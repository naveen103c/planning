package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class include_one {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
    }

    public Connection connect() throws SQLException {
        Connection conn = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
        } catch (ClassNotFoundException e) {
            //System.out.println(e.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/planningdatabase_march2021?autoReconnect=true&failOverReadOnly=false&maxReconnects=50&characterEncoding=utf8", "root", "root");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
/*
package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class include_one {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
    }

    public Connection connect() throws SQLException {
        Connection conn = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/planningdatabase?autoReconnect=true&failOverReadOnly=false&maxReconnects=50&characterEncoding=utf8", "root", "root");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
*/