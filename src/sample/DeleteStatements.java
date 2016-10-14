package sample;

import java.sql.Connection;

import static sample.Connector.myStmt;

public class DeleteStatements extends Statements {


    public void onEmployee(int bsn) {
        try {
            sql = "delete from employee"
                    + " where bsn = (?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setInt(1, bsn);
            myStmt.execute();
            System.out.println("Delete completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
