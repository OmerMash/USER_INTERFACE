module com.example.user_interface {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;


    opens com.example.user_interface to javafx.fxml;
    exports com.example.user_interface;
}