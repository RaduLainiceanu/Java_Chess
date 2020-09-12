package repository;

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pieces.*;
import repository.Piece;

import java.util.ArrayList;

public class PieceController {

    public static void addPart(int x, int y, GameLayout.Tile tile){
        if(x==0 && y==0){
            Tower blackTower = new Tower(false, x, y, tile);
            tile.setPiece(blackTower);
        }else if(x==0 && y==1){
            Knight blackKnight = new Knight(false, x, y, tile);
            tile.setPiece(blackKnight);
        }else if(x==0 && y==2){
            Bishop blackBishop = new Bishop(false, x, y, tile);
            tile.setPiece(blackBishop);
        }else if(x==0 && y==3){
            King blackKing = new King(false, x, y, tile);
            tile.setPiece(blackKing);
        }else if(x==0 && y==4){
            Queen blackQueen = new Queen(false, x, y, tile);
            tile.setPiece(blackQueen);
        }else if(x==0 && y==5){
            Bishop blackBishop = new Bishop(false, x, y, tile);
            tile.setPiece(blackBishop);
        }else if(x==0 && y==6){
            Knight blackKnight = new Knight(false, x, y, tile);
            tile.setPiece(blackKnight);
        }else if(x==0 && y==7){
            Tower blackTower = new Tower(false, x, y, tile);
            tile.setPiece(blackTower);
        }else if(x==1){
            Pawn blackPawn = new Pawn(false, x, y, tile);
            tile.setPiece(blackPawn);
        }else if(x == 6){
            Pawn whitePawn = new Pawn(true, x, y, tile);
            tile.setPiece(whitePawn);
        }else if(x==7 && y==0){
            Tower whiteTower = new Tower(true, x, y, tile);
            tile.setPiece(whiteTower);
        }else if(x==7 && y==1){
            Knight whiteKnight = new Knight(true, x, y, tile);
            tile.setPiece(whiteKnight);
        }else if(x==7 && y==2){
            Bishop whiteBishop = new Bishop(true, x, y, tile);
            tile.setPiece(whiteBishop);
        }else if(x==7 && y==3){
            King whiteKing = new King(true, x, y, tile);
            tile.setPiece(whiteKing);
        }else if(x==7 && y==4){
            Queen whiteQueen = new Queen(true, x, y, tile);
            tile.setPiece(whiteQueen);
        }else if(x==7 && y==5){
            Bishop whiteBishop = new Bishop(true, x, y, tile);
            tile.setPiece(whiteBishop);
        }else if(x==7 && y==6){
            Knight whiteKnight = new Knight(true, x, y, tile);
            tile.setPiece(whiteKnight);
        }else if(x==7 && y==7){
            Tower whiteTower = new Tower(true, x, y, tile);
            tile.setPiece(whiteTower);
        }
    }

    private PieceController(){}
}
