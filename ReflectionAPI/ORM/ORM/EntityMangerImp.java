package ReflectionAPI.ORM.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            System.out.println(statement);
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

        
    }
}
