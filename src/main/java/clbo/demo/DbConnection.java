package clbo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final static String USERNAME = "sprindbclbo";
    private final static String PASSWORD = "Rk04?!6UM9bB";
    private final static String CONNSTRING = "jdbc:mysql://den1.mysql6.gear.host/springdbclbo";

    public static Connection getConnection() {

        try {
            System.out.println("YES ITS CONNECTED!");
            return DriverManager.getConnection(CONNSTRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
