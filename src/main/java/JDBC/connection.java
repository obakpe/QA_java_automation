package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "facebook";

    private static Connection connection;

    public static Connection getConnection(){
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
                if (connection != null) {
                    System.out.println("connected");
                } else {
                    System.out.println("failure to connect");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println(e.getClass().getName()+" "+e.getMessage());
            }
        }return connection;

        }

        public static void closeConnection (){
            if (connection != null) {
                try {
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

