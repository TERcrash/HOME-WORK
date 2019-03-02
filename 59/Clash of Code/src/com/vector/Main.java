package com.vector;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{

    World world;

    PImage selectedImage;

    public static void main(String[] args) {
       PApplet.main(Main.class);
    }

    public void settings(){
        size(600,600);
    }

    public void setup(){
        noStroke();

        world=new World(this);
    }

    public void draw(){
        background(244, 206, 66);

        world.draw();
        if(selectedImage!=null) {
            image(selectedImage, mouseX-selectedImage.width/2, mouseY-selectedImage.height/2);
        }
    }

    @Override
    public void mousePressed() {
        for (int i = 0; i < world.components.length; i++) {
            MenuItem component = world.components[i];
            if(mouseX>component.x && mouseY>component.y && mouseX<width && mouseY<component.y+100){
                PApplet.println(component.buildingNumber);
                selectedImage=component.building;
            }
        }
    }
}
