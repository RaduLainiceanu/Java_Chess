package view;

import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.GameModel;

/*
* Gestioneaza afisajul.
* Face legatura cu clasa GameController prin apasarea click asupra elementelor de tip Tile din variabila gridPane.
 */

public class GameLayout extends MainLayout {

    protected Scene gameStage() {
        GameModel.makeTable();
        BorderPane borderPane = new BorderPane();
        makeScene(borderPane);
        return new Scene(borderPane, MainLayout.initialSceneWidth, MainLayout.initialSceneHeight);
    }

    private void makeScene(BorderPane borderPane){
        Button newGameBtn = new Button();
        newGameBtn.setGraphic(new ImageView("new_game.png"));
        Tooltip.install(newGameBtn, new Tooltip("New game"));
        newGameBtn.setOnAction(event -> {
            GameLayout gameLayout = new GameLayout();
            try {
                gameLayout.gameStage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Button backBtn = new Button();
        backBtn.setGraphic(new ImageView("go_back.png"));
        Tooltip.install(backBtn, new Tooltip("Go to menu"));
        backBtn.setOnAction(event -> {
            MainLayout mainLayout = new MainLayout();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            try {
                mainLayout.start(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Button closeBtn = new Button();
        closeBtn.setGraphic(new ImageView("exit.png"));
        Tooltip.install(closeBtn, new Tooltip("Close"));
        closeBtn.setOnAction(event -> {
            Platform.exit();
        });

        Button saveBtn = new Button();
        saveBtn.setGraphic(new ImageView("save_game.png"));
        Tooltip.install(saveBtn, new Tooltip("Save current game"));
        saveBtn.setOnAction(event -> {
            // save position of each piece on board into a file or database. Save a copy of board
        });

        Button loadBtn = new Button();
        loadBtn.setGraphic(new ImageView("load_game.png"));
        Tooltip.install(loadBtn, new Tooltip("Load last game"));
        loadBtn.setOnAction(event -> {
            // load last game status from a file or a database.
        });

        HBox hBoxTop = new HBox(5);
        hBoxTop.getChildren().addAll(newGameBtn, backBtn, closeBtn, saveBtn, loadBtn);
        hBoxTop.setPadding(new Insets(0,0,10,0));

        VBox vBoxLeft = new VBox();
        vBoxLeft.setPadding(new Insets(0,0,0,265));
        VBox vBoxRight = new VBox();
        vBoxRight.setPadding(new Insets(0,235,0,0));
        HBox hBoxBottom = new HBox();
        hBoxBottom.setPadding(new Insets(0,0,50,0));
        borderPane.setTop(hBoxTop);
        borderPane.setLeft(vBoxLeft);
        borderPane.setRight(vBoxRight);
        borderPane.setBottom(hBoxBottom);
        BorderPane.setAlignment(hBoxTop, Pos.TOP_LEFT);

        borderPane.setCenter(GameModel.getGridPane());

        borderPane.setPadding(new Insets(0, 0, 0, 0));
    }
}
