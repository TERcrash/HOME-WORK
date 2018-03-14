int x = 0;
int y = 100;
int speed = 2;
String right = "right";
String left = "left";
String forward = "forward";
String backward = "backward";
String side = right;

void setup() {
  size(480, 200);
}

void draw() {
  background(255);

  if (side==right) {
    x=x+1;
  }  
  if (side==left) {
    x=x-1;
  }  
  if (side==forward) {
    y=y-1;
  }  
  if (side==backward) {
    y=y+1;
  }

  if (x < 0) {
    x = 0;
  } else if (x > width) {
    x = width;
  }

  stroke(0);
  fill(175);
  ellipse(x, y, 32, 32);

  if (keyPressed) {
    if (key=='d') {
      side=right;
    }
    if (key=='a') {
      side=left; //<>//
    }
    if (key=='w') {
      side=forward;
    }
    if (key=='s') {
      side=backward;
    }
  }
}