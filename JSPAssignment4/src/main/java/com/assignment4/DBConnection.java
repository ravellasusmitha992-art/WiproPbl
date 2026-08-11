package com.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "hr",
                "hr"
            );

            System.out.println("CONNECTED SUCCESSFULLY");

            return con;

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                "Database Connection Error: " + e.getMessage(), e
            );
        }
    }
}