package graphic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layout extends Application {

    final double initialSceneWidth = 1190;
    final double initialSceneHeight = 800;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CHESS");
        primaryStage.getIcons().add(new Image("stage_icon.png"));
        primaryStage.setResizable(false);
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setId("anchorPane");
        anchorPane.getStylesheets().add("style.css");

        Button singlePlayer = new Button();
        singlePlayer.setPrefSize(190, 190);
        singlePlayer.setId("singleplayer");
        singlePlayer.getStylesheets().add("style.css");

        Button multiPlayer = new Button();
        multiPlayer.setPrefSize(190, 190);
        multiPlayer.setId("multiplayer");
        multiPlayer.getStylesheets().add("style.css");

        Button options = new Button();
        options.setPrefSize(190, 190);
        options.setId("options");
        options.getStylesheets().add("style.css");

        Button play = new Button();
        play.setPrefSize(190, 190);
        play.setId("play");
        play.getStylesheets().add("style.css");

        VBox vBox = new VBox(5);
        vBox.setPadding(new Insets(5, 0, 5, 5));
        vBox.getChildren().addAll(singlePlayer, multiPlayer, options);

        singlePlayer.setOnAction(event -> {
            if (!vBox.getChildren().contains(play)) {
                vBox.getChildren().add(play);
            }
        });

        multiPlayer.setOnAction(event -> {
            if (!vBox.getChildren().contains(play)) {
                vBox.getChildren().add(play);
            }
        });

        options.setOnAction(event -> {
            if (vBox.getChildren().contains(play)) {
                vBox.getChildren().remove(play);
            }
        });

        anchorPane.getChildren().addAll(vBox);
        Scene scene = new Scene(anchorPane, initialSceneWidth, initialSceneHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
