import processing.core.*;

public class Problem01 extends PApplet {
float x1;
float y1;
    float x2;
    float y2;
    public void settings() {
        fullScreen();


    }

    public void setup() {
        background(0);
        if (keyPressed && key ==CODED) {
            System.out.println("Some key pressed");
        }


    }
    //@Override
    public void keyReleased (){
        System.out.println("Key released");
    }
    //@Override
    public void mouseRealeased () {

    }
    public void draw() {
        fill(0,0,255);
        square(width/3.5f, height/4.5f, 500);

       line(x1, y1, x2, y2);
       stroke(140, 140, 140);
        for (float x1= width / 3.5f; x1 < 500; x1 += (500 / 4f)) {
            for (float y1 = height / 3.5f; y1 < 500; y1 += (500 / 4f)) {
            }
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}


