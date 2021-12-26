import processing.core.*;

public class Problem01 extends PApplet {
float nMoves;
    public void settings() {
        fullScreen();


    }

    public void setup() {
        background(0);
        if (keyPressed && key == CODED) {
            System.out.println("Some key pressed");
        }
    }

    public void keyReleased (){
        System.out.println("Key released");
    }

    public void mouseReleased() {
        System.out.println("Mouse released");

    }

    public void draw() {
        fill(255, 255, 0);
        textSize(40);
        text("Game 15", width / 2.5f, height / 8f);

        fill(255, 255, 0);
        textSize(20);
        text("Start/Restart: Enter", width / 2.5f, height / 1.1f);

        fill(255, 255, 0);
        textSize(20);
        text("Moves:", width / 1.5f, height / 2f);

        fill(255, 255, 0);
        textSize(20);
        text(nMoves, width / 1.6f, height / 2f);
        if (mousePressed && keyPressed) {
            for (float nMoves = 0; nMoves < 100; nMoves++) {
                ++nMoves;

                fill(0, 0, 255);
                square(width / 3.2f, height / 3.2f, 400);


            }
        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}


