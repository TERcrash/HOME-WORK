int x1 = 200;
int x2 = 370;
int x3 = 0;
int x4 = -200;
int frogY = 210;

void setup() { 
  size(200, 250); 
  noStroke();
} 

void draw() { 
  background(#EAF09D);
  stroke(100);

  // автомобильные полосы
  drawLine(40, 40);
  drawLine(80, 80);
  drawLine(120, 120);
  drawLine(160, 160);
  drawLine(200, 200);

  // машины
  noStroke();
  drawFirstCar();
  drawSecondCar();
  drawThirdCar();
  drawfourthCar();

  // лягушка
  drawFrog();
}

void keyPressed() {
  frogY = frogY - 40;
}

void drawLine(int y, int y2) {
  line(0, y, 200, y2);
}

void drawFirstCar() {
  fill(#F0623A);
  rect(x1, 50, 60, 20);
  x1 = x1 - 1;
}

void drawSecondCar() {
  fill(#C13914);
  rect(x2, 50, 60, 20);
  x2 = x2 - 1;
}

void drawThirdCar() {
  fill(#447CB2);
  rect(x3, 130, 60, 20);
  x3 = x3 + 1;
}

void drawfourthCar() {
  fill(#6653D3);
  rect(x4, 130, 60, 20);
  x4 = x4 + 1;
}

void drawFrog() {
  fill(#58C62E);
  rect(90, frogY, 20, 20);
  if (frogY==x1||frogY==x2||frogY==x3||frogY==x4 && 90==x1||90==x2||90==x3||90==x4) {
    background(#363030);
    println("game over");
  }
}