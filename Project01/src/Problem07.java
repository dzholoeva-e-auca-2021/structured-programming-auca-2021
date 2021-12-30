import processing.core.*;

import javax.swing.*;

public class Problem07 extends PApplet {
float stars;
float rays;
float alpha;
float beta;
    public void settings() {
        fullScreen();


    }

    public void setup() {
        textAlign(CENTER, CENTER);
        alpha = random(0, 2 * PI);
        beta = random(0,2*PI);
        try {
            String strNum = JOptionPane.showInputDialog("Number of stars [8,12]: ");
            stars = Float.parseFloat(strNum);
            String strRay = JOptionPane.showInputDialog("Number of rays {8,10,12}: ");
            rays = Float.parseFloat(strRay);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }
        if (stars < 8 || stars > 12) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
            if (rays != 8 || rays != 10 || rays != 12) {
                JOptionPane.showMessageDialog(null, "Incorrect number");
                System.exit(1);
            }
        }
    }

    public void draw() {
        background(0);
        alpha -= 0.08f;
        translate(width/2f, height/2f);
        rotate(alpha);
        drawStar( 0,0,rays,height/5f, 255f,0f,0f);

            for (int i = 1; i < stars; i++) {
                pushMatrix();
                rotate(beta);
                translate(250, 0);
                drawStar(0, 0, rays, height/25f, 0, 0, 255);
                beta += 2*PI/stars + 0.018;
                popMatrix();}
        }

    private void drawStar(float centerX, float centerY, float rays, float r, float red, float green, float blue) {
        pushMatrix();
        float alpha = 0;
        float dAlpha = 2 * PI /rays;

        translate(centerX, centerY);
        stroke(red, green, blue);
        float prevX = 0;
        float prevY = 0;
        for (int i = 0; i <= rays; i++) {
            float curR = r;
            if (i % 2 == 1) {
                curR /= 4;
            }
            float x = curR * cos(alpha);
            float y = curR * sin(alpha);
            line(0, 0, x, y);
            alpha += dAlpha;

            line(prevX, prevY, x, y);
            prevX = x;
            prevY = y;

        }
        popMatrix();
    }
    public static void main(String[] args) {
        PApplet.main("Problem07");
    }

}


