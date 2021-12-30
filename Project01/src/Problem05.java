import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
    float size;
    float squareX;
    float squareY;
    int boardWidth = 650;
    int boardHeight = 650;
    float boardLeftX;
    float boardRightX;
    float boardTopY;
    float boardLowY;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            String strSize = JOptionPane.showInputDialog("Enter board's size [4,12]: ");
            size = Float.parseFloat(strSize);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }

        if (size < 4 || size > 12) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }
        squareX = boardWidth / size;
        squareY = boardHeight / size;
        boardLeftX = width / 4f;
        boardRightX = width / 8f;
        boardTopY = height / 11f;
        boardLowY = height / 1.5f;
    }


    public void draw() {
        background(0, 0, 0);
        fill(255);
        rect(boardLeftX, boardTopY, boardWidth, boardHeight);
        {
            for (float i = boardLeftX; i < boardRightX; i += squareX) {
                for (float i = boardTopY; i < boardLowY; i += squareY) {

                    if (i % 2 == 0) {
                        fill(255);
                    } else {
                        fill(0);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}