package org.example.sql;

import java.sql.*;
import java.util.TimeZone;

public class UseDB {

    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Connection connection;

    public UseDB(Connection connection) {
        this.connection = connection;
    }

    public void insertIntoDatabase(int patientID) {

        /**
         * WE simulating with Math.random in stead of real sensors
         */
        //----------------------Puls-----------------------------
        int vaerdi = (int) (Math.random() * 90 + 130);
        int puls = vaerdi * 10 / 50 + 24;
        //---------------------SpO2------------------------------
        double SpO2 = Math.floor(Math.random() * 5 + 94.7);
        //double spo2 = Math.round(SpO2);

        //---------------------Temperature-----------------------
        double temperature  = Math.floor(Math.random() * 6 + 34.7);
        //double Temp = Math.round(temperature);
        //-----------------------------------------------------

        String SQL = "insert into Journal(Temperature,SpO2,Puls,PtID) values(?,?,?,?);";

        try {

            preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setDouble(1, temperature);
            preparedStatement.setDouble(2,SpO2);
            preparedStatement.setInt(3, puls);
            preparedStatement.setInt(4, patientID);

            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    public void findAllDataFromPatient(int patientID) {
       // TimeZone regtime = TimeZone.getTimeZone("?serverTimezone=Europe/Amsterdam&amp");



        String SQL = "SELECT id,Temperature,SpO2,Puls,PtID, RegTime FROM Journal where PtID="
                + patientID + ";";
        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                System.out.println(
                        "| RawID :" + resultSet.getInt(1) + "|"+"\t" + "|" +
                                "Temperature :" + resultSet.getDouble(2) + " ℃ " + "|"+"\t" + "|" +
                                "SpO2 : " + resultSet.getDouble(3) + "|"+"\t" + "|" +
                                "Puls: " + resultSet.getInt(4) + "|"+"\t" + "|" +
                                "PatientID:" + resultSet.getInt(5) + "|"+"\t" + "|"  +
                                "Date&Time : " + resultSet.getObject(6) + "|"+"\t" + "|"

                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
