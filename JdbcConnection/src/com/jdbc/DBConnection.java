
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "hr",
                    "hr");

            System.out.println("Connection Established Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e.getMessage());
        }

    }
}
