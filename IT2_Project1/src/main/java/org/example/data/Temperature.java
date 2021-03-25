package org.example.data;

import org.example.Controller;

import java.util.Random;

public class Temperature extends Controller {


    public Temperature(double max,double min){
        this.min=min;
        this.max=max;

    }

    Random temperatur = new Random();
    double max,min;
    public static void main(String[] args) {

        double temperature = Math.random();

        System.out.println(temperature);

    }

    public double getValue(){
       double  value = min + (max - min) * temperatur.nextDouble();
                return value;
    };



}
