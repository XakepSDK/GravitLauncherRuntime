package pro.gravit.launcher.client.gui.stage;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pro.gravit.launcher.client.gui.JavaFXApplication;
import pro.gravit.launcher.client.gui.config.DesignConstants;
import pro.gravit.launcher.client.gui.impl.AbstractStage;
import pro.gravit.utils.helper.LogHelper;

import java.io.IOException;

public class PrimaryStage extends AbstractStage {
    public PrimaryStage(Stage primaryStage, String title) {
        super(primaryStage);
        primaryStage.setTitle(title);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(true);
        scene.setFill(Color.TRANSPARENT);
        // Icons
        try {
            Image icon = new Image(JavaFXApplication.getResourceURL("favicon.png").toString());
            stage.getIcons().add(icon);
        } catch (IOException e) {
            LogHelper.error(e);
        }
        setClipRadius(DesignConstants.SCENE_CLIP_RADIUS, DesignConstants.SCENE_CLIP_RADIUS);
    }

    @Override
    public void close() {
        Platform.exit();
    }
}
