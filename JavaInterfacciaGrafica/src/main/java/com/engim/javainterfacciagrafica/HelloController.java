package com.engim.javainterfacciagrafica;

import com.engim.javainterfacciagrafica.model.Persona;
import com.engim.javainterfacciagrafica.model.Registro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addPersonaButton;

    @FXML
    private Label personeLabel;

    @FXML
    private TextField nomeTextField;

    @FXML
    protected void onAddPersonaButtonClick() {
        Registro.getInstance().addPersona(nomeTextField.getText());
        personeLabel.setText(Registro.getInstance().getNomiPersone());

        //welcomeText.setText("Welcome to JavaFX Application!");
    }

}