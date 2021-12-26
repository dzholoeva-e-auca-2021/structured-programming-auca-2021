public class printBoard {
    static int[][] gameBoard = new int[4][4];

    {
        for (int row = 0; row < 4; row++) {

            for (int col = 0; col < 4; col++) {
                if (gameBoard[row][col] != 16) {
                    System.out.printf("%.3d", gameBoard[row][col]);
                } else {
                    System.out.println("    ");
                }
            }
        }
    }
}
