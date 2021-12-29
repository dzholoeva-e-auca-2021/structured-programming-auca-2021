import processing.core.*;

public class Problem06 extends PApplet {
float alpha;
float beta;
float gamma;
float RECT_WIDTH = 175;
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
        beta = random(0,2*PI);
        gamma = random(0, 2*PI);
        textAlign(CENTER, CENTER);
        textSize(30);

        {
            float radius_sun = 150;
            PShape rad_sun = createShape();
            rad_sun.beginShape();
            rad_sun.stroke(255,0,0);
            rad_sun.ellipse(CENTER, CENTER, radius_sun, radius_sun);
        }
    }

    public void draw() {
        background(0, 0, 0);
                float radius_sun = 150;
        float radius_venus = 70;
        float radius_moon = 30;
        float radius_earth = 70;
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

        for (int i = 0; i < Num_of_circles; i++) {
            noStroke();
            comp += dComp;
            radius_sun -= dr1;
            fill(comp, comp, 0);
            circle(0, 0, radius_sun);
        }
        comp = 5;
        translate(150, 0);
            for (int i = 0; i < Num_of_circles; i++) {
                noStroke();
                comp += dComp;
                radius_venus -= dr2;
                fill(0, comp, comp);
                circle(0, 0, radius_venus);
            }
            comp = 5;
            translate(100, 0);
            for (int i = 0; i < Num_of_circles; i++) {
            noStroke();
            comp += dComp;
            float dr3 = radius_earth / Num_of_circles;
            radius_earth -= dr3;
            fill(0, 0, comp);
            circle(0, 0, radius_earth);

        }
        comp = 5;
        gamma += 0.07f;
        rotate(gamma);
        translate(50, 0);
        for (int i = 0; i < Num_of_circles; i++) {
                comp += dComp;
                fill(comp);
                radius_moon -= dr4;
                circle(0, 0, radius_moon);
            }

            popMatrix();

            float rectSunX = width / 1.2f - RECT_WIDTH / 2f;
            float rectSunY = height / 10f - RECT_HEIGHT / 2f;
            float rectVenusX = width / 1.2f - RECT_WIDTH / 2f;
            float rectVenusY = height / 5.81f - RECT_HEIGHT / 2f;
            float rectEarthX = width / 1.2f - RECT_WIDTH / 2f;
            float rectEarthY = height / 4.14f - RECT_HEIGHT / 2f;
            float rectMoonX = width / 1.2f - RECT_WIDTH / 2f;
            float rectMoonY = height / 3.28f - RECT_HEIGHT / 2f;

        {
            stroke(255);
            fill(0, 0, 255);
            rect(rectSunX, rectSunY, RECT_WIDTH, RECT_HEIGHT);

            fill(red, green, blue);
            text("Sun", rectSunX + width / 15f, rectSunY + height / 35f);
            if (mouseX >= rectSunX && mouseX <= (rectSunX + RECT_WIDTH) &&
                    mouseY >= rectSunY && mouseY <= (rectSunY + RECT_HEIGHT)) {
                fill(255, 0, 0);
                text("Sun", rectSunX + width / 15f, rectSunY + height / 35f);

                stroke(255,0,0);
                circle(CENTER, CENTER, radius_sun);

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
            text("Venus", rectVenusX + width / 15f, rectVenusY + height / 30f);
            if (mouseX >= rectVenusX  && mouseX <= (rectVenusX + RECT_WIDTH) &&
                    mouseY >= rectVenusY && mouseY <= (rectVenusY + RECT_HEIGHT)) {
                fill(255, 0, 0);
                text("Venus", rectVenusX + width / 15f, rectVenusY + height / 30f);

                stroke(255, 0, 0);
                circle(CENTER, CENTER, radius_venus);

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
                text("Earth", rectEarthX + width/15f, rectEarthY + height / 30f);
                if (mouseX >= rectEarthX && mouseX <= (rectEarthX + RECT_WIDTH) &&
                        mouseY >= rectEarthY && mouseY <= (rectEarthY + RECT_HEIGHT)) {
                    fill(255,0,0);
                    text("Earth", rectEarthX+width/15f, rectEarthY + height / 30f);


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
                text("Moon", rectMoonX + width/15f, rectMoonY + height / 31f);
                if (mouseX >= rectMoonX && mouseX <= (rectMoonX + RECT_WIDTH) &&
                        mouseY >= rectMoonY && mouseY <= (rectMoonY + RECT_HEIGHT)) {
                    fill(255,0,0);
                    text("Moon", rectMoonX + width/15f, rectMoonY + height / 31f);

                } else {
                    red = 255;
                    green = 255;
                    blue = 255;
                }
            }
            circle.setStroke(255,0,0);


            circle(CENTER, CENTER, radius_sun);
        }
        public static void main (String[]args){
            PApplet.main("Problem06");
        }

}