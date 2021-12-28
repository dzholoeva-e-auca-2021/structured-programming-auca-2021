import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDTH = 500;
    static final float RECT_HEIGHT = 100;
    float red ;
    float green;
    float blue;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textAlign(CENTER,CENTER);

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

        fill(red, green, blue);
        textSize(31);
        text("Java Programming Language", rectTopLeftX * 1.5f + width / 20f, rectTopLeftY * 1.5f);
        if (mouseX >= rectTopLeftX && mouseX <= (rectTopLeftX + RECT_WIDTH) && mouseY >= rectTopLeftY && mouseY <= (rectTopLeftY + RECT_HEIGHT)) {
            red = 255;
            green = 0;
            blue = 0;

            fill(255, 255, 0);
            textSize(20);
            text("Year: 1995. PYPL Index:2.", textLowX, textLowY);
        } else {
            red = 255;
            green = 255;
            blue = 255;
        }

            stroke(73, 113, 222);
            fill(0, 0, 255);
            rect(rectMidX, rectMidY, RECT_WIDTH, RECT_HEIGHT);

            fill(red, green, blue);
            textSize(31);
            text("Kotlin Programming Language", rectMidX * 1.5f+ width/20f, rectMidY * 1.5f - height/12.25f);
            if (mouseX >= rectMidX && mouseX <= (rectMidX + RECT_WIDTH) && mouseY >= rectMidY && mouseY<=(rectMidY+RECT_HEIGHT)) {

                red = 255;
                green = 0;
                blue = 0;

            fill(255, 255, 0);
                textSize(20);
                text("Year: 2011. PYPL Index:11.", textLowX, textLowY);

            } else {
                red = 255;
                green = 255;
                blue = 255;
            }
                stroke(73, 113, 222);
                fill(0, 0, 255);
                rect(rectLowX, rectLowY, RECT_WIDTH, RECT_HEIGHT);

                fill(red, green, blue);
                textSize(31);
                text("Scala Programming Language", rectLowX * 1.5f+ width/20f, rectLowY * 1.5f - height/7f);
                if (mouseX >= rectLowX && mouseX <= (rectLowX + RECT_WIDTH) && mouseY >= rectLowY && mouseY<=(rectLowY+RECT_HEIGHT)) {

                    red = 255;
                    green = 0;
                    blue = 0;

                    fill(255,255,0);
                    textSize(20);
                    text("Year: 2004. PYPL Index:20.", textLowX, textLowY);
                } else {
                    red = 255;
                    green = 255;
                    blue = 255;
                }


                }
    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}