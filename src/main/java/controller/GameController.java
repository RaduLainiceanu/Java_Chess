package controller;

import model.GameModel;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import view.Tile;
import model.pieces.*;

/*
* Clasa responsabila cu primirea inputului de la utilizator si procesarea acestuia
* De aici informam modelul privind alegerile utilizatorului
* */
public class GameController {

    public static void selectAndMovePiece(int x, int y, Piece piece, Tile tile){
        System.out.print(x + " " + y + " ");
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
            }else{
                GameModel.setSelectedPiece(null);
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
