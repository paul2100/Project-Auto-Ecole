module sio.autoecoleprojet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens sio.autoecoleprojet to javafx.fxml;
    exports sio.autoecoleprojet;
}