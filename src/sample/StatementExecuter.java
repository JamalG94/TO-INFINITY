package sample;
import java.sql.Connection;

import static sample.Connector.myStmt;


public class StatementExecuter {

    public static void insert(String sql) {
        try {
            System.out.println("Statement executed");

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}
