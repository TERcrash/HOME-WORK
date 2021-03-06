package com.vector;

import processing.core.PApplet;

public class Building extends MenuItem {
    static PApplet parent;

    int x;
    int y;

    boolean onGround = false;

    Upgrade upgrade;

    Building(int x, int y, int buildingNumber, boolean onGround, PApplet p) {
        super(x, y, buildingNumber, p);
        this.parent = p;

        this.x = x;
        this.y = y;

        this.onGround = onGround;

        upgrade = new Upgrade(x + 23, y - 40, parent);
        upgrade.building = this;
    }

    void draw() {
        parent.image(buildings[buildingNumber], x, y);
        upgrade.draw();
        upgrade.collision();
    }

    void upgrade(){
        buildingNumber=buildingNumber+5;
    }
}
