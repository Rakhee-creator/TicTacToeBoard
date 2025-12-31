import java.util.Scanner;

public class TicTacToeBoard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        boolean xTurn = true;  // track whose turn
        int moves = 0;

        while (moves < 9) {  // max 9 moves in TicTacToe
            if (xTurn) {
                System.out.println("Player X enter row and column (0-2): ");
            } else {
                System.out.println("Player O enter row and column (0-2): ");
            }

            int row = sc.nextInt();
            int col = sc.nextInt();

            // Check if cell is empty
            if (board[row][col] == '-') {
                board[row][col] = xTurn ? 'X' : 'O';
                moves++;
                xTurn = !xTurn; // switch turn
            } else {
                System.out.println("Cell already filled, try again!");
            }

            // Print board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}



