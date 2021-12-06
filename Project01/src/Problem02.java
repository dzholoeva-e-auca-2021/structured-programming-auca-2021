import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float dx;
    public void settings() {
        fullScreen();
    }

    public void setup() {
         x = height/2f;
         y = width/2f;
         dx = 2.5f;
    }

    public void draw() {
        background(0, 0, 0);
        print (x);
        fill(255,255,0);
        circle(x,y,50);
        x+=2.5;
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}