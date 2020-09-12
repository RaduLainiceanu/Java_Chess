package pieces;

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Board;
import repository.Piece;
import repository.Spot;

public class Bishop extends Piece {
    public Bishop(boolean white, int x, int y, GameLayout.Tile tile) {
        super(white, x, y, tile);
        if(white){
            Image pieceImg = new Image("white_bishop.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Bishop";
        }else{
            Image pieceImg = new Image("black_bishop.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Bishop";
        }
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
