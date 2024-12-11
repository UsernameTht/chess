public class Piece {
    private boolean isBlack;
    protected char symbol;

    public Piece(boolean isBlack) {
        this.isBlack = isBlack;
        symbol= 'x'; //should never actually appear on the board

    }

    public String toString() {
        if (isBlack) {
            return Character.toString(symbol).toUpperCase();
        }
        else {
            return Character.toString(symbol).toLowerCase();

        }

    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        // move at most 1 square in any direction
    }
}
