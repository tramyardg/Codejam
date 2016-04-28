package codejam_class.fortesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RAYMARTHINKPAD
 */ 
public class Connect {

    public void connectToAndQueryDatabase(String username, String password) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT lname, fname FROM EMPLOYEE");

        ArrayList<String> fnameAl = new ArrayList();
        while (rs.next()) {
            String ln = rs.getString("lname");
            String fn = rs.getString("fname");
            fnameAl.add(fn);
        }
        System.out.println(fnameAl);
    }
}
