package org.example.sql;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        // Object of the connection
        Connection sqlite = DBConnection.sqliteConnection();
        UseDB dbuser = new UseDB(sqlite);



        for (int i=0;i<30;i++) {

            // You can choos a Patient to be investigated
            //dbuser.insertIntoDatabase(123456789);


        }
        // You can search for any patients data records by typing her/ his ID:
       dbuser.findAllMeasurementsFromPatient(123456789);


    }
}
