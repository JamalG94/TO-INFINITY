package sample;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.Connection;

import static sample.Connector.myStmt;

public class InsertStatements  {

    String sql;
    Connection connection = Connector.connect();

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


    public void onAddress() {
        sql = "insert into address"
                + "(country, postal_code, city, street, address_number)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }


    public void onHeadquarter() {
        sql = "insert into headquarter"
                + "(building_name, country, postal_code, number_of_rooms, rent)"
                + " values('Hogeschool Rotterdam','Nederland', '3011 WN', 5, 6)";
        StatementExecuter.insert(sql);
    }


//    public void onProject() {
//        sql = "insert into project"
//                + " (project_id, budget, total_hours, country, postal_code, building_name)"
//                + " values(1, 30, 60, 'Nederland', '3011 WN', 'Hogeschool Rotterdam')";
//        StatementExecuter.insert(sql);
//    }


    public void onPosition() {
        sql = "insert into position"
                + "(position_id, project_id, description, hour_fee, position_name)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }



    public void onEmployeePosition() {
        sql = "insert into employee_position"
                + "(position_id, bsn, , project_id)"
                + " values('1','1', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }


    public void onEmployeeAddress() {
        sql = "insert into employee_address"
                + "(country, postal_code, bsn)"
                + " values('Nederland','3011 WN', '1')";
        StatementExecuter.insert(sql);
    }


    public void onEmployeeDegree() {
        sql = "insert into employee_degree"
                + "(bsn, school, level, street)"
                + " values('1','HR', 'Bachelor', 'Wijnhaven')";
        StatementExecuter.insert(sql);
    }
}
