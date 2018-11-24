import processing.core.PApplet;

public class Main extends PApplet {


    World world;

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public void settings() {
        size(768, 768);

        world = new World(this);
    }

    public void setup(){
        world.createMap();
    }

    public void draw() {
        background(109, 58, 112);
        noStroke();

        world.draw();
    }

    public void keyPressed() {

        if (key == 'w') {
            world.hero.side = world.hero.up;
        }

        if (key == 's') {
            world.hero.side = world.hero.down;
        }

        if (key == 'a') {
            world.hero.side = world.hero.left;
        }

        if (key == 'd') {
            world.hero.side = world.hero.right;
        }

    }
}
