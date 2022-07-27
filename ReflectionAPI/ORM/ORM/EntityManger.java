package ReflectionAPI.ORM.ORM;

import java.sql.SQLException;

import ReflectionAPI.ORM.Model.Person;

public interface EntityManger<T> {

    static <T> EntityMangerImp<T> of(Class<T> clazz) {
        return new EntityMangerImp<T>(clazz);
    }

    void insert(T t) throws Exception;

    T find(Class<T> clazz, Object primaryKey) throws Exception;

    T delete(Class<T> clazz, Object primaryKey) throws Exception;

}
