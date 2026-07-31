package com.jdbc.queries;


import java.sql.*;

public class EmployeeSalary {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT ENAME, JOB, SAL, COMM FROM EMP WHERE SAL > 1000 AND SAL < 2000");

            while(rs.next()) {

                System.out.println(
                        rs.getString("ENAME") + " " +
                        rs.getString("JOB") + " " +
                        rs.getInt("SAL") + " " +
                        rs.getString("COMM"));

            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}