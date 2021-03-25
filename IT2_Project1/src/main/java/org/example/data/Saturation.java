package org.example.data;

import org.example.Controller;

import java.text.DecimalFormat;

public class Saturation extends Controller {

    public static void main(String[] args) {

        double saturation = Math.random()*5+95;
        DecimalFormat df = new DecimalFormat("##.##");// from many decimals to one or two decimals
        System.out.println("SpO2 is : "+df.format(saturation));
    }

}
