package CBS;

import amit.include_one;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class BSROutputNew {

    public static Connection conn;

    public BSROutputNew() {
        try {
            include_one i = new include_one();
            conn = i.connect();
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        BSROutputNew bsr = new BSROutputNew();
        DecimalFormat df = new DecimalFormat("000");
        Statement st = conn.createStatement();
        File fs = new File("D:\\Other Assisgnment\\Planning\\BSR 2.txt");
        File fn = new File("D:\\Other Assisgnment\\Planning\\Outputnew.txt");
        BufferedReader read = new BufferedReader(new FileReader(fs));
        BufferedWriter output = new BufferedWriter(new FileWriter(fn));
        output.write("BSR2:2019:519:20052019:49902;");
        output.newLine();
        read.readLine();
        String line = read.readLine();
        while (line != null) {
            output.write(line.substring(0, 7) + "\t" + line.substring(8, line.length()));
            output.newLine();
            line = read.readLine();
        }
        output.close();
        read.close();
    }

}
