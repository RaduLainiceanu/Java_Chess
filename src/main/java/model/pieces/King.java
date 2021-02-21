package model.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.GameModel;

public class King extends Piece {
    public King(boolean white, GameModel.Tile tile) {
        super(white, tile);
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
