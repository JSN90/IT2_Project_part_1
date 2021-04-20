package org.example;

import java.sql.*;

public class ConnectionSingleTon {
    private String url, adresse, user, password;
    //needed for a MYSQL Workbench setup
    private Connection conn = null;
    private ResultSet resultSet;
    private Statement statement;
    private PreparedStatement preparedStatement;
    //all thats needed to insert and fetch....almost.

    int randomheltal = (int) (Math.random() * 1000);
    double randomdecimal = Math.random() * 1000;


    //konstruktør til SQLite
    public Connection connectToSQLITE(String filename) {

        String Driver = "jdbc:sqlite:";
        String url = Driver + filename + "";

        try {
//"jdbc:sqlite:sqlitefilnavn"
            conn = DriverManager.getConnection("jdbc:sqlite:Gruppe3DB");
            //grunden til at det kan lade sig gøre kun at køre med sqlitefilnavn er, at databasen findes i samme folder
            //som klassen, der bruger den - Husk at holde de 2 ting let tilgængelige
            //hvis I rykker filen, skal I opdatere navnet.


            if (conn != null) {
                //  DatabaseMetaData meta = conn.getMetaData();


                statement = conn.createStatement();
                //her er SOc & og DRY ikke overholdt
                String insertintodatabase = "insert into NewTable(id,puls) values(?,?);";
                //hav i mængde - mængden af spørgsmålstegn skal passe med mængden af kolonner.

                preparedStatement = conn.prepareStatement(insertintodatabase);


                preparedStatement.setDouble(1, randomdecimal);
                preparedStatement.setInt(2, randomheltal);

                preparedStatement.execute();




                //For at få dem ud igen
                String FindString = "select * from NewTable;";
                System.out.println("From the SQLITE base:");


                resultSet = statement.executeQuery(FindString);

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getDouble(2));
                    System.out.println(resultSet.getInt(3));
                }

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return conn;
    }




    public void createNewSQLITEDBIfNotExists(String dbname) {
        String FILEPATH = "jdbc:sqlite:" + dbname + ".db";
        try (Connection conn = DriverManager.getConnection(FILEPATH)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
