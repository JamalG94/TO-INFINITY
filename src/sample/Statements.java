package sample;

import java.sql.Connection;

/**
 * Created by Jamal on 14-10-2016.
 */
public abstract class Statements {
    String sql;
    Connection connection = Connector.connect();
}
