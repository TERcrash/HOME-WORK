import processing.core.PApplet;

public class Hero {
    String up = "up";
    String down = "down";
    String left = "left";
    String right = "right";
    String side = right;

    Boolean isMoving=false;

    int x = 0;
    int y = 0;

    private PApplet parent;

    Hero(PApplet p) {
        this.parent = p;
    }

    void draw() {
        parent.fill(255,0,121);
        parent.rect(x, y, 64, 64);
    }

    void move() {
        if (side == up) {
            y = y - 5;
            isMoving=true;

        }

        if (side == down) {
            y = y + 5;
            isMoving=true;
        }

        if (side == left) {
            x = x - 5;
            isMoving=true;
        }

        if (side == right) {
            x = x + 5;
            isMoving=true;
        }
    }
}
