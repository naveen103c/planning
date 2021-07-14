package CBS;

import amit.include_one;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BSRPlanning_Naveen {

    public static Connection conn;

    public BSRPlanning_Naveen() {
        try {
            include_one i = new include_one();
            conn = i.connect();
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        BSRPlanning_Naveen bsr = new BSRPlanning_Naveen();
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
        /*
        System.out.println("100");
        ResultSet rs0 = st0.executeQuery("SELECT * FROM planningfinal where code='100'");
        while (rs0.next()) {
            rs0.getString("branchcode");
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
                System.out.println(rs0.getString("branch") + "\tamt1");
            }
            if (rs0.getInt("amt2") != (bsr.data(rs0.getString("branch") + "-110", "amt2") + bsr.data(rs0.getString("branch") + "-120", "amt2") + bsr.data(rs0.getString("branch") + "-130", "amt2"))) {
                System.out.println(rs0.getString("branch") + "\tamt2");
            }
            if (rs0.getInt("amt3") != (bsr.data(rs0.getString("branch") + "-110", "amt3") + bsr.data(rs0.getString("branch") + "-120", "amt3") + bsr.data(rs0.getString("branch") + "-130", "amt3"))) {
                System.out.println(rs0.getString("branch") + "\tamt3");
            }
        }

        System.out.println("200");
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningfinal where code='200'");
        while (rs1.next()) {
            rs1.getString("branchcode");

            if (rs1.getInt("no1") != (bsr.data(rs1.getString("branch") + "-210", "no1") + bsr.data(rs1.getString("branch") + "-220", "no1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
            if (rs1.getInt("no2") != (bsr.data(rs1.getString("branch") + "-210", "no2") + bsr.data(rs1.getString("branch") + "-220", "no2"))) {
                System.out.println(rs1.getString("branch") + "\tno2");
            }
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-210", "no3") + bsr.data(rs1.getString("branch") + "-220", "no3"))) {
                System.out.println(rs1.getString("branch") + "\tno3");
            }
            if (rs1.getInt("amt1") != (bsr.data(rs1.getString("branch") + "-210", "amt1") + bsr.data(rs1.getString("branch") + "-220", "amt1"))) {
                System.out.println(rs1.getString("branch") + "\tamt1");
            }
            if (rs1.getInt("amt2") != (bsr.data(rs1.getString("branch") + "-210", "amt2") + bsr.data(rs1.getString("branch") + "-220", "amt2"))) {
                System.out.println(rs1.getString("branch") + "\tamt2");
            }
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-210", "amt3") + bsr.data(rs1.getString("branch") + "-220", "amt3"))) {
                System.out.println(rs1.getString("branch") + "\tamt3");
            }
        }

        System.out.println("300");
        ResultSet rs2 = st2.executeQuery("SELECT * FROM planningfinal where code='300'");
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
                System.out.println(rs2.getString("branch") + "\tamt1");
            }
            if (rs2.getInt("amt2") != (bsr.data(rs2.getString("branch") + "-310", "amt2") + bsr.data(rs2.getString("branch") + "-320", "amt2") + bsr.data(rs2.getString("branch") + "-330", "amt2") + bsr.data(rs2.getString("branch") + "-340", "amt2") + bsr.data(rs2.getString("branch") + "-350", "amt2"))) {
                System.out.println(rs2.getString("branch") + "\tamt2");
            }
            if (rs2.getInt("amt3") != (bsr.data(rs2.getString("branch") + "-310", "amt3") + bsr.data(rs2.getString("branch") + "-320", "amt3") + bsr.data(rs2.getString("branch") + "-330", "amt3") + bsr.data(rs2.getString("branch") + "-340", "amt3") + bsr.data(rs2.getString("branch") + "-350", "amt3"))) {
                System.out.println(rs2.getString("branch") + "\tamt3");
            }
        }

        System.out.println("310");
        ResultSet rs3 = st3.executeQuery("SELECT * FROM planningfinal where code='310'");
        while (rs3.next()) {
            rs3.getString("branchcode");
            if (rs3.getInt("no1") != (bsr.data(rs3.getString("branch") + "-311", "no1") + bsr.data(rs3.getString("branch") + "-312", "no1") + bsr.data(rs3.getString("branch") + "-313", "no1") + bsr.data(rs3.getString("branch") + "-314", "no1"))) {
                System.out.println(rs3.getString("branch") + "\tno1");
            }
            if (rs3.getInt("no2") != (bsr.data(rs3.getString("branch") + "-311", "no2") + bsr.data(rs3.getString("branch") + "-312", "no2") + bsr.data(rs3.getString("branch") + "-313", "no2") + bsr.data(rs3.getString("branch") + "-314", "no2"))) {
                System.out.println(rs3.getString("branch") + "\tno2");
            }
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-311", "no3") + bsr.data(rs3.getString("branch") + "-312", "no3") + bsr.data(rs3.getString("branch") + "-313", "no3") + bsr.data(rs3.getString("branch") + "-314", "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3");
            }
            if (rs3.getInt("amt1") != (bsr.data(rs3.getString("branch") + "-311", "amt1") + bsr.data(rs3.getString("branch") + "-312", "amt1") + bsr.data(rs3.getString("branch") + "-313", "amt1") + bsr.data(rs3.getString("branch") + "-314", "amt1"))) {
                System.out.println(rs3.getString("branch") + "\tamt1");
            }
            if (rs3.getInt("amt2") != (bsr.data(rs3.getString("branch") + "-311", "amt2") + bsr.data(rs3.getString("branch") + "-312", "amt2") + bsr.data(rs3.getString("branch") + "-313", "amt2") + bsr.data(rs3.getString("branch") + "-314", "amt2"))) {
                System.out.println(rs3.getString("branch") + "\tamt2");
            }
            if (rs3.getInt("amt3") != (bsr.data(rs3.getString("branch") + "-311", "amt3") + bsr.data(rs3.getString("branch") + "-312", "amt3") + bsr.data(rs3.getString("branch") + "-313", "amt3") + bsr.data(rs3.getString("branch") + "-314", "amt3"))) {
                System.out.println(rs3.getString("branch") + "\tamt3");
            }
        }

        System.out.println("400");
        ResultSet rs4 = st4.executeQuery("SELECT * FROM planningfinal where code='400'");
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
                System.out.println(rs4.getString("branch") + "\tamt1");
            }
            if (rs4.getInt("amt2") != (bsr.data(rs4.getString("branch") + "-410", "amt2") + bsr.data(rs4.getString("branch") + "-420", "amt2") + bsr.data(rs4.getString("branch") + "-430", "amt2"))) {
                System.out.println(rs4.getString("branch") + "\tamt2");
                System.out.println(rs4.getInt("amt2") - (bsr.data(rs4.getString("branch") + "-410", "amt2") + bsr.data(rs4.getString("branch") + "-420", "amt2") + bsr.data(rs4.getString("branch") + "-430", "amt2")));
            }
            if (rs4.getInt("amt3") != (bsr.data(rs4.getString("branch") + "-410", "amt3") + bsr.data(rs4.getString("branch") + "-420", "amt3") + bsr.data(rs4.getString("branch") + "-430", "amt3"))) {
                System.out.println(rs4.getString("branch") + "\tamt3");
            }
        }

        System.out.println("420");
        ResultSet rs5 = st5.executeQuery("SELECT * FROM planningfinal where code='420'");
        while (rs5.next()) {
            rs5.getString("branchcode");

            if (rs5.getInt("no1") != (bsr.data(rs5.getString("branch") + "-421", "no1") + bsr.data(rs5.getString("branch") + "-422", "no1"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
            }
            if (rs5.getInt("no2") != (bsr.data(rs5.getString("branch") + "-421", "no2") + bsr.data(rs5.getString("branch") + "-422", "no2"))) {
                System.out.println(rs5.getString("branch") + "\tno2");
            }
            if (rs5.getInt("no3") != (bsr.data(rs5.getString("branch") + "-421", "no3") + bsr.data(rs5.getString("branch") + "-422", "no3"))) {
                System.out.println(rs5.getString("branch") + "\tno3");
            }
            if (rs5.getInt("amt1") != (bsr.data(rs5.getString("branch") + "-421", "amt1") + bsr.data(rs5.getString("branch") + "-422", "amt1"))) {
                System.out.println(rs5.getString("branch") + "\tamt1");
            }
            if (rs5.getInt("amt2") != (bsr.data(rs5.getString("branch") + "-421", "amt2") + bsr.data(rs5.getString("branch") + "-422", "amt2"))) {
                System.out.println(rs5.getString("branch") + "\tamt2");
            }
            if (rs5.getInt("amt3") != (bsr.data(rs5.getString("branch") + "-421", "amt3") + bsr.data(rs5.getString("branch") + "-422", "amt3"))) {
                System.out.println(rs5.getString("branch") + "\tamt3");
            }
        }

        System.out.println("430");
        ResultSet rs6 = st6.executeQuery("SELECT * FROM planningfinal where code='430'");
        while (rs6.next()) {
            rs6.getString("branchcode");

            if (rs6.getInt("no1") != (bsr.data(rs6.getString("branch") + "-431", "no1") + bsr.data(rs6.getString("branch") + "-432", "no1"))) {
                System.out.println(rs6.getString("branch") + "\tno1");
            }
            if (rs6.getInt("no2") != (bsr.data(rs6.getString("branch") + "-431", "no2") + bsr.data(rs6.getString("branch") + "-432", "no2"))) {
                System.out.println(rs6.getString("branch") + "\tno2");
            }
            if (rs6.getInt("no3") != (bsr.data(rs6.getString("branch") + "-431", "no3") + bsr.data(rs6.getString("branch") + "-432", "no3"))) {
                System.out.println(rs6.getString("branch") + "\tno3");
            }
            if (rs6.getInt("amt1") != (bsr.data(rs6.getString("branch") + "-431", "amt1") + bsr.data(rs6.getString("branch") + "-432", "amt1"))) {
                System.out.println(rs6.getString("branch") + "\tamt1");
            }
            if (rs6.getInt("amt2") != (bsr.data(rs6.getString("branch") + "-431", "amt2") + bsr.data(rs6.getString("branch") + "-432", "amt2"))) {
                System.out.println(rs6.getString("branch") + "\tamt2");
            }
            if (rs6.getInt("amt3") != (bsr.data(rs6.getString("branch") + "-431", "amt3") + bsr.data(rs6.getString("branch") + "-432", "amt3"))) {
                System.out.println(rs6.getString("branch") + "\tamt3");
            }
        }
        System.out.println("410>=411");
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='411'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no1") > (bsr.data(rs12.getString("branch") + "-410", "no1"))) {
                System.out.println(rs12.getString("branch") + "\tno1");
            }
            if (rs12.getInt("no2") > (bsr.data(rs12.getString("branch") + "-410", "no2"))) {
                System.out.println(rs12.getString("branch") + "\tno2");
            }
            if (rs12.getInt("no3") > (bsr.data(rs12.getString("branch") + "-410", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt1") > (bsr.data(rs12.getString("branch") + "-410", "amt1"))) {
                System.out.println(rs12.getString("branch") + "\tamt1");
            }
            if (rs12.getInt("amt2") > (bsr.data(rs12.getString("branch") + "-410", "amt2"))) {
                System.out.println(rs12.getString("branch") + "\tamt2");
            }
            if (rs12.getInt("amt3") > (bsr.data(rs12.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("500");
        ResultSet rs7 = st7.executeQuery("SELECT * FROM planningfinal where code='500'");
        while (rs7.next()) {
            rs7.getString("branchcode");
            if (rs7.getInt("no1") != (bsr.data(rs7.getString("branch") + "-510", "no1") + bsr.data(rs7.getString("branch") + "-520", "no1"))) {
                System.out.println(rs7.getString("branch") + "\tno1");
            }
            if (rs7.getInt("no2") != (bsr.data(rs7.getString("branch") + "-510", "no2") + bsr.data(rs7.getString("branch") + "-520", "no2"))) {
                System.out.println(rs7.getString("branch") + "\tno2");
            }
            if (rs7.getInt("no3") != (bsr.data(rs7.getString("branch") + "-510", "no3") + bsr.data(rs7.getString("branch") + "-520", "no3"))) {
                System.out.println(rs7.getString("branch") + "\tno3");
            }
            if (rs7.getInt("amt1") != (bsr.data(rs7.getString("branch") + "-510", "amt1") + bsr.data(rs7.getString("branch") + "-520", "amt1"))) {
                System.out.println(rs7.getString("branch") + "\tamt1");
            }
            if (rs7.getInt("amt2") != (bsr.data(rs7.getString("branch") + "-510", "amt2") + bsr.data(rs7.getString("branch") + "-520", "amt2"))) {
                System.out.println(rs7.getString("branch") + "\tamt2");
            }
            if (rs7.getInt("amt3") != (bsr.data(rs7.getString("branch") + "-510", "amt3") + bsr.data(rs7.getString("branch") + "-520", "amt3"))) {
                System.out.println(rs7.getString("branch") + "\tamt3");
            }
        }
        System.out.println("510");
        ResultSet rs8 = st7.executeQuery("SELECT * FROM planningfinal where code='510'");
        while (rs8.next()) {
            rs8.getString("branchcode");
            if (rs8.getInt("no1") != (bsr.data(rs8.getString("branch") + "-511", "no1") + bsr.data(rs8.getString("branch") + "-512", "no1"))) {
                System.out.println(rs8.getString("branch") + "\tno1");
            }
            if (rs8.getInt("no2") != (bsr.data(rs8.getString("branch") + "-511", "no2") + bsr.data(rs8.getString("branch") + "-512", "no2"))) {
                System.out.println(rs8.getString("branch") + "\tno2");
            }
            if (rs8.getInt("no3") != (bsr.data(rs8.getString("branch") + "-511", "no3") + bsr.data(rs8.getString("branch") + "-512", "no3"))) {
                System.out.println(rs8.getString("branch") + "\tno3");
            }
            if (rs8.getInt("amt1") != (bsr.data(rs8.getString("branch") + "-511", "amt1") + bsr.data(rs8.getString("branch") + "-512", "amt1"))) {
                System.out.println(rs8.getString("branch") + "\tamt1");
            }
            if (rs8.getInt("amt2") != (bsr.data(rs8.getString("branch") + "-511", "amt2") + bsr.data(rs8.getString("branch") + "-512", "amt2"))) {
                System.out.println(rs8.getString("branch") + "\tamt2");
            }
            if (rs8.getInt("amt3") != (bsr.data(rs8.getString("branch") + "-511", "amt3") + bsr.data(rs8.getString("branch") + "-512", "amt3"))) {
                System.out.println(rs8.getString("branch") + "\tamt3");
            }
        }
        System.out.println("0");
        ResultSet rs9 = st9.executeQuery("SELECT * FROM planningfinal where code=0");
        while (rs9.next()) {
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
                System.out.println(rs9.getString("branch") + "\tamt1");
            }
            if (rs9.getInt("amt2") != (bsr.data(rs9.getString("branch") + "-100", "amt2") + bsr.data(rs9.getString("branch") + "-200", "amt2") + bsr.data(rs9.getString("branch") + "-300", "amt2") + bsr.data(rs9.getString("branch") + "-400", "amt2") + bsr.data(rs9.getString("branch") + "-500", "amt2"))) {
                System.out.println(rs9.getString("branch") + "\tamt2");
            }
            if (rs9.getInt("amt3") != (bsr.data(rs9.getString("branch") + "-100", "amt3") + bsr.data(rs9.getString("branch") + "-200", "amt3") + bsr.data(rs9.getString("branch") + "-300", "amt3") + bsr.data(rs9.getString("branch") + "-400", "amt3") + bsr.data(rs9.getString("branch") + "-500", "amt3"))) {
                System.out.println(rs9.getString("branch") + "\tamt3");
            }
        }

        System.out.println("610");
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='610'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }

        System.out.println("410");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='410'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");

            }
        }
        System.out.println("600=0-500-311");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='600'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"));
                st2.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs11.getString("branch") + "-600" + "';");
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"));
                st2.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs11.getString("branch") + "-600" + "';");
            }
        }

        System.out.println("600=611+...+616");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='600'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-611", "no3") + bsr.data(rs11.getString("branch") + "-612", "no3") + bsr.data(rs11.getString("branch") + "-613", "no3") + bsr.data(rs11.getString("branch") + "-614", "no3") + bsr.data(rs11.getString("branch") + "-615", "no3") + bsr.data(rs11.getString("branch") + "-616", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-611", "amt3") + bsr.data(rs11.getString("branch") + "-612", "amt3") + bsr.data(rs11.getString("branch") + "-613", "amt3") + bsr.data(rs11.getString("branch") + "-614", "amt3") + bsr.data(rs11.getString("branch") + "-615", "amt3") + bsr.data(rs11.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
            }
        }

        System.out.println("720");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("410");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='410'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != bsr.data(rs12.getString("branch") + "-720", "no3")) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") != bsr.data(rs12.getString("branch") + "-720", "amt3")) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("700");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='700'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-721", "no3") + bsr.data(rs12.getString("branch") + "-722", "no3") + bsr.data(rs12.getString("branch") + "-723", "no3") + bsr.data(rs12.getString("branch") + "-724", "no3") + bsr.data(rs12.getString("branch") + "-725", "no3") + bsr.data(rs12.getString("branch") + "-726", "no3") + bsr.data(rs12.getString("branch") + "-727", "no3") + bsr.data(rs12.getString("branch") + "-728", "no3") + bsr.data(rs12.getString("branch") + "-729", "no3") + bsr.data(rs12.getString("branch") + "-731", "no3") + bsr.data(rs12.getString("branch") + "-732", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-721", "amt3") + bsr.data(rs12.getString("branch") + "-722", "amt3") + bsr.data(rs12.getString("branch") + "-723", "amt3") + bsr.data(rs12.getString("branch") + "-724", "amt3") + bsr.data(rs12.getString("branch") + "-725", "amt3") + bsr.data(rs12.getString("branch") + "-726", "amt3") + bsr.data(rs12.getString("branch") + "-727", "amt3") + bsr.data(rs12.getString("branch") + "-728", "amt3") + bsr.data(rs12.getString("branch") + "-729", "amt3") + bsr.data(rs12.getString("branch") + "-731", "amt3") + bsr.data(rs12.getString("branch") + "-732", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("700");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='700'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
            }
        }
         */
        System.out.println("811-801 avg");
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in(811,812,813,814,801,802,803,804)");
        while (rs10.next()) {
            double a801 = 50, a802 = 750, a803 = 5000, a804 = 50000000;
            try {
                a801 = ((bsr.data(rs10.getString("branch") + "-811", "amt3") - bsr.data(rs10.getString("branch") + "-801", "amt3")) / (bsr.data(rs10.getString("branch") + "-811", "no3") - bsr.data(rs10.getString("branch") + "-801", "no3")));
            } catch (ArithmeticException e) {
            }

            try {
                a802 = ((bsr.data(rs10.getString("branch") + "-812", "amt3") - bsr.data(rs10.getString("branch") + "-802", "amt3")) / (bsr.data(rs10.getString("branch") + "-812", "no3") - bsr.data(rs10.getString("branch") + "-802", "no3")));
            } catch (ArithmeticException e) {
            }
            try {
                a803 = ((bsr.data(rs10.getString("branch") + "-813", "amt3") - bsr.data(rs10.getString("branch") + "-803", "amt3")) / (bsr.data(rs10.getString("branch") + "-813", "no3") - bsr.data(rs10.getString("branch") + "-803", "no3")));
            } catch (ArithmeticException e) {
            }
            try {
                a804 = ((bsr.data(rs10.getString("branch") + "-814", "amt3") - bsr.data(rs10.getString("branch") + "-804", "amt3")) / (bsr.data(rs10.getString("branch") + "-814", "no3") - bsr.data(rs10.getString("branch") + "-804", "no3")));
            } catch (ArithmeticException e) {
            }
            if (a801 < 0 || a801 > 100) {
                System.out.println(rs10.getString("branch") + "  811-801");
            }
            if (a802 < 100 || a802 > 1500) {
                System.out.println(rs10.getString("branch") + "  812-802");
            }
            if (a803 < 1500 || a803 > 10000) {
                System.out.println(rs10.getString("branch") + "  813-803");
            }
            if (a804 < 10000) {
                System.out.println(rs10.getString("branch") + "  814-804");
            }
        }

        System.out.println("801 802 803 avg");
        int arr_index[] = {801, 802, 803, 804, 811, 812, 813, 814};
        int min_rangex[] = {0, 100, 1500, 10000, 0, 100, 1500, 10000};
        int max_rangex[] = {100, 1500, 10000, 100000000, 100, 1500, 10000, 100000000};
        for (int i = 0; i < 8; i++) {
            System.out.println(arr_index[i] + " avg");
            rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='" + arr_index[i] + "'");
            while (rs10.next()) {
                rs10.getString("branchcode");
                if ((rs10.getDouble("amt3") / rs10.getDouble("no3")) > max_rangex[i] || (rs10.getDouble("amt3") / rs10.getDouble("no3")) < min_rangex[i]) {
                    System.out.println(rs10.getString("branch"));
                }
            }
        }

        System.out.println("810");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='810'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-801", "no3") + bsr.data(rs10.getString("branch") + "-802", "no3") + bsr.data(rs10.getString("branch") + "-803", "no3") + bsr.data(rs10.getString("branch") + "-804", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-801", "amt3") + bsr.data(rs10.getString("branch") + "-802", "amt3") + bsr.data(rs10.getString("branch") + "-803", "amt3") + bsr.data(rs10.getString("branch") + "-804", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }
        System.out.println("410");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='810'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-410", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }
        System.out.println("800");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='800'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-811", "no3") + bsr.data(rs10.getString("branch") + "-812", "no3") + bsr.data(rs10.getString("branch") + "-813", "no3") + bsr.data(rs10.getString("branch") + "-814", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-811", "amt3") + bsr.data(rs10.getString("branch") + "-812", "amt3") + bsr.data(rs10.getString("branch") + "-813", "amt3") + bsr.data(rs10.getString("branch") + "-814", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }
        System.out.println("800");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='800'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
            }
        }
        System.out.println("910");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='910'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-901", "no3") + bsr.data(rs10.getString("branch") + "-902", "no3") + bsr.data(rs10.getString("branch") + "-903", "no3") + bsr.data(rs10.getString("branch") + "-904", "no3") + bsr.data(rs10.getString("branch") + "-905", "no3") + bsr.data(rs10.getString("branch") + "-906", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-901", "amt3") + bsr.data(rs10.getString("branch") + "-902", "amt3") + bsr.data(rs10.getString("branch") + "-903", "amt3") + bsr.data(rs10.getString("branch") + "-904", "amt3") + bsr.data(rs10.getString("branch") + "-905", "amt3") + bsr.data(rs10.getString("branch") + "-906", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }
        System.out.println("410");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='910'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-410", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-410", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }

        System.out.println("900");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='900'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
            }
        }
        System.out.println("900");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='900'");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-911", "no3") + bsr.data(rs10.getString("branch") + "-912", "no3") + bsr.data(rs10.getString("branch") + "-913", "no3") + bsr.data(rs10.getString("branch") + "-914", "no3") + bsr.data(rs10.getString("branch") + "-915", "no3") + bsr.data(rs10.getString("branch") + "-916", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
            }
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-911", "amt3") + bsr.data(rs10.getString("branch") + "-912", "amt3") + bsr.data(rs10.getString("branch") + "-913", "amt3") + bsr.data(rs10.getString("branch") + "-914", "amt3") + bsr.data(rs10.getString("branch") + "-915", "amt3") + bsr.data(rs10.getString("branch") + "-916", "amt3"))) {
                System.out.println(rs10.getString("branch") + "\tamt3");
            }
        }

        System.out.println("600,700,800,900");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in ('600','700','800','900')");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-600", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3   " + rs11.getString("code"));
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-600", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3   " + rs11.getString("code"));
            }
        }

        System.out.println("410,610,720,810,910");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (410,610,720,810,910)");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-720", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3   " + rs11.getString("code"));
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-720", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3   " + rs11.getString("code"));
            }
        }

        System.out.println("no1>amt1 no2>amt2 no>amt no3=amt3=0");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='1'");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("amt1") > rs11.getInt("no1")) {
                System.out.println(rs11.getString("branch") + "\tno1");
            }
            if (rs11.getInt("amt2") > rs11.getInt("no2")) {
                System.out.println(rs11.getString("branch") + "\tno1");
            }
            if (rs11.getInt("amt") > rs11.getInt("no")) {
                System.out.println(rs11.getString("branch") + "\tno1");
            }
            if (rs11.getInt("no3") != 0) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt3") != 0) {
                System.out.println(rs11.getString("branch") + "\tamt3");
            }
        }

        System.out.println("600>610");
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='600'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-610", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-610", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("611>601");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='611'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-601", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-601", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("612>602");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='612'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-602", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-602", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("613>603");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='613'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-603", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-603", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("614>604");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='614'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-604", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-604", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("615>605");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='615'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-605", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-605", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("616>606");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='616'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-606", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-606", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("721>701");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='721'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-701", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-701", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("722>702");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='722'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-702", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-702", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("723>703");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='723'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-703", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-703", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("724>704");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='724'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-704", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-704", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("725>705");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='725'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-705", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-705", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("726>706");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='726'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-706", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-706", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("727>707");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='727'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-707", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-707", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("728>708");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='728'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-708", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-708", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("729>709");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='729'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-709", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-709", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("731>711");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='731'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-711", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-711", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("732>712");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='732'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-712", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-712", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("811>801");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='811'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-801", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-801", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("812>802");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='812'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-802", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-802", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("813>803");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='813'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-803", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-803", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("814>804");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='814'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-804", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-804", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("911>901");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='911'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-901", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-901", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }

        System.out.println("912>902");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='912'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-902", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-902", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("913>903");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='913'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-903", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-903", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("914>904");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='914'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-904", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-904", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("915>905");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='915'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-905", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-905", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
        System.out.println("916>906");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='916'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") < (bsr.data(rs12.getString("branch") + "-906", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
            }
            if (rs12.getInt("amt3") < (bsr.data(rs12.getString("branch") + "-906", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
            }
        }
    }

    public int data(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningfinal where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }
    /*
    public int databsr7(String sol, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM bsr7 where sol='" + sol + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }
     */
}
