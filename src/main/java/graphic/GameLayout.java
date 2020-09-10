package graphic;


import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class GameLayout extends MainLayout {

    protected Scene gameStage() {

        GridPane paneGrid = new GridPane();


        boolean trigger = false;
        
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                Rectangle rectangle = new Rectangle(i*100,j*100,100,100);
                if (trigger){
                    rectangle.setFill(Color.BLACK);
                    trigger = !trigger;
                }else {
                    trigger = !trigger;
                    rectangle.setFill(Color.WHITE);
                }
                paneGrid.getChildren().addAll(rectangle);
            }
            trigger = !trigger;
        }


        Scene scene = new Scene(paneGrid, MainLayout.initialSceneWidth, MainLayout.initialSceneHeight);


        return scene;
    }
}
