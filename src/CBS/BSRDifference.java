package CBS;

import amit.include_one;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BSRDifference {

    public static Connection conn;

    public BSRDifference() {
        try {
            include_one i = new include_one();
            conn = i.connect();
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        BSRDifference bsr = new BSRDifference();
        Statement st0 = conn.createStatement();
        Statement st1 = conn.createStatement();
        Statement st2 = conn.createStatement();
        Statement st3 = conn.createStatement();
        Statement st4 = conn.createStatement();
        Statement st5 = conn.createStatement();
        Statement st6 = conn.createStatement();
        Statement st11 = conn.createStatement();
        Statement st10 = conn.createStatement();
        Statement st111 = conn.createStatement();
        Statement st12 = conn.createStatement();
        Statement st13 = conn.createStatement();
        Statement st9 = conn.createStatement();
        Statement st15 = conn.createStatement();
        Statement st16 = conn.createStatement();
        Statement st21 = conn.createStatement();
        Statement st31 = conn.createStatement();
        Statement st41 = conn.createStatement();
        Statement st51 = conn.createStatement();
        Statement st61 = conn.createStatement();
        Statement st121 = conn.createStatement();
        Statement st131 = conn.createStatement();
        Statement st141 = conn.createStatement();
        Statement st151 = conn.createStatement();
        Statement st161 = conn.createStatement();

        int a = 600;
        int b = 400;
        int code = 0;
        int max = 0;
        /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"))) {
                /*
                System.out.println(rs1.getInt("no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-500", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-311", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
         *//*
                int diff1 = rs1.getInt("no3") - (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
                //System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no3") - diff1);
                //System.out.println("sum1 " + sum1);
                st10.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
//System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "no3"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614''615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        //System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        //System.out.println("COde is " + code);
                    }
                }
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no3"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no3") - diff1);
                //System.out.println("" + sum11);
                st111.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no3"));
            }
        }
         
         rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"))) {
                /*
                System.out.println(rs1.getInt("amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-500", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-311", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
         *//*
                int diff1 = rs1.getInt("amt3") - (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                //System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt3") - diff1);
                //System.out.println("sum1 " + sum1);
                st10.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
//System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "amt3"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614''615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        //System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        //System.out.println("COde is " + code);
                    }
                }
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "amt3"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt3") - diff1);
                //System.out.println("" + sum11);
                st111.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "amt3"));
            }
        }
         */
 /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        System.out.println("no3");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"))) {
                
                System.out.println(rs1.getInt("no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-500", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-311", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
                  
                int diff1 = rs1.getInt("no3") - (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
                //System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no3") - diff1);
                //System.out.println("sum1 " + sum1);
                st10.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
//System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "no3"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('811','812','813','814') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {

                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        //System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        //System.out.println("COde is " + code);
                    }
                }
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no3"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no3") - diff1);
                //System.out.println("" + sum11);
                st111.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no3"));
            }
        }

        rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        System.out.println("amt3");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"))) {
                
                System.out.println(rs1.getInt("amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-500", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-311", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                 
                int diff1 = rs1.getInt("amt3") - (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                //System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt3") - diff1);
                //System.out.println("sum1 " + sum1);
                st10.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
//System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "amt3"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('811','812','813','814') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {

                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        //System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        //System.out.println("COde is " + code);
                    }
                }
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "amt3"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt3") - diff1);
                //System.out.println("" + sum11);
                st111.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "amt3"));
            }
        }*/
 /*
         rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        System.out.println("no3");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"))) {
                rs1.getString("branchcode");
                System.out.println(rs1.getInt("no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-500", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-311", "no3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));

                int diff1 = rs1.getInt("no3") - (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
                System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no3") - diff1);
                System.out.println("sum1 " + sum1);
                //st10.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('911','912','913','914','915','916') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {

                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        System.out.println("COde is " + code);
                    }
                }
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no3"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no3") - diff1);
                System.out.println("" + sum11);
// st111.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
            }
        }

        rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        System.out.println("amt3");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"))) {
                System.out.println(rs1.getInt("amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-500", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-311", "amt3"));
                System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));

                int diff1 = rs1.getInt("amt3") - (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt3") - diff1);
                System.out.println("sum1 " + sum1);
//st10.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('911','912','913','914','915','916') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        System.out.println("COde is " + code);
                    }
                }
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "amt3"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt3") - diff1);
                System.out.println("" + sum11);
//st111.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "amt3"));
            }
        }
         */
 /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no2") != (bsr.data(rs1.getString("branch") + "-0", "no2") - bsr.data(rs1.getString("branch") + "-500", "no2") - bsr.data(rs1.getString("branch") + "-311", "no2"))) {
                System.out.println(rs1.getString("branch") + "\tno2");
                int diff1 = rs1.getInt("no2") - (bsr.data(rs1.getString("branch") + "-0", "no2") - bsr.data(rs1.getString("branch") + "-500", "no2") - bsr.data(rs1.getString("branch") + "-311", "no2"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no2") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set no2=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('721','722','723','724','725','726','727','728','729','731','732') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("no2")) {
                        max = rs11.getInt("no2");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no2") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set no2=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
		rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"))) {
                System.out.println(rs1.getString("branch") + "\tno3");
                int diff1 = rs1.getInt("no3") - (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no3") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('721','722','723','724','725','726','727','728','729','731','732') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no3") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
		rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt1") != (bsr.data(rs1.getString("branch") + "-0", "amt1") - bsr.data(rs1.getString("branch") + "-500", "amt1") - bsr.data(rs1.getString("branch") + "-311", "amt1"))) {
                System.out.println(rs1.getString("branch") + "\tamt1");
                int diff1 = rs1.getInt("amt1") - (bsr.data(rs1.getString("branch") + "-0", "amt1") - bsr.data(rs1.getString("branch") + "-500", "amt1") - bsr.data(rs1.getString("branch") + "-311", "amt1"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt1") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('721','722','723','724','725','726','727','728','729','731','732') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("amt1")) {
                        max = rs11.getInt("amt1");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt1") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
		rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt2") != (bsr.data(rs1.getString("branch") + "-0", "amt2") - bsr.data(rs1.getString("branch") + "-500", "amt2") - bsr.data(rs1.getString("branch") + "-311", "amt2"))) {
                System.out.println(rs1.getString("branch") + "\tamt2");
                int diff1 = rs1.getInt("amt2") - (bsr.data(rs1.getString("branch") + "-0", "amt2") - bsr.data(rs1.getString("branch") + "-500", "amt2") - bsr.data(rs1.getString("branch") + "-311", "amt2"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt2") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('721','722','723','724','725','726','727','728','729','731','732') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("amt2")) {
                        max = rs11.getInt("amt2");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt2") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
         *//*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"))) {
                //System.out.println(rs1.getString("branch") + "\tamt3");
                System.out.println("Value of 700 is " + rs1.getInt("amt3"));
                //System.out.println("Value of 0-500-311 is " + (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3")));
                int diff1 = rs1.getInt("amt3") - (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                System.out.println("diff is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt3") - diff1);
                //System.out.println("New Value of 700 is " + sum1);
                //st10.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('721','722','723','724','725','726','727','728','729','731','732') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {

                    if (max <= rs11.getInt("amt3")) {

                        max = rs11.getInt("amt3");
                        //System.out.println(max);
                        code = rs11.getInt("code");
                        //System.out.println(code);
                    }
                }
                //System.out.println("Value of " + code + " - " + max);
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt3") - diff1);
                //System.out.println("New Value of " + code + " - " + sum11);
                //st111.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
            }
        }
         *//*
        
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no1") != (bsr.data(rs1.getString("branch") + "-0", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"))) {
                //System.out.println(rs1.getString("branch") + "\tno1");
                System.out.println(rs1.getInt("no1"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-0", "no1"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-500", "no1"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-311", "no1"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-0", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"));
//System.out.println(bsr.data(rs1.getString("branch") + "-" + b, "no1"));
                int diff1 = rs1.getInt("no1") - (bsr.data(rs1.getString("branch") + "-0", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"));
                System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no1") - diff1);
                System.out.println("sum1 " + sum1);
                st10.executeUpdate("update planningdatabase.planningdifference set no1=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
//System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "no1"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("no1")) {
                        max = rs11.getInt("no1");
                        System.out.println("Maximum value is " + max);
                        code = rs11.getInt("code");
                        System.out.println("COde is " + code);
                    }
                }
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no1"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no1") - diff1);
                System.out.println("" + sum11);
                st111.executeUpdate("update planningdatabase.planningdifference set no1=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no1"));
            }
        }
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no2") != (bsr.data(rs1.getString("branch") + "-0", "no2") - bsr.data(rs1.getString("branch") + "-500", "no2") - bsr.data(rs1.getString("branch") + "-311", "no2"))) {
                System.out.println(rs1.getString("branch") + "\tno2");
                int diff1 = rs1.getInt("no2") - (bsr.data(rs1.getString("branch") + "-0", "no2") - bsr.data(rs1.getString("branch") + "-500", "no2") - bsr.data(rs1.getString("branch") + "-311", "no2"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no2") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set no2=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("no2")) {
                        max = rs11.getInt("no2");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no2") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set no2=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
         *//*

        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"))) {
                //System.out.println(rs1.getString("branch") + "\tno3");
                System.out.println(rs1.getInt("no3"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-500", "no3"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-311", "no3"));
                //System.out.println(bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));

                int diff1 = rs1.getInt("no3") - (bsr.data(rs1.getString("branch") + "-0", "no3") - bsr.data(rs1.getString("branch") + "-500", "no3") - bsr.data(rs1.getString("branch") + "-311", "no3"));
                System.out.println("diff " + diff1);
                //int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no3") - diff1);
                //System.out.println("sum " + sum1);
                //st10.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
                //System.out.println(rs1.getInt("no3"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {

                    if (max <= rs11.getInt("no3")) {        
                        max = rs11.getInt("no3");
                        //System.out.println("no3 "+ max);
                        code = rs11.getInt("code");
                        //System.out.println("code "+code);
                    }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no3") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
            //System.out.println(code + "---" + sum11); 
            }
        }
                 
         *//*
		rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt1") != (bsr.data(rs1.getString("branch") + "-0", "amt1") - bsr.data(rs1.getString("branch") + "-500", "amt1") - bsr.data(rs1.getString("branch") + "-311", "amt1"))) {
                System.out.println(rs1.getString("branch") + "\tamt1");
                int diff1 = rs1.getInt("amt1") - (bsr.data(rs1.getString("branch") + "-0", "amt1") - bsr.data(rs1.getString("branch") + "-500", "amt1") - bsr.data(rs1.getString("branch") + "-311", "amt1"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt1") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("amt1")) {
                        max = rs11.getInt("amt1");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt1") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
		rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("amt2") != (bsr.data(rs1.getString("branch") + "-0", "amt2") - bsr.data(rs1.getString("branch") + "-500", "amt2") - bsr.data(rs1.getString("branch") + "-311", "amt2"))) {
                System.out.println(rs1.getString("branch") + "\tamt2");
                int diff1 = rs1.getInt("amt2") - (bsr.data(rs1.getString("branch") + "-0", "amt2") - bsr.data(rs1.getString("branch") + "-500", "amt2") - bsr.data(rs1.getString("branch") + "-311", "amt2"));
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt2") - diff1);
                st10.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    
                    if (max <= rs11.getInt("amt2")) {
                        max = rs11.getInt("amt2");
                        code = rs11.getInt("code");
                        }
                }
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt2") - diff1);
                st111.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                }
        }
         */
 /*
                rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
                while (rs1.next()) {
                    max = 0;
                    if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"))) {
                        System.out.println(rs1.getString("branch") + "\tamt3");
                        System.out.println(rs1.getInt("amt3"));
                        //System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3"));
                        //System.out.println(bsr.data(rs1.getString("branch") + "-500", "amt3"));
                        //System.out.println(bsr.data(rs1.getString("branch") + "-311", "amt3"));
                        //System.out.println(bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                        int diff2 = rs1.getInt("amt3") - (bsr.data(rs1.getString("branch") + "-0", "amt3") - bsr.data(rs1.getString("branch") + "-500", "amt3") - bsr.data(rs1.getString("branch") + "-311", "amt3"));
                        System.out.println("diff " + diff2);
                        /*
                        int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "amt3") - diff1);
                        //System.out.println("sum " + sum1);
                        st10.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
                        //System.out.println(rs1.getInt("amt3"));

                        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                        while (rs11.next()) {

                            if (max <= rs11.getInt("amt3")) {
                                max = rs11.getInt("amt3");
                                //System.out.println("amt3 "+ max);
                                code = rs11.getInt("code");
                                //System.out.println("code "+code);
                            }
                        }
                        int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "amt3") - diff1);
                        st111.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                        //System.out.println(code + "---" + sum11); 
                    }
                }
                }
         */
 /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {

            if (rs1.getInt("no1") != (bsr.data(rs1.getString("branch") + "-000", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
                int diff1 = rs1.getInt("no1") - (bsr.data(rs1.getString("branch") + "-000", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"));
                System.out.println(rs1.getInt("no1"));
                System.out.println(bsr.data(rs1.getString("branch") + "-000", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"));
                System.out.println("diff1"+diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no1")) + diff1;
                //System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "no1"));
                System.out.println("sum1"+sum1);
//st10.executeUpdate("update planningdatabase.planningdifference set no1=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
            }
        }*/
 /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {

            if (rs1.getInt("no1") > (bsr.data(rs1.getString("branch") + "-" + b, "no1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
                int sum1 = bsr.data(rs1.getString("branch") + "-" + b, "no1");
                st10.executeUpdate("update planningdatabase.planningdifference set no1=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
            }
        }

        ResultSet rs2 = st2.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs2.next()) {

            if (rs2.getInt("no2") > (bsr.data(rs2.getString("branch") + "-" + b, "no2"))) {
                System.out.println(rs2.getString("branch") + "\tno2");
                int sum1 = bsr.data(rs2.getString("branch") + "-" + b, "no2");
                st21.executeUpdate("update planningdatabase.planningdifference set no2=" + sum1 + " where branchcode='" + rs2.getString("branch") + "-" + a + "';");
            }
        }

        ResultSet rs3 = st3.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs3.next()) {

            if (rs3.getInt("no3") > (bsr.data(rs3.getString("branch") + "-" + b, "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3");
                int sum1 = bsr.data(rs3.getString("branch") + "-" + b, "no3");
                st31.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs3.getString("branch") + "-" + a + "';");
            }
        }
        ResultSet rs4 = st4.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs4.next()) {

            if (rs4.getInt("amt1") > (bsr.data(rs4.getString("branch") + "-" + b, "amt1"))) {
                System.out.println(rs4.getString("branch") + "\tamt1");
                int sum1 = bsr.data(rs4.getString("branch") + "-" + b, "amt1");
                st41.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum1 + " where branchcode='" + rs4.getString("branch") + "-" + a + "';");
            }
        }

        ResultSet rs5 = st5.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs5.next()) {

            if (rs5.getInt("amt2") > (bsr.data(rs5.getString("branch") + "-" + b, "amt2"))) {
                System.out.println(rs5.getString("branch") + "\tamt2");
                int sum1 = bsr.data(rs5.getString("branch") + "-" + b, "amt2");
                st51.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum1 + " where branchcode='" + rs5.getString("branch") + "-" + a + "';");
            }
        }

        ResultSet rs6 = st6.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs6.next()) {

            if (rs6.getInt("amt3") > (bsr.data(rs6.getString("branch") + "-" + b, "amt3"))) {
                System.out.println(rs6.getString("branch") + "\tamt3");
                int sum1 = bsr.data(rs6.getString("branch") + "-" + b, "amt3");
                st61.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs6.getString("branch") + "-" + a + "';");
            }
        }
         */
 /*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs1.next()) {
            max = 0;
            if (rs1.getInt("no1") != (bsr.data(rs1.getString("branch") + "-000", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
                System.out.println(rs1.getInt("no1"));
                System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "no1"));
                System.out.println(bsr.data(rs1.getString("branch") + "-000", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"));
//System.out.println(bsr.data(rs1.getString("branch") + "-" + b, "no1"));
                int diff1 = rs1.getInt("no1") - (bsr.data(rs1.getString("branch") + "-000", "no1") - bsr.data(rs1.getString("branch") + "-500", "no1") - bsr.data(rs1.getString("branch") + "-311", "no1"));
                System.out.println("Difference is " + diff1);
                int sum1 = (bsr.data(rs1.getString("branch") + "-" + a, "no1") + diff1);
                System.out.println("" + sum1);
                //st10.executeUpdate("update planningdatabase.planningdifference set no1=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-" + a + "';");
//System.out.println(bsr.data(rs1.getString("branch") + "-" + a, "no1"));

                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs1.getString("branch") + "';");
                while (rs11.next()) {
                    if (max < rs11.getInt("no1")) {
                        max = rs11.getInt("no1");
                        System.out.println("" + max);
                        code = rs11.getInt("code");
                        System.out.println("" + code);
                    }
                }
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no1"));
                int sum11 = (bsr.data(rs1.getString("branch") + "-" + code, "no1") + diff1);
                System.out.println("" + sum11);
                //st111.executeUpdate("update planningdatabase.planningdifference set no1=" + sum11 + " where branchcode='" + rs1.getString("branch") + "-" + code + "';");
                System.out.println(bsr.data(rs1.getString("branch") + "-" + code, "no1"));
            }
        }
        
        ResultSet rs2 = st2.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs2.next()) {
            max = 0;
            if (rs2.getInt("no2") != (bsr.data(rs2.getString("branch") + "-611", "no2") + bsr.data(rs2.getString("branch") + "-612", "no2") + bsr.data(rs2.getString("branch") + "-613", "no2") + bsr.data(rs2.getString("branch") + "-614", "no2") + bsr.data(rs2.getString("branch") + "-615", "no2") + bsr.data(rs2.getString("branch") + "-616", "no2"))) {
                System.out.println(rs2.getString("branch") + "\tno2");
                //System.out.println(bsr.data(rs2.getString("branch") + "-" + a, "no2"));
                //System.out.println(bsr.data(rs2.getString("branch") + "-" + b, "no2"));
                int diff1 = (rs2.getInt("no2") - (bsr.data(rs2.getString("branch") + "-611", "no2") + bsr.data(rs2.getString("branch") + "-612", "no2") + bsr.data(rs2.getString("branch") + "-613", "no2") + bsr.data(rs2.getString("branch") + "-614", "no2") + bsr.data(rs2.getString("branch") + "-615", "no2") + bsr.data(rs2.getString("branch") + "-616", "no2")));
                //System.out.println("Difference is" + diff1);
                int sum1 = (bsr.data(rs2.getString("branch") + "-" + a, "no2") + diff1);
                //System.out.println("" + sum1);
                st21.executeUpdate("update planningdatabase.planningdifference set no2=" + sum1 + " where branchcode='" + rs2.getString("branch") + "-" + a + "';");
                //System.out.println(bsr.data(rs2.getString("branch") + "-" + a, "no2"));

                ResultSet rs12 = st12.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs2.getString("branch") + "';");
                while (rs12.next()) {
                    if (max < rs12.getInt("no2")) {
                        max = rs12.getInt("no2");
                        //System.out.println("" + max);
                        code = rs12.getInt("code");
                        //System.out.println("" + code);
                    }
                }
                //System.out.println(bsr.data(rs2.getString("branch") + "-" + code, "no2"));
                int sum11 = (bsr.data(rs2.getString("branch") + "-" + code, "no2") + diff1);
                //System.out.println("" + sum11);
                st121.executeUpdate("update planningdatabase.planningdifference set no2=" + sum11 + " where branchcode='" + rs2.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs2.getString("branch") + "-" + code, "no2"));
            }
        }
        ResultSet rs3 = st3.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs3.next()) {
            max = 0;
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-611", "no3") + bsr.data(rs3.getString("branch") + "-612", "no3") + bsr.data(rs3.getString("branch") + "-613", "no3") + bsr.data(rs3.getString("branch") + "-614", "no3") + bsr.data(rs3.getString("branch") + "-615", "no3") + bsr.data(rs3.getString("branch") + "-616", "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3");
                //System.out.println(bsr.data(rs3.getString("branch") + "-" + a, "no3"));
                //System.out.println(bsr.data(rs3.getString("branch") + "-" + b, "no3"));
                int diff1 = (rs3.getInt("no3") - (bsr.data(rs3.getString("branch") + "-611", "no3") + bsr.data(rs3.getString("branch") + "-612", "no3") + bsr.data(rs3.getString("branch") + "-613", "no3") + bsr.data(rs3.getString("branch") + "-614", "no3") + bsr.data(rs3.getString("branch") + "-615", "no3") + bsr.data(rs3.getString("branch") + "-616", "no3")));
                //System.out.println("Difference is" + diff1);
                int sum1 = (bsr.data(rs3.getString("branch") + "-" + a, "no3") + diff1);
                //System.out.println("" + sum1);
                st31.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs3.getString("branch") + "-" + a + "';");
                //System.out.println(bsr.data(rs3.getString("branch") + "-" + a, "no3"));

                ResultSet rs13 = st13.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs3.getString("branch") + "';");
                while (rs13.next()) {
                    if (max < rs13.getInt("no3")) {
                        max = rs13.getInt("no3");
                        //System.out.println("" + max);
                        code = rs13.getInt("code");
                        //System.out.println("" + code);
                    }
                }
                //System.out.println(bsr.data(rs3.getString("branch") + "-" + code, "no3"));
                int sum11 = (bsr.data(rs3.getString("branch") + "-" + code, "no3") + diff1);
                //System.out.println("" + sum11);
                st131.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs3.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs3.getString("branch") + "-" + code, "no3"));
            }
        }
        ResultSet rs4 = st4.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs4.next()) {
            max = 0;
            if (rs4.getInt("amt1") != (bsr.data(rs4.getString("branch") + "-611", "amt1") + bsr.data(rs4.getString("branch") + "-612", "amt1") + bsr.data(rs4.getString("branch") + "-613", "amt1") + bsr.data(rs4.getString("branch") + "-614", "amt1") + bsr.data(rs4.getString("branch") + "-615", "amt1") + bsr.data(rs4.getString("branch") + "-616", "amt1"))) {
                System.out.println(rs4.getString("branch") + "\tamt1");
                //System.out.println(bsr.data(rs4.getString("branch") + "-" + a, "amt1"));
                //System.out.println(bsr.data(rs4.getString("branch") + "-" + b, "amt1"));
                int diff1 = (rs4.getInt("amt1") - (bsr.data(rs4.getString("branch") + "-611", "amt1") + bsr.data(rs4.getString("branch") + "-612", "amt1") + bsr.data(rs4.getString("branch") + "-613", "amt1") + bsr.data(rs4.getString("branch") + "-614", "amt1") + bsr.data(rs4.getString("branch") + "-615", "amt1") + bsr.data(rs4.getString("branch") + "-616", "amt1")));
                //System.out.println("Difference is" + diff1);
                int sum1 = (bsr.data(rs4.getString("branch") + "-" + a, "amt1") + diff1);
                //System.out.println("" + sum1);
                st41.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum1 + " where branchcode='" + rs4.getString("branch") + "-" + a + "';");
                //System.out.println(bsr.data(rs4.getString("branch") + "-" + a, "amt1"));

                ResultSet rs14 = st14.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs4.getString("branch") + "';");
                while (rs14.next()) {
                    if (max < rs14.getInt("amt1")) {
                        max = rs14.getInt("amt1");
                        //System.out.println("" + max);
                        code = rs14.getInt("code");
                        //System.out.println("" + code);
                    }
                }
                //System.out.println(bsr.data(rs4.getString("branch") + "-" + code, "amt1"));
                int sum11 = (bsr.data(rs4.getString("branch") + "-" + code, "amt1") + diff1);
                //System.out.println("" + sum11);
                st141.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum11 + " where branchcode='" + rs4.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs4.getString("branch") + "-" + code, "amt1"));
            }
        }
        ResultSet rs5 = st5.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs5.next()) {
            max = 0;
            if (rs5.getInt("amt2") != (bsr.data(rs5.getString("branch") + "-611", "amt2") + bsr.data(rs5.getString("branch") + "-612", "amt2") + bsr.data(rs5.getString("branch") + "-613", "amt2") + bsr.data(rs5.getString("branch") + "-614", "amt2") + bsr.data(rs5.getString("branch") + "-615", "amt2") + bsr.data(rs5.getString("branch") + "-616", "amt2"))) {
                System.out.println(rs5.getString("branch") + "\tamt2");
                //System.out.println(bsr.data(rs5.getString("branch") + "-" + a, "amt2"));
                //System.out.println(bsr.data(rs5.getString("branch") + "-" + b, "amt2"));
                int diff1 = (rs5.getInt("amt2") - (bsr.data(rs5.getString("branch") + "-611", "amt2") + bsr.data(rs5.getString("branch") + "-612", "amt2") + bsr.data(rs5.getString("branch") + "-613", "amt2") + bsr.data(rs5.getString("branch") + "-614", "amt2") + bsr.data(rs5.getString("branch") + "-615", "amt2") + bsr.data(rs5.getString("branch") + "-616", "amt2")));
                //System.out.println("Difference is" + diff1);
                int sum1 = (bsr.data(rs5.getString("branch") + "-" + a, "amt2") + diff1);
                //System.out.println("" + sum1);
                st51.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum1 + " where branchcode='" + rs5.getString("branch") + "-" + a + "';");
                //System.out.println(bsr.data(rs5.getString("branch") + "-" + a, "amt2"));

                ResultSet rs15 = st51.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs5.getString("branch") + "';");
                while (rs15.next()) {
                    if (max < rs15.getInt("amt2")) {
                        max = rs15.getInt("amt2");
                        //System.out.println("" + max);
                        code = rs15.getInt("code");
                        //System.out.println("" + code);
                    }
                }
                //System.out.println(bsr.data(rs5.getString("branch") + "-" + code, "amt2"));
                int sum11 = (bsr.data(rs5.getString("branch") + "-" + code, "amt2") + diff1);
                //System.out.println("" + sum11);
                st151.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum11 + " where branchcode='" + rs5.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs5.getString("branch") + "-" + code, "amt2"));
            }
        }
        ResultSet rs6 = st6.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs6.next()) {
            max = 0;
            if (rs6.getInt("amt3") != (bsr.data(rs6.getString("branch") + "-611", "amt3") + bsr.data(rs6.getString("branch") + "-612", "amt3") + bsr.data(rs6.getString("branch") + "-613", "amt3") + bsr.data(rs6.getString("branch") + "-614", "amt3") + bsr.data(rs6.getString("branch") + "-615", "amt3") + bsr.data(rs6.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs6.getString("branch") + "\tamt3");
                //System.out.println(bsr.data(rs6.getString("branch") + "-" + a, "amt3"));
                //System.out.println(bsr.data(rs6.getString("branch") + "-" + b, "amt3"));
                int diff1 = (rs6.getInt("amt3") - (bsr.data(rs6.getString("branch") + "-611", "amt3") + bsr.data(rs6.getString("branch") + "-612", "amt3") + bsr.data(rs6.getString("branch") + "-613", "amt3") + bsr.data(rs6.getString("branch") + "-614", "amt3") + bsr.data(rs6.getString("branch") + "-615", "amt3") + bsr.data(rs6.getString("branch") + "-616", "amt3")));
                //System.out.println("Difference is" + diff1);
                int sum1 = (bsr.data(rs6.getString("branch") + "-" + a, "amt3") + diff1);
                //System.out.println("" + sum1);
                st61.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs6.getString("branch") + "-" + a + "';");
                //System.out.println(bsr.data(rs6.getString("branch") + "-" + a, "amt3"));

                ResultSet rs16 = st16.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('611','612','613','614','615','616') and branch='" + rs6.getString("branch") + "';");
                while (rs16.next()) {
                    if (max < rs16.getInt("amt3")) {
                        max = rs16.getInt("amt3");
                        //System.out.println("" + max);
                        code = rs16.getInt("code");
                        //System.out.println("" + code);
                    }
                }
                //System.out.println(bsr.data(rs6.getString("branch") + "-" + code, "amt3"));
                int sum11 = (bsr.data(rs6.getString("branch") + "-" + code, "amt3") + diff1);
                //System.out.println("" + sum11);
                st161.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs6.getString("branch") + "-" + code + "';");
                //System.out.println(bsr.data(rs6.getString("branch") + "-" + code, "amt3"));
            }
        }
         *//*
        ResultSet rs3 = st6.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs3.next()) {
            max = 0;
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-" + b, "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3");
                System.out.println(rs3.getInt("no3"));
                System.out.println(bsr.data(rs3.getString("branch") + "-" + b, "no3"));
                int diff1 = (rs3.getInt("no3") - (bsr.data(rs3.getString("branch") + "-" + b, "no3")));
                System.out.println("diff is  " + diff1 );
                int sum1 = (bsr.data(rs3.getString("branch") + "-" + a, "no3") - diff1);
                System.out.println(sum1);
                //st61.executeUpdate("update planningdatabase.planningdifference set no3=" + sum1 + " where branchcode='" + rs3.getString("branch") + "-" + a + "';");
                
                ResultSet rs16 = st16.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('701','702','703','704','705','706','707','708','709','710','711','712') and branch='" + rs3.getString("branch") + "';");
                while (rs16.next()) {
                    if (max <= rs16.getInt("no3")) {
                        max = rs16.getInt("no3");
                        System.out.println(max);
                        code = rs16.getInt("code");
                    System.out.println(code);
                    }
                }
                System.out.println(bsr.data(rs3.getString("branch") + "-" + code, "no3"));
                int sum11 = (bsr.data(rs3.getString("branch") + "-" + code, "no3") - diff1);
                System.out.println(sum11);
                //st161.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs3.getString("branch") + "-" + code + "';");
                }
        }
        ResultSet rs6 = st6.executeQuery("SELECT * FROM planningdatabase.planningdifference where code=" + a + ";");
        while (rs6.next()) {
            max = 0;
            if (rs6.getInt("amt3") != (bsr.data(rs6.getString("branch") + "-" + b, "amt3"))) {
                System.out.println(rs6.getString("branch") + "\tamt3");
                System.out.println(bsr.data(rs6.getString("branch") + "-" + a, "amt3"));
                System.out.println(bsr.data(rs6.getString("branch") + "-" + b, "amt3"));
                int diff1 = (rs6.getInt("amt3") - (bsr.data(rs6.getString("branch") + "-" + b, "amt3")));
                System.out.println("Difference is" + diff1);
                int sum1 = (bsr.data(rs6.getString("branch") + "-" + a, "amt3") - diff1);
                System.out.println("" + sum1);
                //st61.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum1 + " where branchcode='" + rs6.getString("branch") + "-" + a + "';");
                System.out.println(bsr.data(rs6.getString("branch") + "-" + a, "amt3"));

                ResultSet rs16 = st16.executeQuery("SELECT * FROM planningdatabase.planningdifference where code in ('701','702','703','704','705','706','707','708','709','710','711','712') and branch='" + rs6.getString("branch") + "';");
                while (rs16.next()) {
                    if (max <= rs16.getInt("amt3")) {
                        max = rs16.getInt("amt3");
                        System.out.println("" + max);
                        code = rs16.getInt("code");
                        System.out.println("" + code);
                    }
                }
                System.out.println(bsr.data(rs6.getString("branch") + "-" + code, "amt3"));
                int sum11 = (bsr.data(rs6.getString("branch") + "-" + code, "amt3") - diff1);
                System.out.println("" + sum11);
                //st161.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs6.getString("branch") + "-" + code + "';");
                System.out.println(bsr.data(rs6.getString("branch") + "-" + code, "amt3"));
            }
        }
         */
/*
        ResultSet rs9 = st9.executeQuery("SELECT * FROM planningdatabase.planningdifference where code='400'");
        while (rs9.next()) {
            //rs9.getString("branchcode");
            
            if (rs9.getInt("no1") != (bsr.data(rs9.getString("branch") + "-100", "no1") + bsr.data(rs9.getString("branch") + "-200", "no1") + bsr.data(rs9.getString("branch") + "-300", "no1") + bsr.data(rs9.getString("branch") + "-400", "no1") + bsr.data(rs9.getString("branch") + "-500", "no1"))) {
                System.out.println(rs9.getString("branch") + "\tno1");
                int sum1 = (bsr.data(rs9.getString("branch") + "-100", "no1") + bsr.data(rs9.getString("branch") + "-200", "no1") + bsr.data(rs9.getString("branch") + "-300", "no1") + bsr.data(rs9.getString("branch") + "-400", "no1") + bsr.data(rs9.getString("branch") + "-500", "no1"));
                int diff1 = rs9.getInt("no1") - sum1;
                int sum11 = bsr.data(rs9.getString("branch") + b, "no1") + diff1;
                //st1.executeUpdate("update planningdatabase.planningdifference set no1=" + sum11 + " where branchcode='" + rs9.getString("branch") + "-" + b + "'");
            }

            if (rs9.getInt("no2") != (bsr.data(rs9.getString("branch") + "-100", "no2") + bsr.data(rs9.getString("branch") + "-200", "no2") + bsr.data(rs9.getString("branch") + "-300", "no2") + bsr.data(rs9.getString("branch") + "-400", "no2") + bsr.data(rs9.getString("branch") + "-500", "no2"))) {
                System.out.println(rs9.getString("branch") + "\tno2");
                System.out.println(rs9.getInt("no2"));
                int sum1 = (bsr.data(rs9.getString("branch") + "-100", "no2") + bsr.data(rs9.getString("branch") + "-200", "no2") + bsr.data(rs9.getString("branch") + "-300", "no2") + bsr.data(rs9.getString("branch") + "-400", "no2") + bsr.data(rs9.getString("branch") + "-500", "no2"));
                System.out.println(sum1);
                int diff1 = rs9.getInt("no2") - sum1;
                System.out.println(diff1);
                int sum11 = bsr.data(rs9.getString("branch") + b, "no2") + diff1;
                System.out.println(sum11);
                //st1.executeUpdate("update planningdatabase.planningdifference set no2=" + sum11 + " where branchcode='" + rs9.getString("branch") + "-" + b + "'");
            }
            if (rs9.getInt("no3") != (bsr.data(rs9.getString("branch") + "-100", "no3") + bsr.data(rs9.getString("branch") + "-200", "no3") + bsr.data(rs9.getString("branch") + "-300", "no3") + bsr.data(rs9.getString("branch") + "-400", "no3") + bsr.data(rs9.getString("branch") + "-500", "no3"))) {
                System.out.println(rs9.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs9.getString("branch") + "-100", "no3") + bsr.data(rs9.getString("branch") + "-200", "no3") + bsr.data(rs9.getString("branch") + "-300", "no3") + bsr.data(rs9.getString("branch") + "-400", "no3") + bsr.data(rs9.getString("branch") + "-500", "no3"));
                int diff1 = rs9.getInt("no3") - sum1;
                int sum11 = bsr.data(rs9.getString("branch") + b, "no3") + diff1;
                //st1.executeUpdate("update planningdatabase.planningdifference set no3=" + sum11 + " where branchcode='" + rs9.getString("branch") + "-" + b + "'");
            }
            if (rs9.getInt("amt1") != (bsr.data(rs9.getString("branch") + "-100", "amt1") + bsr.data(rs9.getString("branch") + "-200", "amt1") + bsr.data(rs9.getString("branch") + "-300", "amt1") + bsr.data(rs9.getString("branch") + "-400", "amt1") + bsr.data(rs9.getString("branch") + "-500", "amt1"))) {
                System.out.println(rs9.getString("branch") + "\tamt1");
                int sum1 = (bsr.data(rs9.getString("branch") + "-100", "amt1") + bsr.data(rs9.getString("branch") + "-200", "amt1") + bsr.data(rs9.getString("branch") + "-300", "amt1") + bsr.data(rs9.getString("branch") + "-400", "amt1") + bsr.data(rs9.getString("branch") + "-500", "amt1"));
                int diff1 = rs9.getInt("amt1") - sum1;
                int sum11 = bsr.data(rs9.getString("branch") + b, "amt1") + diff1;
                //st1.executeUpdate("update planningdatabase.planningdifference set amt1=" + sum11 + " where branchcode='" + rs9.getString("branch") + "-" + b + "'");
            }
*//*
            if (rs9.getInt("amt2") != (bsr.data(rs9.getString("branch") + "-410", "amt2") + bsr.data(rs9.getString("branch") + "-420", "amt2")+ bsr.data(rs9.getString("branch") + "-430", "amt2"))) {
                System.out.println(rs9.getString("branch") + "\tamt2");
                System.out.println(rs9.getInt("amt2"));
                int sum1 = (bsr.data(rs9.getString("branch") + "-410", "amt2") + bsr.data(rs9.getString("branch") + "-420", "amt2")+ bsr.data(rs9.getString("branch") + "-430", "amt2"));
                System.out.println("sum is "+sum1);
                int diff1 = rs9.getInt("amt2") - sum1;
                System.out.println("diff is "+diff1);
                System.out.println(bsr.data(rs9.getString("branch") + "-420", "amt2"));
                int sum11 = bsr.data(rs9.getString("branch") + "-420", "amt2") + diff1;
                System.out.println("final is "+sum11);
                st1.executeUpdate("update planningdatabase.planningdifference set amt2=" + sum11 + " where branchcode='" + rs9.getString("branch") + "-" + 420 + "'");
            }
            *//*
            if (rs9.getInt("amt3") != (bsr.data(rs9.getString("branch") + "-100", "amt3") + bsr.data(rs9.getString("branch") + "-200", "amt3") + bsr.data(rs9.getString("branch") + "-300", "amt3") + bsr.data(rs9.getString("branch") + "-400", "amt3") + bsr.data(rs9.getString("branch") + "-500", "amt3"))) {
                System.out.println(rs9.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs9.getString("branch") + "-100", "amt3") + bsr.data(rs9.getString("branch") + "-200", "amt3") + bsr.data(rs9.getString("branch") + "-300", "amt3") + bsr.data(rs9.getString("branch") + "-400", "amt3") + bsr.data(rs9.getString("branch") + "-500", "amt3"));
                int diff1 = rs9.getInt("amt3") - sum1;
                int sum11 = bsr.data(rs9.getString("branch") + b, "amt3") + diff1;
                //st1.executeUpdate("update planningdatabase.planningdifference set amt3=" + sum11 + " where branchcode='" + rs9.getString("branch") + "-" + b + "'");
            }  
        }*/
    }

    public int data(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningdatabase.planningdifference where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }
}
