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
    int score;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width /2f ;
        circleY = height/2f ;
        circleR = height/20f;
        boardTopX = width/5.5f;
        boardTopY = height/6f;
        boardLowX = width/1.2f;
        boardLowY = height/1.25f;
        pointX = random(boardTopX, boardLowX);
        pointY = random(boardTopY, boardLowY);
        frameRate(10);

    }

    public void draw() {
        fill (0,0,0,50);
        rect(0,0,width,height);

        fill(0,255,0);
        textAlign(CENTER, CENTER);
        textSize(25);
        text("Game: Collect Yellow Circles using Arrow Buttons", width/2f, height/10f);
        text("Score:", width/2f, height/1.05f);
        text(score, (width/2f + width/20f), height/1.05f);
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
            for (float i = boardTopX; i < boardLowX; i+=circleR) {
                line(i, boardTopY, i, boardLowY);
            }
            stroke(0, 0, 100);
            for (float i = boardTopY; i < boardLowY; i+=circleR) {
                line(boardTopX, i , boardLowX, i);
            }
            stroke(0, 0, 255);
            for (float i = boardTopX; i < boardLowX; i += 4*circleR) {
                line(i , boardTopY, i , boardLowY);
            }
            stroke(0, 0, 255);
            for (float i = boardTopY; i < boardLowY; i += 4*circleR) {
                line(boardTopX, i , boardLowX, i );
            }
            circleX += dx;
            circleY += dy;

            if (circleX >= boardLowX) {
                circleX = boardLowX - circleR/2;
                dx = -dx;
            }
            if (circleX <= boardTopX) {
                circleX = boardTopX + circleR/2;
                dx = -dx;
            }
            if (circleY >= boardLowY) {
                circleY = boardLowY - circleR/2;
                dy = -dy;
            }
            if (circleY <= boardTopY) {
                circleY = boardTopY + circleR/2;
                dy = -dy;
            }
            if (circleX >= pointX && circleX <= pointX + circleR &&
                    circleY >= pointY && circleY <= pointY + circleR) {
                pointX = pointA;
                pointY = pointB;
                pointA = random(boardTopX, boardLowX);
                pointB = random(boardTopY, boardLowY);
                score++;
            }
            if (circleX >= pointA && circleX <= pointA + circleR &&
                    circleY >= pointB && circleY <= pointB + circleR) {
                pointA = pointX;
                pointB = pointY;
                pointA = random(boardTopX, boardLowX);
                pointB = random(boardTopY, boardLowY);
                score++;
            }
        }
    }
        public static void main (String[]args){
            PApplet.main("Problem04");
        }

    }
