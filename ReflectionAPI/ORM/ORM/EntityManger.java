package ReflectionAPI.ORM.ORM;

import java.sql.SQLException;

public interface EntityManger<T> {

    static <T> EntityMangerImp<T> of(Class<T> clazz) {
        return new EntityMangerImp<T>(clazz);
    }

    void insert(T t) throws SQLException;

}
