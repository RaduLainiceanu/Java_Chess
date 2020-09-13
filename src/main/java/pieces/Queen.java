package pieces;

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Board;
import repository.Piece;
import repository.Spot;
import repository.Tile;

public class Queen extends Piece {
    public Queen(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
        if(white){
            Image pieceImg = new Image("white_queen.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Queen";
        }else{
            Image pieceImg = new Image("black_queen.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Queen";
        }
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
