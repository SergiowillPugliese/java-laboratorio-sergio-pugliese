package com.engim.javainterfacciagrafica;

import com.engim.javainterfacciagrafica.model.Registro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addPersonaButton;



    @FXML
    protected void onAddPersonaButtonClick() {
        Registro.getInstance().addPersona("Pippo");

        //welcomeText.setText("Welcome to JavaFX Application!");
    }

}