package repository;

import graphic.GameLayout;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Tile extends Pane {
    private int posX;
    private int posY;
    private Piece piece;

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public Tile(int x, int y) {
        posX = x;
        posY = y;
        setOnMouseClicked(e -> {

        //Piece sourcePiece =









            System.out.print(posX + " " + posY + " ");
            try{
                piece.sayType();
            }catch(Exception ignored){
                System.out.println(" ");
            }
        });
    }
}
