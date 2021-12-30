import processing.core.*;

public class Problem08 extends PApplet {
    
    public void settings() {
        fullScreen();


    }

    public void setup() {
        drawStar();
    }

    private void drawStar(float centerX, float centerY) {
        float n = 2 * rays;
        float alpha = 0;
        float dAlpha = 2 * PI / n;


        stroke(red, green, blue);
        translate(centerX, centerY);
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

    public void draw() {
       
    }
    public static void main(String[] args) {
        PApplet.main("Problem08");
    }

}



