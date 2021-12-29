import processing.core.*;

import javax.swing.*;

public class Problem07 extends PApplet {
float stars;
float rays;
    public void settings() {
        fullScreen();


    }

    public void setup() {
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
        drawStar();

    }

    private void drawStar(float number, float rays, float centerX, float centerY, float red, float green, float blue) {
        pushMatrix();

        int n = 8;
        float alpha = 0;
        float dAlpha = 2*PI/8;


        translate(centerX,centerY);
        stroke(red, green, blue);

        float prevX = 0;
        float prevY = 0;
        for (int i=0; i<=n; i++) {
            float curR = r;
            if (i%2==0) {
                curR /= 4;
            }
            float x = curR * cos(alpha);
            float y = curR * sin(alpha);
            line(0, 0, x, y);
            prevX = x;
            prevY = y;
            line(prevX, prevY, x, y);

            alpha += dAlpha;
        }
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }

}


