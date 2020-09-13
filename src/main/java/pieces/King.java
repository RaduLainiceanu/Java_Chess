package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class King extends Piece {
    public King(boolean white, int x, int y, Tile tile) {
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




}
