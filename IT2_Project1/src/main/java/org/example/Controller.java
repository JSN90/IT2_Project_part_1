package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;
import javafx.stage.Popup;

import java.io.IOException;


public class Controller {

    // maindoctorpane buttons
    public Button starttemperature;
    public Button stoptemperature;
    public Button setlowerboundstemperature;
    public Button setupperboundstemperature;
    public Button startpulse;
    public Button lowerboundspulse;
    public Button stopspulse;
    public Button upperboundspulse;
    public Button startsaturation;
    public Button stopsaturation;
    public Button setupperboundssaturation;
    public Button setlowerboundssaturation;
    public Button startecg;
    public Button stopecg;
    @FXML
    private TextField userfield;
    @FXML
    private PasswordField passwordfield;

    public void showMainMenu() throws IOException {

        try {

            String user = "bruger";
            String password ="password";

            if(passwordfield.getText().contains(password) && userfield.getText().contains(user)){
                App.setRoot("maindoctorpane");
            }

            else{
                App.setRoot("login");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // maindoctorpane methods
    //Temperature
    public void starttemperature(ActionEvent actionEvent) {
    }

    public void stoptemperature(ActionEvent actionEvent) {
    }

    public void setlowerboundstemperature(ActionEvent actionEvent) {
    }

    public void setupperboundstemperature(ActionEvent actionEvent) {
    }

    //Pulse
    public void startpulse(ActionEvent actionEvent) {
    }

    public void lowerboundspulse(ActionEvent actionEvent) {
    }

    public void stoppulse(ActionEvent actionEvent) {
    }

    public void upperboundspulse(ActionEvent actionEvent) {
    }

    //Saturation
    public void startsaturation(ActionEvent actionEvent) {
    }

    public void stopsaturation(ActionEvent actionEvent) {
    }

    public void setupperboundssaturation(ActionEvent actionEvent) {
    }

    public void setlowerboundssaturation(ActionEvent actionEvent) {
    }

    //ECG
    public void startecg(ActionEvent actionEvent) {
    }

    public void stopecg(ActionEvent actionEvent) {
    }
}