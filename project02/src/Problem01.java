import processing.core.*;

public class Problem01 extends PApplet {
    int nMoves = 0;
    static int[][] gameBoard = new int[4][4];
float squareX = width / 2f;
float squareY = height / 2f;
    public void settings() {
        fullScreen();


    }

    public void setup() {
        background(0);
        printBoard(squareX, squareY);
            if (keyPressed && key == CODED) {
                System.out.println("Some key pressed");
            }
        }

        public void keyReleased () {
            System.out.println("Key released");
            nMoves++;

        }

        public void mouseReleased () {
            System.out.println("Mouse released");
            nMoves++;

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
                   draw();
                   rect

                }
            }
        }
    }


    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}


