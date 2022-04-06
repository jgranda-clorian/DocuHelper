package com.clorian.docuhelper.service.impl;

import com.clorian.docuhelper.service.InvoiceGeneratorService;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class InvoiceGeneratorServiceImpl implements InvoiceGeneratorService {

    @Override
    public File getDirectory() {
        return new DirectoryChooser().showDialog(new Stage());
    }
}
