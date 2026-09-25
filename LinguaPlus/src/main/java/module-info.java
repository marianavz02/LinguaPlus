module com.example.linguaplus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.linguaplus to javafx.fxml;
    exports com.example.linguaplus;
}