/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CBS;

import amit.include_one;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 */
public class BSROutput {

    public static Connection conn;

    public BSROutput() {
        try {
            include_one i = new include_one();
            conn = i.connect();
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        BSROutput bsr = new BSROutput();
        DecimalFormat df = new DecimalFormat("000");
        Statement st = conn.createStatement();
        File fn = new File("D:\\Other Assisgnment\\Planning\\Output.txt");
        BufferedWriter output = new BufferedWriter(new FileWriter(fn));
        ResultSet rs = st.executeQuery("SELECT * FROM suvbention.planningnewfinal");
        output.write("BSR2:2019:519:21052019:49902;");
        output.newLine();
        while (rs.next()) {
            if (rs.getInt("code") == 1) {
                output.write("" + rs.getString("branch") + "\t" + df.format(rs.getInt("code")) + "\t" + rs.getString("no1") + "\t" + rs.getString("amt1") + "\t" + rs.getString("no2") + "\t" + rs.getString("amt2") + "\t" + rs.getString("no3") + "\t" + rs.getString("amt3") + "\t0\t0\t0\t0");
            } else {
                output.write("" + rs.getString("branch") + "\t" + df.format(rs.getInt("code")) + "\t" + rs.getString("no1") + "\t" + rs.getString("amt1") + "\t" + rs.getString("no2") + "\t" + rs.getString("amt2") + "\t0\t0\t" + rs.getString("no3") + "\t" + rs.getString("amt3") + "\t" + (rs.getInt("no1") + rs.getInt("no2") + rs.getInt("no3")) + "\t" + (rs.getInt("amt1") + rs.getInt("amt2") + rs.getInt("amt3")));
            }
            output.newLine();
        }
        output.close();
    }

    public int data(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM suvbention.planningnew where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }

    public int databsr7(String sol, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM suvbention.bsr7 where sol='" + sol + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }

}
