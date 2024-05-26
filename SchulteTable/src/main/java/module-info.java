module com.example.schultetable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schultetable to javafx.fxml;
    exports com.example.schultetable;
}