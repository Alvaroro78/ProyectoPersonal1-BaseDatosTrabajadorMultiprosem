package com.icesi.base_de_datos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.icesi.base_de_datos.model.Multiprosem;

public class HelloController {

    private Multiprosem multiprosem;

    @FXML
    private Label infoBox;

    @FXML
    private TextField workerId;

    @FXML
    private TextField code;

    private final String securityCode = "Huevo100";


    public void initialize(){
        multiprosem = new Multiprosem();
        multiprosem.casoPrueba();
    }

    @FXML
    public void search(){
        if (code.getText().equals(securityCode)) {
            infoBox.setText(multiprosem.getWorker(workerId.getText()));
        }
    }
}
