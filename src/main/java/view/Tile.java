package view;

import controller.GameController;
import javafx.scene.layout.Pane;
import model.pieces.Piece;

/*
*   Aceasta clasa este un element vizual folosit in GameLayout pentru a reprezenta celulele de pe tabla.
* Ea este folosit ca principalul element al interactiunii utilizatorului cu logica din spate a aplicatiei.
* La apasarea click asupra unui element Tile, aplicatia face legatura cu metodele din clasa GameController.
* */
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
