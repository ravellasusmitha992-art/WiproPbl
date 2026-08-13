package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521:XE";

    private static final String USERNAME = "hr";
    private static final String PASSWORD = "hr";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC DRIVER NOT FOUND", e);
        }

        try {
            return DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );
        } catch (SQLException e) {
            System.out.println("===== DATABASE ERROR =====");
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
            throw e;
        }
    }
}