package com.vector;

import processing.core.PApplet;
import processing.core.PImage;

public class Building {
    PApplet parent;

    PImage[] skin=new PImage[5];

    int x;
    int y;

    int skinNumber;

    Building(int x,int y,int skinNumber,PApplet p){
        this.parent=p;

        this.x=x;
        this.y=y;

        this.skinNumber=skinNumber;

        skin[0] = parent.loadImage("town hall.png");
        skin[1] = parent.loadImage("elixir collector.png");
        skin[2] = parent.loadImage("barrack.png");
        skin[3] = parent.loadImage("clan castle.png");
        skin[4] = parent.loadImage("army camp.png");
    }

    void draw(){
        parent.image(skin[skinNumber],x,y);
    }
}
