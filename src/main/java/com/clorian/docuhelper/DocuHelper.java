package com.clorian.docuhelper;
import com.clorian.docuhelper.utils.SceneHelper;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class DocuHelper extends Application {
    private Scene mainScene;
    private static final String MAIN_SCENE_FXML = "docu-helper.fxml";
    private static final String MAIN_SCENE_CSS = "docu-helper.css";

    @Override
    public void start(Stage stage) throws IOException {
        mainScene = SceneHelper.getNewScene(MAIN_SCENE_FXML,MAIN_SCENE_CSS);
        stage.setTitle("Clorian Invoice Generator");
        stage.setScene(mainScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}