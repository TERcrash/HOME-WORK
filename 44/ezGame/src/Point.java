import processing.core.PApplet;

public class Point {
    PApplet parent;

    static int size=64;

    int x;
    int y;
    Point(int x,int y,PApplet p){
        parent=p;

        this.x=x;
        this.y=y;
    }

    void draw(){
        parent.fill(247, 243, 0);
        parent.ellipse(x,y,size,size);
    }
}

