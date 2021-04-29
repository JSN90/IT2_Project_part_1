module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens org.example to javafx.fxml;
    exports org.example;
    exports org.example.sql;
    opens org.example.sql to javafx.fxml;
    exports org.example.Sensors;
    opens org.example.Sensors to javafx.fxml;
}