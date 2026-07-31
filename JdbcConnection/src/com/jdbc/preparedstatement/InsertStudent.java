package com.jdbc.preparedstatement;

import java.sql.*;

public class InsertStudent {
    public static void main(String args[]) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "hr",
                "hr");

        String sql = "insert into Student values(?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 1001);
        ps.setString(2, "RAMESH");
        ps.setString(3, "X");
        ps.setDate(4, Date.valueOf("2009-05-15"));
        ps.setDouble(5, 25000);

        int i = ps.executeUpdate();

        if(i>0)
            System.out.println("Record Inserted");

        con.close();
    }
}