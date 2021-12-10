import processing.core.*;

import java.util.Random;

public class Problem03 extends PApplet {
    static final float RECT_WIDTH = 400;
    static final float RECT_HEIGHT= 200;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(40);
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 100);
        ellipse(mouseX, mouseY, 50, 50);
        fill(0, 0, 255);
        float rectTopLeftX = width/2f - RECT_WIDTH/2f;
        float rectTopLeftY = height/2f - RECT_HEIGHT/2f;
        rect(rectTopLeftX, rectTopLeftY, RECT_WIDTH, RECT_HEIGHT);
        fill(255,255,0);
        text("mouseX: " + mouseX, width/2f, height/2f);
        text("mouseY: " + mouseY, width/2f, height/2f + height/30f);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}