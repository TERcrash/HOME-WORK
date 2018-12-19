import processing.core.PApplet;

public class Finish {
    PApplet parent;

    static int size=64;

    int x;
    int y;
    Finish(int x,int y,PApplet p){
        parent=p;

        this.x=x;
        this.y=y;
    }

    void draw() {
        parent.fill(204, 18, 52);
        parent.rect(x, y, size, size);
    }
}
