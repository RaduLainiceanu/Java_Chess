package model.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Tile;

public class Pawn extends Piece {

    public Pawn(boolean white, Tile tile) {
        super(white, tile);
        if(white){
            setImgUrl("white_pawn.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Pawn";
        }else{
            setImgUrl("black_pawn.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Pawn";
        }
    }


}
