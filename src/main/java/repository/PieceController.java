package repository;

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pieces.Pawn;
import repository.Piece;

import java.util.ArrayList;

public class PieceController {
    //Adaugare Radu piesa pion pe tabla
    ArrayList<Piece> pieces = new ArrayList<>();

    public static void addPart(int x, int y, GameLayout.Tile tile){
        if(x == 1){
            Pawn blackPawn1 = new Pawn(false, x, y, tile);
        }
        if(x == 6){
            Pawn blackPawn1 = new Pawn(true, x, y, tile);
        }
    }

    private PieceController(){}
}
