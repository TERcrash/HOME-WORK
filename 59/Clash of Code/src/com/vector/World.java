package com.vector;

import processing.core.PApplet;

public class World {
    MenuItem[] components;

    Tip[] tips;

    PApplet parent;

    World(PApplet p) {
        this.parent = p;

        components = new MenuItem[]{new MenuItem(480, 465, 0, parent), new MenuItem(480, 335, 1, parent),new MenuItem(480,230,2,parent),new MenuItem(480,110,3,parent),new MenuItem(480,10,4,parent)};

        tips= new Tip[]{new Tip(465,0,"Town Hall","workers will live \nhere",parent),new Tip(335,1,"Elixir Collector", "extracts elixir",parent),new Tip(230,2 ,"Barrack", "war will be \ntrained here",parent),new Tip(110,3,"Clan Castle", "need to join the \nclan",parent),new Tip(10,4,"Army Camp", "war will be live \nhere",parent)};
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
                tips[i].draw(component.buildingNumber,component.buildings);
            }
        }
    }
}
