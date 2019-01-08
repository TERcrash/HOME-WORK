import processing.core.PApplet;

public class Block {
    PApplet parent;

    static int size = 64;

    int x;
    int y;

    Block(int x, int y, PApplet p) {
        parent = p;

        this.x = x;
        this.y = y;
    }

    void draw() {
        parent.fill(255);
        parent.rect(x, y, size, size);
    }
}
