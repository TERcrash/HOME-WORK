package com.vector;

import processing.core.PApplet;

public class Tip {
    PApplet parent;

    Tip(PApplet p){
        this.parent=p;

    }

    void draw(int buildingNumber){
        parent.fill(255);
        parent.rect(395,0,70,60);

        if(buildingNumber==0){
            parent.fill(0);
            parent.text("",395,10);
        }

        if(buildingNumber==1){

        }

        if(buildingNumber==2){

        }

        if(buildingNumber==3){

        }

        if(buildingNumber==4){

        }
    }
}
