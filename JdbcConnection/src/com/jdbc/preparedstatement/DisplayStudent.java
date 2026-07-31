package com.jdbc.preparedstatement;

import java.sql.*;

public class DisplayStudent {

    public static void main(String args[]) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs;

            if (args.length == 0) {

                rs = st.executeQuery("SELECT * FROM STUDENT");

            } else {

                rs = st.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO=" + args[0]);

            }

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + "  " +
                        rs.getString("STUDENTNAME") + "  " +
                        rs.getString("STANDARD") + "  " +
                        rs.getDate("DATE_OF_BIRTH") + "  " +
                        rs.getDouble("FEES"));

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}