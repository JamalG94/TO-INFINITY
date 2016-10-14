package sample;

import static sample.Connector.myStmt;

/**
 * Created by Jamal on 2-10-2016.
 */
public class UpdateStatements extends Statements{

    public void onEmployee(int bsn, String name) {
        try {
            sql = "update employee"
                    + " set name = (?)"
                    + " where bsn = (?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setString(1, name);
            myStmt.setInt(2, bsn);
            myStmt.execute();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void onProject(int id, int budget) {
        try {
            sql = "update project"
                    + " set budget = (?)"
                    + " where project_id = (?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setInt(1, budget);
            myStmt.setInt(2, id);
            myStmt.execute();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


