package graphic;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.image.Image ;
import pieces.Pawn;

public class GameLayout extends MainLayout {

    protected Scene gameStage() {

        GridPane gridPane = new GridPane();
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
                    color = "black";
                }
                Tile tile = new Tile(row, col);
                tile.setPrefSize(tileWidth, tileHeight);
                tile.setStyle("-fx-background-color: " + color + ";");
                gridPane.add(tile, col, row);
                if(row == 1 && col == 1){
                    Pawn blackPawn1 = new Pawn(false, row, col);
                    Image pieceImg = new Image("black_pawn.png");
                    tile.getChildren().add(new ImageView(pieceImg));
                }
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

        HBox hBoxTop = new HBox();
        hBoxTop.setMinHeight(50);

        borderPane.setTop(hBoxTop);

        borderPane.setCenter(gridPane);

        borderPane.setPadding(new Insets(0, 250, 50, 250));

        Scene scene = new Scene(borderPane, MainLayout.initialSceneWidth, MainLayout.initialSceneHeight);

        return scene;
    }

    class Tile extends Pane {
        private int posX;
        private int posY;

        public Tile(int x, int y) {
            posX = x;
            posY = y;
            setOnMouseClicked(e -> {
                System.out.println(posX + " " + posY);
                //COMENTARIU TEST GABI
            });
        }
    }

    //Adaugare Radu piesa pion pe tabla


}
