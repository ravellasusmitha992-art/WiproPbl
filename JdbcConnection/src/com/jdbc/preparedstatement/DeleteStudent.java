package com.jdbc.preparedstatement;

import java.sql.*;

public class DeleteStudent {

    public static void main(String args[]) throws Exception {

        int roll = Integer.parseInt(args[0]);

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "hr",
                "hr");

        PreparedStatement ps1 = con.prepareStatement(
                "select * from Student where RollNo=?");

        ps1.setInt(1, roll);

        ResultSet rs = ps1.executeQuery();

        if(rs.next()){

            PreparedStatement ps2 = con.prepareStatement(
                    "insert into StudentLog values(?,?,?,sysdate)");

            ps2.setInt(1, rs.getInt(1));
            ps2.setString(2, rs.getString(2));
            ps2.setString(3, rs.getString(3));

            ps2.executeUpdate();

            PreparedStatement ps3 = con.prepareStatement(
                    "delete from Student where RollNo=?");

            ps3.setInt(1, roll);

            ps3.executeUpdate();

            System.out.println("Record Deleted");
        }
        else{
            System.out.println("Student Not Found");
        }

        con.close();
    }
}