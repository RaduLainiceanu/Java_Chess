package view;

import controller.GameController;
import javafx.scene.layout.Pane;
import model.pieces.Piece;

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
            GameController.selectAndMovePiece(x, y, this.piece, this);
        });
    }
}
