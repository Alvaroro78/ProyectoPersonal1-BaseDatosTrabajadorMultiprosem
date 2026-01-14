module com.icesi.base_de_datos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.icesi.base_de_datos to javafx.fxml;
    exports com.icesi.base_de_datos;
}