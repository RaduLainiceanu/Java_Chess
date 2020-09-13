package repository;
//An abstract class to represent common functionality of all chess pieces:

import javafx.scene.image.Image;

public abstract class Piece {

    private boolean killed = false;
    private boolean white = false;
    private int[] coord  = new int[]{0, 0};
    protected String pieceName = "generic piece";
    private String imgUrl = "";

    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Piece(boolean white, int x, int y, Tile tile) {
        this.setCoordonates(x, y);
        this.white = white;
    }

    public void sayType(){
        System.out.println(this.pieceName);
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

    public int[] getCoord() {
        return coord;
    }

    public void setCoordonates(int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }
}

