package model.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.GameModel;

public class Queen extends Piece {
    public Queen(boolean white, GameModel.Tile tile) {
        super(white, tile);
        movementRules = new int[][]{{1, 1}, {-1,-1}};
        if(white){
            setImgUrl("white_queen.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "White Queen";
        }else{
            setImgUrl("black_queen.png");
            Image pieceImg = new Image(getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            pieceName = "Black Queen";
        }
    }


}
