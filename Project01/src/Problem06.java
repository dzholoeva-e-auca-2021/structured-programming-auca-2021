import processing.core.*;

public class Problem06 extends PApplet {
    float alpha;
    float beta;
    final float Num_of_circles = 50;
    float r = height / 10f;
    float comp = 5;
    float dr = r / Num_of_circles;
    float dComp = 255 / Num_of_circles;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha = random(0, 2 * PI);
        r = height / 10f;
         comp = 5;
         dr = r / Num_of_circles;
         dComp = 255 / Num_of_circles;
    }



    public void draw() {
        background(0, 0, 0);

        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(alpha);
        alpha += 0.05f;
        beta += 0.1f;


        comp = 0;
        r = height/10f;
        for (int i = 0; i < Num_of_circles; i++) {
            r -= dr;
            comp += dComp;
            fill(comp, comp, 0);
            circle(0, 0, r);
        }

        translate(150, 0);
        fill(0, 0, comp);
        circle(0, 0, 50);

        for (int i = 0; i < Num_of_circles; i++) {
            r -= dr;
            comp += dComp;
        }


        rotate(beta);
        translate(80, 0);
        fill(255);
        circle(0, 0, 10);

        for (int i = 0; i < Num_of_circles; i++) {
            r -= dr;
            comp += dComp;
        }


        popMatrix();
        textSize(36);
        textAlign(CENTER, CENTER);
        text("Planets", width / 2f, 100);


    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}