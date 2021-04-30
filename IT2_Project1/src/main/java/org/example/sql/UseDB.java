package org.example.sql;

import java.sql.*;

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
        //----------------------------------------------------
        int vaerdi = (int) (Math.random() * 90 + 130);
        int puls = vaerdi * 10 / 50 + 24;
        //----------------------------------------------------
        double SpO2 = (Math.random() * 5 + 95);
      // double spo2 = Math.round(SpO2);

        //----------------------------------------------------
        double temperature  = Math.random() * 6 + 35;
        //double Temp = Math.round(temperature);
        //-----------------------------------------------------

        String SQL = "insert into Journals(Temperature,SpO2,Puls,patientID) values(?,?,?,?);";

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

/*
    public void insertAppointment(int patientID) {

        try {
            preparedStatement = connection.prepareStatement("");
        } catch (Exception ex) {

        }

    }

 */

    public void findAllMeasurementsFromPatient(int patientID) {

        String SQL = "SELECT rawID,Temperature,SpO2,Puls,PatientID FROM Journals where patientID="
                + patientID + ";";
        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                System.out.println(
                        "| RawID :" + resultSet.getInt(1) + "|"+"\t" + "|" +
                                "Temperature :" + resultSet.getDouble(2) + "℃" + "|"+"\t" + "|" +
                                "SpO2 : " + resultSet.getDouble(3) + "|"+"\t" + "|" +
                                "Puls: " + resultSet.getInt(4) + "|"+"\t" + "|" +
                                "PatientID:" + resultSet.getInt(5) + "|"+"\t" + "|"

                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
