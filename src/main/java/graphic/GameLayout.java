package graphic;


import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class GameLayout extends MainLayout {

    protected Scene gameStage() {

        GridPane gridPane = new GridPane();
        final int size = 8;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Rectangle rectangle = new Rectangle();
                Color color;
                if ((row + col) % 2 == 0) {
                    color = Color.WHITE;
                } else {
                    color = Color.BLACK;
                }
                rectangle.setFill(color);
                gridPane.add(rectangle, col, row);
                rectangle.widthProperty().bind(gridPane.widthProperty().divide(size));
                rectangle.heightProperty().bind(gridPane.heightProperty().divide(size));
            }
        }
        Group group = new Group(gridPane);

        gridPane.setId("borderGrid");
        gridPane.getStylesheets().add("style.css");

        BorderPane borderPane = new BorderPane();

        HBox hBoxTop = new HBox();
        hBoxTop.setMinHeight(50);
//
//        HBox hBoxBot = new HBox();
//        hBoxBot.setMinHeight(100);
//
//        VBox vBoxRight = new VBox();
//        vBoxRight.setMinWidth(100);
//
//        VBox vBoxLeft = new VBox();
//        vBoxLeft.setMinWidth(100);

        borderPane.setTop(hBoxTop);
//        borderPane.setBottom(hBoxBot);
//        borderPane.setRight(vBoxRight);
//        borderPane.setLeft(vBoxLeft);
        borderPane.setCenter(gridPane);

        borderPane.setPadding(new Insets(0,250,50,250));


        Scene scene = new Scene(borderPane, MainLayout.initialSceneWidth, MainLayout.initialSceneHeight);


        return scene;
    }
}
