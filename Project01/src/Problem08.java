import processing.core.*;

public class Problem08 extends PApplet {
    float rays;
    float red;
    float blue;
    float green;
    public void settings() {
        fullScreen();


    }

    public void setup() {
        textSize(30);

    }

    public void draw() {
        background(0);
        fill(255,0,0);
        text("Red", width/6f, height/3f);

        fill(0,255,0);
        text("Green", width/6f, height/2f);

        fill(0,0,255);
        text("Blue", width/6f, height/1.5f);

        fill(255,255,0);
        text("12:5", width/1.1f, height/3f);

        fill(255,255,0);
        text("18:7", width/1.1f, height/2f);

        fill(255,255,0);
        text("23:11", width/1.1f, height/1.5f);

        stroke(255,255,0);
        noFill();
        square(width/1.1f-width/20f, height/3f, 30);
        if(mousePressed){
            fill(255,255,0);
        }

        stroke(255,255,0);
        noFill();
        square(width/1.1f-width/20f, height/2f, 30);
        if(mousePressed){
            fill(255,255,0);
        }

        stroke(255,255,0);
        noFill();
        square(width/1.1f-width/20f, height/1.5f, 30);
        if(mousePressed){
            fill(255,255,0);
        }

        stroke(255,0,0);
        noFill();
        square(width/4f-width/20f, height/3f, 30);
        if(mousePressed){
            fill(255,0,0);
        }

        stroke(0,255,0);
        noFill();
        square(width/4f-width/20f, height/2f, 30);
        if(mousePressed){
            fill(0,255,0);
        }

        stroke(0,0,255);
        noFill();
        square(width/4f-width/20f, height/1.5f, 30);

        translate(width/2f, height/2f);
        drawStar(100, red, green, blue);
    }

    private void drawStar( float r, float red, float green, float blue) {
        float n = 2 * rays;
        float alpha = 0;
        float dAlpha = 2 * PI / n;


        stroke(red, green, blue);
        float prevX = 0;
        float prevY = 0;
        for (int i = 0; i <= n; i++) {
            float curR = r;
            if (i % 2 == 1) {
                curR /= 4;
            }
            float x = curR * cos(alpha);
            float y = curR * sin(alpha);
            line(0, 0, x, y);

            line(prevX, prevY, x, y);
            prevX = x;
            prevY = y;
            alpha += dAlpha;

        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem08");
    }

}



