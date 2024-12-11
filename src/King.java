public class King extends Piece{
    public King(boolean isBlack) {
        super(isBlack);
        symbol = 'K';
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        // move at most 1 square in any direction
        boolean result = false;
        if((Math.abs(startRow-endRow <=1) && (Math.abs(startCol - endCol) <=1)) {
        result = true;
        }
        if (startRow == endRow && startCol == endCol) {
            result = true;
        }
        return result;
    }
}
