package pieces;

import repository.Board;
import repository.Piece;
import repository.Spot;

public class Tower extends Piece {
    public Tower(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
