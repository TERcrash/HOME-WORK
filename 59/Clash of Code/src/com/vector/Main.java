package com.vector;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

public class Main extends PApplet {

    World world;

    ArrayList<Building> buildings;

    ArrayList<Upgrate> buttons;

    PImage selectedImage;

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        noStroke();

        world = new World(this);

        buildings = new ArrayList<>();

        buttons = new ArrayList<>();
    }

    public void draw() {
        background(244, 206, 66);
        noFill();

        world.draw();
        for (int i = 0; i < buildings.size(); i++) {
            buildings.get(i).draw();
        }
        if (selectedImage != null) {
            image(selectedImage, mouseX - selectedImage.width / 2, mouseY - selectedImage.height / 2);
        }
    }

    @Override
    public void mousePressed() {
        for (int i = 0; i < world.components.length; i++) {
            for (int j = 0; j < buildings.size(); j++) {
                MenuItem component = world.components[i];
                if (mouseX > component.x && mouseY > component.y && mouseX < width && mouseY < component.y + 100) {
                    PApplet.println(component.buildingNumber);
                    selectedImage = component.building;
                    component.isTaken = true;
                }
                if (component.isTaken && mouseX < 430) {
                    buildings.add(new Building(mouseX - component.building.width / 2, mouseY - component.building.height / 2, i, this));
                    component.isTaken = false;
                    selectedImage = null;
                }

                Building building = buildings.get(j);
                if (mouseX > building.x && mouseY > building.y && mouseX < building.x + component.building.width / 2 && mouseY < building.y + building.skin[j].height) {

                }
            }
        }
    }
}
