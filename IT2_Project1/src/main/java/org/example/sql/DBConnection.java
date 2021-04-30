package org.example.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {


    public static Connection sqliteConnection() {
        Connection conn = null;

        try {

            Class.forName("org.sqlite.JDBC");
            try {

                //Connecting to database "journals"
                conn = DriverManager.getConnection("jdbc:sqlite:Database");
                System.out.println(" Connected to Database");

            } catch (SQLException throwables) {
                System.out.println("SQLite Connection error! ");
            }

        } catch (ClassNotFoundException e) {
            System.out.println(" SQLite path error " + e);
        }
        return conn;
    }}

