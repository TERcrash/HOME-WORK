package com.vector;

import processing.core.PApplet;
import processing.core.PImage;

public class Upgrate {
    PApplet parent;

    PImage button;

    int x;
    int y;

    Upgrate(int x,int y,PApplet p){
        this.parent=p;

        this.x=x;
        this.y=y;

        button=parent.loadImage("upgrate.png");
    }

    void draw(){
        parent.image(button,x,y);
    }
}
