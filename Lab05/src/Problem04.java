
    import processing.core.*;

    public class Problem04 extends PApplet {
    static final int Num_of_circles = 100;
        public void settings() {
            fullScreen(800, 600);
        }

        public void setup() {
        }

        public void draw() {

            for (int i=0; i < 100; ++i) {
                float x = random(width);
                float y = random(height);
                float r = random(radius);
                noStroke = ();
                fill(random(255),random(255),random(255));
                circle (x,y, 2* r);
        }

            public static void main(String[] args) {
                PApplet.main("Problem01");
            }
        }

    }

}
