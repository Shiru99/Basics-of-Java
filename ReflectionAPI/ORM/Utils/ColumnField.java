package ReflectionAPI.ORM.Utils;

import java.lang.reflect.Field;
import ReflectionAPI.ORM.Annotations.Column;

public class ColumnField {

    private Field field;
    private Column column;

    public ColumnField() {
    }
    
    public ColumnField(Field field) {
        this.field = field;
        this.column = field.getAnnotation(Column.class);
    }
    
    public Field getField() {
        return field;
    }
    
    public void setField(Field field) {
        this.field = field;
    }
    
    public String getName() {
        // return field.getName();
        return column.name();
    }

    public Class<?> getType() {
        return field.getType();
    }

}
