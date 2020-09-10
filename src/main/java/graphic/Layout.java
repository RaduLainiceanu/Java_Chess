package graphic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class Layout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CHESS");
        primaryStage.getIcons().add(new Image("stage_icon.png"));
        AnchorPane anchorPane = new AnchorPane();

        Button singlePlayer = new Button();
        singlePlayer.setPrefSize(195,195);
        singlePlayer.setId("singleplayer");
        singlePlayer.getStylesheets().add("style.css");

        Button multiPlayer = new Button();
        multiPlayer.setPrefSize(195,195);
        multiPlayer.setId("multiplayer");
        multiPlayer.getStylesheets().add("style.css");

        Button options = new Button();
        options.setPrefSize(195,195);
        options.setId("options");
        options.getStylesheets().add("style.css");

        VBox vBox = new VBox(5);
        vBox.getChildren().addAll(singlePlayer, multiPlayer, options);

        anchorPane.getChildren().addAll(vBox);
        Scene scene = new Scene(anchorPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
