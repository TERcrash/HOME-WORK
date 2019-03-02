package com.vector;

import processing.core.PApplet;

public class World {
    MenuItem[] components;

    PApplet parent;

    World(PApplet p) {
        this.parent = p;

        components = new MenuItem[]{new MenuItem(480, 455, 0, parent), new MenuItem(480, 335, 1, parent),new MenuItem(480,230,2,parent),new MenuItem(480,115,3,parent),new MenuItem(480,10,4,parent)};
    }

    void draw() {
        for (int i=0;i< components.length;i++) {
        components[i].drawPanel();
        }

        for (int i=0;i< components.length;i++) {
            components[i].draw();
        }
    }
}
