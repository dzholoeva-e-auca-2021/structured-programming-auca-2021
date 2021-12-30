import processing.core.*;

public class Problem01 extends PApplet {
    float messageSize;
    float MIN_SIZE = 10;
    float MAX_SIZE = 130;
    float color;
public void settings() {
        fullScreen();


    }

    public void setup() {
        background(0);
        messageSize = MIN_SIZE;


    }

    public void draw() {
        background(0, 0, 0);
        textSize(messageSize);
        textAlign(CENTER, CENTER);
        fill(color);
        text("Hello, Processing!!!", width / 2.0f, height / 2.0f);
        if (messageSize < MAX_SIZE) {
            messageSize += 1;
        } else if (messageSize > MIN_SIZE) {
            messageSize -= 1;
            MAX_SIZE -= 1;
        }

    }

        public static void main(String[] args) {
        PApplet.main("Problem01");
            }

        }


