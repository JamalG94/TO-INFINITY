package sample;



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

    public void onProject(int project_id, String country, String postal_code, String building_name) {
        try {
            sql = "delete from project"
                    + " where project_id = (?) and country = (?) and postal_code = (?) and building_name = (?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setInt(1, project_id);
            myStmt.setString(2, country);
            myStmt.setString(3, postal_code);
            myStmt.setString(4, building_name);
            myStmt.execute();
            System.out.println("Delete completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void onEmployeePosition(int bsn, int project_id, int position_id) {
        try {
            sql = "delete from employee_postion"
                    + " where bsn = (?) and project_id = (?) and position_id = (?)";
            myStmt = connection.prepareStatement(sql);
            myStmt.setInt(1, bsn);
            myStmt.setInt(2, project_id);
            myStmt.setInt(3, position_id);
            myStmt.execute();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
