package ReflectionAPI.ORM.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2EntityManager<T> extends AbstractEntityManger<T> {

    public H2EntityManager(Class<T> clazz) {
        super(clazz);
    }

    public Connection buildConnectionToDB() {
        Connection connection;
        try {
            connection = DriverManager
                    .getConnection("jdbc:h2:~/0/Java/Basics-of-Java/ReflectionAPI/ORM/DB-files/myTest", "sa", "");
            return connection;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;

        }
    }
}
