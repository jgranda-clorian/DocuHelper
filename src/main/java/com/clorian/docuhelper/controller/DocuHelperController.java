package com.clorian.docuhelper.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DocuHelperController {

    @FXML
    private Label message;
    @FXML
    public void setWelcomeMessage()
    {
        message.setText("ASD");
    }


}