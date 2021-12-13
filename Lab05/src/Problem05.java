import processing.core.*;

    public class Problem05 extends PApplet {
        static final int NUM_OF_CIRCLES = 30;
        public void settings() {
            fullScreen();
        }

        public void setup() {
            noStroke();
        }

        public void draw() {
            background(0);
            float r = height / 2f;
            float redComp = 10;
            float dr = r / NUM_OF_CIRCLES;
            float dRedComp = 255 / NUM_OF_CIRCLES;

            fill(redComp, 0, 0);
            circle(width / 2f, height / 2f, 2 * r);

            for (int i = 0; i < NUM_OF_CIRCLES; ++i) {
                r -= dr;
                redComp += dRedComp;
            }

        }
                public static void main (String[]args){
                    PApplet.main("Problem05");
                }
            }



