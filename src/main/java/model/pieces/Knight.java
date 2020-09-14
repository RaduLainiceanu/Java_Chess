package model.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import view.Tile;

public class Knight extends Piece {
    public Knight(boolean white, Tile tile) {
        super(white, tile);
        if(white){
            setImgUrl("white_knight.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Knight";
        }else{
            setImgUrl("black_knight.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Knight";
        }
    }


}
