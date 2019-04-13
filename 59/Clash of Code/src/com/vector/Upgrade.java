package com.vector;

import processing.core.PApplet;
import processing.core.PImage;

public class Upgrade {
    PApplet parent;

    PImage button;

    int x;
    int y;

    Upgrade(int x, int y, PApplet p){
        this.parent=p;

        this.x=x;
        this.y=y;

        button=parent.loadImage("upgrade.png");
    }

    void draw(){
        parent.pushMatrix();
        parent.translate(x,y);
        parent.scale(0.1f);
        parent.image(button,0,0);
        parent.popMatrix();
    }

    void collision(){
        if(parent.mouseX>x && parent.mouseY>y && parent.mouseX<x+button.width*0.1f && parent.mouseY<y+button.height*0.1f && parent.mousePressed){
            PApplet.print("каво\n");
        }
    }
}
