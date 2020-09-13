package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class King extends Piece {
    public King(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
        if(white){
            setImgUrl("white_king.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White King";
        }else{
            setImgUrl("black_king.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black King";
        }
    }




}
