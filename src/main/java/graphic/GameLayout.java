package graphic;

import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import pieces.Bishop;
import repository.Piece;
import repository.PieceController;
import repository.Spot;

public class GameLayout extends MainLayout {

    GridPane gridPane = new GridPane();

    protected Scene gameStage() {
        final int size = 8;
        double tileWidth = MainLayout.initialSceneWidth / size;
        double tileHeight = MainLayout.initialSceneHeight / size;


        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                StackPane stackPane = new StackPane();
                String color;
                if ((row + col) % 2 == 0) {
                    color = "white";
                } else {
                    color = "gray";
                }
                Tile tile = new Tile(row, col);
                tile.setPrefSize(tileWidth, tileHeight);
                tile.setStyle("-fx-background-color: " + color + ";");
                gridPane.add(tile, col, row);

                PieceController.addPart(row, col, tile);
            }
        }
        for (int i = 0; i < size; i++) {
            gridPane.getColumnConstraints().add(new ColumnConstraints(5, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, true));
            gridPane.getRowConstraints().add(new RowConstraints(5, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, VPos.CENTER, true));
        }

        Group group = new Group(gridPane);

        gridPane.setId("pane");
        gridPane.getStylesheets().add("style.css");

        BorderPane borderPane = new BorderPane();

        Button newGame = new Button();
        newGame.setGraphic(new ImageView("new_game.png"));
        Tooltip.install(newGame, new Tooltip("New game"));
        newGame.setOnAction(event -> {
            GameLayout gameLayout = new GameLayout();
            try {
                gameLayout.gameStage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button back = new Button();
        back.setGraphic(new ImageView("go_back.png"));
        Tooltip.install(back, new Tooltip("Go to menu"));
        back.setOnAction(event -> {
            MainLayout mainLayout = new MainLayout();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            try {
                mainLayout.start(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button close = new Button();
        close.setGraphic(new ImageView("exit.png"));
        Tooltip.install(close, new Tooltip("Close"));
        close.setOnAction(event -> {
            Platform.exit();
        });

        HBox hBoxTop = new HBox(5);
        hBoxTop.getChildren().addAll(newGame, back, close);
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



        borderPane.setCenter(gridPane);

        borderPane.setPadding(new Insets(0, 0, 0, 0));

        Scene scene = new Scene(borderPane, MainLayout.initialSceneWidth, MainLayout.initialSceneHeight);

        return scene;
    }

    public class Tile extends Pane {
        private int posX;
        private int posY;
        private Piece piece;

        public void setPiece(Piece piece) {
            this.piece = piece;
        }

        public Tile(int x, int y) {
            posX = x;
            posY = y;
            setOnMouseClicked(e -> {
                System.out.print(posX + " " + posY + " ");
                try{
                    piece.sayType();
                }catch(Exception ignored){
                    System.out.println(" ");
                }
            });
        }
    }


}
