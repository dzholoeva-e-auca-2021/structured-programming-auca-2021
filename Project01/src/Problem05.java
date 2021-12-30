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
    float row;
    float col;

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
        row = boardWidth / size;
        col = boardHeight / size;
    }


    public void draw() {
        background(0, 0, 0);
        fill(255);
        rect(boardLeftX, boardTopY, boardWidth, boardHeight);
        {
            while (squareY < boardLowY + boardHeight) {
                row += 2;

                }
            }
        }
    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}