import java.util.Scanner;

public class Chess {
    private Piece[][] board; // 8x8 board of chess pieces

    public Chess() {
        board = new Piece[8][8]; // instantiate the board to 8x8

        board[0][0] = new Pawn(true);

        for  (int col = 0; col < 8; col++ ) {
            board[1][col] = new Pawn( true);
            board[7][col] = new Pawn( true);


        }


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
    public String getPlayerMove () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start square:");
        String start = input.nextLine();
        System.out.println("Enter start square:");
        String end = input.nextLine();
        return (start+end).toUpperCase();
    }

    public void haveYourGo() {
        // get input from player
        String move = getPlayerMove();
        // check move is allowed
        //1. break move into start and end
        int startRow = chessRowtoInt(move.charAt(1));
        int startCol = chessColtoInt(move.charAt(2));
        int endRow = chessRowtoInt(move.charAt(3));
        int endCol = chessColtoInt(move.charAt(2));
        System.out.println("Start r"+startRow+"c"+startCol+"end r" );
        //2. check there is a piece at that start pos
        if (board)[startRow][startCol] != null) {
        //3. check the move rules for that piece
            Piece pieceToMove = board[startRow][startCol];
            if (pieceToMove.isValidMove()) {
                board[endRow][endCol] = pieceToMove;
                board[startRow][startCol] = null;
            }
        //3.5 TODO check about capturing pieces
    }
        //4. Update Board
        display();

    }
    // convert char '1' to int 0
    private int chessRowtoInt(char chessRow) {
        return Integer.parseInt(character.toString(chessRow));

    }
    // convert char 'A' to int 0
    private int chessColtoInt(char chessCol) {
        int ascii =  (int)chessCol;
        return ascii - (int)'A';
    }
}
