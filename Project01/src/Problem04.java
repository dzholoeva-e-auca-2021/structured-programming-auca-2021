import processing.core.*;

public class Problem04 extends PApplet {
    float circleX;
    float circleY;
    float circleR;
    float pointX;
    float pointY;
    float pointA;
    float pointB;
    float boardTopX;
    float boardTopY;
    float boardLowX;
    float boardLowY;
    float dx;
    float dy;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width /2f ;
        circleY = height/2f ;
        circleR = height/20f;
        boardTopX = width/6f;
        boardTopY = height/6f;
        boardLowX = width/1.5f;
        boardLowY = height/1.5f;
        pointX = random(boardTopX, boardLowX);
        pointY = random(boardTopY, boardLowY);
        frameRate(10);

    }

    public void draw() {
        fill(0, 0, 0, 50);
        rect(0, 0, width, height);

        fill(255, 255, 0);
        circle(pointX, pointY, circleR);

        fill(255, 0, 0);
        circle(circleX, circleY, circleR);

        if (key == CODED) {
            switch (keyCode) {
                case UP:
                    circleY -= circleR;
                    break;
                case DOWN:
                    circleY += circleR;
                    break;
                case LEFT:
                    circleX -= circleR;
                    break;
                case RIGHT:
                    circleX += circleR;
                    break;
            }

            stroke(0, 0, 100);
            for (float i = 0; i < boardLowX; i++) {
                line(i * circleR, 0, i * circleR, height);
            }
            stroke(0, 0, 100);
            for (int i = 0; i < boardLowY; i++) {
                line(0, i * circleR, width, i * circleR);
            }
            stroke(0, 0, 255);
            for (int i = 0; i < boardLowX; i += 4) {
                line(i * circleR, 0, i * circleR, height);
            }
            stroke(0, 0, 255);
            for (int i = 0; i < boardLowY; i += 4) {
                line(0, i * circleR, width, i * circleR);
            }
            circleX += dx;
            circleY += dy;

            if (circleX >= width) {
                circleX = width - 1;
                dx = -dx;
            }
            if (circleX <= 0) {
                circleX = 0;
                dx = -dx;
            }
            if (circleY >= height) {
                circleY = height - 1;
                dy = -dy;
            }
            if (circleY <= 0) {
                circleY = 0;
                dy = -dy;
            }
            if (circleX >= pointX && circleX <= pointX + circleR &&
                    circleY >= pointY && circleY <= pointY + circleR) {
                pointX = pointA;
                pointY = pointB;
                pointA = random(boardTopX, boardLowX);
                pointB = random(boardTopY, boardLowY);
            }
            if (circleX >= pointA && circleX <= pointA + circleR &&
                    circleY >= pointB && circleY <= pointB + circleR) {
                pointA = pointX;
                pointB = pointY;
                pointA = random(boardTopX, boardLowX);
                pointB = random(boardTopY, boardLowY);
            }
        }
    }
        public static void main (String[]args){
            PApplet.main("Problem04");
        }

    }
