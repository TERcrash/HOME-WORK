import processing.core.PApplet;

public class Hero {
    String up = "up";
    String down = "down";
    String left = "left";
    String right = "right";
    String side = right;

    int x = 0;
    int y = 0;

    private PApplet parent;

    Hero(PApplet parent) {
        this.parent = parent;
    }

    void draw() {
        parent.fill(255);
        parent.rect(x, y, 40, 40);
    }

    void move() {
        if (side == up) {
            y = y - 5;
        }

        if (side == down) {
            y = y + 5;
        }

        if (side == left) {
            x = x - 5;
        }

        if (side == right) {
            x = x + 5;
        }
    }
}
