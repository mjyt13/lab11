module com.example.sadanie_11_4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.sadanie_11_4 to javafx.fxml;
    exports com.example.sadanie_11_4;
}