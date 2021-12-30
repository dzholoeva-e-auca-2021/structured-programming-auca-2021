import processing.core.*;

import java.util.Random;

public class Problem01 extends PApplet {
    int nMoves = 0;
    static int[][] gameBoard = new int[4][4];
float NUM_OF_SHUFFLE_MOVES = 3;
float squareX = width/1.1f;
float squareY = height/1.1f;
int emptyRow;
int emptyCol;
    static Random rnd = new Random();
    public void settings() {
        fullScreen();


    }

    public void setup() {
        background(0);

        printBoard(squareX, squareY);

        if (keyPressed && key == CODED) {
                System.out.println("Some key pressed");
                shuffleBoard();
            }
        }

    private void shuffleBoard() {
        int nMove = 0;
        while (nMove < NUM_OF_SHUFFLE_MOVES) {
            int dir = rnd.nextInt(4);
            int dr = 0;
            int dc = 0;
            switch (dir) {
                case 0:
                    dr = -1;
                    break;
                case 1:
                    dc = 1;
                    break;
                case 2:
                    dr = 1;
                    break;
                case 3:
                    dc = -1;
                    break;
            }
            if (0 <= emptyRow + dr && emptyRow + dr < 4 && 0 <= emptyCol + dc && emptyCol + dc < 0) {
                gameBoard[emptyRow][emptyCol] = gameBoard[emptyRow + dr][emptyCol + dc];
                emptyRow += dr;
                emptyCol += dc;
                gameBoard[emptyRow][emptyCol] = 16;
                ++nMove;
            }
        }
    }

    public void keyReleased () {
            shuffleBoard();

        }

        public void mouseReleased () {
                shuffleBoard();
            }

    public void draw() {
        fill(255, 255, 0);
        textSize(40);
        text("Game 15", width / 2.5f, height / 8f);

        fill(255, 255, 0);
        textSize(20);
        text("Start/Restart: Enter", width / 2.5f, height / 1.1f);

        fill(255, 255, 0);
        textSize(20);
        text("Moves:", width / 1.5f, height / 2f);

        fill(255, 255, 0);
        textSize(20);
        text(nMoves, width / 1.35f, height / 2f);

        printBoard(squareX, squareY);

    }
    private void printBoard(float squareX, float squareY){

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (gameBoard[row][col] != 16) {

                    fill(0,0,255);
                    stroke(140);
                   rect(squareX, squareY, 100, 100);

                }
            }
        }
    }


    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}


