package com.javarush.task.sql.task08.task0807;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPDataSource {
    private static HikariCPDataSource instance;
    private final HikariConfig config;
    private final HikariDataSource ds;

    private HikariCPDataSource() {
        config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        config.setUsername("root");
        config.setPassword("root");
        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        if (instance == null) {
            instance = new HikariCPDataSource();
        }
        return instance.ds.getConnection();
    }
}
