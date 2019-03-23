package com.vector;

import processing.core.PApplet;

public class Building extends MenuItem{
    PApplet parent;

    int x;
    int y;

    Building(int x,int y,int buildingNumber,PApplet p){
        super(x,y,buildingNumber,p);
        this.parent=p;

        this.x=x;
        this.y=y;

    }

    void draw(){
        parent.image(buildings[buildingNumber],x,y);
    }
}
