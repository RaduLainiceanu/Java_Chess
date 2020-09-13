package repository;

import javafx.scene.layout.Pane;

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
