package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.sql.DBConnection;
import org.example.sql.Main;
import org.example.sql.UseDB;

import java.io.IOException;
import java.sql.Connection;

public class App extends Application {

    private static Scene scene;

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        //Main from sql pakage
        //Main.main(null);
        // Object of the connection
        Connection sqlite = DBConnection.sqliteConnection();
        UseDB dbuser = new UseDB(sqlite);

        for (int i=0;i<30;i++) {

            // You can choos a Patient to be investigated
            //dbuser.insertIntoDatabase(123456789);


        }
        // You can search for any patients data records by typing her/ his ID:
        dbuser.findAllMeasurementsFromPatient(2525);
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("login"), 640, 480);
        stage.setScene(scene);
        stage.show();
        //System.out.println("Hej verden");

    }


}