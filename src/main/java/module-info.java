module com.example.se {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.se to javafx.fxml;
    exports com.example.se;
}