package ReflectionAPI.ORM.ORM;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ReflectionAPI.ORM.Utils.ColumnField;
import ReflectionAPI.ORM.Utils.MetaModel;
import ReflectionAPI.ORM.Utils.PrimaryKeyField;

public class EntityMangerImp<T> implements EntityManger<T> {

    public EntityMangerImp(Class<T> clazz) {
    }

    @Override
    public void insert(T t) {
        MetaModel<T> metaModel = new MetaModel(t.getClass());
        String rawQuery = metaModel.buildInsertQuery(t);

        try {
            PreparedStatement statement = prepareStatementWith(rawQuery).andParameters(t);
            System.out.println("Statement : "+statement);
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        
    }

    private PreparedStatementWrapper prepareStatementWith(String rawQuery) throws SQLException  {

        Connection connection = DriverManager.getConnection("jdbc:h2:~/0/Java/Basics-of-Java/ReflectionAPI/ORM/DB-files/myTest", "sa", "");
        
        PreparedStatement statement  = connection.prepareStatement(rawQuery);
        return new PreparedStatementWrapper(statement);
        
    }


    class PreparedStatementWrapper {
        private PreparedStatement statement;

        public PreparedStatementWrapper(PreparedStatement statement) {
            this.statement = statement;
        }

        public PreparedStatement andParameters(T t) throws Exception {

            MetaModel<T> metaModel = new MetaModel(t.getClass());

            // primaryKeyField

            PrimaryKeyField primaryKeyField = metaModel.getPrimaryKey();

            primaryKeyField.getField().setAccessible(true);
            Class<?> primaryKeyFieldType = primaryKeyField.getField().getType();
            Object primaryKeyFieldValue = primaryKeyField.getField().get(t);

            if( primaryKeyFieldType ==  String.class ) {
                statement.setString(1, (String) primaryKeyFieldValue);
            }else{
                System.out.println("Unsupported type for primary key");
            }


            // ColumnFields
            for( int i = 0; i < metaModel.getColumns().size(); i++ ) {
                ColumnField columnField = metaModel.getColumns().get(i);
                
                columnField.getField().setAccessible(true);
                Class<?> fieldType = columnField.getField().getType();
                Object fieldValue = columnField.getField().get(t);
                
                if( fieldType ==  String.class ) {
                    statement.setString(i + 2, (String) fieldValue);
                } else if( fieldType == int.class ) {
                    statement.setInt(i + 2, (int) fieldValue);
                } else {
                    System.out.println("Unsupported type");
                }

            }

            return this.statement;
        }

        public PreparedStatement andPrimaryKey(Object primaryKey) throws SQLException {
            if (primaryKey.getClass() == String.class) {
                statement.setString(1, (String) primaryKey);
            } else {
                System.out.println("Unsupported type for primary key");
            }
            return this.statement;
        }


        
    }

    @Override
    public T find(Class<T> clazz, Object primaryKey) {

        MetaModel<T> metaModel = new MetaModel(clazz);
        String rawQuery = metaModel.buildSelectQuery(primaryKey);

        try {
            PreparedStatement statement = prepareStatementWith(rawQuery).andPrimaryKey(primaryKey);
            System.out.println("Statement : "+statement);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("ResultSet : "+resultSet);
            if(resultSet.next()){
                return buildInstanceFrom(resultSet, clazz);
            }else{
                System.out.println("No result found");
                return null;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private T buildInstanceFrom(ResultSet resultSet, Class<T> clazz) throws Exception {
        MetaModel<T> metaModel = new MetaModel(clazz);
        T t = clazz.getDeclaredConstructor().newInstance();

        PrimaryKeyField primaryKeyField = metaModel.getPrimaryKey();

        primaryKeyField.getField().setAccessible(true);
        Class<?> primaryKeyFieldType = primaryKeyField.getField().getType();
        String primaryKeyFieldName = primaryKeyField.getField().getName();

        if( primaryKeyFieldType ==  String.class ) {
            primaryKeyField.getField().set(t, resultSet.getString(primaryKeyFieldName));
        } else {
            System.out.println("Unsupported type for primary key");
        }

        for (ColumnField columnField : metaModel.getColumns()) {

            columnField.getField().setAccessible(true);
            Class<?> fieldType = columnField.getField().getType();
            String fieldName = columnField.getField().getName();
            
            if( fieldType ==  String.class ) {
                columnField.getField().set(t, resultSet.getString(fieldName));
            } else if( fieldType == int.class ) {
                columnField.getField().set(t, resultSet.getInt(fieldName));
            } else {
                System.out.println("Unsupported type");
            }
            
        }

        return t;
    }
}
