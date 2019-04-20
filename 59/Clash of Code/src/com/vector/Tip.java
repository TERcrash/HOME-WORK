package com.vector;

import processing.core.PApplet;
import processing.core.PImage;

public class Tip {
    PApplet parent;

    String title;

    String description;

    int tipNumber;

    int y;

    Tip(int y,int tipNumber, String title,String description,PApplet p){
        this.parent=p;

        this.y=y;

        this.tipNumber=tipNumber;

        this.title=title;
        this.description=description;
    }

    void draw(int buildingNumber, PImage[] buildings) {
        parent.fill(255);
        parent.rect(465, y, parent.width-465,buildings[buildingNumber].height);

        if (buildingNumber == tipNumber) {
            parent.textSize(18);
            parent.fill(104, 149, 221);
            parent.text(title, 470, y+30);
            parent.textSize(15);
            parent.fill(0);
            parent.text(description, 470, y+60);
        }
    }
}
