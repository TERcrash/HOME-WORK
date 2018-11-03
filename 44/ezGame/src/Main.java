import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    Hero hero = new Hero(this);

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public void settings(){
        size(800,800);
    }

    public void draw(){
        background(136, 14, 244);
        noStroke();

        hero.draw();
        hero.move();
    }

    public void keyPressed() {
        if(key=='w'){
            hero.side=hero.up;
        }

        if(key=='s'){
            hero.side=hero.down;
        }

        if(key=='a'){
            hero.side=hero.left;
        }

        if(key=='d'){
            hero.side=hero.right;
        }
    }
}
