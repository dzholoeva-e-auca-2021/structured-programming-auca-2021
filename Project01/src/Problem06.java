import processing.core.*;

public class Problem06 extends PApplet {
float alpha;
float beta;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha = random(0, 2 * PI);
    }

    public void draw() {
        background(0, 0, 0);

        final float Num_of_circles = 50;
        float radius_sun = 150;
        float radius_venus = height / 20f;
        float radius_earth = 70;
        float radius_moon = 30;
        float dr1 = radius_sun / Num_of_circles;
        float dr2 = radius_venus / Num_of_circles;
        float dr3 = radius_earth / Num_of_circles;
        float dr4 = radius_moon / Num_of_circles;
        float dComp = 255 / Num_of_circles;
        float comp = 5;



        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(alpha);
        alpha += 0.05f;
        beta += 0.1f;

        for (int i = 0; i < Num_of_circles; i++) {
            noStroke();
            radius_sun -= dr1;
            comp += dComp;
            fill(comp, comp, 0);
            circle(0, 0, radius_sun);
        }

        translate(200, 0);
        for (int i = 0; i < Num_of_circles; i++) {
            noStroke();
            radius_earth -= dr3;
            comp += dComp;
            fill(0, 0, comp);
            circle(0, 0, radius_earth);
        }
        {
            rotate(beta);
            translate(80, 0);

            for (int i = 0; i < Num_of_circles; i++) {
                noStroke();
                radius_moon -= dr4;
                comp += dComp;
                fill(comp);
                circle(0, 0, radius_moon);
            }
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