import processing.core.PApplet;

public class Hero {
    String up = "up";
    String down = "down";
    String left = "left";
    String right = "right";
    String side = right;

    int speed = 8;

    Boolean isMoving = false;

    int size = 64;

    int x = 0;
    int y = 0;

    private PApplet parent;

    Hero(PApplet p) {
        this.parent = p;
    }

    void draw() {
        parent.fill(255, 0, 121);
        parent.rect(x, y, size, size);
    }

    void move() {
        if (side == up) {
            y = y - speed;
        }

        if (side == down) {
            y = y + speed;
        }

        if (side == left) {
            x = x - speed;
        }

        if (side == right) {
            x = x + speed;
        }
    }

    void reset() {
        x = 0;
        y = 0;
    }
}
