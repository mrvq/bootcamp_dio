package com.dio.java.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoargsConstructor(access = AccessLevel.PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {

        var url = "jdbc:mysql://localhost/board";
        var user = "board";
        var password = "board";
        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}
