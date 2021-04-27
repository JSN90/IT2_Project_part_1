package org.example.DB;

import java.sql.*;

public class ConnectionSingleTon {

    private Connection conn = null;
    private ResultSet resultSet;
    private Statement statement;
    private PreparedStatement preparedStatement;


    //all thats needed to insert and fetch....almost.
    int randomheltal = (int) (Math.random() * 1000);
    double randomdecimal = Math.random() * 1000;


    //konstruktør
    public Connection connectToSQLITE(String Gruppe3DB) {

        String Driver = "jdbc:sqlite:";
        String url = Driver + Gruppe3DB + "";

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Gruppe3DB");

            if (conn != null) {
                //  DatabaseMetaData meta = conn.getMetaData();


                statement = conn.createStatement();
                //her er SOc & og DRY ikke overholdt
                String insertintodatabase = "insert into NewTable(Puls,Spo2) values(?,?);";
                //hav i mængde - mængden af spørgsmålstegn skal passe med mængden af kolonner.

                preparedStatement = conn.prepareStatement(insertintodatabase);


                preparedStatement.setInt(1, randomheltal);
                preparedStatement.setDouble(2, randomdecimal);

                preparedStatement.execute();




                //For at få dem ud igen
                String FindString = "select * from tabelnavn;";
                System.out.println("From the SQLITE base:");


                resultSet = statement.executeQuery(FindString);

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(2));
                    System.out.println(resultSet.getDouble(3));
                    System.out.println(resultSet.getInt(4));
                }

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return conn;
    }



}
