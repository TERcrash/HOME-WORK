int speed = 1;
int x1 = 230;
int x2 = 300;
int x3 = -140;
int x4 = -20;
int frogY = 220;

void setup() { 
  size(200, 250); 
  noStroke();
  rectMode(CENTER);
} 

void draw() { 
  background(#EAF09D);
  stroke(100);

  // автомобильные полосы
  for (int i=40; i <=200; i=i+40) {
    drawLine(i, i);
  }

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