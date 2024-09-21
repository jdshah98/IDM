module com.jdshah {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jdshah to javafx.fxml;
    exports com.jdshah;
}