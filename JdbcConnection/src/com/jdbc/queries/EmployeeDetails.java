package com.jdbc.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDetails {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM EMP");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + "   " +
                        rs.getString("ename"));

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}