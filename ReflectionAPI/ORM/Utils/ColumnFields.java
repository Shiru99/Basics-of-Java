package ReflectionAPI.ORM.Utils;

import java.lang.reflect.Field;

public class ColumnFields {

    public Field field;

    public ColumnFields() {
    }
    
    public ColumnFields(Field field) {
        this.field = field;
    }
    
    public Field getField() {
        return field;
    }
    
    public void setField(Field field) {
        this.field = field;
    }
    
    public String getName() {
        return field.getName();
    }

    public Class<?> getType() {
        return field.getType();
    }

}