package pieces;

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Board;
import repository.Piece;
import repository.Spot;

public class King extends Piece {
    public King(boolean white, int x, int y, GameLayout.Tile tile) {
        super(white, x, y, tile);
        if(white){
            Image pieceImg = new Image("white_king.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White King";
        }else{
            Image pieceImg = new Image("black_king.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black King";
        }
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
