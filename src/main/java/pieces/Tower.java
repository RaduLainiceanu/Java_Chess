package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class Tower extends Piece {
    public Tower(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
        if(white){
            Image pieceImg = new Image("white_rook.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Tower";
        }else{
            Image pieceImg = new Image("black_rook.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Tower";
        }
    }


}
