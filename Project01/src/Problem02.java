import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float a;
    float b;
    float s;
    float t;
    float n;
    float m;
    float dx;
    float dy;
    float da;
    float db;
    float dt;
    float ds;
    public void settings() {
        fullScreen();
    }

    public void setup() {
         x = width/2f;
         y = height/2f;
        a = width/2f -40;
        b = height/2f - 40;
        s = width/2f - 80;
        t = height/2f - 80;
        n = random(3.5f , 10.5f);
        m = random(2.5f, 5.5f);
         dx = n;
         dy = m;
        da = n;
        db = m;
        ds =n;
        dt =m;
    }

    public void draw() {
        background(0, 0, 0);
        print (x);
        fill(0, 255, 0);
        circle(a, b, 50);
        a+=da;
        b+=db;
        fill(0, 0, 255);
        circle(s, t, 50);
        s+=ds;
        t+=dt;
        fill(255,0,0);
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
            a = width - 1;
            da = -da ;
        }
        if (a<0) {
            a = 0;
            da = -da ;
        }
        if (b>=height) {
            b = height - 1;
            db = -db ;
        }
        if (b<0) {
            b = 0;
            db = -db ;
        }
        if (s>=width) {
            s = width - 1;
            ds = -ds ;
        }
        if (s<0) {
            s = 0;
            ds = -ds ;
        }
        if (t>=height) {
            t = height - 1;
            dt = -dt ;
        }
        if (t<0) {
            t = 0;
            dt = -dt ;
    }

        }
    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}