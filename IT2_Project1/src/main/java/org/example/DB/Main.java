package org.example.DB;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {


         ConnectionSingleTon singleTon= new ConnectionSingleTon();

         singleTon.connectToSQLITE("Gruppe3DB"); // bruger Gruppe3DB databse



        ConnectionDRYnSOC refined = new ConnectionDRYnSOC();
        refined.getSQLITEConnection("Journals"); //


        Connection sqlite = refined.getSQLITEConnection("Journals");

        UseDB dbuser = new UseDB(sqlite);


        for (int i=0;i<30;i++){

            dbuser.insertMeasurementsIntoTable(3402,((int) (Math.random()*1000)) ) ;
        }
        Connection c1 = singleTon.connectToSQLITE("sqlitefilnavn");


        //dbuser.findAllMeasurementsFromPatient(0,21);



    }

}
