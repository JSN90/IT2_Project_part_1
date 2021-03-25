package org.example.data;

import org.example.Controller;

import java.text.DecimalFormat;

public class Pulse extends Controller {

    public static void main(String[] args) {
        int vaerdi;
       // int pulse = (int) Math.random();

        vaerdi = (int) (Math.random() * 90 + 130);
        double temperatur = vaerdi * 10 / 50 + 24;
        DecimalFormat Decimal = new DecimalFormat("##");
        System.out.println(Decimal.format(temperatur));

    }
}


