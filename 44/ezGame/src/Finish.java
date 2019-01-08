import processing.core.PApplet;

public class Finish {
    PApplet parent;

    static int size = 64;

    int x;
    int y;

    boolean isEnabled = false;

    Finish(int x, int y, PApplet p) {
        parent = p;

        this.x = x;
        this.y = y;
    }

    void draw() {
        if (isEnabled) {
            parent.fill(83, 244, 66);
        } else {
            parent.fill(204, 18, 52);
        }
        parent.rect(x, y, size, size);
    }

    void enable() {
        isEnabled = true;
    }
}