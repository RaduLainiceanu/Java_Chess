package model.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Tile;

public class Bishop extends Piece {

    public Bishop(boolean white, Tile tile) {
        super(white, tile);
        if(white){
            setImgUrl("white_bishop.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Bishop";
        }else{
            setImgUrl("black_bishop.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Bishop";
        }
    }

}
