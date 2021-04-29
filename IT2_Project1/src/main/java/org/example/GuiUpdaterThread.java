package org.example;

import javafx.scene.shape.Polyline;
import org.example.Sensors.Puls;
import org.example.Sensors.Temperature;

public class GuiUpdaterThread implements Runnable{

    Polyline graf;
    Temperature temperature;
    Puls puls = new Puls();
    public GuiUpdaterThread(Polyline graf){
        this.graf=graf;

    }
    public GuiUpdaterThread(Polyline graf, Temperature temperature){
        this.graf=graf;
        this.temperature=temperature;

    }

    @Override
    public void run() {

       // graf.getPoints().add(temperature.getValue());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
