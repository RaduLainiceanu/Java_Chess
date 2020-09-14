package model.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Tile;

public class Tower extends Piece {
    public Tower(boolean white,  Tile tile) {
        super(white, tile);
        if(white){
            setImgUrl("white_rook.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Tower";
        }else{
            setImgUrl("black_rook.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Tower";
        }
    }


}
