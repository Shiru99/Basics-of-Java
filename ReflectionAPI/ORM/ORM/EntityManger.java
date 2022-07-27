package ReflectionAPI.ORM.ORM;


public interface EntityManger<T> {

    static <T> AbstractEntityManger<T> of(Class<T> clazz) {
        return new H2EntityManager<T>(clazz);
    }

    void insert(T t) throws Exception;

    T find(Class<T> clazz, Object primaryKey) throws Exception;

    T delete(Class<T> clazz, Object primaryKey) throws Exception;

}
