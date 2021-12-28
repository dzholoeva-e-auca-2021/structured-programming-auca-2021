import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDTH = 500;
    static final float RECT_HEIGHT = 100;
    float white = 255;
    float red = 255;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(30);
        textAlign(CENTER);
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);

        float rectTopLeftX = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY = height / 4f - RECT_HEIGHT / 2f;
        float rectMidX = width / 2f - RECT_WIDTH / 2f;
        float rectMidY = height / 2.6f - RECT_HEIGHT / 2f;
        float rectLowX = width / 2f - RECT_WIDTH / 2f;
        float rectLowY = height / 1.91f - RECT_HEIGHT / 2f;

        float textLowX = width / 2f;
        float textLowY = height / 1.1f;

        stroke(73, 113, 222);
        fill(0, 0, 255);
        rect(rectTopLeftX, rectTopLeftY, RECT_WIDTH, RECT_HEIGHT);
        text("Java Programming Language", rectTopLeftX / 2f, rectTopLeftY / 2f);

        stroke(73, 113, 222);
        fill(0, 0, 255);
        rect(rectMidX, rectMidY, RECT_WIDTH, RECT_HEIGHT);
        text("Kotlin Programming Language", rectMidX / 2f, rectMidY / 2f);
        if (mouseX == rectMidX && mouseY == rectMidY) {
            fill(red, 0, 0);

            fill(255,255,0);
            text("Year: 2011. PYPL Index:11.", textLowX, textLowY);

        } else {
            fill(white);

            stroke(73, 113, 222);
            fill(0, 0, 255);
            rect(rectLowX, rectLowY, RECT_WIDTH, RECT_HEIGHT);
            text("Scala Programming Language", rectLowX / 2f, rectLowY / 2f);
            if (mouseX == rectLowX && mouseY == rectLowY) {
                fill(red, 0, 0);
                text("Year: 2011. PYPL Index:11.", textLowX, textLowY);
            } else {
                fill(white);

                fill(0, 0, 100);
                ellipse(mouseX, mouseY, 50, 50);


            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}