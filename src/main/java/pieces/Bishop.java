package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class Bishop extends Piece {

    public Bishop(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
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
