import processing.core.*;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);

        drawStar(width/2, height/2f, height/3f, 255f, 0f, 0f );
        drawStar(width/6, height/6f, height/8f, 255f, 255f, 0f );
        drawStar(width - width/6, height/6f, height/8f, 255f, 255f, 0f );
        drawStar(width/6, height/6f, height/8f, 255f, 255f, 0f );
    }

    private void drawStar(float centerX, float centerY, float r, float red, float green, float blue) {
        pushMatrix();

        int n = 8;
        float alpha = 0;
        float dAlpha = 2*PI/8;


        translate(centerX,centerY);
        stroke(red, green, blue);

        float prevX = 0;
        float prevY = 0;
        for (int i=0; i<=n; i++) {
            float curR = r;
            if (i%2==0) {
                curR /= 4;
            }
            float x = curR * cos(alpha);
            float y = curR * sin(alpha);
            line(0, 0, x, y);
             prevX = x;
             prevY = y;
            line(prevX, prevY, x, y);

            alpha += dAlpha;
        }
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}