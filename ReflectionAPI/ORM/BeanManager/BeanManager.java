package ReflectionAPI.ORM.BeanManager;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import ReflectionAPI.ORM.Annotations.Inject;
import ReflectionAPI.ORM.Annotations.Provider;
import ReflectionAPI.ORM.Providers.H2ConnectionProvider;

public class BeanManager {

    private Map<Class<?>, Supplier<?>> registry = new HashMap<>();

    // Singleton
    private static BeanManager instance = new BeanManager();

    private BeanManager() {
        List<Class<?>> providerClasses = List.of(
            H2ConnectionProvider.class
        );

        for (Class<?> providerClass : providerClasses) {
            Method[] methods = providerClass.getDeclaredMethods();
            for (Method method : methods) {
                Provider provider = method.getAnnotation(Provider.class);

                if (provider != null) {
                    Class<?> returnType = method.getReturnType();

                    Supplier<?> supplier = ()-> {
                        try {
                            if(Modifier.isStatic(method.getModifiers())) {
                                return method.invoke(null);
                            }else{
                                Object obj = providerClass.getConstructor().newInstance();
                                return method.invoke(obj);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    };

                    registry.put(returnType, supplier);
                }
            }

        }
        System.out.println("Registry : "+registry);
    }

    public static BeanManager getInstance() {
        return instance;
    }


    public <T> T getInstance(Class<T> clazz) {
        try {
            T t = clazz.getDeclaredConstructor().newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.getAnnotation(Inject.class) != null) {
                    Class<?> InjectFieldType = field.getType();
                    Supplier<?> supplier = registry.get(InjectFieldType);
                    if (supplier != null) {
                        Object obj = supplier.get();
                        field.setAccessible(true);
                        field.set(t, obj);
                    }
                }
            }

            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
