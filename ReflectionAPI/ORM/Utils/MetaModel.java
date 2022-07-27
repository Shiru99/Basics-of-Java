package ReflectionAPI.ORM.Utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<ColumnField> getColumns() {

        Field[] fields = clazz.getDeclaredFields();
        List<ColumnField> columns = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Column.class)) {
                columns.add(new ColumnField(field));
            }
        }

        return columns;
    }

    public String buildInsertQuery(T t) {
        // insert into table (column1, column2, column3) values (?, ?, ?)

        String columnElements = getColumns()
                .stream()
                .map(ColumnField::getName)
                .collect(Collectors.joining(", "));

        columnElements = "(" + getPrimaryKey().getName() + ", " + columnElements + ")";

        String QuestionMarkElement = getColumns()
                .stream()
                .map(columnField -> "?")
                .collect(Collectors.joining(", "));

        QuestionMarkElement = "(?, " + QuestionMarkElement + ")";

        return "insert into " + this.getClazz().getSimpleName() + " " + columnElements + " values " + QuestionMarkElement;
    }

    public String buildSelectQuery(Object primaryKey) {
        // select * from table where primaryKey = ?

        return "select * from " + this.getClazz().getSimpleName() + " where " + getPrimaryKey().getName() + " = ?";
    }

    public String buildDeleteQuery(Object primaryKey) {
        // delete from table where primaryKey = ?
        return "delete from " + this.getClazz().getSimpleName() + " where " + getPrimaryKey().getName() + " = ?";
    }
}
