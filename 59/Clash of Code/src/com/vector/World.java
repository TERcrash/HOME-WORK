package com.vector;

import processing.core.PApplet;

public class World {
    MenuItem[] components;

    Tip[] tips;

    PApplet parent;

    World(PApplet p) {
        this.parent = p;

        components = new MenuItem[]{new MenuItem(480, 455, 0, parent), new MenuItem(480, 335, 1, parent),new MenuItem(480,230,2,parent),new MenuItem(480,115,3,parent),new MenuItem(480,10,4,parent)};

        tips= new Tip[]{new Tip(0,"Town Hall","workers will live here",parent),new Tip(1,"Elixir Collector", "extracts elixir",parent),new Tip(2 ,"Barrack", "war will be trained \nhere",parent),new Tip(3,"Clan Castle", "need to join the clan",parent),new Tip(4,"Army Camp", "war will be live here",parent)};
    }

    void draw() {
        for (int i=0;i< components.length;i++) {
        components[i].drawPanel();
        }

        for (int i=0;i< components.length;i++) {
            components[i].draw();
        }

        for (int i = 0; i < components.length; i++) {
            MenuItem component = components[i];
            if(parent.mouseX>component.x && parent.mouseY>component.y && parent.mouseX<parent.width && parent.mouseY<component.y+100){
                tips[i].draw(component.buildingNumber);
            }
        }
    }
}
