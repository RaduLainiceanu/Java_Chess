package repository;
//An abstract class to represent common functionality of all chess pieces:

import graphic.GameLayout;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Piece {

    private boolean killed = false;
    private boolean white = false;
    private int[] coord  = new int[]{0, 0};
    protected String pieceName = "generic piece";

    public Piece(boolean white, int x, int y, Tile tile) {
        this.setCoord(x, y);
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

    public abstract boolean canMove(Board board, Spot start, Spot end);

    public int[] getCoord() {
        return coord;
    }

    public void setCoord(int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }
}

