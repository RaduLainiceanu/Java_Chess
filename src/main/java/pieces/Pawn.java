package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class Pawn extends Piece {

    public Pawn(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
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
