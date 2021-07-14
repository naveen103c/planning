package CBS;

import amit.include_one;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BSRPlanningnew {

    public static Connection conn;

    public BSRPlanningnew() {
        try {
            include_one i = new include_one();
            conn = i.connect();

        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        BSRPlanningnew bsr = new BSRPlanningnew();
        Statement st0 = conn.createStatement();
        Statement st1 = conn.createStatement();
        Statement st2 = conn.createStatement();
        Statement st3 = conn.createStatement();
        Statement st4 = conn.createStatement();
        Statement st5 = conn.createStatement();
        Statement st6 = conn.createStatement();
        Statement st7 = conn.createStatement();
        Statement st8 = conn.createStatement();
        Statement st9 = conn.createStatement();
        Statement st10 = conn.createStatement();
        Statement st11 = conn.createStatement();
        Statement st12 = conn.createStatement();
        Statement st13 = conn.createStatement();
        /*ResultSet rs0 = st0.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='100'");
        while (rs0.next()) {
            if (rs0.getInt("no1") != (bsr.data(rs0.getString("branch") + "-110", "no1") + bsr.data(rs0.getString("branch") + "-120", "no1") + bsr.data(rs0.getString("branch") + "-130", "no1"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
            }
            if (rs0.getInt("no2") != (bsr.data(rs0.getString("branch") + "-110", "no2") + bsr.data(rs0.getString("branch") + "-120", "no2") + bsr.data(rs0.getString("branch") + "-130", "no2"))) {
                System.out.println(rs0.getString("branch") + "\tno2");
            }
            if (rs0.getInt("no3") != (bsr.data(rs0.getString("branch") + "-110", "no3") + bsr.data(rs0.getString("branch") + "-120", "no3") + bsr.data(rs0.getString("branch") + "-130", "no3"))) {
                System.out.println(rs0.getString("branch") + "\tno3");
            }
            if (rs0.getInt("amt1") != (bsr.data(rs0.getString("branch") + "-110", "amt1") + bsr.data(rs0.getString("branch") + "-120", "amt1") + bsr.data(rs0.getString("branch") + "-130", "amt1"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
            }
            if (rs0.getInt("amt2") != (bsr.data(rs0.getString("branch") + "-110", "amt2") + bsr.data(rs0.getString("branch") + "-120", "amt2") + bsr.data(rs0.getString("branch") + "-130", "amt2"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
            }
            if (rs0.getInt("amt3") != (bsr.data(rs0.getString("branch") + "-110", "amt3") + bsr.data(rs0.getString("branch") + "-120", "amt3") + bsr.data(rs0.getString("branch") + "-130", "amt3"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
            }
            if (rs0.getInt("amt3") != (bsr.data(rs0.getString("branch") + "-100", "amt3"))) {
                System.out.println(rs0.getString("branch") + "\tamt3\t" + rs0.getInt("amt3") + "\t" + bsr.data(rs0.getString("branch") + "-100", "amt3"));
            }
            if (rs0.getInt("no3") != (bsr.data(rs0.getString("branch") + "-110", "no3") + bsr.data(rs0.getString("branch") + "-120", "no3") + bsr.data(rs0.getString("branch") + "-130", "no3"))) {
                System.out.println(rs0.getString("branch") + "\tno3\t" + rs0.getInt("amt3") + "\t" +bsr.data(rs0.getString("branch") + "-110", "no3")+ "\t" +bsr.data(rs0.getString("branch") + "-120", "no3")+ "\t" +bsr.data(rs0.getString("branch") + "-130", "no3"));
            }
            if (rs0.getInt("no3") != (bsr.data(rs0.getString("branch") + "-100", "no3"))) {
                System.out.println(rs0.getString("branch") + "\tno3\t" + rs0.getInt("no3") + "\t" + bsr.data(rs0.getString("branch") + "-100", "no3"));
            }
        }
        /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='200'");
        while (rs1.next()) {
            rs1.getString("branchcode");
            if (rs1.getInt("no1") != (bsr.data(rs1.getString("branch") + "-210", "no1") + bsr.data(rs1.getString("branch") + "-220", "no1") + bsr.data(rs1.getString("branch") + "-", "no1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
            if (rs1.getInt("no2") != (bsr.data(rs1.getString("branch") + "-210", "no2") + bsr.data(rs1.getString("branch") + "-220", "no2") + bsr.data(rs1.getString("branch") + "-", "no2"))) {
                System.out.println(rs1.getString("branch") + "\tno2");
            }
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-210", "no3") + bsr.data(rs1.getString("branch") + "-220", "no3") + bsr.data(rs1.getString("branch") + "-", "no3"))) {
                System.out.println(rs1.getString("branch") + "\tno3");
            }
            if (rs1.getInt("amt1") != (bsr.data(rs1.getString("branch") + "-210", "amt1") + bsr.data(rs1.getString("branch") + "-220", "amt1") + bsr.data(rs1.getString("branch") + "-", "amt1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
            if (rs1.getInt("amt2") != (bsr.data(rs1.getString("branch") + "-210", "amt2") + bsr.data(rs1.getString("branch") + "-220", "amt2") + bsr.data(rs1.getString("branch") + "-", "amt2"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-210", "amt3") + bsr.data(rs1.getString("branch") + "-220", "amt3") + bsr.data(rs1.getString("branch") + "-", "amt3"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-200", "amt3"))) {
                System.out.println(rs1.getString("branch") + "\tamt3\t" + rs1.getInt("amt3") + "\t" + bsr.data(rs1.getString("branch") + "-200", "amt3"));
            }
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-210", "no3") + bsr.data(rs1.getString("branch") + "-220", "no3"))) {
                System.out.println(rs1.getString("branch") + "\tno3\t" + rs1.getInt("amt3") + "\t" +bsr.data(rs1.getString("branch") + "-210", "no3")+ "\t" +bsr.data(rs1.getString("branch") + "-220", "no3"));
            }
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-200", "no3"))) {
                System.out.println(rs1.getString("branch") + "\tno3\t" + rs1.getInt("no3") + "\t" + bsr.data(rs1.getString("branch") + "-200", "no3"));
            }
        }
        ResultSet rs2 = st2.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='300'");
        while (rs2.next()) {
            rs2.getString("branchcode");
            if (rs2.getInt("no1") != (bsr.data(rs2.getString("branch") + "-310", "no1") + bsr.data(rs2.getString("branch") + "-320", "no1") + bsr.data(rs2.getString("branch") + "-330", "no1") + bsr.data(rs2.getString("branch") + "-340", "no1") + bsr.data(rs2.getString("branch") + "-350", "no1"))) {
                System.out.println(rs2.getString("branch") + "\tno1");
            }
            if (rs2.getInt("no2") != (bsr.data(rs2.getString("branch") + "-310", "no2") + bsr.data(rs2.getString("branch") + "-320", "no2") + bsr.data(rs2.getString("branch") + "-330", "no2") + bsr.data(rs2.getString("branch") + "-340", "no2") + bsr.data(rs2.getString("branch") + "-350", "no2"))) {
                System.out.println(rs2.getString("branch") + "\tno2");
            }
            if (rs2.getInt("no3") != (bsr.data(rs2.getString("branch") + "-310", "no3") + bsr.data(rs2.getString("branch") + "-320", "no3") + bsr.data(rs2.getString("branch") + "-330", "no3") + bsr.data(rs2.getString("branch") + "-340", "no3") + bsr.data(rs2.getString("branch") + "-350", "no3"))) {
                System.out.println(rs2.getString("branch") + "\tno3");
            }
            if (rs2.getInt("amt1") != (bsr.data(rs2.getString("branch") + "-310", "amt1") + bsr.data(rs2.getString("branch") + "-320", "amt1") + bsr.data(rs2.getString("branch") + "-330", "amt1") + bsr.data(rs2.getString("branch") + "-340", "amt1") + bsr.data(rs2.getString("branch") + "-350", "amt1"))) {
                System.out.println(rs2.getString("branch") + "\tno1");
            }
            if (rs2.getInt("amt2") != (bsr.data(rs2.getString("branch") + "-310", "amt2") + bsr.data(rs2.getString("branch") + "-320", "amt2") + bsr.data(rs2.getString("branch") + "-330", "amt2") + bsr.data(rs2.getString("branch") + "-340", "amt2") + bsr.data(rs2.getString("branch") + "-350", "amt2"))) {
                System.out.println(rs2.getString("branch") + "\tno1");
            }
            if (rs2.getInt("amt3") != (bsr.data(rs2.getString("branch") + "-310", "amt3") + bsr.data(rs2.getString("branch") + "-320", "amt3") + bsr.data(rs2.getString("branch") + "-330", "amt3") + bsr.data(rs2.getString("branch") + "-340", "amt3") + bsr.data(rs2.getString("branch") + "-350", "amt3"))) {
                System.out.println(rs2.getString("branch") + "\tno1");
            }
            if (rs2.getInt("amt3") != (bsr.data(rs2.getString("branch") + "-300", "amt3"))) {
                System.out.println(rs2.getString("branch") + "\tamt3\t" + rs2.getInt("amt3") + "\t" + bsr.data(rs2.getString("branch") + "-300", "amt3"));
            }
            if (rs2.getInt("no3") != (bsr.data(rs2.getString("branch") + "-310", "no3") + bsr.data(rs2.getString("branch") + "-320", "no3") + bsr.data(rs2.getString("branch") + "-330", "no3") + bsr.data(rs2.getString("branch") + "-340", "no3") + bsr.data(rs2.getString("branch") + "-350", "no3"))) {
                System.out.println(rs2.getString("branch") + "\tno3\t" + rs2.getInt("amt3") + "\t" +bsr.data(rs2.getString("branch") + "-310", "no3")+ "\t" +bsr.data(rs2.getString("branch") + "-320", "no3")+ "\t" +bsr.data(rs2.getString("branch") + "-330", "no3")+ "\t" +bsr.data(rs2.getString("branch") + "-340", "no3")+ "\t" +bsr.data(rs2.getString("branch") + "-350", "no3"));
            }
            if (rs2.getInt("no3") != (bsr.data(rs2.getString("branch") + "-300", "no3"))) {
                System.out.println(rs2.getString("branch") + "\tno3\t" + rs2.getInt("no3") + "\t" + bsr.data(rs2.getString("branch") + "-300", "no3"));
            }
        }
        ResultSet rs3 = st3.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='310'");
        while (rs3.next()) {
            rs3.getString("branchcode");
            if (rs3.getInt("no1") != (bsr.data(rs3.getString("branch") + "-311", "no1") + bsr.data(rs3.getString("branch") + "-312", "no1") + bsr.data(rs3.getString("branch") + "-313", "no1") + bsr.data(rs3.getString("branch") + "-314", "no1") + bsr.data(rs3.getString("branch") + "-", "no1"))) {
                System.out.println(rs3.getString("branch") + "\tno1");
            }
            if (rs3.getInt("no2") != (bsr.data(rs3.getString("branch") + "-311", "no2") + bsr.data(rs3.getString("branch") + "-312", "no2") + bsr.data(rs3.getString("branch") + "-313", "no2") + bsr.data(rs3.getString("branch") + "-314", "no2") + bsr.data(rs3.getString("branch") + "-", "no2"))) {
                System.out.println(rs3.getString("branch") + "\tno2");
            }
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-311", "no3") + bsr.data(rs3.getString("branch") + "-312", "no3") + bsr.data(rs3.getString("branch") + "-313", "no3") + bsr.data(rs3.getString("branch") + "-314", "no3") + bsr.data(rs3.getString("branch") + "-", "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3");
            }
            if (rs3.getInt("amt1") != (bsr.data(rs3.getString("branch") + "-311", "amt1") + bsr.data(rs3.getString("branch") + "-312", "amt1") + bsr.data(rs3.getString("branch") + "-313", "amt1") + bsr.data(rs3.getString("branch") + "-314", "amt1") + bsr.data(rs3.getString("branch") + "-", "amt1"))) {
                System.out.println(rs3.getString("branch") + "\tno1");
            }
            if (rs3.getInt("amt2") != (bsr.data(rs3.getString("branch") + "-311", "amt2") + bsr.data(rs3.getString("branch") + "-312", "amt2") + bsr.data(rs3.getString("branch") + "-313", "amt2") + bsr.data(rs3.getString("branch") + "-314", "amt2") + bsr.data(rs3.getString("branch") + "-", "amt2"))) {
                System.out.println(rs3.getString("branch") + "\tno1");
            }
            if (rs3.getInt("amt3") != (bsr.data(rs3.getString("branch") + "-311", "amt3") + bsr.data(rs3.getString("branch") + "-312", "amt3") + bsr.data(rs3.getString("branch") + "-313", "amt3") + bsr.data(rs3.getString("branch") + "-314", "amt3") + bsr.data(rs3.getString("branch") + "-", "amt3"))) {
                System.out.println(rs3.getString("branch") + "\tno1");
            }
            if (rs3.getInt("amt3") != (bsr.data(rs3.getString("branch") + "-310", "amt3"))) {
                System.out.println(rs3.getString("branch") + "\tamt3\t" + rs3.getInt("amt3") + "\t" + bsr.data(rs3.getString("branch") + "-310", "amt3"));
            }
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-311", "no3") + bsr.data(rs3.getString("branch") + "-312", "no3") + bsr.data(rs3.getString("branch") + "-313", "no3") + bsr.data(rs3.getString("branch") + "-314", "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3\t" + rs3.getInt("amt3") + "\t" + bsr.data(rs3.getString("branch") + "-311", "no3") + "\t" + bsr.data(rs3.getString("branch") + "-312", "no3") + "\t" + bsr.data(rs3.getString("branch") + "-313", "no3") + "\t" + bsr.data(rs3.getString("branch") + "-314", "no3"));
            }
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-310", "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3\t" + rs3.getInt("no3") + "\t" + bsr.data(rs3.getString("branch") + "-310", "no3"));
            }
        }
        ResultSet rs4 = st4.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='400'");
        while (rs4.next()) {
            rs4.getString("branchcode");
            if (rs4.getInt("no1") != (bsr.data(rs4.getString("branch") + "-410", "no1") + bsr.data(rs4.getString("branch") + "-420", "no1") + bsr.data(rs4.getString("branch") + "-430", "no1"))) {
                System.out.println(rs4.getString("branch") + "\tno1");
            }
            if (rs4.getInt("no2") != (bsr.data(rs4.getString("branch") + "-410", "no2") + bsr.data(rs4.getString("branch") + "-420", "no2") + bsr.data(rs4.getString("branch") + "-430", "no2"))) {
                System.out.println(rs4.getString("branch") + "\tno2");
            }
            if (rs4.getInt("no3") != (bsr.data(rs4.getString("branch") + "-410", "no3") + bsr.data(rs4.getString("branch") + "-420", "no3") + bsr.data(rs4.getString("branch") + "-430", "no3"))) {
                System.out.println(rs4.getString("branch") + "\tno3");
            }
            if (rs4.getInt("amt1") != (bsr.data(rs4.getString("branch") + "-410", "amt1") + bsr.data(rs4.getString("branch") + "-420", "amt1") + bsr.data(rs4.getString("branch") + "-430", "amt1"))) {
                System.out.println(rs4.getString("branch") + "\tno1");
            }
            if (rs4.getInt("amt2") != (bsr.data(rs4.getString("branch") + "-410", "amt2") + bsr.data(rs4.getString("branch") + "-420", "amt2") + bsr.data(rs4.getString("branch") + "-430", "amt2"))) {
                System.out.println(rs4.getString("branch") + "\tno1");
            }
            if (rs4.getInt("amt3") != (bsr.data(rs4.getString("branch") + "-410", "amt3") + bsr.data(rs4.getString("branch") + "-420", "amt3") + bsr.data(rs4.getString("branch") + "-430", "amt3"))) {
                System.out.println(rs4.getString("branch") + "\tno1");
            }
            if (rs4.getInt("amt3") != (bsr.data(rs4.getString("branch") + "-400", "amt3"))) {
                System.out.println(rs4.getString("branch") + "\tamt3\t" + rs4.getInt("amt3") + "\t" + bsr.data(rs4.getString("branch") + "-400", "amt3"));
            }
            if (rs4.getInt("no3") != (bsr.data(rs4.getString("branch") + "-410", "no3") + bsr.data(rs4.getString("branch") + "-420", "no3") + bsr.data(rs4.getString("branch") + "-430", "no3") )) {
                System.out.println(rs4.getString("branch") + "\tno3\t" + rs4.getInt("amt3") + "\t" + bsr.data(rs4.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs4.getString("branch") + "-420", "no3") + "\t" + bsr.data(rs4.getString("branch") + "-430", "no3"));
            }
            if (rs4.getInt("no3") != (bsr.data(rs4.getString("branch") + "-400", "no3"))) {
                System.out.println(rs4.getString("branch") + "\tno3\t" + rs4.getInt("no3") + "\t" + bsr.data(rs4.getString("branch") + "-400", "no3"));
            }
        }
        ResultSet rs5 = st5.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='420'");
        while (rs5.next()) {
            rs5.getString("branchcode");
            if (rs5.getInt("no1") != (bsr.data(rs5.getString("branch") + "-421", "no1") + bsr.data(rs5.getString("branch") + "-422", "no1") + bsr.data(rs5.getString("branch") + "-", "no1"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
            }
            if (rs5.getInt("no2") != (bsr.data(rs5.getString("branch") + "-421", "no2") + bsr.data(rs5.getString("branch") + "-422", "no2") + bsr.data(rs5.getString("branch") + "-", "no2"))) {
                System.out.println(rs5.getString("branch") + "\tno2");
            }
            if (rs5.getInt("no3") != (bsr.data(rs5.getString("branch") + "-421", "no3") + bsr.data(rs5.getString("branch") + "-422", "no3") + bsr.data(rs5.getString("branch") + "-", "no3"))) {
                System.out.println(rs5.getString("branch") + "\tno3");
            }
            if (rs5.getInt("amt1") != (bsr.data(rs5.getString("branch") + "-421", "amt1") + bsr.data(rs5.getString("branch") + "-422", "amt1") + bsr.data(rs5.getString("branch") + "-", "amt1"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
            }
            if (rs5.getInt("amt2") != (bsr.data(rs5.getString("branch") + "-421", "amt2") + bsr.data(rs5.getString("branch") + "-422", "amt2") + bsr.data(rs5.getString("branch") + "-", "amt2"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
            }
            if (rs5.getInt("amt3") != (bsr.data(rs5.getString("branch") + "-421", "amt3") + bsr.data(rs5.getString("branch") + "-422", "amt3") + bsr.data(rs5.getString("branch") + "-", "amt3"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
            }
            //System.out.println(rs5.getString("branch")+"\t" + bsr.data(rs5.getString("branch") + "-410", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-610", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-720", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-810", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-910", "amt3"));
            //System.out.println(rs5.getString("branch")+"\t" + bsr.data(rs5.getString("branch") + "-410", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-610", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-720", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-810", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-910", "no3"));
            //System.out.println(rs5.getString("branch")+"\t" + bsr.data(rs5.getString("branch") + "-600", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-700", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-800", "no3")+"\t" + bsr.data(rs5.getString("branch") + "-900", "no3")+"\t" + (bsr.data(rs5.getString("branch") + "-0", "no3")-bsr.data(rs5.getString("branch") + "-500", "no3")-bsr.data(rs5.getString("branch") + "-311", "no3")));
            //System.out.println(rs5.getString("branch")+"\t" + bsr.data(rs5.getString("branch") + "-600", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-700", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-800", "amt3")+"\t" + bsr.data(rs5.getString("branch") + "-900", "amt3")+"\t" + (bsr.data(rs5.getString("branch") + "-0", "amt3")-bsr.data(rs5.getString("branch") + "-500", "amt3")-bsr.data(rs5.getString("branch") + "-311", "amt3")));
        }
        /* ResultSet rs6 = st6.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='430'");
        while (rs6.next()) {
            rs6.getString("branchcode");
            if (rs6.getInt("no1") != (bsr.data(rs6.getString("branch") + "-431", "no1") + bsr.data(rs6.getString("branch") + "-432", "no1") + bsr.data(rs6.getString("branch") + "-", "no1"))) {
                System.out.println(rs6.getString("branch") + "\tno1");
            }
            if (rs6.getInt("no2") != (bsr.data(rs6.getString("branch") + "-431", "no2") + bsr.data(rs6.getString("branch") + "-432", "no2") + bsr.data(rs6.getString("branch") + "-", "no2"))) {
                System.out.println(rs6.getString("branch") + "\tno2");
            }
            if (rs6.getInt("no3") != (bsr.data(rs6.getString("branch") + "-431", "no3") + bsr.data(rs6.getString("branch") + "-432", "no3") + bsr.data(rs6.getString("branch") + "-", "no3"))) {
                System.out.println(rs6.getString("branch") + "\tno3");
            }
            if (rs6.getInt("amt1") != (bsr.data(rs6.getString("branch") + "-431", "amt1") + bsr.data(rs6.getString("branch") + "-432", "amt1") + bsr.data(rs6.getString("branch") + "-", "amt1"))) {
                System.out.println(rs6.getString("branch") + "\tno1");
            }
            if (rs6.getInt("amt2") != (bsr.data(rs6.getString("branch") + "-431", "amt2") + bsr.data(rs6.getString("branch") + "-432", "amt2") + bsr.data(rs6.getString("branch") + "-", "amt2"))) {
                System.out.println(rs6.getString("branch") + "\tno1");
            }
            if (rs6.getInt("amt3") != (bsr.data(rs6.getString("branch") + "-431", "amt3") + bsr.data(rs6.getString("branch") + "-432", "amt3") + bsr.data(rs6.getString("branch") + "-", "amt3"))) {
                System.out.println(rs6.getString("branch") + "\tno1");
            }
        }
        ResultSet rs7 = st7.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='500'");
        while (rs7.next()) {
            rs7.getString("branchcode");
            if (rs7.getInt("no1") != (bsr.data(rs7.getString("branch") + "-510", "no1") + bsr.data(rs7.getString("branch") + "-520", "no1") + bsr.data(rs7.getString("branch") + "-", "no1"))) {
                System.out.println(rs7.getString("branch") + "\tno1");
            }
            if (rs7.getInt("no2") != (bsr.data(rs7.getString("branch") + "-510", "no2") + bsr.data(rs7.getString("branch") + "-520", "no2") + bsr.data(rs7.getString("branch") + "-", "no2"))) {
                System.out.println(rs7.getString("branch") + "\tno2");
            }
            if (rs7.getInt("no3") != (bsr.data(rs7.getString("branch") + "-510", "no3") + bsr.data(rs7.getString("branch") + "-520", "no3") + bsr.data(rs7.getString("branch") + "-", "no3"))) {
                System.out.println(rs7.getString("branch") + "\tno3");
            }
            if (rs7.getInt("amt1") != (bsr.data(rs7.getString("branch") + "-510", "amt1") + bsr.data(rs7.getString("branch") + "-520", "amt1") + bsr.data(rs7.getString("branch") + "-", "amt1"))) {
                System.out.println(rs7.getString("branch") + "\tno1");
            }
            if (rs7.getInt("amt2") != (bsr.data(rs7.getString("branch") + "-510", "amt2") + bsr.data(rs7.getString("branch") + "-520", "amt2") + bsr.data(rs7.getString("branch") + "-", "amt2"))) {
                System.out.println(rs7.getString("branch") + "\tno1");
            }
            if (rs7.getInt("amt3") != (bsr.data(rs7.getString("branch") + "-510", "amt3") + bsr.data(rs7.getString("branch") + "-520", "amt3") + bsr.data(rs7.getString("branch") + "-", "amt3"))) {
                System.out.println(rs7.getString("branch") + "\tno1");
            }
        }
        ResultSet rs8 = st7.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='510'");
        while (rs8.next()) {
            rs8.getString("branchcode");
            if (rs8.getInt("no1") != (bsr.data(rs8.getString("branch") + "-511", "no1") + bsr.data(rs8.getString("branch") + "-512", "no1") + bsr.data(rs8.getString("branch") + "-", "no1"))) {
                System.out.println(rs8.getString("branch") + "\tno1");
            }
            if (rs8.getInt("no2") != (bsr.data(rs8.getString("branch") + "-511", "no2") + bsr.data(rs8.getString("branch") + "-512", "no2") + bsr.data(rs8.getString("branch") + "-", "no2"))) {
                System.out.println(rs8.getString("branch") + "\tno2");
            }
            if (rs8.getInt("no3") != (bsr.data(rs8.getString("branch") + "-511", "no3") + bsr.data(rs8.getString("branch") + "-512", "no3") + bsr.data(rs8.getString("branch") + "-", "no3"))) {
                System.out.println(rs8.getString("branch") + "\tno3");
            }
            if (rs8.getInt("amt1") != (bsr.data(rs8.getString("branch") + "-511", "amt1") + bsr.data(rs8.getString("branch") + "-512", "amt1") + bsr.data(rs8.getString("branch") + "-", "amt1"))) {
                System.out.println(rs8.getString("branch") + "\tno1");
            }
            if (rs8.getInt("amt2") != (bsr.data(rs8.getString("branch") + "-511", "amt2") + bsr.data(rs8.getString("branch") + "-512", "amt2") + bsr.data(rs8.getString("branch") + "-", "amt2"))) {
                System.out.println(rs8.getString("branch") + "\tno1");
            }
            if (rs8.getInt("amt3") != (bsr.data(rs8.getString("branch") + "-511", "amt3") + bsr.data(rs8.getString("branch") + "-512", "amt3") + bsr.data(rs8.getString("branch") + "-", "amt3"))) {
                System.out.println(rs8.getString("branch") + "\tno1");
            }
        }
        *//*
        ResultSet rs9 = st9.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='0'");
        while (rs9.next()) {
            rs9.getString("branchcode");
            if (rs9.getInt("no1") != (bsr.data(rs9.getString("branch") + "-100", "no1") + bsr.data(rs9.getString("branch") + "-200", "no1") + bsr.data(rs9.getString("branch") + "-300", "no1") + bsr.data(rs9.getString("branch") + "-400", "no1") + bsr.data(rs9.getString("branch") + "-500", "no1"))) {
                System.out.println(rs9.getString("branch") + "\tno1");
            }
            if (rs9.getInt("no2") != (bsr.data(rs9.getString("branch") + "-100", "no2") + bsr.data(rs9.getString("branch") + "-200", "no2") + bsr.data(rs9.getString("branch") + "-300", "no2") + bsr.data(rs9.getString("branch") + "-400", "no2") + bsr.data(rs9.getString("branch") + "-500", "no2"))) {
                System.out.println(rs9.getString("branch") + "\tno2");
            }
            if (rs9.getInt("no3") != (bsr.data(rs9.getString("branch") + "-100", "no3") + bsr.data(rs9.getString("branch") + "-200", "no3") + bsr.data(rs9.getString("branch") + "-300", "no3") + bsr.data(rs9.getString("branch") + "-400", "no3") + bsr.data(rs9.getString("branch") + "-500", "no3"))) {
                System.out.println(rs9.getString("branch") + "\tno3");
            }
            if (rs9.getInt("amt1") != (bsr.data(rs9.getString("branch") + "-100", "amt1") + bsr.data(rs9.getString("branch") + "-200", "amt1") + bsr.data(rs9.getString("branch") + "-300", "amt1") + bsr.data(rs9.getString("branch") + "-400", "amt1") + bsr.data(rs9.getString("branch") + "-500", "amt1"))) {
                System.out.println(rs9.getString("branch") + "\tno1");
            }
            if (rs9.getInt("amt2") != (bsr.data(rs9.getString("branch") + "-100", "amt2") + bsr.data(rs9.getString("branch") + "-200", "amt2") + bsr.data(rs9.getString("branch") + "-300", "amt2") + bsr.data(rs9.getString("branch") + "-400", "amt2") + bsr.data(rs9.getString("branch") + "-500", "amt2"))) {
                System.out.println(rs9.getString("branch") + "\tno1");
            }
            if (rs9.getInt("amt3") != (bsr.data(rs9.getString("branch") + "-100", "amt3") + bsr.data(rs9.getString("branch") + "-200", "amt3") + bsr.data(rs9.getString("branch") + "-300", "amt3") + bsr.data(rs9.getString("branch") + "-400", "amt3") + bsr.data(rs9.getString("branch") + "-500", "amt3"))) {
                System.out.println(rs9.getString("branch") + "\tno1");
            }
        }
*/
 /*ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='400'");
        while (rs10.next()) {
            if (rs10.getInt("amt1") != (bsr.datanew(rs10.getString("branch") + "-410", "amt1") + bsr.datanew(rs10.getString("branch") + "-420", "amt1") + bsr.datanew(rs10.getString("branch") + "-430", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-410", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-420", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-430", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.datanew(rs10.getString("branch") + "-410", "amt2") + bsr.datanew(rs10.getString("branch") + "-420", "amt2") + bsr.datanew(rs10.getString("branch") + "-430", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-410", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-420", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-430", "amt2"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-410", "amt3") + bsr.datanew(rs10.getString("branch") + "-420", "amt3") + bsr.datanew(rs10.getString("branch") + "-430", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-410", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-420", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-430", "amt3"));
            }
        }
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='0'");
        while (rs10.next()) {
            System.out.println(rs10.getString("branch"));
            if (rs10.getInt("amt1") != (bsr.datanew(rs10.getString("branch") + "-100", "amt1") + bsr.datanew(rs10.getString("branch") + "-200", "amt1") + bsr.datanew(rs10.getString("branch") + "-300", "amt1") + bsr.datanew(rs10.getString("branch") + "-400", "amt1") + bsr.datanew(rs10.getString("branch") + "-500", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-100", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-200", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-300", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-400", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-500", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.datanew(rs10.getString("branch") + "-100", "amt2") + bsr.datanew(rs10.getString("branch") + "-200", "amt2") + bsr.datanew(rs10.getString("branch") + "-300", "amt2") + bsr.datanew(rs10.getString("branch") + "-400", "amt2") + bsr.datanew(rs10.getString("branch") + "-500", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-100", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-200", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-300", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-400", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-500", "amt2"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-100", "amt3") + bsr.datanew(rs10.getString("branch") + "-200", "amt3") + bsr.datanew(rs10.getString("branch") + "-300", "amt3") + bsr.datanew(rs10.getString("branch") + "-400", "amt3") + bsr.datanew(rs10.getString("branch") + "-500", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-100", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-200", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-300", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-400", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-500", "amt3"));
            }
        }
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='410'");
        while (rs10.next()) {
            //System.out.println(rs10.getString("branch"));
            if (rs10.getInt("amt1") != (bsr.datanew(rs10.getString("branch") + "-610", "amt1") + bsr.datanew(rs10.getString("branch") + "-2000", "amt1") + bsr.datanew(rs10.getString("branch") + "-3000", "amt1") + bsr.datanew(rs10.getString("branch") + "-4000", "amt1") + bsr.datanew(rs10.getString("branch") + "-5000", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-610", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-2000", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-3000", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-4000", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-5000", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.datanew(rs10.getString("branch") + "-610", "amt2") + bsr.datanew(rs10.getString("branch") + "-2000", "amt2") + bsr.datanew(rs10.getString("branch") + "-3000", "amt2") + bsr.datanew(rs10.getString("branch") + "-4000", "amt2") + bsr.datanew(rs10.getString("branch") + "-5000", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-610", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-2000", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-3000", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-4000", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-5000", "amt2"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-610", "amt3") + bsr.datanew(rs10.getString("branch") + "-2000", "amt3") + bsr.datanew(rs10.getString("branch") + "-3000", "amt3") + bsr.datanew(rs10.getString("branch") + "-4000", "amt3") + bsr.datanew(rs10.getString("branch") + "-5000", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-610", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-2000", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-3000", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-4000", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-5000", "amt3"));
            }
        }*/
 /* ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='910'");
        while (rs10.next()) {
            System.out.println(rs10.getString("branch"));
            String data1 = bsr.datanewfinal(rs10.getString("branch") + "-901");
            String data2 = bsr.datanewfinal(rs10.getString("branch") + "-902");
            String data3 = bsr.datanewfinal(rs10.getString("branch") + "-903");
            String data4 = bsr.datanewfinal(rs10.getString("branch") + "-904");
            String data5 = bsr.datanewfinal(rs10.getString("branch") + "-905");
            String data6 = bsr.datanewfinal(rs10.getString("branch") + "-906");
            if (rs10.getInt("no1") != (Integer.parseInt(data1.split("~")[0]) + Integer.parseInt(data2.split("~")[0]) + Integer.parseInt(data3.split("~")[0]) + Integer.parseInt(data4.split("~")[0]) + Integer.parseInt(data5.split("~")[0]) + Integer.parseInt(data6.split("~")[0]))) {
                System.out.println(rs10.getString("branch") + "\tno1");
            }
            if (rs10.getInt("no2") != (Integer.parseInt(data1.split("~")[1]) + Integer.parseInt(data2.split("~")[1]) + Integer.parseInt(data3.split("~")[1]) + Integer.parseInt(data4.split("~")[1]) + Integer.parseInt(data5.split("~")[1]) + Integer.parseInt(data6.split("~")[1]))) {
                System.out.println(rs10.getString("branch") + "\tno2");
            }
            if (rs10.getInt("no3") != (Integer.parseInt(data1.split("~")[2]) + Integer.parseInt(data2.split("~")[2]) + Integer.parseInt(data3.split("~")[2]) + Integer.parseInt(data4.split("~")[2]) + Integer.parseInt(data5.split("~")[2]) + Integer.parseInt(data6.split("~")[2]))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt1") != (Integer.parseInt(data1.split("~")[3]) + Integer.parseInt(data2.split("~")[3]) + Integer.parseInt(data3.split("~")[3]) + Integer.parseInt(data4.split("~")[3]) + Integer.parseInt(data5.split("~")[3]) + Integer.parseInt(data6.split("~")[3]))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-601", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-602", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-604", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-604", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-605", "amt1") + "\t" + bsr.datanew(rs10.getString("branch") + "-606", "amt1"));
            }
            if (rs10.getInt("amt2") != (Integer.parseInt(data1.split("~")[4]) + Integer.parseInt(data2.split("~")[4]) + Integer.parseInt(data3.split("~")[4]) + Integer.parseInt(data4.split("~")[4]) + Integer.parseInt(data5.split("~")[4]) + Integer.parseInt(data6.split("~")[4]))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-601", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-602", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-603", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-604", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-605", "amt2") + "\t" + bsr.datanew(rs10.getString("branch") + "-606", "amt2"));
            }
            if (rs10.getInt("amt3") != (Integer.parseInt(data1.split("~")[5]) + Integer.parseInt(data2.split("~")[5]) + Integer.parseInt(data3.split("~")[5]) + Integer.parseInt(data4.split("~")[5]) + Integer.parseInt(data5.split("~")[5]) + Integer.parseInt(data6.split("~")[5]))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-601", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-602", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-603", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-604", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-605", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-606", "amt3"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs10.getString("branch")+"\tamt3\terror");
                //System.out.println(rs10.getString("branch") + "\tamt3\t" + bsr.data(rs10.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-410", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-610", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-610", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-601", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-602", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-603", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-604", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-605", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-606", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-601", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-602", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-603", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-604", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-605", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-606", "no3"));
            }
            if (rs10.getInt("no3") != (bsr.datanew(rs10.getString("branch") + "-410", "no3"))) {
                System.out.println(rs10.getString("branch")+"\tno3\terror");
                //System.out.println(rs10.getString("branch") + "\tno3\t" + rs10.getInt("no3") + "\t" + bsr.data(rs10.getString("branch") + "-410", "no3"));
            }
        }*/
 /* ResultSet rs11 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='720'");
        while (rs11.next()) {
            System.out.println(rs11.getString("branch"));
            String data1 = bsr.datanewfinal(rs11.getString("branch") + "-701");
            String data2 = bsr.datanewfinal(rs11.getString("branch") + "-702");
            String data3 = bsr.datanewfinal(rs11.getString("branch") + "-703");
            String data4 = bsr.datanewfinal(rs11.getString("branch") + "-704");
            String data5 = bsr.datanewfinal(rs11.getString("branch") + "-705");
            String data6 = bsr.datanewfinal(rs11.getString("branch") + "-706");
            String data7 = bsr.datanewfinal(rs11.getString("branch") + "-707");
            String data8 = bsr.datanewfinal(rs11.getString("branch") + "-708");
            String data9 = bsr.datanewfinal(rs11.getString("branch") + "-709");
            String data11 = bsr.datanewfinal(rs11.getString("branch") + "-711");
            String data12 = bsr.datanewfinal(rs11.getString("branch") + "-712");
            if (rs11.getInt("no1") != (Integer.parseInt(data1.split("~")[0]) + Integer.parseInt(data2.split("~")[0]) + Integer.parseInt(data3.split("~")[0]) + Integer.parseInt(data4.split("~")[0]) + Integer.parseInt(data5.split("~")[0]) + Integer.parseInt(data6.split("~")[0]) + Integer.parseInt(data7.split("~")[0]) + Integer.parseInt(data8.split("~")[0]) + Integer.parseInt(data9.split("~")[0]) + Integer.parseInt(data11.split("~")[0]) + Integer.parseInt(data12.split("~")[0]))) {
                System.out.println(rs11.getString("branch") + "\tno1");
            }
            if (rs11.getInt("no2") != (Integer.parseInt(data1.split("~")[1]) + Integer.parseInt(data2.split("~")[1]) + Integer.parseInt(data3.split("~")[1]) + Integer.parseInt(data4.split("~")[1]) + Integer.parseInt(data5.split("~")[1]) + Integer.parseInt(data6.split("~")[1]) + Integer.parseInt(data7.split("~")[1]) + Integer.parseInt(data8.split("~")[1]) + Integer.parseInt(data9.split("~")[1]) + Integer.parseInt(data11.split("~")[1]) + Integer.parseInt(data12.split("~")[1]))) {
                System.out.println(rs11.getString("branch") + "\tno2");
            }
            if (rs11.getInt("no3") != (Integer.parseInt(data1.split("~")[2]) + Integer.parseInt(data2.split("~")[2]) + Integer.parseInt(data3.split("~")[2]) + Integer.parseInt(data4.split("~")[2]) + Integer.parseInt(data5.split("~")[2]) + Integer.parseInt(data6.split("~")[2]) + Integer.parseInt(data7.split("~")[2]) + Integer.parseInt(data8.split("~")[2]) + Integer.parseInt(data9.split("~")[2]) + Integer.parseInt(data11.split("~")[2]) + Integer.parseInt(data12.split("~")[2]))) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt1") != (Integer.parseInt(data1.split("~")[3]) + Integer.parseInt(data2.split("~")[3]) + Integer.parseInt(data3.split("~")[3]) + Integer.parseInt(data4.split("~")[3]) + Integer.parseInt(data5.split("~")[3]) + Integer.parseInt(data6.split("~")[3]) + Integer.parseInt(data7.split("~")[3]) + Integer.parseInt(data8.split("~")[3]) + Integer.parseInt(data9.split("~")[3]) + Integer.parseInt(data11.split("~")[3]) + Integer.parseInt(data12.split("~")[3]))) {
                System.out.println(rs11.getString("branch") + "\tamt1\t" + rs11.getInt("amt1") + "\t" + bsr.datanew(rs11.getString("branch") + "-601", "amt1") + "\t" + bsr.datanew(rs11.getString("branch") + "-602", "amt1") + "\t" + bsr.datanew(rs11.getString("branch") + "-604", "amt1") + "\t" + bsr.datanew(rs11.getString("branch") + "-604", "amt1") + "\t" + bsr.datanew(rs11.getString("branch") + "-605", "amt1") + "\t" + bsr.datanew(rs11.getString("branch") + "-606", "amt1"));
            }
            if (rs11.getInt("amt2") != (Integer.parseInt(data1.split("~")[4]) + Integer.parseInt(data2.split("~")[4]) + Integer.parseInt(data3.split("~")[4]) + Integer.parseInt(data4.split("~")[4]) + Integer.parseInt(data5.split("~")[4]) + Integer.parseInt(data6.split("~")[4]) + Integer.parseInt(data7.split("~")[4]) + Integer.parseInt(data8.split("~")[4]) + Integer.parseInt(data9.split("~")[4]) + Integer.parseInt(data11.split("~")[4]) + Integer.parseInt(data12.split("~")[4]))) {
                System.out.println(rs11.getString("branch") + "\tamt2\t" + rs11.getInt("amt2") + "\t" + bsr.datanew(rs11.getString("branch") + "-601", "amt2") + "\t" + bsr.datanew(rs11.getString("branch") + "-602", "amt2") + "\t" + bsr.datanew(rs11.getString("branch") + "-603", "amt2") + "\t" + bsr.datanew(rs11.getString("branch") + "-604", "amt2") + "\t" + bsr.datanew(rs11.getString("branch") + "-605", "amt2") + "\t" + bsr.datanew(rs11.getString("branch") + "-606", "amt2"));
            }
            if (rs11.getInt("amt3") != (Integer.parseInt(data1.split("~")[5]) + Integer.parseInt(data2.split("~")[5]) + Integer.parseInt(data3.split("~")[5]) + Integer.parseInt(data4.split("~")[5]) + Integer.parseInt(data5.split("~")[5]) + Integer.parseInt(data6.split("~")[5]) + Integer.parseInt(data7.split("~")[5]) + Integer.parseInt(data8.split("~")[5]) + Integer.parseInt(data9.split("~")[5]) + Integer.parseInt(data11.split("~")[5]) + Integer.parseInt(data12.split("~")[5]))) {
                System.out.println(rs11.getString("branch") + "\tamt3\t" + rs11.getInt("amt3") + "\t" + bsr.datanew(rs11.getString("branch") + "-601", "amt3") + "\t" + bsr.datanew(rs11.getString("branch") + "-602", "amt3") + "\t" + bsr.datanew(rs11.getString("branch") + "-603", "amt3") + "\t" + bsr.datanew(rs11.getString("branch") + "-604", "amt3") + "\t" + bsr.datanew(rs11.getString("branch") + "-605", "amt3") + "\t" + bsr.datanew(rs11.getString("branch") + "-606", "amt3"));
            }
            if (rs11.getInt("amt3") != (bsr.datanew(rs11.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3\terror");
                //System.out.println(rs11.getString("branch") + "\tamt3\t" + bsr.data(rs11.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-410", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-610", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-610", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-601", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-602", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-603", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-604", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-605", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-606", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-601", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-602", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-603", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-604", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-605", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-606", "no3"));
            }
            if (rs11.getInt("no3") != (bsr.datanew(rs11.getString("branch") + "-410", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3\terror");
                //System.out.println(rs11.getString("branch") + "\tno3\t" + rs11.getInt("no3") + "\t" + bsr.data(rs11.getString("branch") + "-410", "no3"));
            }
        }
        ResultSet rs12 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='810'");
        while (rs12.next()) {
            //System.out.println(rs12.getString("branch"));
            String data1 = bsr.datanewfinal(rs12.getString("branch") + "-801");
            String data2 = bsr.datanewfinal(rs12.getString("branch") + "-802");
            String data3 = bsr.datanewfinal(rs12.getString("branch") + "-803");
            String data4 = bsr.datanewfinal(rs12.getString("branch") + "-804");
            if (rs12.getInt("no1") != (Integer.parseInt(data1.split("~")[0]) + Integer.parseInt(data2.split("~")[0]) + Integer.parseInt(data3.split("~")[0]) + Integer.parseInt(data4.split("~")[0]))) {
                System.out.println(rs12.getString("branch") + "\tno1");
            }
            if (rs12.getInt("no2") != (Integer.parseInt(data1.split("~")[1]) + Integer.parseInt(data2.split("~")[1]) + Integer.parseInt(data3.split("~")[1]) + Integer.parseInt(data4.split("~")[1]))) {
                System.out.println(rs12.getString("branch") + "\tno2");
            }
            if (rs12.getInt("no3") != (Integer.parseInt(data1.split("~")[2]) + Integer.parseInt(data2.split("~")[2]) + Integer.parseInt(data3.split("~")[2]) + Integer.parseInt(data4.split("~")[2]))) {
                System.out.println(rs12.getString("branch") + "\t" + rs12.getString("no3") + "\tno3\t" + data1.split("~")[2] + "\t" + data2.split("~")[2] + "\t" + data3.split("~")[2] + "\t" + data4.split("~")[2]);
            }
            if (rs12.getInt("amt1") != (Integer.parseInt(data1.split("~")[3]) + Integer.parseInt(data2.split("~")[3]) + Integer.parseInt(data3.split("~")[3]) + Integer.parseInt(data4.split("~")[3]))) {
                System.out.println(rs12.getString("branch") + "\tamt1\t" + rs12.getInt("amt1") + "\t" + Integer.parseInt(data2.split("~")[3]) + "\t" + bsr.datanew(rs12.getString("branch") + "-602", "amt1") + "\t" + bsr.datanew(rs12.getString("branch") + "-604", "amt1") + "\t" + bsr.datanew(rs12.getString("branch") + "-604", "amt1") + "\t" + bsr.datanew(rs12.getString("branch") + "-605", "amt1") + "\t" + bsr.datanew(rs12.getString("branch") + "-606", "amt1"));
            }
            if (rs12.getInt("amt2") != (Integer.parseInt(data1.split("~")[4]) + Integer.parseInt(data2.split("~")[4]) + Integer.parseInt(data3.split("~")[4]) + Integer.parseInt(data4.split("~")[4]))) {
                System.out.println(rs12.getString("branch") + "\tamt2\t" + rs12.getInt("amt2") + "\t" + bsr.datanew(rs12.getString("branch") + "-601", "amt2") + "\t" + bsr.datanew(rs12.getString("branch") + "-602", "amt2") + "\t" + bsr.datanew(rs12.getString("branch") + "-603", "amt2") + "\t" + bsr.datanew(rs12.getString("branch") + "-604", "amt2") + "\t" + bsr.datanew(rs12.getString("branch") + "-605", "amt2") + "\t" + bsr.datanew(rs12.getString("branch") + "-606", "amt2"));
            }
            if (rs12.getInt("amt3") != (Integer.parseInt(data1.split("~")[5]) + Integer.parseInt(data2.split("~")[5]) + Integer.parseInt(data3.split("~")[5]) + Integer.parseInt(data4.split("~")[5]))) {
                System.out.println(rs12.getString("branch") + "\tamt3\t" + rs12.getInt("amt3") + "\t" + bsr.datanew(rs12.getString("branch") + "-601", "amt3") + "\t" + bsr.datanew(rs12.getString("branch") + "-602", "amt3") + "\t" + bsr.datanew(rs12.getString("branch") + "-603", "amt3") + "\t" + bsr.datanew(rs12.getString("branch") + "-604", "amt3") + "\t" + bsr.datanew(rs12.getString("branch") + "-605", "amt3") + "\t" + bsr.datanew(rs12.getString("branch") + "-606", "amt3"));
            }
            if (rs12.getInt("amt3") != (bsr.datanew(rs12.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3\terror");
                //System.out.println(rs12.getString("branch") + "\tamt3\t" + bsr.data(rs12.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-410", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-610", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-610", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-601", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-602", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-603", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-604", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-605", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-606", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-601", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-602", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-603", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-604", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-605", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-606", "no3"));
            }
            if (rs12.getInt("no3") != (bsr.datanew(rs12.getString("branch") + "-410", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3\terror");
                //System.out.println(rs12.getString("branch") + "\tno3\t" + rs12.getInt("no3") + "\t" + bsr.data(rs12.getString("branch") + "-410", "no3"));
            }
        }
        /*ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='600'");
        while (rs10.next()) {
            //System.out.println(rs10.getString("branch"));
            if (rs10.getInt("amt1") != (bsr.dataold(rs10.getString("branch") + "-611", "amt1") + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + bsr.dataold(rs10.getString("branch") + "-613", "amt1") + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + bsr.dataold(rs10.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.dataold(rs10.getString("branch") + "-611", "amt2") + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + bsr.dataold(rs10.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt2"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-721", "amt3") + bsr.datanew(rs10.getString("branch") + "-722", "amt3") + bsr.datanew(rs10.getString("branch") + "-723", "amt3") + bsr.datanew(rs10.getString("branch") + "-724", "amt3") + bsr.datanew(rs10.getString("branch") + "-725", "amt3") + bsr.datanew(rs10.getString("branch") + "-726", "amt3")+ bsr.datanew(rs10.getString("branch") + "-727", "amt3")+ bsr.datanew(rs10.getString("branch") + "-728", "amt3")+ bsr.datanew(rs10.getString("branch") + "-729", "amt3")+ bsr.datanew(rs10.getString("branch") + "-731", "amt3")+ bsr.datanew(rs10.getString("branch") + "-732", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-721", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-722", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-723", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-724", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-725", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-726", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-727", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-728", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-729", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-731", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-732", "amt3"));
            }
        }
         ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='700'");
        while (rs10.next()) {
            System.out.println(rs10.getString("branch"));
            /*if (rs10.getInt("amt1") != (bsr.dataold(rs10.getString("branch") + "-611", "amt1") + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + bsr.dataold(rs10.getString("branch") + "-613", "amt1") + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + bsr.dataold(rs10.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.dataold(rs10.getString("branch") + "-611", "amt2") + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + bsr.dataold(rs10.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt2"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-721", "amt3") + bsr.datanew(rs10.getString("branch") + "-722", "amt3") + bsr.datanew(rs10.getString("branch") + "-723", "amt3") + bsr.datanew(rs10.getString("branch") + "-724", "amt3") + bsr.datanew(rs10.getString("branch") + "-725", "amt3") + bsr.datanew(rs10.getString("branch") + "-726", "amt3")+ bsr.datanew(rs10.getString("branch") + "-727", "amt3")+ bsr.datanew(rs10.getString("branch") + "-728", "amt3")+ bsr.datanew(rs10.getString("branch") + "-729", "amt3")+ bsr.datanew(rs10.getString("branch") + "-731", "amt3")+ bsr.datanew(rs10.getString("branch") + "-732", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-721", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-722", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-723", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-724", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-725", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-726", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-727", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-728", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-729", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-731", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-732", "amt3"));
            }
        }
         */
        // ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='610'");
        //System.out.println(rs10.getString("branch"));
        /*if (rs10.getInt("amt1") != (bsr.dataold(rs10.getString("branch") + "-611", "amt1") + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + bsr.dataold(rs10.getString("branch") + "-613", "amt1") + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + bsr.dataold(rs10.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.dataold(rs10.getString("branch") + "-611", "amt2") + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + bsr.dataold(rs10.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt2"));
            }*/
 /* if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-901", "amt3") + bsr.datanew(rs10.getString("branch") + "-902", "amt3") + bsr.datanew(rs10.getString("branch") + "-903", "amt3") + bsr.datanew(rs10.getString("branch") + "-904", "amt3")+ bsr.datanew(rs10.getString("branch") + "-905", "amt3")+ bsr.datanew(rs10.getString("branch") + "-906", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-901", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-902", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-903", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-904", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-905", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-906", "amt3"));
            }*/
 /*int a = (bsr.datanew(rs10.getString("branch") + "-0", "amt3") - bsr.datanew(rs10.getString("branch") + "-500", "amt3") - bsr.datanew(rs10.getString("branch") + "-311", "amt3"));
            if (rs10.getInt("amt3") != a) {
                System.out.println(rs10.getString("branch") + "\t600-(000-500-311)amt3\t" + rs10.getInt("amt3") + "\t" + a);
            }
            if ((bsr.datanew(rs10.getString("branch") + "-800", "amt3")) != (bsr.datanew(rs10.getString("branch") + "-0", "amt3") - bsr.datanew(rs10.getString("branch") + "-500", "amt3") - bsr.datanew(rs10.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\t800-(000-500-311)amt3\t" + (bsr.datanew(rs10.getString("branch") + "-800", "amt3")) + "\t" + a);
            }
            if ((bsr.datanew(rs10.getString("branch") + "-900", "amt3")) != (bsr.datanew(rs10.getString("branch") + "-0", "amt3") - bsr.datanew(rs10.getString("branch") + "-500", "amt3") - bsr.datanew(rs10.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\t900-(000-500-311)amt3\t" + (bsr.datanew(rs10.getString("branch") + "-900", "amt3")) + "\t" + a);
            }
            if ((bsr.datanew(rs10.getString("branch") + "-700", "amt3")) != (bsr.datanew(rs10.getString("branch") + "-0", "amt3") - bsr.datanew(rs10.getString("branch") + "-500", "amt3") - bsr.datanew(rs10.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\t700-(000-500-311)amt3\t" + (bsr.datanew(rs10.getString("branch") + "-700", "amt3")) + "\t" + a);
            }
            if ((bsr.datanew(rs10.getString("branch") + "-900", "amt3")) != (bsr.datanew(rs10.getString("branch") + "-0", "amt3") - bsr.datanew(rs10.getString("branch") + "-500", "amt3") - bsr.datanew(rs10.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\t910-410amt3\t");
            }*/
        //System.out.println(rs10.getString("branch")+"\t"+rs10.getInt("amt3")+"\t"+bsr.datanew(rs10.getString("branch")+ "-611", "amt3") +"\t"+ bsr.datanew(rs10.getString("branch")+ "-612", "amt3") +"\t"+ bsr.datanew(rs10.getString("branch")+ "-613", "amt3") +"\t"+ bsr.datanew(rs10.getString("branch")+"-614", "amt3")+"\t"+ bsr.datanew(rs10.getString("branch")+"-615", "amt3")+"\t"+ bsr.datanew(rs10.getString("branch")+"-616", "amt3"));
        /*ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='0'");
        while (rs11.next()) {
            //System.out.println(rs11.getString("branch") + "\t" + rs11.getInt("amt1") + "\t" + rs11.getInt("amt2") + "\t" + rs11.getInt("amt3"));
            if ((bsr.datanew(rs11.getString("branch") + "-610", "amt3")) != (bsr.datanew(rs11.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\t610-410amt3\t");
            }
            if ((bsr.datanew(rs11.getString("branch") + "-720", "amt3")) != (bsr.datanew(rs11.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\t720-410amt3\t");
            }
            if ((bsr.datanew(rs11.getString("branch") + "-810", "amt3")) != (bsr.datanew(rs11.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\t810-410amt3\t");
            }
            if ((bsr.datanew(rs11.getString("branch") + "-910", "amt3")) != (bsr.datanew(rs11.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\t910-410amt3\t");
            }
        }*/
 /* ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where code='600'");
        while (rs10.next()) {
            //System.out.println(rs10.getString("branch"));
            if (rs10.getInt("amt1") != (bsr.dataold(rs10.getString("branch") + "-611", "amt1") + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + bsr.dataold(rs10.getString("branch") + "-613", "amt1") + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + bsr.dataold(rs10.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1\t" + rs10.getInt("amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt1") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt1"));
            }
            if (rs10.getInt("amt2") != (bsr.dataold(rs10.getString("branch") + "-611", "amt2") + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + bsr.dataold(rs10.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2\t" + rs10.getInt("amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-611", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-612", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-613", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-614", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-615", "amt2") + "\t" + bsr.dataold(rs10.getString("branch") + "-616", "amt2"));
            }
            if (rs10.getInt("amt3") != (bsr.datanew(rs10.getString("branch") + "-611", "amt3") + bsr.datanew(rs10.getString("branch") + "-612", "amt3") + bsr.datanew(rs10.getString("branch") + "-613", "amt3") + bsr.datanew(rs10.getString("branch") + "-614", "amt3") + bsr.datanew(rs10.getString("branch") + "-615", "amt3") + bsr.datanew(rs10.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + rs10.getInt("amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-611", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-612", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-613", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-614", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-615", "amt3") + "\t" + bsr.datanew(rs10.getString("branch") + "-616", "amt3"));
            }
        }*/
 /* ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='600'");
        while (rs11.next()) {
            System.out.println(rs11.getString("branch"));
            if (rs11.getInt("amt1") != (bsr.data(rs11.getString("branch") + "-611", "amt1") + bsr.data(rs11.getString("branch") + "-612", "amt1") + bsr.data(rs11.getString("branch") + "-613", "amt1") + bsr.data(rs11.getString("branch") + "-614", "amt1") + bsr.data(rs11.getString("branch") + "-615", "amt1") + bsr.data(rs11.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs11.getString("branch") + "\tamt1\t" + rs11.getInt("amt1") + "\t" + bsr.data(rs11.getString("branch") + "-611", "amt1") + "\t" + bsr.data(rs11.getString("branch") + "-612", "amt1") + "\t" + bsr.data(rs11.getString("branch") + "-614", "amt1") + "\t" + bsr.data(rs11.getString("branch") + "-614", "amt1") + "\t" + bsr.data(rs11.getString("branch") + "-615", "amt1") + "\t" + bsr.data(rs11.getString("branch") + "-616", "amt1"));
            }
            if (rs11.getInt("amt2") != (bsr.data(rs11.getString("branch") + "-611", "amt2") + bsr.data(rs11.getString("branch") + "-612", "amt2") + bsr.data(rs11.getString("branch") + "-613", "amt2") + bsr.data(rs11.getString("branch") + "-614", "amt2") + bsr.data(rs11.getString("branch") + "-615", "amt2") + bsr.data(rs11.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs11.getString("branch") + "\tamt2\t" + rs11.getInt("amt2") + "\t" + bsr.data(rs11.getString("branch") + "-611", "amt2") + "\t" + bsr.data(rs11.getString("branch") + "-612", "amt2") + "\t" + bsr.data(rs11.getString("branch") + "-613", "amt2") + "\t" + bsr.data(rs11.getString("branch") + "-614", "amt2") + "\t" + bsr.data(rs11.getString("branch") + "-615", "amt2") + "\t" + bsr.data(rs11.getString("branch") + "-616", "amt2"));
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-611", "amt3") + bsr.data(rs11.getString("branch") + "-612", "amt3") + bsr.data(rs11.getString("branch") + "-613", "amt3") + bsr.data(rs11.getString("branch") + "-614", "amt3") + bsr.data(rs11.getString("branch") + "-615", "amt3") + bsr.data(rs11.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3\t" + rs11.getInt("amt3") + "\t" + bsr.data(rs11.getString("branch") + "-611", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-612", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-613", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-614", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-615", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-616", "amt3"));
            }
        }
        
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='610'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no1") != (bsr.data(rs11.getString("branch") + "-611", "no1") + bsr.data(rs11.getString("branch") + "-612", "no1") + bsr.data(rs11.getString("branch") + "-613", "no1") + bsr.data(rs11.getString("branch") + "-614", "no1") + bsr.data(rs11.getString("branch") + "-615", "no1") + bsr.data(rs11.getString("branch") + "-616", "no1"))) {
                System.out.println(rs11.getString("branch") + "\tno1");
            }
            if (rs11.getInt("no2") != (bsr.data(rs11.getString("branch") + "-611", "no2") + bsr.data(rs11.getString("branch") + "-612", "no2") + bsr.data(rs11.getString("branch") + "-613", "no2") + bsr.data(rs11.getString("branch") + "-614", "no2") + bsr.data(rs11.getString("branch") + "-615", "no2") + bsr.data(rs11.getString("branch") + "-616", "no2"))) {
                System.out.println(rs11.getString("branch") + "\tno2");
            }
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-611", "no3") + bsr.data(rs11.getString("branch") + "-612", "no3") + bsr.data(rs11.getString("branch") + "-613", "no3") + bsr.data(rs11.getString("branch") + "-614", "no3") + bsr.data(rs11.getString("branch") + "-615", "no3") + bsr.data(rs11.getString("branch") + "-616", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt1") != (bsr.data(rs11.getString("branch") + "-611", "amt1") + bsr.data(rs11.getString("branch") + "-612", "amt1") + bsr.data(rs11.getString("branch") + "-613", "amt1") + bsr.data(rs11.getString("branch") + "-614", "amt1") + bsr.data(rs11.getString("branch") + "-615", "amt1") + bsr.data(rs11.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs11.getString("branch") + "\tamt1");
            }
            if (rs11.getInt("amt2") != (bsr.data(rs11.getString("branch") + "-611", "amt2") + bsr.data(rs11.getString("branch") + "-612", "amt2") + bsr.data(rs11.getString("branch") + "-613", "amt2") + bsr.data(rs11.getString("branch") + "-614", "amt2") + bsr.data(rs11.getString("branch") + "-615", "amt2") + bsr.data(rs11.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs11.getString("branch") + "\tamt2");
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-611", "amt3") + bsr.data(rs11.getString("branch") + "-612", "amt3") + bsr.data(rs11.getString("branch") + "-613", "amt3") + bsr.data(rs11.getString("branch") + "-614", "amt3") + bsr.data(rs11.getString("branch") + "-615", "amt3") + bsr.data(rs11.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3\t" + bsr.data(rs11.getString("branch") + "-600", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs11.getString("branch") + "-611", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-612", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-613", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-614", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-615", "amt3") + "\t" + bsr.data(rs11.getString("branch") + "-616", "amt3"));
            }
        }
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='720'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no1") != (bsr.data(rs12.getString("branch") + "-701", "no1") + bsr.data(rs12.getString("branch") + "-702", "no1") + bsr.data(rs12.getString("branch") + "-703", "no1") + bsr.data(rs12.getString("branch") + "-704", "no1") + bsr.data(rs12.getString("branch") + "-705", "no1") + bsr.data(rs12.getString("branch") + "-706", "no1") + bsr.data(rs12.getString("branch") + "-707", "no1") + bsr.data(rs12.getString("branch") + "-708", "no1") + bsr.data(rs12.getString("branch") + "-709", "no1") + bsr.data(rs12.getString("branch") + "-711", "no1") + bsr.data(rs12.getString("branch") + "-712", "no1"))) {
                System.out.println(rs12.getString("branch") + "\tno1");
            }
            if (rs12.getInt("no2") != (bsr.data(rs12.getString("branch") + "-701", "no2") + bsr.data(rs12.getString("branch") + "-702", "no2") + bsr.data(rs12.getString("branch") + "-703", "no2") + bsr.data(rs12.getString("branch") + "-704", "no2") + bsr.data(rs12.getString("branch") + "-705", "no2") + bsr.data(rs12.getString("branch") + "-706", "no2") + bsr.data(rs12.getString("branch") + "-707", "no2") + bsr.data(rs12.getString("branch") + "-708", "no2") + bsr.data(rs12.getString("branch") + "-709", "no2") + bsr.data(rs12.getString("branch") + "-711", "no2") + bsr.data(rs12.getString("branch") + "-712", "no2"))) {
                System.out.println(rs12.getString("branch") + "\tno2");
            }
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt1") != (bsr.data(rs12.getString("branch") + "-701", "amt1") + bsr.data(rs12.getString("branch") + "-702", "amt1") + bsr.data(rs12.getString("branch") + "-703", "amt1") + bsr.data(rs12.getString("branch") + "-704", "amt1") + bsr.data(rs12.getString("branch") + "-705", "amt1") + bsr.data(rs12.getString("branch") + "-706", "amt1") + bsr.data(rs12.getString("branch") + "-707", "amt1") + bsr.data(rs12.getString("branch") + "-708", "amt1") + bsr.data(rs12.getString("branch") + "-709", "amt1") + bsr.data(rs12.getString("branch") + "-711", "amt1") + bsr.data(rs12.getString("branch") + "-712", "amt1"))) {
                System.out.println(rs12.getString("branch") + "\tamt1");
            }
            if (rs12.getInt("amt2") != (bsr.data(rs12.getString("branch") + "-701", "amt2") + bsr.data(rs12.getString("branch") + "-702", "amt2") + bsr.data(rs12.getString("branch") + "-703", "amt2") + bsr.data(rs12.getString("branch") + "-704", "amt2") + bsr.data(rs12.getString("branch") + "-705", "amt2") + bsr.data(rs12.getString("branch") + "-706", "amt2") + bsr.data(rs12.getString("branch") + "-707", "amt2") + bsr.data(rs12.getString("branch") + "-708", "amt2") + bsr.data(rs12.getString("branch") + "-709", "amt2") + bsr.data(rs12.getString("branch") + "-711", "amt2") + bsr.data(rs12.getString("branch") + "-712", "amt2"))) {
                System.out.println(rs12.getString("branch") + "\tamt2");
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3\t" + bsr.data(rs12.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-410", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-610", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-610", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-701", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-702", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-703", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-704", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-705", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-706", "amt3"));
            }
        }
        ResultSet rs13 = st9.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='0'");
        while (rs13.next()) {
            System.out.print(rs13.getString("branch"));
            if (rs13.getInt("amt1") != (bsr.databsr7(rs13.getString("branch"), "curr"))) {
                System.out.print("\t" + bsr.databsr7(rs13.getString("branch"), "curr") + "\t" + rs13.getInt("amt1") + "\t" + (bsr.databsr7(rs13.getString("branch"), "curr") - rs13.getInt("amt1")));
            } else {
                System.out.print("\t"+bsr.databsr7(rs13.getString("branch"), "curr")+"\t"+rs13.getInt("amt1")+"\t0");
            }
            if (rs13.getInt("amt2") != (bsr.databsr7(rs13.getString("branch"), "saving"))) {
                System.out.print("\t" + bsr.databsr7(rs13.getString("branch"), "saving") + "\t" + rs13.getInt("amt2") + "\t" + (bsr.databsr7(rs13.getString("branch"), "saving") - rs13.getInt("amt2")));
            } else {
                System.out.print("\t"+bsr.databsr7(rs13.getString("branch"), "saving")+"\t"+rs13.getInt("amt2")+"\t0");
            }
            if (rs13.getInt("amt3") != (bsr.databsr7(rs13.getString("branch"), "term"))) {
                System.out.print("\t" + bsr.databsr7(rs13.getString("branch"), "term") + "\t" + rs13.getInt("amt3") + "\t" + (bsr.databsr7(rs13.getString("branch"), "term") - rs13.getInt("amt3")));
            } else {
                System.out.print("\t"+bsr.databsr7(rs13.getString("branch"), "term")+"\t"+rs13.getInt("amt3")+"\t0");
            }
            System.out.println("");
        }*/
 /*ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='610'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no1") != (bsr.data(rs10.getString("branch") + "-601", "no1") + bsr.data(rs10.getString("branch") + "-602", "no1") + bsr.data(rs10.getString("branch") + "-603", "no1") + bsr.data(rs10.getString("branch") + "-604", "no1") + bsr.data(rs10.getString("branch") + "-605", "no1") + bsr.data(rs10.getString("branch") + "-606", "no1"))) {
                System.out.println(rs10.getString("branch") + "\tno1");
            }
            if (rs10.getInt("no2") != (bsr.data(rs10.getString("branch") + "-601", "no2") + bsr.data(rs10.getString("branch") + "-602", "no2") + bsr.data(rs10.getString("branch") + "-603", "no2") + bsr.data(rs10.getString("branch") + "-604", "no2") + bsr.data(rs10.getString("branch") + "-605", "no2") + bsr.data(rs10.getString("branch") + "-606", "no2"))) {
                System.out.println(rs10.getString("branch") + "\tno2");
            }
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt1") != (bsr.data(rs10.getString("branch") + "-601", "amt1") + bsr.data(rs10.getString("branch") + "-602", "amt1") + bsr.data(rs10.getString("branch") + "-603", "amt1") + bsr.data(rs10.getString("branch") + "-604", "amt1") + bsr.data(rs10.getString("branch") + "-605", "amt1") + bsr.data(rs10.getString("branch") + "-606", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1");
            }
            if (rs10.getInt("amt2") != (bsr.data(rs10.getString("branch") + "-601", "amt2") + bsr.data(rs10.getString("branch") + "-602", "amt2") + bsr.data(rs10.getString("branch") + "-603", "amt2") + bsr.data(rs10.getString("branch") + "-604", "amt2") + bsr.data(rs10.getString("branch") + "-605", "amt2") + bsr.data(rs10.getString("branch") + "-606", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + bsr.data(rs10.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-410", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-610", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-610", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-601", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-602", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-603", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-604", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-605", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-606", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-601", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-602", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-603", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-604", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-605", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-606", "no3"));
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + bsr.data(rs10.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-410", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-610", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-610", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-601", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-602", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-603", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-604", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-605", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-606", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-601", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-602", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-603", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-604", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-605", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-606", "no3"));
            }
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-410", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3\t" + rs10.getInt("no3") + "\t" + bsr.data(rs10.getString("branch") + "-410", "no3"));
            }
        }
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='600'");
        while (rs10.next()) {
            /*rs10.getString("branchcode");
            if (rs10.getInt("no1") != (bsr.data(rs10.getString("branch") + "-611", "no1") + bsr.data(rs10.getString("branch") + "-612", "no1") + bsr.data(rs10.getString("branch") + "-613", "no1") + bsr.data(rs10.getString("branch") + "-614", "no1") + bsr.data(rs10.getString("branch") + "-615", "no1") + bsr.data(rs10.getString("branch") + "-616", "no1"))) {
                System.out.println(rs10.getString("branch") + "\tno1");
            }
            if (rs10.getInt("no2") != (bsr.data(rs10.getString("branch") + "-611", "no2") + bsr.data(rs10.getString("branch") + "-612", "no2") + bsr.data(rs10.getString("branch") + "-613", "no2") + bsr.data(rs10.getString("branch") + "-614", "no2") + bsr.data(rs10.getString("branch") + "-615", "no2") + bsr.data(rs10.getString("branch") + "-616", "no2"))) {
                System.out.println(rs10.getString("branch") + "\tno2");
            }
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-611", "no3") + bsr.data(rs10.getString("branch") + "-612", "no3") + bsr.data(rs10.getString("branch") + "-613", "no3") + bsr.data(rs10.getString("branch") + "-614", "no3") + bsr.data(rs10.getString("branch") + "-615", "no3") + bsr.data(rs10.getString("branch") + "-616", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt1") != (bsr.data(rs10.getString("branch") + "-611", "amt1") + bsr.data(rs10.getString("branch") + "-612", "amt1") + bsr.data(rs10.getString("branch") + "-613", "amt1") + bsr.data(rs10.getString("branch") + "-614", "amt1") + bsr.data(rs10.getString("branch") + "-615", "amt1") + bsr.data(rs10.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs10.getString("branch") + "\tamt1");
            }
            if (rs10.getInt("amt2") != (bsr.data(rs10.getString("branch") + "-611", "amt2") + bsr.data(rs10.getString("branch") + "-612", "amt2") + bsr.data(rs10.getString("branch") + "-613", "amt2") + bsr.data(rs10.getString("branch") + "-614", "amt2") + bsr.data(rs10.getString("branch") + "-615", "amt2") + bsr.data(rs10.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs10.getString("branch") + "\tamt2");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-611", "amt3") + bsr.data(rs10.getString("branch") + "-612", "amt3") + bsr.data(rs10.getString("branch") + "-613", "amt3") + bsr.data(rs10.getString("branch") + "-614", "amt3") + bsr.data(rs10.getString("branch") + "-615", "amt3") + bsr.data(rs10.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + bsr.data(rs10.getString("branch") + "-600", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-611", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-612", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-613", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-614", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-615", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-616", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-611", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-612", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-613", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-614", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-615", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-616", "no3"));
            }
             if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-0", "amt3") - bsr.data(rs10.getString("branch") + "-500", "amt3") - bsr.data(rs10.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3\t" + bsr.data(rs10.getString("branch") + "-600", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-0", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-0", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-500", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-500", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-311", "amt3") + "\t" + bsr.data(rs10.getString("branch") + "-311", "no3"));
            }
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-0", "no3") - bsr.data(rs10.getString("branch") + "-500", "no3") - bsr.data(rs10.getString("branch") + "-311", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3\t" + bsr.data(rs10.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-0", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-0", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-500", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-500", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-311", "no3") + "\t" + bsr.data(rs10.getString("branch") + "-311", "no3"));
            }
        }*/
 /*
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where code='900'");
        while (rs12.next()) {
            /*if (rs12.getInt("no1") != (bsr.data(rs12.getString("branch") + "-911", "no1") + bsr.data(rs12.getString("branch") + "-912", "no1") + bsr.data(rs12.getString("branch") + "-913", "no1") + bsr.data(rs12.getString("branch") + "-914", "no1") + bsr.data(rs12.getString("branch") + "-915", "no1") + bsr.data(rs12.getString("branch") + "-916", "no1"))) {
                System.out.println(rs12.getString("branch") + "\tno1");
            }
            if (rs12.getInt("no2") != (bsr.data(rs12.getString("branch") + "-911", "no2") + bsr.data(rs12.getString("branch") + "-912", "no2") + bsr.data(rs12.getString("branch") + "-913", "no2") + bsr.data(rs12.getString("branch") + "-914", "no2") + bsr.data(rs12.getString("branch") + "-915", "no2") + bsr.data(rs12.getString("branch") + "-916", "no2"))) {
                System.out.println(rs12.getString("branch") + "\tno2");
            }
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-911", "no3") + bsr.data(rs12.getString("branch") + "-912", "no3") + bsr.data(rs12.getString("branch") + "-913", "no3") + bsr.data(rs12.getString("branch") + "-914", "no3") + bsr.data(rs12.getString("branch") + "-915", "no3") + bsr.data(rs12.getString("branch") + "-916", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt1") != (bsr.data(rs12.getString("branch") + "-911", "amt1") + bsr.data(rs12.getString("branch") + "-912", "amt1") + bsr.data(rs12.getString("branch") + "-913", "amt1") + bsr.data(rs12.getString("branch") + "-914", "amt1") + bsr.data(rs12.getString("branch") + "-915", "amt1") + bsr.data(rs12.getString("branch") + "-916", "amt1"))) {
                System.out.println(rs12.getString("branch") + "\tamt1");
            }
            if (rs12.getInt("amt2") != (bsr.data(rs12.getString("branch") + "-911", "amt2") + bsr.data(rs12.getString("branch") + "-912", "amt2") + bsr.data(rs12.getString("branch") + "-913", "amt2") + bsr.data(rs12.getString("branch") + "-914", "amt2") + bsr.data(rs12.getString("branch") + "-915", "amt2") + bsr.data(rs12.getString("branch") + "-916", "amt2"))) {
                System.out.println(rs12.getString("branch") + "\tamt2");
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-911", "amt3") + bsr.data(rs12.getString("branch") + "-912", "amt3") + bsr.data(rs12.getString("branch") + "-913", "amt3") + bsr.data(rs12.getString("branch") + "-914", "amt3") + bsr.data(rs12.getString("branch") + "-915", "amt3") + bsr.data(rs12.getString("branch") + "-916", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3\t" + rs12.getInt("amt3") + "\t" + rs12.getInt("no3") + "\t" + bsr.data(rs12.getString("branch") + "-600", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-911", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-912", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-913", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-914", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-915", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-916", "amt3"));
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-600", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3\t" + rs12.getInt("amt3") + "\t" + bsr.data(rs12.getString("branch") + "-600", "amt3"));
            }
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-911", "no3") + bsr.data(rs12.getString("branch") + "-912", "no3") + bsr.data(rs12.getString("branch") + "-913", "no3") + bsr.data(rs12.getString("branch") + "-914", "no3") + bsr.data(rs12.getString("branch") + "-915", "no3") + bsr.data(rs12.getString("branch") + "-916", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3\t" + rs12.getInt("no3") + "\t" + bsr.data(rs12.getString("branch") + "-910", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-600", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-600", "amt3") + "\t" + bsr.data(rs12.getString("branch") + "-911", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-912", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-913", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-914", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-915", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-916", "no3"));
            }
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-600", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3\t" + rs12.getInt("no3") + "\t" + bsr.data(rs12.getString("branch") + "-600", "no3"));
            }
            //System.out.println(rs12.getString("branch") + "\tamt3\t" + bsr.data(rs12.getString("branch") + "-700", "amt3") + "\t" + rs12.getInt("amt3") + "\t" + bsr.data(rs12.getString("branch") + "-410", "no3") + "\t" + bsr.data(rs12.getString("branch") + "-410", "amt3"));
        }*/
    }

    public int data(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningdatabase.planningnewfinal where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }

    public int dataold(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningdatabase.planning where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }

    public int datanew(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningdatabase.planningnewfinalfinal where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }

    public String datanewfinal(String branchcode) throws SQLException {
        String tab = "0~0~0~0~0~0";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT no1, amt1, no2, amt2, no3, amt3 FROM planningdatabase.planningnewfinalfinal where branchcode='" + branchcode + "'");
        if (rs.next()) {
            tab = rs.getString("no1") + "~" + rs.getString("no2") + "~" + rs.getString("no3") + "~" + rs.getString("amt1") + "~" + rs.getString("amt2") + "~" + rs.getString("amt3");
        }
        return tab;
    }

    public int databsr7(String sol, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningdatabase.bsr7 where sol='" + sol + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }
}
