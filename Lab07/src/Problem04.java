import java.util.Random;

public class Problem04 {
    static int[][] gameBoard = new int[4][4];
    static final int NUM_OF_SHUFFLE_MOVES = 3;
    static int emptyRow ;
    static int emptyCol ;
    static Random rnd = new Random();
    public static void main(String[] args) {
        initBoard();
        printBoard();
        shuffleBoard();
    }

    private static void shuffleBoard() {
        int nMove = 0;
        while (nMove <NUM_OF_SHUFFLE_MOVES) {
            int dir = rnd.nextInt(4);
            int dr = 0;
            int dc = 0;
            switch (dir) {
                case 0:
                    dr = -1;
                case 1:
                    dc = 1;
                case 2:
                    dr = 1;
                case 3:
                    dc = -1;
            }
            if(0<= emptyRow + dr && emptyRow + dr <4 && 0<= emptyCol + dc && emptyCol +dc < 0) {
            gameBoard[emptyRow][emptyCol] = gameBoard[emptyRow + dr][emptyCol + dc];

        }
    }

    private static void initBoard() {
        int curNumber = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                gameBoard[row][col] = curNumber;
                ++curNumber;
            }
        }
    }
    private static void printBoard() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if ( gameBoard[row][col] != 16) {
                    System.out.printf("%.3d", gameBoard[row][col]);
                } else {
                    System.out.println("    ");
                }
            }

            }
            System.out.println();
        }
    }
