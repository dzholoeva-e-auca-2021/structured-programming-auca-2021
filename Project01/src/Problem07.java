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
            String strSize = JOptionPane.showInputDialog("Number of stars [8,12]: ");
            stars = Float.parseFloat(strSize);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }

        if (stars<8 || stars > 12) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }
        try {
            String strSize = JOptionPane.showInputDialog("Number of rays {8,10,12}: ");
            rays = Float.parseFloat(strSize);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }

        if (rays!=8 || rays != 10 || rays != 12) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }


    }

    public void draw() {


    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}


