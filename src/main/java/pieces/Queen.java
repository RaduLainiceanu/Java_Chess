package pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import repository.Piece;
import repository.Tile;

public class Queen extends Piece {
    public Queen(boolean white, int x, int y, Tile tile) {
        super(white, x, y, tile);
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
