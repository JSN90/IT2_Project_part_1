package org.example.Sensors;

import org.example.Controller;

import java.text.DecimalFormat;

public class Temperature extends Controller {

/*
    public Temperature(double max,double min){
        this.min=min;
        this.max=max;

    }

    Random temperatur = new Random();
    double max,min;

 */


    public static double BodyTemp() {
        double temperature;
        while (true) {

            temperature = Math.random() * 6 + 35;
            DecimalFormat deci = new DecimalFormat("##.##");
            System.out.println("Patient's Temperature is : " + deci.format(temperature) + "℃");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


/*
    public double getValue(){
       double  value = min + (max - min) * temperatur.nextDouble();
                return value;
    };



    }

}





 */