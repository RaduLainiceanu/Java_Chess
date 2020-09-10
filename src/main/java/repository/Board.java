package repository;

public class Board {
    Spot[][] boxes;

    public Board(Spot[][] boxes) {
        this.boxes = boxes;
    }
    public Spot getBox(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7){
            throw new Exception("Index out of Bound");
        }
        return boxes[x][y];
    }
}
