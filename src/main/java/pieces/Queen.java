package pieces;

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Board;
import repository.Piece;
import repository.Spot;

public class Queen extends Piece {
    public Queen(boolean white, int x, int y, GameLayout.Tile tile) {
        super(white, x, y, tile);
        if(white){
            Image pieceImg = new Image("white_queen.png");
            tile.getChildren().add(new ImageView(pieceImg));
        }else{
            Image pieceImg = new Image("black_queen.png");
            tile.getChildren().add(new ImageView(pieceImg));
        }
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
