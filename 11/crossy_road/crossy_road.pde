int frogY = 220;
int[] xes = {230,200,-140,-20};

color[] colors = {#F0623A,#C13914,#447CB2,#6653D3};
int[] speeds = {-2,-4,2,5};

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
drawCars();
  // лягушка
  drawFrog();
}

void keyPressed() {
  frogY = frogY - 40;
}