import processing.core.PApplet;

public class Main extends PApplet {

    World world;

    static String GAME = "game";
    static String GAME_OVER = "gameover";
    static String screen = GAME;

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public void settings() {
        size(768, 768);

        world = new World(this);
    }

    public void setup() {
        world.createMap();
    }

    public void draw() {
        background(109, 58, 112);
        noStroke();

        if (screen == GAME) {
            game();
        } else if (screen == GAME_OVER) {
            gameOver();
        }

        world.draw();
    }

    void game() {
        world.draw();
    }

    void gameOver() {
        background(0x3E3636);
        fill(255);
        textSize(40);
        text("game over", width / 3, height / 3);
        textSize(20);
        text("press 'r' to restart", width / 3, height / 2);


        if (keyPressed) {
            if (key == 'r') {
                world.restart();
            }
        }
    }


    public void keyPressed() {
        if (!world.hero.isMoving) {
            if (key == 'w') {
                world.hero.side = world.hero.up;
                world.hero.isMoving = true;
            }

            if (key == 's') {
                world.hero.side = world.hero.down;
                world.hero.isMoving = true;
            }

            if (key == 'a') {
                world.hero.side = world.hero.left;
                world.hero.isMoving = true;
            }

            if (key == 'd') {
                world.hero.side = world.hero.right;
                world.hero.isMoving = true;
            }
        }

    }
}
