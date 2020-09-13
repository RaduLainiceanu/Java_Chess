package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class Knight extends Piece {
    public Knight(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
        if(white){
            Image pieceImg = new Image("white_knight.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Knight";
        }else{
            Image pieceImg = new Image("black_knight.png");
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Knight";
        }
    }


}
