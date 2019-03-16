package com.vector;

import processing.core.PApplet;

public class Tip {
    PApplet parent;

    String title;

    String description;

    int tipNumber;

    Tip(int tipNumber, String title,String description,PApplet p){
        this.parent=p;

        this.tipNumber=tipNumber;

        this.title=title;
        this.description=description;

    }

    void draw(int buildingNumber) {
        parent.fill(255);
        parent.rect(295, 0, 160, 160, 20);

        if (buildingNumber == tipNumber) {
            parent.textSize(20);
            parent.fill(104, 149, 221);
            parent.text(title, 300, 30);
            parent.textSize(15);
            parent.fill(0);
            parent.text(description, 300, 60);
        }
    }
}
