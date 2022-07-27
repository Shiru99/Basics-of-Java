package ReflectionAPI.ORM.Providers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ReflectionAPI.ORM.Annotations.Provider;

public class H2ConnectionProvider {
    
    @Provider
    public Connection buildConnectionToDB() {
        Connection connection;
        try {
            connection = DriverManager
                    .getConnection("jdbc:h2:~/0/Java/Basics-of-Java/ReflectionAPI/ORM/DB-files/myTest", "sa", "");
            return connection;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
