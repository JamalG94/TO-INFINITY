package sample;

public class DeleteStatements implements IVisit {

    String sql;

    @Override
    public void onAddress() {
        sql = "insert into address"
                + "(country, postal_code, city, street, address_number)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }

    @Override
    public void onHeadquarter() {
        sql = "insert into headquarter"
                + "(building_name, country, postal_code, number_of_rooms, rent)"
                + " values('Hogeschool Rotterdam','Nederland', '3011 WN', 5, 6)";
        StatementExecuter.insert(sql);
    }

    @Override
    public void onProject() {
        sql = "insert into project"
                + "(project_id, budget, total_hours, country, postal_code, building_name)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }

    @Override
    public void onPosition() {
        sql = "insert into position"
                + "(position_id, project_id, description, hour_fee, position_name)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }

    @Override
    public void onEmployee() {
        sql = "delete from employee"
                + " where bsn = 1 ";
        StatementExecuter.insert(sql);
    }
    @Override
    public void onEmployeePosition() {
        sql = "insert into employee_position"
                + "(position_id, bsn, , project_id)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven', '206')";
        StatementExecuter.insert(sql);
    }

    @Override
    public void onEmployeeAddress() {
        sql = "insert into employee_address"
                + "(country, postal_code, bsn)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam')";
        StatementExecuter.insert(sql);
    }

    @Override
    public void onEmployeeDegree() {
        sql = "insert into employee_degree"
                + "(bsn, school, level, street)"
                + " values('Nederland','3011 WN', 'Hogeschool Rotterdam', 'Wijnhaven')";
        StatementExecuter.insert(sql);
    }
}
