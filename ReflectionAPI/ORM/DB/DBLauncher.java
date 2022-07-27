package ReflectionAPI.ORM.DB;

import java.sql.SQLException;

import org.h2.tools.Server;

public class DBLauncher {
    public static void main(String[] args) {
        try {
            Server.main();
            System.out.println("H2 database started");
        } catch (SQLException e) {
            System.out.println("H2 database failed to start");
            e.printStackTrace();
        }
    }
}
