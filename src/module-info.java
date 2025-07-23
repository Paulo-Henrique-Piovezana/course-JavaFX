module courseJavaFXjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens gui to javafx.fxml;
    exports application;
    
    opens model.entities to javafx.base;

}
