package CBS;

import amit.include_one;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BSRPlanningUpdate {

    public static Connection conn;

    public BSRPlanningUpdate() {
        try {
            include_one i = new include_one();
            conn = i.connect();
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        BSRPlanningUpdate bsr = new BSRPlanningUpdate();
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
        int code = 0;
        int max = 0;
        String as = "0,100,110,120,130,200,210,220,300,310,311,312,313,314,320,330,340,350,400,410,411,420,421,422,430,431,432,500,510,511,512,520,600,601,602,603,604,605,606,610,611,612,613,614,615,616,700,701,703,704,705,706,707,708,709,711,712,810,811,813,814,815,816,817,818,819,731,732,800,801,802,803,804,810,811,812,813,814,900,901,902,903,904,905,906,910,911,912,913,914,915,916";
        String br = "5190001,5190002,5190003,5190004,5190005,5190006,5190007,5190008,5190009,519000A,519000B,519000C,519000D,519000E,519000F,519000G,519000H,5190010,5190011,5190012,5190013,5190014,5190015,5190016,5190017,5190018,5190019,5190020,5190021,5190022,5190023,5190024,5190025,5190026,5190027,5190028,5190029,5190030,5190031,5190032,5190033,5190034,5190035,5190036,5190037,5190038,5190039,5190040,5190041,5190042,5190043,5190044,5190045,5190046,5190047,5190048,5190049,5190050,5190051,5190052,5190053,5190054,5190055,5190056,5190057,5190058,5190059,5190060,5190061,5190062,5190063,5190064,5190065,5190066,5190067,5190068,5190069,5190070,5190071,5190081,5190073,5190074,5190075,5190076,5190077,5190078,5190079,5190080,5190081,5190082,5190083,5190084,5190085,5190086,5190087,5190088,5190089,5190090,5190091,5190092,5190093,5190094,5190095,5190096,5190097,5190098,5190099,5190100,5190101,5190102,5190103,5190104,5190105,5190106,5190107,5190108,5190109,5190110,5190111,5190112,5190113,5190114,5190115,5190116,5190117,5190118,5190119,5190120,5190121,5190122,5190123,5190124,5190125,5190126,5190127,5190128,5190129,5190130,5190131,5190132,5190133,5190134,5190135,5190136,5190137,5190138,5190139,5190140,5190141,5190142,5190143,5190144,5190145,5190146,5190147,5190148,5190149,5190150,5190151,5190152,5190153,5190154,5190155,5190156,5190157,5190158,5190159,5190160,5190161,5190162,5190163,5190164,5190165,5190166,5190167,5190168,5190169,5190170,5190171,5190181,5190173,5190174,5190175,5190176,5190177,5190178,5190179,5190180,5190181,5190182,5190183,5190184,5190185,5190186,5190187,5190188,5190189,5190190,5190191,5190192,5190193,5190194,5190195,5190196,5190197,5190198,5190199,5190200,5190201,5190202,5190203,5190204,5190205,5190206,5190207,5190208,5190209,5190210,5190211,5190212,5190213,5190214,5190215,5190216,5190217,5190218,5190219,5190220,5190221,5190222,5190223,5190224,5190225,5190226,5190227,5190228,5190229,5190230,5190231,5190232,5190233,5190234,5190235,5190236,5190237,5190238,5190239,5190240,5190241,5190242,5190243,5190244,5190245,5190246,5190247,5190248,5190249,5190250,5190251,5190252,5190253,5190254,5190255,5190256,5190257,5190258,5190259,5190260,5190261,5190262,5190263,5190264,5190265,5190266,5190267,5190268,5190269,5190270,5190271,5190305,5190273,5190274,5190275,5190276,5190277,5190278,5190279,5190280,5190305,5190282,5190283,5190284,5190285,5190286,5190287,5190288,5190289,5190290,5190291,5190292,5190293,5190294,5190295,5190296,5190297,5190298,5190299,5190300,5190301,5190305,5190305,5190304,5190305,5190306,5190307,5190308,5190309,5190310,5190311,5190312,5190313,5190314,5190315,5190316,5190317,5190318,5190319,5190320,5190321,5190322,5190323,5190324,5190325,5190326,5190327,5190328,5190329,5190330,5190331,5190332,5190333,5190334,5190335,5190336,5190337,5190338,5190339,5190340,5190341,5190342,5190343,5190344,5190345,5190346,5190347,5190348,5190349,5190350,5190351,5190352,5190353,5190354,5190355,5190356,5190357,5190358,5190359,5190360,5190361,5190362,5190363,5190364,5190365,5190366,5190367,5190368,5190369,5190370,5190371,5190381,5190373,5190374,5190375,5190376,5190377,5190378,5190379,5190380,5190381,5190382,5190383,5190384,5190385,5190386,5190387,5190388,5190389,5190390,5190391,5190392,5190393,5190394,5190395,5190396,5190397,5190398,5190399,5190400,5190401,5190402,5190403,5190404,5190405,5190406,5190407,5190408,5190409,5190410,5190411,5190412,5190413,5190414,5190415,5190416,5190417,5190418,5190419,5190420,5190421,5190422,5190423,5190424,5190425,5190426,5190427,5190428,5190429,5190430,5190431,5190432,5190433,5190434,5190435,5190436,5190437,5190438,5190439,5190440,5190441,5190442,5190443,5190444,5190445,5190446,5190447,5190448,5190449,5190450,5190451,5190452,5190453,5190454,5190455,5190456,5190457,5190458,5190459,5190460,5190461,5190462,5190463,5190464,5190465,5190466,5190467,5190468,5190469,5190470,5190471,5190481,5190473,5190474,5190475,5190476,5190477,5190478,5190479,5190480,5190481,5190482,5190483,5190484,5190485,5190486,5190487,5190488,5190489,5190490,5190491,5190492,5190493,5190494,5190495,5190496,5190497,5190498,5190499,5190500,5190501,5190502,5190503,5190504,5190505,5190506,5190507,5190508,5190509,5190510,5190511,5190512,5190513,5190514,5190515,5190516,5190517,5190518,5190519,5190520,5190521,5190522,5190523,5190524,5190525,5190526,5190527,5190528,5190529,5190530,5190531,5190532,5190533,5190534,5190535,5190536,5190537,5190538,5190539,5190540,5190541,5190542,5190543,5190544,5190545,5190546,5190547,5190548,5190549,5190550,5190551,5190552,5190553,5190554,5190555,5190556,5190557,5190558,5190559,5190560,5190561,5190562,5190563,5190564,5190565,5190566,5190567,5190568,5190569,5190570,5190571,5190581,5190573,5190574,5190575,5190576,5190577,5190578,5190579,5190580,5190581,5190582,5190583,5190584,5190585,5190586,5190587,5190588,5190589,5190590,5190591,5190592,5190593,5190594,5190595,5190596,5190597,5190598,5190599,5190600,5190601,5190602,5190603,5190604,5190605,5190606,5190607,5190608,5190609,5190610,5190611,5190612,5190613,5190614,5190615,5190616,5190617,5190618,5190619,5190620,5190621,5190622,5190623,5190624,5190625,5190626,5190627,5190628,5190629,5190630,5190631,5190632,5190633,5190634,5190636,5190637,5190638,5190639,5190640,5190641,5190642,5190643,5190644,5190645,5190646,5190649,5190650,5190651,5190652,5190653,5190654,5190655,5190656,5190657,5190658,5190659,5190660,5190661,5190662,5190663,5190664,5190665,5190666,5190667,5190668,5190669,5190670,5190671,5190681,5190673,5190674,5190675,5190676,5190677,5190678,5190679,5190680,5190681,5190682,5190683,5190684,5190685,5190686,5190687,5190688,5190689,5190690,5190691,5190692,5190693,5190694,5190695,5190696,5190697,5190698,5190699,5190700,5190701,5190702,5190703,5190704,5190705,5190706,5190707,5190708,5190709,5190710,5190711,5190712,5190713,5190714,5190715,5190716,5190717,5190718,5190719,5190810,5190811,5190812,5190813,5190814,5190815,5190816,5190817,5190818,5190819,5190730,5190731,5190732,5190733,5190734,5190735,5190736,5190737,5190738,5190739,5190740,5190741,5190742,5190743,5190744,5190745,5190746,5190747,5190748,5190749,5190750,5190751,5190752,5190753,5190754,5190755,5190756,5190757,5190758,5190759,5190760,5190761,5190762,5190763,5190764,5190765,5190766,5190767,5190768,5190769,5190770,5190771,5190781,5190773,5190774,5190775,5190776,5190777,5190778,5190779,5190780,5190781,5190782,5190783,5190784,5190785,5190786,5190787,5190788,5190789,5190790,5190791,5190792,5190793,5190794,5190795,5190796,5190797,5190798,5190799,5190800,5190801,5190802,5190803,5190804,5190805,5190806,5190807,5190808,5190809,5190810,5190811,5190812,5190813,5190814,5190815,5190816,5190817,5190818,5190819,5190820,5190821,5190822,5190823,5190824,5190825,5190826,5190827,5190828,5190829,5190830,5190831,5190832,5190833,5190834,5190835,5190836,5190837,5190838,5190839,5190840,5190841,5190842,5190843,5190844,5190845,5190846,5190847,5190848,5190849,5190850,5190851,5190852,5190853";
        /*
        ResultSet rs0 = st0.executeQuery("SELECT * FROM planningfinal where code='100'");
        while (rs0.next()) {
            rs0.getString("branchcode");
            
            if (rs0.getInt("no1") != (bsr.data(rs0.getString("branch") + "-110", "no1") + bsr.data(rs0.getString("branch") + "-120", "no1") + bsr.data(rs0.getString("branch") + "-130", "no1"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
            }
            if (rs0.getInt("no2") != (bsr.data(rs0.getString("branch") + "-110", "no2") + bsr.data(rs0.getString("branch") + "-120", "no2") + bsr.data(rs0.getString("branch") + "-130", "no2"))) {
                System.out.println(rs0.getString("branch") + "\tno2");
                int sum2=(bsr.data(rs0.getString("branch") + "-110", "no2") + bsr.data(rs0.getString("branch") + "-120", "no2") + bsr.data(rs0.getString("branch") + "-130", "no2"));
                st1.executeUpdate("update planningfinal set no2=" + sum2 + " where branchcode='" + rs0.getString("branch") + "-100'");
            }
            if (rs0.getInt("no3") != (bsr.data(rs0.getString("branch") + "-110", "no3") + bsr.data(rs0.getString("branch") + "-120", "no3") + bsr.data(rs0.getString("branch") + "-130", "no3"))) {
                System.out.println(rs0.getString("branch") + "\tno3");
            int sum2=(bsr.data(rs0.getString("branch") + "-110", "no3") + bsr.data(rs0.getString("branch") + "-120", "no3") + bsr.data(rs0.getString("branch") + "-130", "no3"));
                st1.executeUpdate("update planningfinal set no3=" + sum2 + " where branchcode='" + rs0.getString("branch") + "-100'");            
            }
            if (rs0.getInt("amt1") != (bsr.data(rs0.getString("branch") + "-110", "amt1") + bsr.data(rs0.getString("branch") + "-120", "amt1") + bsr.data(rs0.getString("branch") + "-130", "amt1"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
            }
           
            if (rs0.getInt("amt2") != (bsr.data(rs0.getString("branch") + "-110", "amt2") + bsr.data(rs0.getString("branch") + "-120", "amt2") + bsr.data(rs0.getString("branch") + "-130", "amt2"))) {
                System.out.println(rs0.getString("branch") + "\tamt2");
                int sum3=(bsr.data(rs0.getString("branch") + "-110", "amt2") + bsr.data(rs0.getString("branch") + "-120", "amt2") + bsr.data(rs0.getString("branch") + "-130", "amt2"));
                st1.executeUpdate("update planningfinal set amt2=" + sum3 + " where branchcode='" + rs0.getString("branch") + "-100'");
            }
            if (rs0.getInt("amt3") != (bsr.data(rs0.getString("branch") + "-110", "amt3") + bsr.data(rs0.getString("branch") + "-120", "amt3") + bsr.data(rs0.getString("branch") + "-130", "amt3"))) {
                System.out.println(rs0.getString("branch") + "\tno1");
                 int sum3=(bsr.data(rs0.getString("branch") + "-110", "amt3") + bsr.data(rs0.getString("branch") + "-120", "amt3") + bsr.data(rs0.getString("branch") + "-130", "amt3"));
                st1.executeUpdate("update planningfinal set amt3=" + sum3 + " where branchcode='" + rs0.getString("branch") + "-100'");
            
            }
        }
         *//*
        ResultSet rs1 = st1.executeQuery("SELECT * FROM planningfinal where code='200'");
        while (rs1.next()) {
            rs1.getString("branchcode");
            
            if (rs1.getInt("no1") != (bsr.data(rs1.getString("branch") + "-210", "no1") + bsr.data(rs1.getString("branch") + "-220", "no1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
            if (rs1.getInt("no2") != (bsr.data(rs1.getString("branch") + "-210", "no2") + bsr.data(rs1.getString("branch") + "-220", "no2"))) {
                System.out.println(rs1.getString("branch") + "\tno2");
            }
            if (rs1.getInt("no3") != (bsr.data(rs1.getString("branch") + "-210", "no3") + bsr.data(rs1.getString("branch") + "-220", "no3") + bsr.data(rs1.getString("branch") + "-", "no3"))) {
                System.out.println(rs1.getString("branch") + "\tno3");
            }
            if (rs1.getInt("amt1") != (bsr.data(rs1.getString("branch") + "-210", "amt1") + bsr.data(rs1.getString("branch") + "-220", "amt1") + bsr.data(rs1.getString("branch") + "-", "amt1"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
         /*
            ResultSet rs1 = st1.executeQuery("SELECT * FROM planningfinal where code='200'");
        while (rs1.next()) {
            rs1.getString("branchcode");
            if (rs1.getInt("amt2") != (bsr.data(rs1.getString("branch") + "-210", "amt2") + bsr.data(rs1.getString("branch") + "-220", "amt2"))) {
                System.out.println(rs1.getString("branch") + "\tamt2");
            int sum1 = (bsr.data(rs1.getString("branch") + "-210", "amt2") + bsr.data(rs1.getString("branch") + "-220", "amt2"));
            st2.executeUpdate("update planningfinal set amt2=" + sum1 + " where branchcode='" + rs1.getString("branch") + "-200'");
            }
        }*/
 /*
            if (rs1.getInt("amt3") != (bsr.data(rs1.getString("branch") + "-210", "amt3") + bsr.data(rs1.getString("branch") + "-220", "amt3") + bsr.data(rs1.getString("branch") + "-", "amt3"))) {
                System.out.println(rs1.getString("branch") + "\tno1");
            }
           
        } */
 /*
        System.out.println("300");
        ResultSet rs2 = st2.executeQuery("SELECT * FROM planningfinal where code='300'");
        while (rs2.next()) {
            rs2.getString("branchcode");
            if (rs2.getInt("no1") != (bsr.data(rs2.getString("branch") + "-310", "no1") + bsr.data(rs2.getString("branch") + "-320", "no1") + bsr.data(rs2.getString("branch") + "-330", "no1") + bsr.data(rs2.getString("branch") + "-340", "no1") + bsr.data(rs2.getString("branch") + "-350", "no1"))) {
                System.out.println(rs2.getString("branch") + "\tno1");
                int sum1 = (bsr.data(rs2.getString("branch") + "-310", "no1") + bsr.data(rs2.getString("branch") + "-320", "no1") + bsr.data(rs2.getString("branch") + "-330", "no1") + bsr.data(rs2.getString("branch") + "-340", "no1") + bsr.data(rs2.getString("branch") + "-350", "no1"));
                st1.executeUpdate("update planningfinal set no1=" + sum1 + " where branchcode='" + rs2.getString("branch") + "-300'");
            }
            if (rs2.getInt("no2") != (bsr.data(rs2.getString("branch") + "-310", "no2") + bsr.data(rs2.getString("branch") + "-320", "no2") + bsr.data(rs2.getString("branch") + "-330", "no2") + bsr.data(rs2.getString("branch") + "-340", "no2") + bsr.data(rs2.getString("branch") + "-350", "no2"))) {
                System.out.println(rs2.getString("branch") + "\tno2");
                int sum2 = (bsr.data(rs2.getString("branch") + "-310", "no2") + bsr.data(rs2.getString("branch") + "-320", "no2") + bsr.data(rs2.getString("branch") + "-330", "no2") + bsr.data(rs2.getString("branch") + "-340", "no2") + bsr.data(rs2.getString("branch") + "-350", "no2"));
                st1.executeUpdate("update planningfinal set no2=" + sum2 + " where branchcode='" + rs2.getString("branch") + "-300'");
            }
            if (rs2.getInt("no3") != (bsr.data(rs2.getString("branch") + "-310", "no3") + bsr.data(rs2.getString("branch") + "-320", "no3") + bsr.data(rs2.getString("branch") + "-330", "no3") + bsr.data(rs2.getString("branch") + "-340", "no3") + bsr.data(rs2.getString("branch") + "-350", "no3"))) {
                System.out.println(rs2.getString("branch") + "\tno3");
                int sum3 = (bsr.data(rs2.getString("branch") + "-310", "no3") + bsr.data(rs2.getString("branch") + "-320", "no3") + bsr.data(rs2.getString("branch") + "-330", "no3") + bsr.data(rs2.getString("branch") + "-340", "no3") + bsr.data(rs2.getString("branch") + "-350", "no3"));
                st1.executeUpdate("update planningfinal set no3=" + sum3 + " where branchcode='" + rs2.getString("branch") + "-300'");
            }
            if (rs2.getInt("amt1") != (bsr.data(rs2.getString("branch") + "-310", "amt1") + bsr.data(rs2.getString("branch") + "-320", "amt1") + bsr.data(rs2.getString("branch") + "-330", "amt1") + bsr.data(rs2.getString("branch") + "-340", "amt1") + bsr.data(rs2.getString("branch") + "-350", "amt1"))) {
                System.out.println(rs2.getString("branch") + "\tamt1");
                int sum4 = (bsr.data(rs2.getString("branch") + "-310", "amt1") + bsr.data(rs2.getString("branch") + "-320", "amt1") + bsr.data(rs2.getString("branch") + "-330", "amt1") + bsr.data(rs2.getString("branch") + "-340", "amt1") + bsr.data(rs2.getString("branch") + "-350", "amt1"));
                st1.executeUpdate("update planningfinal set amt1=" + sum4 + " where branchcode='" + rs2.getString("branch") + "-300'");
            }
            if (rs2.getInt("amt2") != (bsr.data(rs2.getString("branch") + "-310", "amt2") + bsr.data(rs2.getString("branch") + "-320", "amt2") + bsr.data(rs2.getString("branch") + "-330", "amt2") + bsr.data(rs2.getString("branch") + "-340", "amt2") + bsr.data(rs2.getString("branch") + "-350", "amt2"))) {
                System.out.println(rs2.getString("branch") + "\tamt2");
                int sum5 = (bsr.data(rs2.getString("branch") + "-310", "amt2") + bsr.data(rs2.getString("branch") + "-320", "amt2") + bsr.data(rs2.getString("branch") + "-330", "amt2") + bsr.data(rs2.getString("branch") + "-340", "amt2") + bsr.data(rs2.getString("branch") + "-350", "amt2"));
                st1.executeUpdate("update planningfinal set amt2=" + sum5 + " where branchcode='" + rs2.getString("branch") + "-300'");
            }
            if (rs2.getInt("amt3") != (bsr.data(rs2.getString("branch") + "-310", "amt3") + bsr.data(rs2.getString("branch") + "-320", "amt3") + bsr.data(rs2.getString("branch") + "-330", "amt3") + bsr.data(rs2.getString("branch") + "-340", "amt3") + bsr.data(rs2.getString("branch") + "-350", "amt3"))) {
                System.out.println(rs2.getString("branch") + "\tamt3");
                int sum6 = (bsr.data(rs2.getString("branch") + "-310", "amt3") + bsr.data(rs2.getString("branch") + "-320", "amt3") + bsr.data(rs2.getString("branch") + "-330", "amt3") + bsr.data(rs2.getString("branch") + "-340", "amt3") + bsr.data(rs2.getString("branch") + "-350", "amt3"));
                st1.executeUpdate("update planningfinal set amt3=" + sum6 + " where branchcode='" + rs2.getString("branch") + "-300'");
            }
        }
        System.out.println("310");
        ResultSet rs3 = st3.executeQuery("SELECT * FROM planningfinal where code='310'");
        while (rs3.next()) {
            rs3.getString("branchcode");
            if (rs3.getInt("no1") != (bsr.data(rs3.getString("branch") + "-311", "no1") + bsr.data(rs3.getString("branch") + "-312", "no1") + bsr.data(rs3.getString("branch") + "-313", "no1") + bsr.data(rs3.getString("branch") + "-314", "no1"))) {
                System.out.println(rs3.getString("branch") + "\tno1");
                int sum1 = (bsr.data(rs3.getString("branch") + "-311", "no1") + bsr.data(rs3.getString("branch") + "-312", "no1") + bsr.data(rs3.getString("branch") + "-313", "no1") + bsr.data(rs3.getString("branch") + "-314", "no1"));
                st1.executeUpdate("update planningfinal set no1=" + sum1 + " where branchcode='" + rs3.getString("branch") + "-310'");
            }
            if (rs3.getInt("no2") != (bsr.data(rs3.getString("branch") + "-311", "no2") + bsr.data(rs3.getString("branch") + "-312", "no2") + bsr.data(rs3.getString("branch") + "-313", "no2") + bsr.data(rs3.getString("branch") + "-314", "no2"))) {
                System.out.println(rs3.getString("branch") + "\tno2");
                System.out.println(rs3.getInt("no2"));
                System.out.println(bsr.data(rs3.getString("branch") + "-310", "no2"));
                System.out.println((bsr.data(rs3.getString("branch") + "-311", "no2") + bsr.data(rs3.getString("branch") + "-312", "no2") + bsr.data(rs3.getString("branch") + "-313", "no2") + bsr.data(rs3.getString("branch") + "-314", "no2")));
                int sum2 = (bsr.data(rs3.getString("branch") + "-311", "no2") + bsr.data(rs3.getString("branch") + "-312", "no2") + bsr.data(rs3.getString("branch") + "-313", "no2") + bsr.data(rs3.getString("branch") + "-314", "no2"));
                System.out.println(sum2);
                st2.executeUpdate("update planningfinal set no2=" + sum2 + " where branchcode='" + rs3.getString("branch") + "-310'");
                System.out.println(bsr.data(rs3.getString("branch") + "-310", "no2"));
            }
            if (rs3.getInt("no3") != (bsr.data(rs3.getString("branch") + "-311", "no3") + bsr.data(rs3.getString("branch") + "-312", "no3") + bsr.data(rs3.getString("branch") + "-313", "no3") + bsr.data(rs3.getString("branch") + "-314", "no3"))) {
                System.out.println(rs3.getString("branch") + "\tno3");
                int sum3 = (bsr.data(rs3.getString("branch") + "-311", "no3") + bsr.data(rs3.getString("branch") + "-312", "no3") + bsr.data(rs3.getString("branch") + "-313", "no3") + bsr.data(rs3.getString("branch") + "-314", "no3"));
                st1.executeUpdate("update planningfinal set no3=" + sum3 + " where branchcode='" + rs3.getString("branch") + "-310'");
            }
            if (rs3.getInt("amt1") != (bsr.data(rs3.getString("branch") + "-311", "amt1") + bsr.data(rs3.getString("branch") + "-312", "amt1") + bsr.data(rs3.getString("branch") + "-313", "amt1") + bsr.data(rs3.getString("branch") + "-314", "amt1"))) {
                System.out.println(rs3.getString("branch") + "\tamt1");
                int sum4 = (bsr.data(rs3.getString("branch") + "-311", "amt1") + bsr.data(rs3.getString("branch") + "-312", "amt1") + bsr.data(rs3.getString("branch") + "-313", "amt1") + bsr.data(rs3.getString("branch") + "-314", "amt1"));
                st1.executeUpdate("update planningfinal set amt1=" + sum4 + " where branchcode='" + rs3.getString("branch") + "-310'");
            }
            if (rs3.getInt("amt2") != (bsr.data(rs3.getString("branch") + "-311", "amt2") + bsr.data(rs3.getString("branch") + "-312", "amt2") + bsr.data(rs3.getString("branch") + "-313", "amt2") + bsr.data(rs3.getString("branch") + "-314", "amt2"))) {
                System.out.println(rs3.getString("branch") + "\tamt2");
                int sum5 = (bsr.data(rs3.getString("branch") + "-311", "amt2") + bsr.data(rs3.getString("branch") + "-312", "amt2") + bsr.data(rs3.getString("branch") + "-313", "amt2") + bsr.data(rs3.getString("branch") + "-314", "amt2"));
                st1.executeUpdate("update planningfinal set amt2=" + sum5 + " where branchcode='" + rs3.getString("branch") + "-310'");
            }
            if (rs3.getInt("amt3") != (bsr.data(rs3.getString("branch") + "-311", "amt3") + bsr.data(rs3.getString("branch") + "-312", "amt3") + bsr.data(rs3.getString("branch") + "-313", "amt3") + bsr.data(rs3.getString("branch") + "-314", "amt3"))) {
                System.out.println(rs3.getString("branch") + "\tamt3");
                int sum6 = (bsr.data(rs3.getString("branch") + "-311", "amt3") + bsr.data(rs3.getString("branch") + "-312", "amt3") + bsr.data(rs3.getString("branch") + "-313", "amt3") + bsr.data(rs3.getString("branch") + "-314", "amt3"));
                st1.executeUpdate("update planningfinal set amt3=" + sum6 + " where branchcode='" + rs3.getString("branch") + "-310'");
            }
        }*/
        System.out.println("410>=411");
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='411'");
        while (rs12.next()) {
            rs12.getString("branchcode");
            //st1.executeUpdate("update planningfinal set no2=" + rs12.getDouble("no2") + " where branchcode='" + rs12.getString("branch") + "-411'");
            int sum1 = bsr.data(rs12.getString("branch") + "-410", "no2");
            sum1 = (int) (sum1 - (sum1 * 0.58));
            st1.executeUpdate("update planningfinal set no2=" + sum1 + " where branchcode='" + rs12.getString("branch") + "-411'");
            int sum2 = bsr.data(rs12.getString("branch") + "-410", "amt2");
            sum2 = (int) (sum2 - (sum2 * 0.68));
            st1.executeUpdate("update planningfinal set amt2=" + sum2 + " where branchcode='" + rs12.getString("branch") + "-411'");
            int sum3 = bsr.data(rs12.getString("branch") + "-410", "no3");
            sum3 = (int) (sum3 - (sum3 * 0.58));
            st1.executeUpdate("update planningfinal set no3=" + sum3 + " where branchcode='" + rs12.getString("branch") + "-411'");
            int sum4 = bsr.data(rs12.getString("branch") + "-410", "amt3");
            sum4 = (int) (sum4 - (sum4 * 0.68));
            st1.executeUpdate("update planningfinal set amt3=" + sum4 + " where branchcode='" + rs12.getString("branch") + "-411'");
            int sumNo = rs12.getInt("no1") + rs12.getInt("no2") + rs12.getInt("no3");
            int sumAmt = rs12.getInt("amt1") + rs12.getInt("amt2") + rs12.getInt("amt3");
            st1.executeUpdate("update planningfinal set totno=" + sumNo + " where branchcode='" + rs12.getString("branch") + "-411'");
            st1.executeUpdate("update planningfinal set totamt=" + sumAmt + " where branchcode='" + rs12.getString("branch") + "-411'");
            System.out.println(rs12.getString("branch"));
        }
        /*
        System.out.println("400");
        ResultSet rs4 = st4.executeQuery("SELECT * FROM planningfinal where code='400' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs4.next()) {
            rs4.getString("branchcode");

            if (rs4.getInt("no1") != (bsr.data(rs4.getString("branch") + "-410", "no1") + bsr.data(rs4.getString("branch") + "-420", "no1") + bsr.data(rs4.getString("branch") + "-430", "no1"))) {
                System.out.println(rs4.getString("branch") + "\tno1");
                int sum1 = (bsr.data(rs4.getString("branch") + "-410", "no1") + bsr.data(rs4.getString("branch") + "-420", "no1") + bsr.data(rs4.getString("branch") + "-430", "no1"));
                st1.executeUpdate("update planningfinal set no1=" + sum1 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
            if (rs4.getInt("no2") != (bsr.data(rs4.getString("branch") + "-410", "no2") + bsr.data(rs4.getString("branch") + "-420", "no2") + bsr.data(rs4.getString("branch") + "-430", "no2"))) {
                System.out.println(rs4.getString("branch") + "\tno2");
                int sum2 = (bsr.data(rs4.getString("branch") + "-410", "no2") + bsr.data(rs4.getString("branch") + "-420", "no2") + bsr.data(rs4.getString("branch") + "-430", "no2"));
                st1.executeUpdate("update planningfinal set no2=" + sum2 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
            if (rs4.getInt("no3") != (bsr.data(rs4.getString("branch") + "-410", "no3") + bsr.data(rs4.getString("branch") + "-420", "no3") + bsr.data(rs4.getString("branch") + "-430", "no3"))) {
                System.out.println(rs4.getString("branch") + "\tno3");
                int sum3 = (bsr.data(rs4.getString("branch") + "-410", "no3") + bsr.data(rs4.getString("branch") + "-420", "no3") + bsr.data(rs4.getString("branch") + "-430", "no3"));
                st1.executeUpdate("update planningfinal set no3=" + sum3 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
            if (rs4.getInt("no3") != (bsr.data(rs4.getString("branch") + "-410", "no3") + bsr.data(rs4.getString("branch") + "-420", "no3") + bsr.data(rs4.getString("branch") + "-430", "no3"))) {
                System.out.println(rs4.getString("branch") + "\tno3");
                int diff = (bsr.data(rs4.getString("branch") + "-400", "no3") - bsr.data(rs4.getString("branch") + "-410", "no3"));
                System.out.println(diff);
                st1.executeUpdate("update planningfinal set no3=" + sum3 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
            if (rs4.getInt("amt1") != (bsr.data(rs4.getString("branch") + "-410", "amt1") + bsr.data(rs4.getString("branch") + "-420", "amt1") + bsr.data(rs4.getString("branch") + "-430", "amt1"))) {
                System.out.println(rs4.getString("branch") + "\tamt1");
                int sum4 = (bsr.data(rs4.getString("branch") + "-410", "amt1") + bsr.data(rs4.getString("branch") + "-420", "amt1") + bsr.data(rs4.getString("branch") + "-430", "amt1"));
                st1.executeUpdate("update planningfinal set amt1=" + sum4 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
            if (rs4.getInt("amt2") != (bsr.data(rs4.getString("branch") + "-410", "amt2") + bsr.data(rs4.getString("branch") + "-420", "amt2") + bsr.data(rs4.getString("branch") + "-430", "amt2"))) {
                System.out.println(rs4.getString("branch") + "\tamt2");
                int sum5 = (bsr.data(rs4.getString("branch") + "-410", "amt2") + bsr.data(rs4.getString("branch") + "-420", "amt2") + bsr.data(rs4.getString("branch") + "-430", "amt2"));
                st1.executeUpdate("update planningfinal set amt2=" + sum5 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
            if (rs4.getInt("amt3") != (bsr.data(rs4.getString("branch") + "-410", "amt3") + bsr.data(rs4.getString("branch") + "-420", "amt3") + bsr.data(rs4.getString("branch") + "-430", "amt3"))) {
                System.out.println(rs4.getString("branch") + "\tamt3");
                int sum6 = (bsr.data(rs4.getString("branch") + "-410", "amt3") + bsr.data(rs4.getString("branch") + "-420", "amt3") + bsr.data(rs4.getString("branch") + "-430", "amt3"));
                st1.executeUpdate("update planningfinal set amt3=" + sum6 + " where branchcode='" + rs4.getString("branch") + "-400'");
            }
        }*//*
        System.out.println("400=410+420+430 making equal after 800 average");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='410' and branch "
                //+ "= 5190026");
                + "in(5190026,'519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs11.next()) {
            rs11.getString("branchcode");
            System.out.println(rs11.getString("branch") + "\tno3");
            int sum11 = 0;
            st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branch='" + rs11.getString("branch") + "' and code in(100,110,120,130,200,210,220,300,310,320,330,340,350,311,312,313,314,420,421,422,430,431,432,500,510,520,511,512)");
            int sum20 = rs11.getInt("no3");
            st2.executeUpdate("update planningfinal set no3=" + sum20 + " where branchcode='" + rs11.getString("branch") + "-0'");
            st2.executeUpdate("update planningfinal set no3=" + sum20 + " where branchcode='" + rs11.getString("branch") + "-400'");
            System.out.println(rs11.getString("branch") + "\tamt3");
            sum11 = 0;
            st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branch='" + rs11.getString("branch") + "' and code in(100,110,120,130,200,210,220,300,310,320,330,340,350,311,312,313,314,420,421,422,430,431,432,500,510,520,511,512)");
            int sum21 = rs11.getInt("amt3");
            st2.executeUpdate("update planningfinal set amt3=" + sum21 + " where branchcode='" + rs11.getString("branch") + "-0'");
            st2.executeUpdate("update planningfinal set amt3=" + sum21 + " where branchcode='" + rs11.getString("branch") + "-400'");
        }
        /*
        ResultSet rs5 = st5.executeQuery("SELECT * FROM planningfinal where code='420'");
        while (rs5.next()) {
            rs5.getString("branchcode");
            if (rs5.getInt("no1") != (bsr.data(rs5.getString("branch") + "-421", "no1") + bsr.data(rs5.getString("branch") + "-422", "no1"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
                int sum1 = (bsr.data(rs5.getString("branch") + "-421", "no1") + bsr.data(rs5.getString("branch") + "-422", "no1"));
                st1.executeUpdate("update planningfinal set no1=" + sum1 + " where branchcode='" + rs5.getString("branch") + "-420'");
            }
            if (rs5.getInt("no2") != (bsr.data(rs5.getString("branch") + "-421", "no2") + bsr.data(rs5.getString("branch") + "-422", "no2"))) {
                System.out.println(rs5.getString("branch") + "\tno2");
                int sum1= (bsr.data(rs5.getString("branch") + "-421", "no2") + bsr.data(rs5.getString("branch") + "-422", "no2"));
                st1.executeUpdate("update planningfinal set no2=" + sum1 + " where branchcode='" + rs5.getString("branch") + "-420'");
            }
            if (rs5.getInt("no3") != (bsr.data(rs5.getString("branch") + "-421", "no3") + bsr.data(rs5.getString("branch") + "-422", "no3"))) {
                System.out.println(rs5.getString("branch") + "\tno3");
            }
            if (rs5.getInt("amt1") != (bsr.data(rs5.getString("branch") + "-421", "amt1") + bsr.data(rs5.getString("branch") + "-422", "amt1"))) {
                System.out.println(rs5.getString("branch") + "\tamt1");
                int sum1=(bsr.data(rs5.getString("branch") + "-421", "amt1") + bsr.data(rs5.getString("branch") + "-422", "amt1"));
                st1.executeUpdate("update planningfinal set amt1=" + sum1 + " where branchcode='" + rs5.getString("branch") + "-420'");
            }
            if (rs5.getInt("amt2") != (bsr.data(rs5.getString("branch") + "-421", "amt2") + bsr.data(rs5.getString("branch") + "-422", "amt2"))) {
                System.out.println(rs5.getString("branch") + "\tamt2");
            int sum1=(bsr.data(rs5.getString("branch") + "-421", "amt2") + bsr.data(rs5.getString("branch") + "-422", "amt2"));
            st1.executeUpdate("update planningfinal set amt2=" + sum1 + " where branchcode='" + rs5.getString("branch") + "-420'");
            }
            if (rs5.getInt("amt3") != (bsr.data(rs5.getString("branch") + "-421", "amt3") + bsr.data(rs5.getString("branch") + "-422", "amt3"))) {
                System.out.println(rs5.getString("branch") + "\tno1");
            }   
        }
         *//*
        ResultSet rs6 = st6.executeQuery("SELECT * FROM planningfinal where code='430'");
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
        ResultSet rs7 = st7.executeQuery("SELECT * FROM planningfinal where code='500'");
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
        ResultSet rs8 = st7.executeQuery("SELECT * FROM planningfinal where code='510'");
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
        ResultSet rs9 = st9.executeQuery("SELECT * FROM planningfinal where code=0 and branch >5190263 and branch<5190510");
        while (rs9.next()) {
            rs9.getString("branchcode");
            
            if (rs9.getInt("no1") != (bsr.data(rs9.getString("branch") + "-100", "no1") + bsr.data(rs9.getString("branch") + "-200", "no1") + bsr.data(rs9.getString("branch") + "-300", "no1") + bsr.data(rs9.getString("branch") + "-400", "no1") + bsr.data(rs9.getString("branch") + "-500", "no1"))) {
                System.out.println(rs9.getString("branch") + "\tno1");
                int sum1 = (bsr.data(rs9.getString("branch") + "-100", "no1") + bsr.data(rs9.getString("branch") + "-200", "no1") + bsr.data(rs9.getString("branch") + "-300", "no1") + bsr.data(rs9.getString("branch") + "-400", "no1") + bsr.data(rs9.getString("branch") + "-500", "no1"));
                st1.executeUpdate("update planningfinal set no1=" + sum1 + " where branchcode='" + rs9.getString("branch") + "-0'");
            }
            if (rs9.getInt("no2") != (bsr.data(rs9.getString("branch") + "-100", "no2") + bsr.data(rs9.getString("branch") + "-200", "no2") + bsr.data(rs9.getString("branch") + "-300", "no2") + bsr.data(rs9.getString("branch") + "-400", "no2") + bsr.data(rs9.getString("branch") + "-500", "no2"))) {
                System.out.println(rs9.getString("branch") + "\tno2");
                int sum2 = (bsr.data(rs9.getString("branch") + "-100", "no2") + bsr.data(rs9.getString("branch") + "-200", "no2") + bsr.data(rs9.getString("branch") + "-300", "no2") + bsr.data(rs9.getString("branch") + "-400", "no2") + bsr.data(rs9.getString("branch") + "-500", "no2"));
                st1.executeUpdate("update planningfinal set no2=" + sum2 + " where branchcode='" + rs9.getString("branch") + "-0'");
            }
            if (rs9.getInt("no3") != (bsr.data(rs9.getString("branch") + "-100", "no3") + bsr.data(rs9.getString("branch") + "-200", "no3") + bsr.data(rs9.getString("branch") + "-300", "no3") + bsr.data(rs9.getString("branch") + "-400", "no3") + bsr.data(rs9.getString("branch") + "-500", "no3"))) {
                System.out.println(rs9.getString("branch") + "\tno3");
                int sum3 = (bsr.data(rs9.getString("branch") + "-100", "no3") + bsr.data(rs9.getString("branch") + "-200", "no3") + bsr.data(rs9.getString("branch") + "-300", "no3") + bsr.data(rs9.getString("branch") + "-400", "no3") + bsr.data(rs9.getString("branch") + "-500", "no3"));
                st1.executeUpdate("update planningfinal set no3=" + sum3 + " where branchcode='" + rs9.getString("branch") + "-0'");
            }
            if (rs9.getInt("amt1") != (bsr.data(rs9.getString("branch") + "-100", "amt1") + bsr.data(rs9.getString("branch") + "-200", "amt1") + bsr.data(rs9.getString("branch") + "-300", "amt1") + bsr.data(rs9.getString("branch") + "-400", "amt1") + bsr.data(rs9.getString("branch") + "-500", "amt1"))) {
                System.out.println(rs9.getString("branch") + "\tamt1");
                int sum4 = (bsr.data(rs9.getString("branch") + "-100", "amt1") + bsr.data(rs9.getString("branch") + "-200", "amt1") + bsr.data(rs9.getString("branch") + "-300", "amt1") + bsr.data(rs9.getString("branch") + "-400", "amt1") + bsr.data(rs9.getString("branch") + "-500", "amt1"));
                st1.executeUpdate("update planningfinal set amt1=" + sum4 + " where branchcode='" + rs9.getString("branch") + "-0'");
            }
            if (rs9.getInt("amt2") != (bsr.data(rs9.getString("branch") + "-100", "amt2") + bsr.data(rs9.getString("branch") + "-200", "amt2") + bsr.data(rs9.getString("branch") + "-300", "amt2") + bsr.data(rs9.getString("branch") + "-400", "amt2") + bsr.data(rs9.getString("branch") + "-500", "amt2"))) {
                System.out.println(rs9.getString("branch") + "\tamt2");
                int sum5 = (bsr.data(rs9.getString("branch") + "-100", "amt2") + bsr.data(rs9.getString("branch") + "-200", "amt2") + bsr.data(rs9.getString("branch") + "-300", "amt2") + bsr.data(rs9.getString("branch") + "-400", "amt2") + bsr.data(rs9.getString("branch") + "-500", "amt2"));
                st1.executeUpdate("update planningfinal set amt2=" + sum5 + " where branchcode='" + rs9.getString("branch") + "-0'");
            }
            if (rs9.getInt("amt3") != (bsr.data(rs9.getString("branch") + "-100", "amt3") + bsr.data(rs9.getString("branch") + "-200", "amt3") + bsr.data(rs9.getString("branch") + "-300", "amt3") + bsr.data(rs9.getString("branch") + "-400", "amt3") + bsr.data(rs9.getString("branch") + "-500", "amt3"))) {
                System.out.println(rs9.getString("branch") + "\tamt3");
                int sum6 = (bsr.data(rs9.getString("branch") + "-100", "amt3") + bsr.data(rs9.getString("branch") + "-200", "amt3") + bsr.data(rs9.getString("branch") + "-300", "amt3") + bsr.data(rs9.getString("branch") + "-400", "amt3") + bsr.data(rs9.getString("branch") + "-500", "amt3"));
                st1.executeUpdate("update planningfinal set amt3=" + sum6 + " where branchcode='" + rs9.getString("branch") + "-0'");
            }
        }
         
        
         *//*
        System.out.println("600,700,800,900 no3");
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in ('600','700','800','900')");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != bsr.data(rs10.getString("branch") + "-600", "no3")) {
                System.out.println(rs10.getString("branch") + "\tno3");
                int sum1 = bsr.data(rs10.getString("branch") + "-600", "no3");                
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-700'");
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-800'");
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-900'");                
            }
        }

        System.out.println("600,700,800,900 amt3");
         rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in ('600','700','800','900')");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("amt3") != bsr.data(rs10.getString("branch") + "-600", "amt3")) {
                System.out.println(rs10.getString("branch") + "\tamt3");
                int sum1 = bsr.data(rs10.getString("branch") + "-600", "amt3");                
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-700'");
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-800'");
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-900'");                
            }
        }
        
        System.out.println("610=410 no3");
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (410,610,720,810,910)");
        //ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (810) and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("no3") != bsr.data(rs10.getString("branch") + "-410", "no3")) {
                System.out.println(rs10.getString("branch") + "\tno3");
                int sum1 = bsr.data(rs10.getString("branch") + "-410", "no3");
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-610'");
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-720'");
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-810'");
                st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-910'");
            }
        }

        System.out.println("610=410 amt3");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (410,610,720,810,910)");
        //rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (810) and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs10.next()) {
            rs10.getString("branchcode");
            if (rs10.getInt("amt3") != bsr.data(rs10.getString("branch") + "-410", "amt3")) {
                System.out.println(rs10.getString("branch") + "\tamt3");
                int sum1 = bsr.data(rs10.getString("branch") + "-410", "amt3");
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-610'");
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-720'");
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-810'");
                st1.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-910'");
            }
        }

         *//*
        System.out.println("600=0-500-311");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='600' and branch>5190263 and branch<5190510");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
                System.out.println(rs11.getInt("no3"));
                System.out.println(bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"));
                int sum1 = (bsr.data(rs11.getString("branch") + "-0", "no3") - bsr.data(rs11.getString("branch") + "-500", "no3") - bsr.data(rs11.getString("branch") + "-311", "no3"));
                int diff = sum1 - rs11.getInt("no3");
                int sum11 = (bsr.data(rs11.getString("branch") + "-0", "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttt");
                } else {
                    if ((bsr.data(rs11.getString("branch") + "-100", "no3") > 0) && (bsr.data(rs11.getString("branch") + "-100", "no3") - diff) > 0) {
                        st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-100", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-100" + "';");
                        if (bsr.data(rs11.getString("branch") + "-110", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-110", "no3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-110", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-110" + "';");
                        } else if (bsr.data(rs11.getString("branch") + "-120", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-120", "no3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-120", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-120" + "';");
                        } else if (bsr.data(rs11.getString("branch") + "-130", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-130", "no3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-130", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-130" + "';");
                        } else {
                            System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                        }
                    } else if ((bsr.data(rs11.getString("branch") + "-400", "no3") > 0) && (bsr.data(rs11.getString("branch") + "-400", "no3") - diff) > 0) {
                        st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-400", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-400" + "';");
                        if (bsr.data(rs11.getString("branch") + "-410", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-410", "no3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-410", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-410" + "';");
                        } else if (bsr.data(rs11.getString("branch") + "-420", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-420", "no3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-420", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-420" + "';");
                            if (bsr.data(rs11.getString("branch") + "-421", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-421", "no3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-421", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-421" + "';");
                            } else if (bsr.data(rs11.getString("branch") + "-422", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-422", "no3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-422", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-422" + "';");
                            }
                        } else if (bsr.data(rs11.getString("branch") + "-430", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-430", "no3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-430", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-430" + "';");
                            if (bsr.data(rs11.getString("branch") + "-431", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-431", "no3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-431", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-431" + "';");
                            } else if (bsr.data(rs11.getString("branch") + "-432", "no3") > 0 && (bsr.data(rs11.getString("branch") + "-432", "no3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs11.getString("branch") + "-432", "no3") - diff) + " where branchcode='" + rs11.getString("branch") + "-432" + "';");
                            }
                        } else {
                            System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                        }
                    } else {
                        System.out.println(rs11.getString("branch"));
                    }
                }

            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"))) {
                // System.out.println(rs11.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-0", "amt3") - bsr.data(rs11.getString("branch") + "-500", "amt3") - bsr.data(rs11.getString("branch") + "-311", "amt3"));
                int diff = sum1 - rs11.getInt("amt3");
                int sum11 = (bsr.data(rs11.getString("branch") + "-0", "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttt");
                } else {
                    if (bsr.data(rs11.getString("branch") + "-100", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-100", "amt3") - diff) > 0) {
                        st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-100", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-100" + "';");
                        if (bsr.data(rs11.getString("branch") + "-110", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-110", "amt3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-110", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-110" + "';");
                        } else if (bsr.data(rs11.getString("branch") + "-120", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-120", "amt3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-120", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-120" + "';");
                        } else if (bsr.data(rs11.getString("branch") + "-130", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-130", "amt3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-130", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-130" + "';");
                        } else {
                            System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                        }

                    } else if ((bsr.data(rs11.getString("branch") + "-400", "amt3") > 0) && (bsr.data(rs11.getString("branch") + "-400", "amt3") - diff) > 0) {
                        st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-400", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-400" + "';");
                        if (bsr.data(rs11.getString("branch") + "-410", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-410", "amt3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-410", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-410" + "';");
                        } else if (bsr.data(rs11.getString("branch") + "-420", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-420", "amt3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-420", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-420" + "';");
                            if (bsr.data(rs11.getString("branch") + "-421", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-421", "amt3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-421", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-421" + "';");
                            } else if (bsr.data(rs11.getString("branch") + "-422", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-422", "amt3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-422", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-422" + "';");
                            }
                        } else if (bsr.data(rs11.getString("branch") + "-430", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-430", "amt3") - diff) > 0) {
                            st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-430", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-430" + "';");
                            if (bsr.data(rs11.getString("branch") + "-431", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-431", "amt3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-431", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-431" + "';");
                            } else if (bsr.data(rs11.getString("branch") + "-432", "amt3") > 0 && (bsr.data(rs11.getString("branch") + "-432", "amt3") - diff) > 0) {
                                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs11.getString("branch") + "-432", "amt3") - diff) + " where branchcode='" + rs11.getString("branch") + "-432" + "';");
                            }
                        }
                    } else {
                        System.out.println(rs11.getString("branch"));
                    }
                }
            }
        }
         *//*
        System.out.println("600=611+...+616");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='600'");
        while (rs11.next()) {
            rs11.getString("branchcode");

            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-611", "no3") + bsr.data(rs11.getString("branch") + "-612", "no3") + bsr.data(rs11.getString("branch") + "-613", "no3") + bsr.data(rs11.getString("branch") + "-614", "no3") + bsr.data(rs11.getString("branch") + "-615", "no3") + bsr.data(rs11.getString("branch") + "-616", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-611", "no3") + bsr.data(rs11.getString("branch") + "-612", "no3") + bsr.data(rs11.getString("branch") + "-613", "no3") + bsr.data(rs11.getString("branch") + "-614", "no3") + bsr.data(rs11.getString("branch") + "-615", "no3") + bsr.data(rs11.getString("branch") + "-616", "no3"));
                int diff = sum1 - rs11.getInt("no3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in ('611','612','613','614','615','616') and branch='" + rs11.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("no3")) {
                        max = rs10.getInt("no3");
                        code = rs10.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs11.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs11.getString("branch") + "-" + code + "';");
                }
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-611", "amt3") + bsr.data(rs11.getString("branch") + "-612", "amt3") + bsr.data(rs11.getString("branch") + "-613", "amt3") + bsr.data(rs11.getString("branch") + "-614", "amt3") + bsr.data(rs11.getString("branch") + "-615", "amt3") + bsr.data(rs11.getString("branch") + "-616", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-611", "amt3") + bsr.data(rs11.getString("branch") + "-612", "amt3") + bsr.data(rs11.getString("branch") + "-613", "amt3") + bsr.data(rs11.getString("branch") + "-614", "amt3") + bsr.data(rs11.getString("branch") + "-615", "amt3") + bsr.data(rs11.getString("branch") + "-616", "amt3"));
                int diff = sum1 - rs11.getInt("amt3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in ('611','612','613','614','615','616') and branch='" + rs11.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("amt3")) {
                        max = rs10.getInt("amt3");
                        code = rs10.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs11.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs11.getString("branch") + "-" + code + "';");
                }
            }
        }*//*
        System.out.println("610 no3 first");
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='610' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs10.next()) {
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs10.getString("branch") + "-611", "no3") + bsr.data(rs10.getString("branch") + "-612", "no3") + bsr.data(rs10.getString("branch") + "-613", "no3") + bsr.data(rs10.getString("branch") + "-614", "no3") + bsr.data(rs10.getString("branch") + "-615", "no3") + bsr.data(rs10.getString("branch") + "-616", "no3"));
                sum1 = (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"));
                int diff = sum1 - rs10.getInt("no3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in ('601','602','603','604','605','606') and branch='" + rs10.getString("branch") + "';");
                max = 0;
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs10.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs10.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("610 amt3 first");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='610' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs10.next()) {
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"))) {
                int sum1 = (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"));
                int diff = sum1 - rs10.getInt("amt3");
               ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in ('601','602','603','604','605','606') and branch='" + rs10.getString("branch") + "';");
                max = 0;
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs10.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs10.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("610 no3 equal");
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='610' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-601", "no3") + bsr.data(rs12.getString("branch") + "-602", "no3") + bsr.data(rs12.getString("branch") + "-603", "no3") + bsr.data(rs12.getString("branch") + "-604", "no3") + bsr.data(rs12.getString("branch") + "-605", "no3") + bsr.data(rs12.getString("branch") + "-606", "no3"))
                    || (bsr.data(rs12.getString("branch") + "-613", "no3")) < (bsr.data(rs12.getString("branch") + "-603", "no3")) || (bsr.data(rs12.getString("branch") + "-616", "no3")) < (bsr.data(rs12.getString("branch") + "-606", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-611", "no3")) + " where branchcode='" + rs12.getString("branch") + "-601" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-612", "no3")) + " where branchcode='" + rs12.getString("branch") + "-602" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-613", "no3")) + " where branchcode='" + rs12.getString("branch") + "-603" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-614", "no3")) + " where branchcode='" + rs12.getString("branch") + "-604" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-615", "no3")) + " where branchcode='" + rs12.getString("branch") + "-605" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-616", "no3")) + " where branchcode='" + rs12.getString("branch") + "-606" + "';");
            }
        }
        System.out.println("610 amt3 equal");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='610' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-601", "amt3") + bsr.data(rs12.getString("branch") + "-602", "amt3") + bsr.data(rs12.getString("branch") + "-603", "amt3") + bsr.data(rs12.getString("branch") + "-604", "amt3") + bsr.data(rs12.getString("branch") + "-605", "amt3") + bsr.data(rs12.getString("branch") + "-606", "amt3"))
                    || (bsr.data(rs12.getString("branch") + "-613", "amt3")) < (bsr.data(rs12.getString("branch") + "-603", "amt3")) || (bsr.data(rs12.getString("branch") + "-616", "amt3")) < (bsr.data(rs12.getString("branch") + "-606", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-611", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-601" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-612", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-602" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-613", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-603" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-614", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-604" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-615", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-605" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-616", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-606" + "';");
            }
        }
        System.out.println("610 no3 final");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='610' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs10.next()) {
            if (rs10.getInt("no3") != (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"))) {
                System.out.println(rs10.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs10.getString("branch") + "-611", "no3") + bsr.data(rs10.getString("branch") + "-612", "no3") + bsr.data(rs10.getString("branch") + "-613", "no3") + bsr.data(rs10.getString("branch") + "-614", "no3") + bsr.data(rs10.getString("branch") + "-615", "no3") + bsr.data(rs10.getString("branch") + "-616", "no3"));
                sum1 = (bsr.data(rs10.getString("branch") + "-601", "no3") + bsr.data(rs10.getString("branch") + "-602", "no3") + bsr.data(rs10.getString("branch") + "-603", "no3") + bsr.data(rs10.getString("branch") + "-604", "no3") + bsr.data(rs10.getString("branch") + "-605", "no3") + bsr.data(rs10.getString("branch") + "-606", "no3"));
                int diff = sum1 - rs10.getInt("no3");
             ResultSet   rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in ('601','602','603','604','605','606') and branch='" + rs10.getString("branch") + "';");
                max = 0;
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs10.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs10.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("610 amt3 final");
        rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='610' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs10.next()) {
            if (rs10.getInt("amt3") != (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"))) {
                int sum1 = (bsr.data(rs10.getString("branch") + "-601", "amt3") + bsr.data(rs10.getString("branch") + "-602", "amt3") + bsr.data(rs10.getString("branch") + "-603", "amt3") + bsr.data(rs10.getString("branch") + "-604", "amt3") + bsr.data(rs10.getString("branch") + "-605", "amt3") + bsr.data(rs10.getString("branch") + "-606", "amt3"));
                int diff = sum1 - rs10.getInt("amt3");
              ResultSet  rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in ('601','602','603','604','605','606') and branch='" + rs10.getString("branch") + "';");
                max = 0;
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs10.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs10.getString("branch") + "-" + code + "';");
                }
            }
        }/*
        System.out.println("700=721+722+...+731+732");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='700' and branch >5190250 and branch<5190252");
        while (rs11.next()) {
            rs11.getString("branchcode");
            if (rs11.getInt("no3") != (bsr.data(rs11.getString("branch") + "-721", "no3") + bsr.data(rs11.getString("branch") + "-722", "no3") + bsr.data(rs11.getString("branch") + "-723", "no3") + bsr.data(rs11.getString("branch") + "-724", "no3") + bsr.data(rs11.getString("branch") + "-725", "no3") + bsr.data(rs11.getString("branch") + "-726", "no3") + bsr.data(rs11.getString("branch") + "-727", "no3") + bsr.data(rs11.getString("branch") + "-728", "no3") + bsr.data(rs11.getString("branch") + "-729", "no3") + bsr.data(rs11.getString("branch") + "-731", "no3") + bsr.data(rs11.getString("branch") + "-732", "no3"))) {
                System.out.println(rs11.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-721", "no3") + bsr.data(rs11.getString("branch") + "-722", "no3") + bsr.data(rs11.getString("branch") + "-723", "no3") + bsr.data(rs11.getString("branch") + "-724", "no3") + bsr.data(rs11.getString("branch") + "-725", "no3") + bsr.data(rs11.getString("branch") + "-726", "no3") + bsr.data(rs11.getString("branch") + "-727", "no3") + bsr.data(rs11.getString("branch") + "-728", "no3") + bsr.data(rs11.getString("branch") + "-729", "no3") + bsr.data(rs11.getString("branch") + "-731", "no3") + bsr.data(rs11.getString("branch") + "-732", "no3"));
                int diff = sum1 - rs11.getInt("no3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (721,722,723,724,725,726,727,728,729,731,732) and branch='" + rs11.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("no3")) {
                        max = rs10.getInt("no3");
                        code = rs10.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs11.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs11.getString("branch") + "-" + code + "';");
                }
            }
            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-721", "amt3") + bsr.data(rs11.getString("branch") + "-722", "amt3") + bsr.data(rs11.getString("branch") + "-723", "amt3") + bsr.data(rs11.getString("branch") + "-724", "amt3") + bsr.data(rs11.getString("branch") + "-725", "amt3") + bsr.data(rs11.getString("branch") + "-726", "amt3") + bsr.data(rs11.getString("branch") + "-727", "amt3") + bsr.data(rs11.getString("branch") + "-728", "amt3") + bsr.data(rs11.getString("branch") + "-729", "amt3") + bsr.data(rs11.getString("branch") + "-731", "amt3") + bsr.data(rs11.getString("branch") + "-732", "amt3"))) {
                System.out.println(rs11.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs11.getString("branch") + "-721", "amt3") + bsr.data(rs11.getString("branch") + "-722", "amt3") + bsr.data(rs11.getString("branch") + "-723", "amt3") + bsr.data(rs11.getString("branch") + "-724", "amt3") + bsr.data(rs11.getString("branch") + "-725", "amt3") + bsr.data(rs11.getString("branch") + "-726", "amt3") + bsr.data(rs11.getString("branch") + "-727", "amt3") + bsr.data(rs11.getString("branch") + "-728", "amt3") + bsr.data(rs11.getString("branch") + "-729", "amt3") + bsr.data(rs11.getString("branch") + "-731", "amt3") + bsr.data(rs11.getString("branch") + "-732", "amt3"));
                int diff = sum1 - rs11.getInt("amt3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (721,722,723,724,725,726,727,728,729,731,732) and branch='" + rs11.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("amt3")) {
                        max = rs10.getInt("amt3");
                        code = rs10.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs11.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs11.getString("branch") + "-" + code + "';");
                }
            }
        }*//*
        System.out.println("720 no3 first");
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"));
                int diff = sum1 - rs12.getInt("no3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (701,702,703,704,705,706,707,708,709,711,712) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("720 amt3 first");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"));
                int diff = sum1 - rs12.getInt("amt3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (701,702,703,704,705,706,707,708,709,711,712) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("720 no3 equal");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"))
                    || (bsr.data(rs12.getString("branch") + "-724", "no3")) < (bsr.data(rs12.getString("branch") + "-704", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-721", "no3") + " where branchcode='" + rs12.getString("branch") + "-701" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-722", "no3") + " where branchcode='" + rs12.getString("branch") + "-702" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-723", "no3") + " where branchcode='" + rs12.getString("branch") + "-703" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-724", "no3") + " where branchcode='" + rs12.getString("branch") + "-704" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-725", "no3") + " where branchcode='" + rs12.getString("branch") + "-705" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-726", "no3") + " where branchcode='" + rs12.getString("branch") + "-706" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-727", "no3") + " where branchcode='" + rs12.getString("branch") + "-707" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-728", "no3") + " where branchcode='" + rs12.getString("branch") + "-708" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-729", "no3") + " where branchcode='" + rs12.getString("branch") + "-709" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-731", "no3") + " where branchcode='" + rs12.getString("branch") + "-711" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-732", "no3") + " where branchcode='" + rs12.getString("branch") + "-712" + "';");
            }
        }
        System.out.println("720 amt3 equal");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"))
                    || (bsr.data(rs12.getString("branch") + "-724", "amt3")) < (bsr.data(rs12.getString("branch") + "-704", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-721", "amt3") + " where branchcode='" + rs12.getString("branch") + "-701" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-722", "amt3") + " where branchcode='" + rs12.getString("branch") + "-702" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-723", "amt3") + " where branchcode='" + rs12.getString("branch") + "-703" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-724", "amt3") + " where branchcode='" + rs12.getString("branch") + "-704" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-725", "amt3") + " where branchcode='" + rs12.getString("branch") + "-705" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-726", "amt3") + " where branchcode='" + rs12.getString("branch") + "-706" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-727", "amt3") + " where branchcode='" + rs12.getString("branch") + "-707" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-728", "amt3") + " where branchcode='" + rs12.getString("branch") + "-708" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-729", "amt3") + " where branchcode='" + rs12.getString("branch") + "-709" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-731", "amt3") + " where branchcode='" + rs12.getString("branch") + "-711" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-732", "amt3") + " where branchcode='" + rs12.getString("branch") + "-712" + "';");
            }
        }

        System.out.println("720 no3 final");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-701", "no3") + bsr.data(rs12.getString("branch") + "-702", "no3") + bsr.data(rs12.getString("branch") + "-703", "no3") + bsr.data(rs12.getString("branch") + "-704", "no3") + bsr.data(rs12.getString("branch") + "-705", "no3") + bsr.data(rs12.getString("branch") + "-706", "no3") + bsr.data(rs12.getString("branch") + "-707", "no3") + bsr.data(rs12.getString("branch") + "-708", "no3") + bsr.data(rs12.getString("branch") + "-709", "no3") + bsr.data(rs12.getString("branch") + "-711", "no3") + bsr.data(rs12.getString("branch") + "-712", "no3"));
                int diff = sum1 - rs12.getInt("no3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (701,702,703,704,705,706,707,708,709,711,712) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("720 amt3 final");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='720' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-701", "amt3") + bsr.data(rs12.getString("branch") + "-702", "amt3") + bsr.data(rs12.getString("branch") + "-703", "amt3") + bsr.data(rs12.getString("branch") + "-704", "amt3") + bsr.data(rs12.getString("branch") + "-705", "amt3") + bsr.data(rs12.getString("branch") + "-706", "amt3") + bsr.data(rs12.getString("branch") + "-707", "amt3") + bsr.data(rs12.getString("branch") + "-708", "amt3") + bsr.data(rs12.getString("branch") + "-709", "amt3") + bsr.data(rs12.getString("branch") + "-711", "amt3") + bsr.data(rs12.getString("branch") + "-712", "amt3"));
                int diff = sum1 - rs12.getInt("amt3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (701,702,703,704,705,706,707,708,709,711,712) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }/*
        System.out.println("800=811+812+..+814");
       ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='800' and branch in(5190013,5190015,5190019)");
        while (rs12.next()) {
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-811", "no3") + bsr.data(rs12.getString("branch") + "-812", "no3") + bsr.data(rs12.getString("branch") + "-813", "no3") + bsr.data(rs12.getString("branch") + "-814", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum11 = (bsr.data(rs12.getString("branch") + "-811", "no3") + bsr.data(rs12.getString("branch") + "-812", "no3") + bsr.data(rs12.getString("branch") + "-813", "no3") + bsr.data(rs12.getString("branch") + "-814", "no3"));
                int diff = sum11 - rs12.getInt("no3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (811,812,813,814) and branch='" + rs12.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("no3")) {
                        max = rs10.getInt("no3");
                        code = rs10.getInt("code");
                    }
                }
                sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-811", "amt3") + bsr.data(rs12.getString("branch") + "-812", "amt3") + bsr.data(rs12.getString("branch") + "-813", "amt3") + bsr.data(rs12.getString("branch") + "-814", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum11 = (bsr.data(rs12.getString("branch") + "-811", "amt3") + bsr.data(rs12.getString("branch") + "-812", "amt3") + bsr.data(rs12.getString("branch") + "-813", "amt3") + bsr.data(rs12.getString("branch") + "-814", "amt3"));
                int diff = sum11 - rs12.getInt("amt3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (811,812,813,814) and branch='" + rs12.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("amt3")) {
                        max = rs10.getInt("amt3");
                        code = rs10.getInt("code");
                    }
                }
                sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("810 no3 first");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='810' and branch in(5190013,5190015,5190019)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-801", "no3") + bsr.data(rs12.getString("branch") + "-802", "no3") + bsr.data(rs12.getString("branch") + "-803", "no3") + bsr.data(rs12.getString("branch") + "-804", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-801", "no3") + bsr.data(rs12.getString("branch") + "-802", "no3") + bsr.data(rs12.getString("branch") + "-803", "no3") + bsr.data(rs12.getString("branch") + "-804", "no3"));
                int diff = sum1 - rs12.getInt("no3");
             ResultSet   rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (801,802,803,804) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("810 amt3 first");
         rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='810' and branch in(5190013,5190015,5190019)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-801", "amt3") + bsr.data(rs12.getString("branch") + "-802", "amt3") + bsr.data(rs12.getString("branch") + "-803", "amt3") + bsr.data(rs12.getString("branch") + "-804", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-801", "amt3") + bsr.data(rs12.getString("branch") + "-802", "amt3") + bsr.data(rs12.getString("branch") + "-803", "amt3") + bsr.data(rs12.getString("branch") + "-804", "amt3"));
                int diff = sum1 - rs12.getInt("amt3");
               ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (801,802,803,804) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                System.out.println(sum11);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                System.out.println("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                    
                }
            }
        }*//*
        System.out.println("810 no3 equal");
       ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='810' and branch in"
               + "('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-801", "no3") + bsr.data(rs12.getString("branch") + "-802", "no3") + bsr.data(rs12.getString("branch") + "-803", "no3") + bsr.data(rs12.getString("branch") + "-804", "no3"))|| (bsr.data(rs12.getString("branch") + "-811", "no3")) < (bsr.data(rs12.getString("branch") + "-801", "no3"))|| (bsr.data(rs12.getString("branch") + "-812", "no3")) < (bsr.data(rs12.getString("branch") + "-802", "no3"))|| (bsr.data(rs12.getString("branch") + "-813", "no3")) < (bsr.data(rs12.getString("branch") + "-803", "no3"))|| (bsr.data(rs12.getString("branch") + "-814", "no3")) < (bsr.data(rs12.getString("branch") + "-804", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-811", "no3") + " where branchcode='" + rs12.getString("branch") + "-801" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-812", "no3") + " where branchcode='" + rs12.getString("branch") + "-802" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-813", "no3") + " where branchcode='" + rs12.getString("branch") + "-803" + "';");
                st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-814", "no3") + " where branchcode='" + rs12.getString("branch") + "-804" + "';");
            //    st2.executeUpdate("update planningfinal set no3=" + bsr.data(rs12.getString("branch") + "-800", "no3") + " where branchcode='" + rs12.getString("branch") + "-810" + "';");
            }
        }
        System.out.println("810 amt3 equal");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='810' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-801", "amt3") + bsr.data(rs12.getString("branch") + "-802", "amt3") + bsr.data(rs12.getString("branch") + "-803", "amt3") + bsr.data(rs12.getString("branch") + "-804", "amt3"))   || (bsr.data(rs12.getString("branch") + "-811", "amt3")) < (bsr.data(rs12.getString("branch") + "-801", "amt3"))|| (bsr.data(rs12.getString("branch") + "-812", "amt3")) < (bsr.data(rs12.getString("branch") + "-802", "amt3"))|| (bsr.data(rs12.getString("branch") + "-813", "amt3")) < (bsr.data(rs12.getString("branch") + "-803", "amt3"))|| (bsr.data(rs12.getString("branch") + "-814", "amt3")) < (bsr.data(rs12.getString("branch") + "-804", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-811", "amt3") + " where branchcode='" + rs12.getString("branch") + "-801" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-812", "amt3") + " where branchcode='" + rs12.getString("branch") + "-802" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-813", "amt3") + " where branchcode='" + rs12.getString("branch") + "-803" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-814", "amt3") + " where branchcode='" + rs12.getString("branch") + "-804" + "';");
       //         st2.executeUpdate("update planningfinal set amt3=" + bsr.data(rs12.getString("branch") + "-800", "amt3") + " where branchcode='" + rs12.getString("branch") + "-810" + "';");
         }
        }
         *//*
        System.out.println("810 no3 final");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='810' and branch in(5190013,5190015,5190019)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-801", "no3") + bsr.data(rs12.getString("branch") + "-802", "no3") + bsr.data(rs12.getString("branch") + "-803", "no3") + bsr.data(rs12.getString("branch") + "-804", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-801", "no3") + bsr.data(rs12.getString("branch") + "-802", "no3") + bsr.data(rs12.getString("branch") + "-803", "no3") + bsr.data(rs12.getString("branch") + "-804", "no3"));
                int diff = sum1 - rs12.getInt("no3");
ResultSet                rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (801,802,803,804) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("810 amt3 final");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='810' and branch in(5190013,5190015,5190019)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-801", "amt3") + bsr.data(rs12.getString("branch") + "-802", "amt3") + bsr.data(rs12.getString("branch") + "-803", "amt3") + bsr.data(rs12.getString("branch") + "-804", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-801", "amt3") + bsr.data(rs12.getString("branch") + "-802", "amt3") + bsr.data(rs12.getString("branch") + "-803", "amt3") + bsr.data(rs12.getString("branch") + "-804", "amt3"));
                int diff = sum1 - rs12.getInt("amt3");
ResultSet                rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (801,802,803,804) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
         /*
        System.out.println("900=911+912+..+916");
       ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='900'");
        while (rs12.next()) {
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-911", "no3") + bsr.data(rs12.getString("branch") + "-912", "no3") + bsr.data(rs12.getString("branch") + "-913", "no3") + bsr.data(rs12.getString("branch") + "-914", "no3") + bsr.data(rs12.getString("branch") + "-915", "no3") + bsr.data(rs12.getString("branch") + "-916", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum11 = (bsr.data(rs12.getString("branch") + "-911", "no3") + bsr.data(rs12.getString("branch") + "-912", "no3") + bsr.data(rs12.getString("branch") + "-913", "no3") + bsr.data(rs12.getString("branch") + "-914", "no3") + bsr.data(rs12.getString("branch") + "-915", "no3") + bsr.data(rs12.getString("branch") + "-916", "no3"));
                int diff = sum11 - rs12.getInt("no3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (911,912,913,914,915,916) and branch='" + rs12.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("no3")) {
                        max = rs10.getInt("no3");
                        code = rs10.getInt("code");
                    }
                }
                sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-911", "amt3") + bsr.data(rs12.getString("branch") + "-912", "amt3") + bsr.data(rs12.getString("branch") + "-913", "amt3") + bsr.data(rs12.getString("branch") + "-914", "amt3") + bsr.data(rs12.getString("branch") + "-915", "amt3") + bsr.data(rs12.getString("branch") + "-916", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum11 = (bsr.data(rs12.getString("branch") + "-911", "amt3") + bsr.data(rs12.getString("branch") + "-912", "amt3") + bsr.data(rs12.getString("branch") + "-913", "amt3") + bsr.data(rs12.getString("branch") + "-914", "amt3") + bsr.data(rs12.getString("branch") + "-915", "amt3") + bsr.data(rs12.getString("branch") + "-916", "amt3"));
                int diff = sum11 - rs12.getInt("amt3");
                ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code in (911,912,913,914,915,916) and branch='" + rs12.getString("branch") + "';");
                max = 0;
                while (rs10.next()) {
                    if (max <= rs10.getInt("amt3")) {
                        max = rs10.getInt("amt3");
                        code = rs10.getInt("code");
                    }
                }
                sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }*//*
        System.out.println("910 no3 first");
        ResultSet rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='910' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-901", "no3") + bsr.data(rs12.getString("branch") + "-902", "no3") + bsr.data(rs12.getString("branch") + "-903", "no3") + bsr.data(rs12.getString("branch") + "-904", "no3") + bsr.data(rs12.getString("branch") + "-905", "no3") + bsr.data(rs12.getString("branch") + "-906", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");

                int sum1 = (bsr.data(rs12.getString("branch") + "-901", "no3") + bsr.data(rs12.getString("branch") + "-902", "no3") + bsr.data(rs12.getString("branch") + "-903", "no3") + bsr.data(rs12.getString("branch") + "-904", "no3") + bsr.data(rs12.getString("branch") + "-905", "no3") + bsr.data(rs12.getString("branch") + "-906", "no3"));
                int diff = sum1 - rs12.getInt("no3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (901,902,903,904,905,906) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("910 amt3 first");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='910' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-901", "amt3") + bsr.data(rs12.getString("branch") + "-902", "amt3") + bsr.data(rs12.getString("branch") + "-903", "amt3") + bsr.data(rs12.getString("branch") + "-904", "amt3") + bsr.data(rs12.getString("branch") + "-905", "amt3") + bsr.data(rs12.getString("branch") + "-906", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");

                int sum1 = (bsr.data(rs12.getString("branch") + "-901", "amt3") + bsr.data(rs12.getString("branch") + "-902", "amt3") + bsr.data(rs12.getString("branch") + "-903", "amt3") + bsr.data(rs12.getString("branch") + "-904", "amt3") + bsr.data(rs12.getString("branch") + "-905", "amt3") + bsr.data(rs12.getString("branch") + "-906", "amt3"));
                int diff = sum1 - rs12.getInt("amt3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (901,902,903,904) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("910 no3 equal");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='910' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-901", "no3") + bsr.data(rs12.getString("branch") + "-902", "no3") + bsr.data(rs12.getString("branch") + "-903", "no3") + bsr.data(rs12.getString("branch") + "-904", "no3") + bsr.data(rs12.getString("branch") + "-905", "no3") + bsr.data(rs12.getString("branch") + "-906", "no3"))
                    || (bsr.data(rs12.getString("branch") + "-912", "no3")) < (bsr.data(rs12.getString("branch") + "-902", "no3")) || (bsr.data(rs12.getString("branch") + "-913", "no3")) < (bsr.data(rs12.getString("branch") + "-903", "no3")) || (bsr.data(rs12.getString("branch") + "-911", "no3")) < (bsr.data(rs12.getString("branch") + "-901", "no3")) || (bsr.data(rs12.getString("branch") + "-915", "no3")) < (bsr.data(rs12.getString("branch") + "-905", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-911", "no3")) + " where branchcode='" + rs12.getString("branch") + "-901" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-912", "no3")) + " where branchcode='" + rs12.getString("branch") + "-902" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-913", "no3")) + " where branchcode='" + rs12.getString("branch") + "-903" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-914", "no3")) + " where branchcode='" + rs12.getString("branch") + "-904" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-915", "no3")) + " where branchcode='" + rs12.getString("branch") + "-905" + "';");
                st2.executeUpdate("update planningfinal set no3=" + (bsr.data(rs12.getString("branch") + "-916", "no3")) + " where branchcode='" + rs12.getString("branch") + "-906" + "';");
            }
        }
        System.out.println("910 amt3 equal");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='910' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-901", "amt3") + bsr.data(rs12.getString("branch") + "-902", "amt3") + bsr.data(rs12.getString("branch") + "-903", "amt3") + bsr.data(rs12.getString("branch") + "-904", "amt3") + bsr.data(rs12.getString("branch") + "-905", "amt3") + bsr.data(rs12.getString("branch") + "-906", "amt3"))
                    || (bsr.data(rs12.getString("branch") + "-912", "amt3")) < (bsr.data(rs12.getString("branch") + "-902", "amt3")) || (bsr.data(rs12.getString("branch") + "-913", "amt3")) < (bsr.data(rs12.getString("branch") + "-903", "amt3")) || (bsr.data(rs12.getString("branch") + "-911", "amt3")) < (bsr.data(rs12.getString("branch") + "-901", "amt3")) || (bsr.data(rs12.getString("branch") + "-915", "amt3")) < (bsr.data(rs12.getString("branch") + "-905", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-911", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-901" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-912", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-902" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-913", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-903" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-914", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-904" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-915", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-905" + "';");
                st2.executeUpdate("update planningfinal set amt3=" + (bsr.data(rs12.getString("branch") + "-916", "amt3")) + " where branchcode='" + rs12.getString("branch") + "-906" + "';");
            }
        }
        System.out.println("910 no3 final");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='910' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("no3") != (bsr.data(rs12.getString("branch") + "-901", "no3") + bsr.data(rs12.getString("branch") + "-902", "no3") + bsr.data(rs12.getString("branch") + "-903", "no3") + bsr.data(rs12.getString("branch") + "-904", "no3") + bsr.data(rs12.getString("branch") + "-905", "no3") + bsr.data(rs12.getString("branch") + "-906", "no3"))) {
                System.out.println(rs12.getString("branch") + "\tno3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-901", "no3") + bsr.data(rs12.getString("branch") + "-902", "no3") + bsr.data(rs12.getString("branch") + "-903", "no3") + bsr.data(rs12.getString("branch") + "-904", "no3") + bsr.data(rs12.getString("branch") + "-905", "no3") + bsr.data(rs12.getString("branch") + "-906", "no3"));
                int diff = sum1 - rs12.getInt("no3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (901,902,903,904,905,906) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("no3")) {
                        max = rs11.getInt("no3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "no3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set no3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        System.out.println("910 amt3 final");
        rs12 = st12.executeQuery("SELECT * FROM planningfinal where code='910' and branch in('519000F',5190217,5190478,5190478,5190512,5190722,'519000D','519000H',5190013,5190015,5190019,5190026,5190034,5190043,5190086,5190113,5190121,5190145,5190145,5190174,5190182,5190203,5190206,5190208,5190209,5190210,5190215,5190215,5190237,5190248,5190288,5190297,5190298,5190303,5190313,5190315,5190331,5190344,5190364,5190365,5190383,5190389,5190407,5190445,5190470,5190478,5190510,5190520,5190521,5190525,5190528,5190529,5190538,5190542,5190544,5190548,5190560,5190580,5190590,5190599,5190604,5190620,5190625,5190625,5190636,5190654,5190673,5190689,5190702,5190716,5190718,5190725,5190747,5190747,5190755,5190778,5190788,5190788,5190794,5190851)");
        while (rs12.next()) {
            rs12.getString("branchcode");
            if (rs12.getInt("amt3") != (bsr.data(rs12.getString("branch") + "-901", "amt3") + bsr.data(rs12.getString("branch") + "-902", "amt3") + bsr.data(rs12.getString("branch") + "-903", "amt3") + bsr.data(rs12.getString("branch") + "-904", "amt3") + bsr.data(rs12.getString("branch") + "-905", "amt3") + bsr.data(rs12.getString("branch") + "-906", "amt3"))) {
                System.out.println(rs12.getString("branch") + "\tamt3");
                int sum1 = (bsr.data(rs12.getString("branch") + "-901", "amt3") + bsr.data(rs12.getString("branch") + "-902", "amt3") + bsr.data(rs12.getString("branch") + "-903", "amt3") + bsr.data(rs12.getString("branch") + "-904", "amt3") + bsr.data(rs12.getString("branch") + "-905", "amt3") + bsr.data(rs12.getString("branch") + "-906", "amt3"));
                int diff = sum1 - rs12.getInt("amt3");
                ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in (901,902,903,904) and branch='" + rs12.getString("branch") + "';");
                while (rs11.next()) {
                    if (max <= rs11.getInt("amt3")) {
                        max = rs11.getInt("amt3");
                        code = rs11.getInt("code");
                    }
                }
                int sum11 = (bsr.data(rs12.getString("branch") + "-" + code, "amt3") - diff);
                if (sum11 < 1) {
                    System.out.println("Alertttttttttttttttttttttttttttttttttttttt");
                } else {
                    st2.executeUpdate("update planningfinal set amt3=" + sum11 + " where branchcode='" + rs12.getString("branch") + "-" + code + "';");
                }
            }
        }
        /*
        ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='1'");
        while (rs10.next()) {
            rs10.getString("branchcode");

            int sum3 = rs10.getInt("no3");
            st1.executeUpdate("update planningfinal set no1=" + sum3 + " where branchcode='" + rs10.getString("branch") + "-1'");
            int sum4 = rs10.getInt("amt3");
            st1.executeUpdate("update planningfinal set amt1=" + sum4 + " where branchcode='" + rs10.getString("branch") + "-1'");
           
            int sum1 = 0;
            st1.executeUpdate("update planningfinal set no3=" + sum1 + " where branchcode='" + rs10.getString("branch") + "-1'");
            int sum2 = 0;
            st1.executeUpdate("update planningfinal set amt3=" + sum2 + " where branchcode='" + rs10.getString("branch") + "-1'");

        }
         *//*
        
        System.out.println("no1>amt1 no2>amt2 no>amt no3=amt3=0");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='1';");
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
            if (rs11.getInt("no3") !=0) {
                System.out.println(rs11.getString("branch") + "\tno3");
            }
            if (rs11.getInt("amt3") !=0) {
                System.out.println(rs11.getString("branch") + "\tamt3");
            }
        }
        System.out.println("600,700,800,900");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code in ('600');");
        while (rs11.next()) {

            if (rs11.getInt("amt3") != (bsr.data(rs11.getString("branch") + "-900", "amt3"))) {
                //if((bsr.data(rs11.getString("branch") + "-911", "amt3"))>1){
                int diff = (rs11.getInt("amt3") - (bsr.data(rs11.getString("branch") + "-900", "amt3")));
                int sum1 = (rs11.getInt("amt3"));
                int sum2 = (bsr.data(rs11.getString("branch") + "-911", "amt3")) + diff;
                //st5.executeUpdate("update planningfinal set amt3=" + sum2 + " where branchcode='" + rs11.getString("branch") + "-911'");
                //st5.executeUpdate("update planningfinal set amt3=" + sum1 + " where branchcode='" + rs11.getString("branch") + "-900'");                
                //}
                System.out.println(rs11.getString("branchcode"));
            }
        }*//*
        System.out.println("totno=no1+no2+no+no3");
        ResultSet rs11 = st11.executeQuery("SELECT * FROM planningfinal where code!='001' and branch in('519000F',5190263)");
        while (rs11.next()) {
            System.out.println(rs11.getString("branchcode"));
            String codex = rs11.getString("code");
            int sum1 = rs11.getInt("no1") + rs11.getInt("no2") + rs11.getInt("no") + rs11.getInt("no3");
            int sum2 = rs11.getInt("amt1") + rs11.getInt("amt2") + rs11.getInt("amt") + rs11.getInt("amt3");
            st5.executeUpdate("update planningfinal set totno=" + sum1 + " where branch='" + rs11.getString("branch") + "' and code='" + codex + "';");
            st5.executeUpdate("update planningfinal set totamt=" + sum2 + " where branch='" + rs11.getString("branch") + "' and code='" + codex + "';");
        }
        System.out.println("totno=no3=0");
        rs11 = st11.executeQuery("SELECT * FROM planningfinal where code='001' and branch in('519000F',5190263)");
        while (rs11.next()) {
            System.out.println(rs11.getString("branchcode"));
            String codex = rs11.getString("code");
            st5.executeUpdate("update planningfinal set totno=0,no3=0 where branch='" + rs11.getString("branch") + "' and code='001';");
            st5.executeUpdate("update planningfinal set totamt=0,amt3=0  where branch='" + rs11.getString("branch") + "' and code='001';");
        }  
         /*
        int arr_ind[] = {801, 802, 803, 804, 811, 812, 813, 814};
        int min_rang[] = {0, 100, 1500, 10000, 0, 100, 1500, 10000};
        int max_rang[] = {100, 1500, 10000, 100000000, 100, 1500, 10000, 100000000};
        for (int i = 0; i < 8; i++) {
            System.out.println(arr_ind[i] + " avg");
            ResultSet rs10 = st10.executeQuery("SELECT * FROM planningfinal where code='" + arr_ind[i] + "'");
            while (rs10.next()) {
                rs10.getString("branchcode");
                if ((rs10.getDouble("amt3") / rs10.getDouble("no3")) > max_rang[i] || (rs10.getDouble("amt3") / rs10.getDouble("no3")) < min_rang[i]) {
                    System.out.println(rs10.getString("branch"));
                    st5.executeUpdate("update planningfinal set amt3=" + ((max_rang[i]+min_rang[i])/2)*rs10.getInt("no3") + " where branch='" + rs10.getString("branch") + "' and code='" + arr_ind[i] + "';");
                    //System.out.println("update planningfinal set amt3=" + ((max_rang[i]+min_rang[i])/2)*rs10.getInt("no3") + " where branch='" + rs10.getString("branch") + "' and code='" + arr_ind[i] + "';");
                }
            }
        }*/
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

    public int datanew(String branchcode, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM planningfinal where branchcode='" + branchcode + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }

    public int databsr7(String sol, String field) throws SQLException {
        int no = 0;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM bsr7final where sol='" + sol + "'");
        while (rs.next()) {
            no = rs.getInt("" + field);
        }
        return no;
    }
}
