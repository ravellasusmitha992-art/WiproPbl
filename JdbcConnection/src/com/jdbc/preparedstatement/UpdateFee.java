package com.jdbc.preparedstatement;

import java.sql.*;

public class UpdateFee {

    public static void main(String args[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "hr",
                    "hr");

            String sql = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, Double.parseDouble(args[1]));
            ps.setInt(2, Integer.parseInt(args[0]));

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Student Not Found");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}