package com.clorian.docuhelper.utils;

import com.clorian.docuhelper.DocuHelper;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;


public class SceneHelper {
    private static final String FXML_PATH = "path.fxml";
    private static final String CSS_PATH = "path.css";
    public static Scene getNewScene(String mainSceneFxml, String mainSceneCss) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                DocuHelper.class.getResource(PropertiesHelper.getProp(FXML_PATH) + mainSceneFxml));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(
                SceneHelper.class.getResource(PropertiesHelper.getProp(CSS_PATH) + mainSceneCss).toExternalForm());
        return scene;
    }
}
