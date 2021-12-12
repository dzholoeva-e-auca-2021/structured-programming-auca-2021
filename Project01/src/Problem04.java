import processing.core.*;

public class Problem04 extends PApplet {
    float circleX;
    float circleY;
    float circleR;
    float pointX;
    float pointY;
    float dx;
    float dy;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width /2f ;
        circleY = height/2f ;
        circleR = height/20f;
        pointX = random(0, width);
        pointY = random(0, height);
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

                stroke(0, 0, 255);
            for (int i = 0; i < width; i++)
                line(i * circleR, 0, i * circleR, height);

            stroke(0, 0, 255);
            for (int i = 0; i < height; i++)
                line(0, i * circleR, width, i * circleR);

        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}