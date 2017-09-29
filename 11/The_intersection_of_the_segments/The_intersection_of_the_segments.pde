int x=0;
int x2=200;

void setup() {
  size(500, 500);
}

void draw() {
  background(#F7F6EB);
  noStroke();
  fill(#F52C2C);
  rect(x, 250, 100, 10, 40);
  fill(#F5E12C);
  rect(x2, 250, 100, 10, 440);
  if (keyPressed) {
    if (keyCode == LEFT) {
      x--;
    } else if (keyCode == RIGHT) {
      x++;
    }
  }
  if (keyPressed) {
    if (key == 'a') {
      x2--;
    } else if (key == 'd') {
      x2++;
    }
  }
}