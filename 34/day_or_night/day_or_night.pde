Boolean light = false;

void setup() {
  size(480, 200);
}

void draw() {
  if (light==true) {
    background(#FFFFFF);
  } else {
    background(#000000);
  }
}

void mousePressed() {
  if (light==false) {
    light=true;
  } else if (light==true) {
    light=false;
  }
}