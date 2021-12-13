import processing.core.*;

    public class Problem05 extends PApplet {
        static final int Num_of_circles = 50;
        public void settings() {
            fullScreen();
        }

        public void setup() {
            noStroke();
        }

        public void draw() {
            background(0);
            float r = height / 2f;
            float redComp = 5;
            float dr = r / Num_of_circles;
            float dRedComp = 255 / Num_of_circles;

            fill(50, 0, 0);
            circle(width / 2f, height / 2f, 2 * r);

            for (int i = 0; i < Num_of_circles; i++) {
                r -= dr;
                redComp += dRedComp;

            }
        }
                public static void main (String[]args){
                    PApplet.main("Problem05");
                }
            }



