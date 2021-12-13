import processing.core.*;

public class Problem06 extends PApplet {
float alpha;
float beta;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha=random(0, 2*PI);
    }

    public void draw() {
        background(0, 0, 0);

        pushMatrix();
        translate(width/2f, height/2f);
        rotate(alpha);
        stroke(255,0,0);
        strokeWeight(5);
        line(-50, 0, 50, 0);
        line(0,50,0,-50);
        alpha +=0.05f;
        beta +=0.1f;

        translate(150, 0);
        circle(0, 0, 50);

        rotate(beta);
        translate(80, 0);
        circle(0, 0, 10);

        popMatrix();
        textSize(36);
        textAlign(CENTER, CENTER);
        text("Planets",width/2f, 100  );

    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}