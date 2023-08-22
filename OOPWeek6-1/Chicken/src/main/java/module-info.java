module com.example.chicken {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.chicken to javafx.fxml;
    exports com.example.chicken;
}