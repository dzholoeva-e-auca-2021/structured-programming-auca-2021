import processing.core.*;

public class Problem01 extends PApplet {

    public void settings() {
        fullScreen();
        size(200, 200);
    }

    @Override
    public void selectOutput(String prompt, String callback) {
    }

    public void setup() {
        background(0);



    }

    public void draw() {
        textSize(100);
        fill(255, 0, 0);
        text("Hello, Processing!!!", 200, 400);


    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }



}

