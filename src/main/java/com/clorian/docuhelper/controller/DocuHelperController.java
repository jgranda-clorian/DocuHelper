package com.clorian.docuhelper.controller;

import com.clorian.docuhelper.service.InvoiceGeneratorService;
import com.clorian.docuhelper.service.impl.InvoiceGeneratorServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

import java.io.File;

public class DocuHelperController {
    private final InvoiceGeneratorService invoiceGenerator;

    @FXML
    private Label pathToFolderLabel;
    @FXML
    private ListView directoryListView;

    public DocuHelperController() {
        //this.stage = (Stage) splitPane1.getScene().getWindow();
        this.invoiceGenerator = new InvoiceGeneratorServiceImpl();
    }

    public void onSelectedFolder(ActionEvent actionEvent) {
        File directory = this.invoiceGenerator.getDirectory();
        pathToFolderLabel.setText(directory.getAbsolutePath());

        directoryListView.getItems().addAll(directory.list());
    }
}