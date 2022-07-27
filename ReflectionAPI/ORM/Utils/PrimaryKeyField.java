package ReflectionAPI.ORM.Utils;

import java.lang.reflect.Field;
import ReflectionAPI.ORM.Annotations.PrimaryKey;

public class PrimaryKeyField {
    private Field field;
    private PrimaryKey primaryKey; 

    public PrimaryKeyField() {
    }

    public PrimaryKeyField(Field field) {
        this.field = field;
        this.primaryKey = field.getAnnotation(PrimaryKey.class);
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getName() {
        // return field.getName();
        return primaryKey.name();
    }

    public Class<?> getType() {
        return field.getType();
    }
}
