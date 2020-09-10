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

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CHESS");
        primaryStage.getIcons().add(new Image("stage_icon.png"));
        AnchorPane anchorPane = new AnchorPane();

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

        VBox vBox = new VBox(5);
        vBox.setPadding(new Insets(5,0,5,5));
        vBox.getChildren().addAll(singlePlayer, multiPlayer, options);

        anchorPane.getChildren().addAll(vBox);
        Scene scene = new Scene(anchorPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
