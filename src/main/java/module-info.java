module com.clorian.docuhelper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.clorian.docuhelper to javafx.fxml;
    exports com.clorian.docuhelper;
    exports com.clorian.docuhelper.controller;
    opens com.clorian.docuhelper.controller to javafx.fxml;
}