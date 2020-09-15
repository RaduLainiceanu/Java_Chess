package model.pieces;
//An abstract class to represent common functionality of all chess model.pieces:

import model.GameModel;

public abstract class Piece {

    private boolean killed = false;
    private boolean white = false;
    protected String pieceName = "generic piece";
    private String imgUrl = "";
    public int[][] movementRules = new int[][]{{1, 1}, {-1,-1}};

    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Piece(boolean white, GameModel.Tile tile) {
        this.white = white;
    }

    public void sayType(){
        System.out.println(this.pieceName);
    }
    public String getPieceName(){
        return this.pieceName;
    }

    public boolean isWhite() {
        return this.white == true;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isKilled() {
        return this.killed == true;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }
}

