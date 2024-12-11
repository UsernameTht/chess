public class Chess {
    private Piece[][] board; // 8x8 board of chess pieces

    public Chess() {
        board = new Piece[8][8]; // instantiate the board to 8x8

        board[0][0] = new Pawn(true);

        for  (int col = 0; )


    }

    public void display() {
        for (int row = 7; row >=0; row--) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] != null) {
                    System.out.println(board[row][col] + "");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
