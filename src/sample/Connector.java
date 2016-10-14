package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public final class Connector {

    static PreparedStatement myStmt;


    public static Connection connect() {

        try {
            String url = "jdbc:postgresql://localhost:3307/databeest";
            String user = "postgres";
            String password = "test123";

            Connection connection = DriverManager.getConnection(url, user, password);


            System.out.println("Connection established");
            return connection;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
