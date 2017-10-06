int x=50;
int x2=450;

void setup() {
  size(500, 500);
}

void draw() {
  background(#F7F6EB);
  noStroke();
  fill(#F52C2C,155);
  rectMode(CENTER);
  rect(x, 250, 100, 10, 40);
  fill(#F5E12C,155);
  rect(x2, 250, 100, 10, 440);
  if(abs(x-x2)<=100){
    fill(#291F1F);
    text("Алах бабах",210,30);
  }
    
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