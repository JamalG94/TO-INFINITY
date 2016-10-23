package sample;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static sample.Connector.myStmt;

/**
 * Created by stefan on 14-Oct-16.
 */
public class RandomStatements extends Statements {
    List <String> projectids;
    public String onCheckProjectRent() {
        String result = "";
        ResultSet rs;
        Statement stmt;
        projectids = new ArrayList<String>();

        try {
            sql =   "SELECT p.project_id\n" +
                    " FROM headquarter h, project p\n" +
                    " WHERE h.building_name = p.building_name\n" +
                    " AND h.country = p.country\n" +
                    " AND h.postal_code = p.postal_code\n" +
                    " AND h.rent > (p.budget / 10)";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            while ( rs.next() ) {
                String project_id = rs.getString("project_id");
                projectids.add(project_id);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for (String x: projectids) {
            result = result + " " + x;
        }
        return result;
    }
}