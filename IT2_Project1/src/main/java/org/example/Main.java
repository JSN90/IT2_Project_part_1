package org.example;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {

         ConnectionSingleTon singleTon= new ConnectionSingleTon();

      singleTon.connectToSQLITE("Gruppe3DB");


        ConnectionDRYnSOC refined = new ConnectionDRYnSOC();
        //refined.getSQLITEConnection("hestestalden");

        //Connection mysql = refined.getMYSQLConnection("guest","hestehest","sundhedsteknologidb");
        Connection sqlite = refined.getSQLITEConnection("Gruppe3DB");

        //UseDB dbuser = new UseDB();


      for (int i=0;i<30;i++){

          // dbuser.insertMeasurementsIntoTable(3402,((int) (Math.random()*1000)) ) ;
       }
      Connection c1 = singleTon.connectToSQLITE("Gruppe3DB");

        //dbuser.findAllMeasurementsFromPatient(0,21);

    }

}
