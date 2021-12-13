import processing.core.*;

public class Problem06 extends PApplet {
float alpha;
float beta;
final float Num_of_circles = 50;
    float r = height / 2f;
    float comp = 5;
    float dr = r / Num_of_circles;
    float dComp = 255 / Num_of_circles;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha=random(0, 2*PI);
    }

    public void draw() {
        background(0, 0, 0);

        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(alpha);
        alpha += 0.05f;
        beta += 0.1f;

       fill(50,0,0);
        circle(CENTER, CENTER, r);


            translate(150, 0);
            circle(0, 0, 50);

            rotate(beta);
            translate(80, 0);
            circle(0, 0, 10);

            popMatrix();
            textSize(36);
            textAlign(CENTER, CENTER);
            text("Planets", width / 2f, 100);


        }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}