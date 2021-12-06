import processing.core.*;

public class Problem01 extends PApplet {
    float messageSize = 10 ;
    public void settings() {
        fullScreen();


    }

    public void setup() {
        background(0);
        textAlign(CENTER, CENTER);


    }

    public void draw() {
        background(0, 0, 0);
        textSize(messageSize);
        fill(255, 0, 0);
        text("Hello, Processing!!!", width/2.0f , height/2.0f);
        if (messageSize < 130) {
            messageSize += 1;
        }

    }


            public static void main
                (String[]args) {
        PApplet.main("Problem01");
            }

        }


