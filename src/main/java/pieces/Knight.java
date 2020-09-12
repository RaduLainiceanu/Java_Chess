package pieces;

import repository.Board;
import repository.Piece;
import repository.Spot;

public class Knight extends Piece {
    public Knight(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
