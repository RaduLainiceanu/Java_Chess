package controller;

import model.GameModel;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.pieces.*;

/*
*   Clasa responsabila cu primirea inputului de la utilizator si procesarea acestuia.
* De aici actualizam GameModel privind alegerile utilizatorului.
* Metodele sale sunt actionate de catre GameLayout prin clasa Tile
* */
public class GameController {

    public static void selectAndMovePiece(int x, int y, Piece piece, GameModel.Tile tile){
        System.out.print(x + " " + y + " "+GameModel.getSelectedPiece() + " ");
        try{
            piece.sayType();
        }catch(Exception ignored){
            System.out.println(" ");
        }
        if(!GameModel.isIsSelected()){
            if(piece!=null){
                GameModel.setSelectedPiece(piece);
                GameModel.setIsSelected(true);
                tile.getChildren().clear();
                tile.setPiece(null);
                GameModel.setOldTileCoordinates(new int[]{x, y});
            }else{
                GameModel.setSelectedPiece(null);
                GameModel.setIsSelected(false);
            }
        }else{
            tile.setPiece(GameModel.getSelectedPiece());
            Image pieceImg = new Image(GameModel.getSelectedPiece().getImgUrl());
            tile.getChildren().add(new ImageView(pieceImg));
            GameModel.setSelectedPiece(null);
            GameModel.setIsSelected(false);
        }
    }

    private GameController(){}
}
