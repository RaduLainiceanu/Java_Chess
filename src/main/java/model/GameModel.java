package model;

import controller.GameController;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import model.pieces.*;
import view.GameLayout;
import view.MainLayout;

/*
Clasa responsabila pentru stocarea datelor.
 */

public class GameModel {

    static private boolean isSelected = false;
    static private Piece selectedPiece;
    public static boolean isIsSelected() {
        return isSelected;
    }
    public static void setIsSelected(boolean isSelected) {
        GameModel.isSelected = isSelected;
    }
    public static Piece getSelectedPiece() {
        return selectedPiece;
    }
    public static void setSelectedPiece(Piece selectedPiece) {
        GameModel.selectedPiece = selectedPiece;
    }

    public static void addPieces(int x, int y, Tile tile){
        if(x==0 && y==0){
            Tower blackTower = new Tower(false, tile);
            tile.setPiece(blackTower);
        }else if(x==0 && y==1){
            Knight blackKnight = new Knight(false, tile);
            tile.setPiece(blackKnight);
        }else if(x==0 && y==2){
            Bishop blackBishop = new Bishop(false, tile);
            tile.setPiece(blackBishop);
        }else if(x==0 && y==3){
            King blackKing = new King(false, tile);
            tile.setPiece(blackKing);
        }else if(x==0 && y==4){
            Queen blackQueen = new Queen(false, tile);
            tile.setPiece(blackQueen);
        }else if(x==0 && y==5){
            Bishop blackBishop = new Bishop(false, tile);
            tile.setPiece(blackBishop);
        }else if(x==0 && y==6){
            Knight blackKnight = new Knight(false, tile);
            tile.setPiece(blackKnight);
        }else if(x==0 && y==7){
            Tower blackTower = new Tower(false, tile);
            tile.setPiece(blackTower);
        }else if(x==1){
            Pawn blackPawn = new Pawn(false, tile);
            tile.setPiece(blackPawn);
        }else if(x == 6){
            Pawn whitePawn = new Pawn(true, tile);
            tile.setPiece(whitePawn);
        }else if(x==7 && y==0){
            Tower whiteTower = new Tower(true, tile);
            tile.setPiece(whiteTower);
        }else if(x==7 && y==1){
            Knight whiteKnight = new Knight(true, tile);
            tile.setPiece(whiteKnight);
        }else if(x==7 && y==2){
            Bishop whiteBishop = new Bishop(true, tile);
            tile.setPiece(whiteBishop);
        }else if(x==7 && y==3){
            King whiteKing = new King(true, tile);
            tile.setPiece(whiteKing);
        }else if(x==7 && y==4){
            Queen whiteQueen = new Queen(true, tile);
            tile.setPiece(whiteQueen);
        }else if(x==7 && y==5){
            Bishop whiteBishop = new Bishop(true, tile);
            tile.setPiece(whiteBishop);
        }else if(x==7 && y==6){
            Knight whiteKnight = new Knight(true, tile);
            tile.setPiece(whiteKnight);
        }else if(x==7 && y==7){
            Tower whiteTower = new Tower(true, tile);
            tile.setPiece(whiteTower);
        }
    }

    private GameModel(){}
}
