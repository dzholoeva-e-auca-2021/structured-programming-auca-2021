import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
float size;
float squareX;
float squareY;
int boardWidth = 500;
int boardHeight = 500;
float boardX;
float boardY;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            String strSize = JOptionPane.showInputDialog("Enter board's size [4,12]: ");
            size = Float.parseFloat(strSize);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
        System.exit(1);
    }

        if (size<4 || size > 12) {
        JOptionPane.showMessageDialog(null, "Incorrect number");
        System.exit(1);
    }
        squareX = boardWidth / size ;
        squareY = boardHeight / size;
        boardX = width/3f;
        boardY = height/1.5f;
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if ((i + j + 1) % 2 == 0) {
                    fill(255, 255, 255);
                } else {
                    fill(0, 0, 0);
                }
                boardWidth ++;
                boardHeight++;
                rect(i * squareX, j * squareY, (i + 1) * squareX, (j + 1) * squareY);
            }
        }
        }
    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}