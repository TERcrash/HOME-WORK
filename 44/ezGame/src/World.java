import processing.core.PApplet;

import java.util.ArrayList;

public class World {

    PApplet parent;

    int[][][] levels = {
            {
                    {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 1, 0},
                    {1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1},
                    {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
            },

            {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 2, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}
            },

            {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                    {1, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 1},
                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                    {0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 2, 0},
                    {0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 1, 0},
                    {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
            },

            {
                    {0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                    {0, 0, 1, 0, 2, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
            },

            {
                    {0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                    {0, 0, 1, 0, 2, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
            }
    };

    int numberOfLvl = 0;


    Hero hero;

    ArrayList<Block> blocks = new ArrayList<>();
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Finish> finish = new ArrayList<>();

    World(PApplet p) {
        parent = p;
        hero = new Hero(parent);
    }

    void draw() {
        hero.draw();
        if (hero.isMoving) {
            hero.move();
        }

        for (int i = 0; i < blocks.size(); i++) {
            blocks.get(i).draw();
        }

        for (int i = 0; i < points.size(); i++) {
            points.get(i).draw();
        }

        for (int i = 0; i < finish.size(); i++) {
            finish.get(i).draw();
        }

        collision();
        goBeyondTheScreen();
        scoringPoints();
        checkFinish();
    }

    void createMap() {
        int[][] currentLevel = levels[numberOfLvl];
        for (int i = 0; i < currentLevel.length; i++) {
            for (int j = 0; j < currentLevel[0].length; j++) {
                if (currentLevel[i][j] == 1) {
                    blocks.add(new Block(j * Block.size, i * Block.size, parent));
                }

                if (currentLevel[i][j] == 2) {
                    points.add(new Point(j * Point.size + Point.size / 2, i * Point.size + Point.size / 2, parent));
                }

                if (currentLevel[i][j] == 3) {
                    finish.add(new Finish(j * Finish.size, i * Finish.size, parent));
                }
            }
        }

    }

    void collision() {
        for (int i = 0; i < blocks.size(); i++) {
            if (hero.side == hero.up) {
                if (hero.y == blocks.get(i).y + Block.size && hero.x == blocks.get(i).x) {
                    hero.isMoving = false;
                }
            }

            if (hero.side == hero.down) {
                if (hero.y + hero.size == blocks.get(i).y && hero.x == blocks.get(i).x) {
                    hero.isMoving = false;
                }
            }

            if (hero.side == hero.left) {
                if (hero.x == blocks.get(i).x + Block.size && hero.y == blocks.get(i).y) {
                    hero.isMoving = false;
                }
            }

            if (hero.side == hero.right) {
                if (hero.x + hero.size == blocks.get(i).x && hero.y == blocks.get(i).y) {
                    hero.isMoving = false;
                }
            }
        }
    }

    void goBeyondTheScreen() {
        if (hero.x < 0 || hero.x + hero.size > 768 || hero.y < 0 || hero.y + hero.size > 768) {
            Main.screen = Main.GAME_OVER;

            blocks.clear();
            points.clear();
            finish.clear();
        }
    }

    void scoringPoints() {
        for (int i = 0; i < points.size(); i++) {
            if (hero.x == points.get(i).x - Point.size / 2 && hero.y == points.get(i).y - Point.size / 2) {
                points.remove(i);
            }
        }
        if (points.size() == 0) {
            if (finish.size() > 0) {
                finish.get(0).enable();
            }
        }
    }

    void checkFinish() {
        if (finish.size() <= 0) {
            return;
        }

        Finish finish = this.finish.get(0);

        if (finish.isEnabled) {
            if (hero.x == finish.x && hero.y == finish.y) {
                levelChange();
            }
        }
    }

    void levelChange() {
        numberOfLvl = numberOfLvl + 1;
        restart();
    }

    void restart() {
        Main.screen = Main.GAME;

        hero.reset();
        hero.isMoving = false;

        blocks.clear();
        points.clear();
        finish.clear();

        createMap();

        finish.get(0).isEnabled = false;
    }
}



