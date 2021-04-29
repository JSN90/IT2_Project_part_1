package org.example.Sensors;

import org.example.Controller;

import java.text.DecimalFormat;

public class Puls extends Controller {

    public static int hr() {
        int vaerdi;

        while (true) {

            vaerdi = (int) (Math.random() * 90 + 130);
            double puls = vaerdi * 10 / 50 + 24;
            DecimalFormat Decimal = new DecimalFormat("##");
            System.out.println("Puls is : " + Decimal.format(puls));
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

    /*
    public static double SpO2() {

        double SpO2;
        while (true) {

            SpO2 = Math.random() * 5 + 95;
            DecimalFormat df = new DecimalFormat("##.##");// from many decimals to one or two decimals
            System.out.println("SpO2 is : "+df.format(SpO2)+ " ");

            try {
                Thread.sleep(1100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static double BodyTemp() {
        double temperature;
        while (true) {

            temperature = Math.random() * 6 + 35;
            DecimalFormat deci = new DecimalFormat("##.##");
            System.out.println("Temperature is :"+ deci.format(temperature));
            try {
                Thread.sleep(11000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }




}







     */
