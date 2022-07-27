package ReflectionAPI.ORM.Utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import ReflectionAPI.ORM.Annotations.Column;
import ReflectionAPI.ORM.Annotations.PrimaryKey;

public class MetaModel<T> {
    private Class<T> clazz;

    public MetaModel(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public PrimaryKeyField getPrimaryKey() {

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(PrimaryKey.class)) {
                return new PrimaryKeyField(field);
            }
        }

        throw new IllegalArgumentException("No primary key found");
    }

    public List<ColumnFields> getColumns() {

        Field[] fields = clazz.getDeclaredFields();
        List<ColumnFields> columns = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Column.class)) {
                columns.add(new ColumnFields(field));
            }
        }

        return columns;
    }
}
