package jm.task.core.jdbc.util;

import java.sql.*;




public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/new_schema_task_one?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String DB_PASSWORD = "visherroot";

    // Метод для настройки соединения с БД
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, DB_PASSWORD);
            System.out.println("Соединение с БД установлено успешно.");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Не удалось найти JDBC драйвер", ex);
        }
        return connection;
    }
}

