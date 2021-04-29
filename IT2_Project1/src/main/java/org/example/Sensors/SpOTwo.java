package org.example.Sensors;

import org.example.Controller;

import java.text.DecimalFormat;

public class SpOTwo extends Controller {
    public static double SpO2 () {

        double SpO2;
        while (true) {

            SpO2 = Math.random() * 5 + 95;
            DecimalFormat df = new DecimalFormat("##.##");// from many decimals to one or two decimals
            System.out.println("SpO2 : "+df.format(SpO2));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


