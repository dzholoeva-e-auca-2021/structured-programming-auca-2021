import processing.core.*;

public class Problem01 extends PApplet {

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

    }
    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}


