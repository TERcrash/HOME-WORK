package com.vector;

import processing.core.PApplet;

import processing.core.PImage;

public class MenuItem {
    int x;
    int y;

    boolean isTaken = false;

    static PApplet parent;

    int buildingNumber;

    PImage building;

    PImage[] buildings = new PImage[10];

    public MenuItem(int x, int y, int buildingNumber, PApplet p) {
        this.x = x;
        this.y = y;
        this.buildingNumber = buildingNumber;
        this.parent = p;

        buildings[0] = parent.loadImage("town hall.png");
        buildings[1] = parent.loadImage("elixir collector.png");
        buildings[2] = parent.loadImage("barrack.png");
        buildings[3] = parent.loadImage("clan castle.png");
        buildings[4] = parent.loadImage("army camp.png");
        buildings[5] = parent.loadImage("town hallV2.png");
        buildings[6] = parent.loadImage("elixir collectorV2.png");
        buildings[7] = parent.loadImage("barrackV2.png");
        buildings[8] = parent.loadImage("clan castleV2.png");
        buildings[9] = parent.loadImage("army campV2.png");

        building = buildings[buildingNumber];
    }

    void draw() {
        parent.image(building, x, y);
    }

    void drawPanel() {
        parent.fill(255);
        parent.rect(465, 0, parent.width, parent.height);
    }
}
