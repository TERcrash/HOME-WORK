package com.vector;

import processing.core.PApplet;

public class Tip {
    PApplet parent;

    Tip(PApplet p){
        this.parent=p;

    }

    void draw(int buildingNumber){
        parent.fill(255);
        parent.rect(295,0,160,160,20);

        if(buildingNumber==0){
            parent.textSize(20);
            parent.fill(104, 149, 221);
            parent.text("Town Hall",300,30);
            parent.textSize(15);
            parent.fill(0);
            parent.text("workers will live here",300,60);
        }

        if(buildingNumber==1){
            parent.textSize(20);
            parent.fill(104, 149, 221);
            parent.text("Elixir Collector",300,30);
            parent.textSize(15);
            parent.fill(0);
            parent.text("extracts elixir",300,60);
        }

        if(buildingNumber==2){
            parent.textSize(20);
            parent.fill(104, 149, 221);
            parent.text("Barrack",300,30);
            parent.textSize(15);
            parent.fill(0);
            parent.text("war will be trained",300,60);
            parent.text("here",300,75);
        }

        if(buildingNumber==3){
            parent.textSize(20);
            parent.fill(104, 149, 221);
            parent.text("Clan Castle",300,30);
            parent.textSize(15);
            parent.fill(0);
            parent.text("need to join the clan",300,60);
        }

        if(buildingNumber==4){
            parent.textSize(20);
            parent.fill(104, 149, 221);
            parent.text("Army Camp",300,30);
            parent.textSize(15);
            parent.fill(0);
            parent.text("war will be live here",300,60);
        }
    }
}
