package sample;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.Connection;

import static sample.Connector.myStmt;

public class InsertStatements extends Statements  {


    public void onEmployee(int bsn, String name, String surname, String building_name, String country, String postal_code) {
        try {
            sql = "insert into employee"
                    + "(bsn, name, surname, building_name, country, postal_code) values"
                    + "(?,?,?,?,?,?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setInt(1, bsn);
            myStmt.setString(2, name);
            myStmt.setString(3, surname);
            myStmt.setString(4, building_name);
            myStmt.setString(5, country);
            myStmt.setString(6, postal_code);
            myStmt.execute();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void onProject(int id, int budget, int total_hours, String building_name, String country, String postal_code) {
        try {
            sql = "insert into project"
                    + "(project_id, budget, total_hours, building_name, country, postal_code) values"
                    + "(?,?,?,?,?,?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setInt(1, id);
            myStmt.setInt(2, budget);
            myStmt.setInt(3, total_hours);
            myStmt.setString(4, building_name);
            myStmt.setString(5, country);
            myStmt.setString(6, postal_code);
            myStmt.execute();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
