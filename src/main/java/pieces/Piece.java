package pieces;

public abstract class Piece {
    int[] move(int x, int y){
        return null;
    }

    boolean setWhite(boolean isWhite){
        return true;
    }
    boolean setBlack(boolean isBlack){
        return true;
    }

    //UN COMENTARIU DE TEST

    /*
    public abstract class Piece {

    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white)
    {
        this.setWhite(white);
    }

    public boolean isWhite()
    {
        return this.white == true;
    }

    public void setWhite(boolean white)
    {
        this.white = white;
    }

    public boolean isKilled()
    {
        return this.killed == true;
    }

    public void setKilled(boolean killed)
    {
        this.killed = killed;
    }

    public abstract boolean canMove(Board board,
                                 Spot start, Spot end);
}
    * */
}
