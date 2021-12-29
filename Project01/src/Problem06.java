import processing.core.*;

public class Problem06 extends PApplet {
float alpha;
float beta;
float gamma;
float RECT_WIDTH = 150;
float RECT_HEIGHT = 50;
float red;
float green;
float blue;
float Num_of_circles = 50;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha = random(0, 2 * PI);
        textAlign(CENTER, CENTER);

    }

    public void draw() {
        background(0, 0, 0);
                float radius_sun = 150;
        float radius_venus = 70;
        float radius_moon = 30;
        float radius_earth = 50;
        float dComp = 255 / Num_of_circles;
        float comp = 5;
        float dr4 = radius_moon / Num_of_circles;
        float dr2 = radius_venus / Num_of_circles;
        float dr1 = radius_sun / Num_of_circles;
        pushMatrix();

        translate(width / 2f, height / 2f);
        rotate(alpha);
        alpha += 0.05f;
        beta += 0.07f;
        gamma += 0.09f;

        for (int i = 0; i < Num_of_circles; i++) {
            noStroke();
            comp += dComp;
            radius_sun -= dr1;
            fill(comp, comp, 0);
            circle(0, 0, radius_sun);
        }
        translate(200, 0);
            for (int i = 0; i < Num_of_circles; i++) {
                noStroke();
                comp += dComp;
                radius_venus -= dr2;
                fill(0, 0, comp);
                circle(0, 0, radius_venus);
            }
            translate(100, 0);
            for (int i = 0; i < Num_of_circles; i++) {
            noStroke();
            comp += dComp;float
                    dr3 = radius_earth / Num_of_circles;
            radius_earth -= dr3;
            fill(0, 0, comp);
            circle(0, 0, radius_earth);

        }
        translate(80, 0);
        rotate(beta);
        for (int i = 0; i < Num_of_circles; i++) {
                comp += dComp;
                fill(comp);
                radius_moon -= dr4;
                circle(0, 0, radius_moon);
            }

            popMatrix();

            float rectSunX = width / 1.25f - RECT_WIDTH / 2f;
            float rectSunY = height / 4f - RECT_HEIGHT / 2f;
            float rectVenusX = width / 1.25f - RECT_WIDTH / 2f;
            float rectVenusY = height / 6f - RECT_HEIGHT / 2f;
            float rectEarthX = width / 1.25f - RECT_WIDTH / 2f;
            float rectEarthY = height / 8.5f - RECT_HEIGHT / 2f;
            float rectMoonX = width / 1.25f - RECT_WIDTH / 2f;
            float rectMoonY = height / 11f - RECT_HEIGHT / 2f;

            {
                stroke(73, 113, 222);
                fill(0, 0, 255);
                rect(rectSunX, rectSunY, RECT_WIDTH, RECT_HEIGHT);

                fill(red, green, blue);
                textSize(15);
                text("Sun", rectSunX, rectSunY - height / 50f);
                if (mouseX >= rectSunX && mouseX <= (rectSunX + RECT_WIDTH) &&
                        mouseY >= rectSunY && mouseY <= (rectSunY + RECT_HEIGHT)) {
                    red = 255;
                    green = 0;
                    blue = 0;


                } else {
                    red = 255;
                    green = 255;
                    blue = 255;
                }
            }
            {
                stroke(255);
                fill(0, 0, 255);
                rect(rectVenusX, rectVenusY, RECT_WIDTH, RECT_HEIGHT);

                fill(red, green, blue);
                textSize(15);
                text("Venus", rectVenusX, rectVenusY - height / 11f);
                if (mouseX >= rectVenusX && mouseX <= (rectVenusX + RECT_WIDTH) &&
                        mouseY >= rectVenusY && mouseY <= (rectVenusY + RECT_HEIGHT)) {

                    red = 255;
                    green = 0;
                    blue = 0;


                } else {
                    red = 255;
                    green = 255;
                    blue = 255;
                }
            }
            {
                stroke(255);
                fill(0, 0, 255);
                rect(rectEarthX, rectEarthY, RECT_WIDTH, RECT_HEIGHT);

                fill(red, green, blue);
                textSize(15);
                text("Earth", rectEarthX, rectEarthY - height / 6f);
                if (mouseX >= rectEarthX && mouseX <= (rectEarthX + RECT_WIDTH) &&
                        mouseY >= rectEarthY && mouseY <= (rectEarthY + RECT_HEIGHT)) {

                    red = 255;
                    green = 0;
                    blue = 0;


                } else {
                    red = 255;
                    green = 255;
                    blue = 255;
                }
            }
            {
                stroke(255);
                fill(0, 0, 255);
                rect(rectMoonX, rectMoonY, RECT_WIDTH, RECT_HEIGHT);

                fill(red, green, blue);
                textSize(15);
                text("Moon", rectMoonX, rectMoonY - height / 6f);
                if (mouseX >= rectMoonX && mouseX <= (rectMoonX + RECT_WIDTH) &&
                        mouseY >= rectMoonY && mouseY <= (rectMoonY + RECT_HEIGHT)) {

                    red = 255;
                    green = 0;
                    blue = 0;


                } else {
                    red = 255;
                    green = 255;
                    blue = 255;
                }
            }
        }
        public static void main (String[]args){
            PApplet.main("Problem06");
        }

}