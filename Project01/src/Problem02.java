import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float a;
    float b;
    float dx;
    float dy;
    float da;
    float db;
    public void settings() {
        fullScreen();
    }

    public void setup() {
         x = width/2f;
         y = height/2f;
        a = width/2f ;
        b = height/2f;
         dx = 2.5f;
         dy =1.5f;
        da = 2.5f;
        db =1.5f;
    }

    public void draw() {
        background(0, 0, 0);
        print (x);
        fill(255, 0, 0);
        circle(a, b, 50);
        a+=da - 1;
        b+=db - 1;
        fill(255,255,0);
        circle(x,y,50);
        x+=dx;
        y+=dy;

        if (x>=width) {
            x = width - 1;
            dx = -dx ;
        }
        if (x<0) {
            x = 0;
            dx = -dx ;
        }
        if (y>=height) {
            y = height - 1;
            dy = -dy ;
        }
        if (y<0) {
            y = 0;
            dy = -dy ;
        }
        if (a>=width) {
            a = width -1;
            da = -da ;
        }
        if (a<0) {
            a = 0;
            da = -da ;
        }
        if (b>=height) {
            b = height -1;
            db = -db ;
        }
        if (b<0) {
            b = 0;
            db = -db ;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}