void drawLine(int y, int y2) {
  line(0, y, 200, y2);
}

void drawFirstCar() {
  fill(#F0623A);
  rect(x1, 180, 60, 20);
  x1 = x1 - speed;
  if (x1<=-30) {
    x1=230;
  }
}

void drawSecondCar() {
  fill(#C13914);
  rect(x2, 140, 60, 20);
  x2 = x2 - speed;
  if (x2<=-30) {
    x2=300;
  }
}

void drawThirdCar() {
  fill(#447CB2);
  rect(x3, 100, 60, 20);
  x3 = x3 + speed;
  if (x3>=230) {
    x3=-140;
  }
}

void drawfourthCar() {
  fill(#6653D3);
  rect(x4, 60, 60, 20);
  x4 = x4 + speed;
  if (x4>=230) {
    x4=-20;
  }
}

void drawFrog() {
  fill(#58C62E);
  rect(100, frogY, 20, 20);
  boolean collisionFirstCar = frogY==180 && abs(100-x1)<=40;
  boolean collisionSecondCar = frogY==140 && abs(100-x2)<=40;
  boolean collisionThirdCar = frogY==100 && abs(100-x3)<=40;
  boolean collisionFourthCar = frogY==60 && abs(100-x4)<=40;
  if (collisionFirstCar || collisionSecondCar || collisionThirdCar || collisionFourthCar) {
    background(#363030);
    speed = 0;
    println("game over");
    text("Тебя сбила машина и ты улетел", 5, 125);
    text("в мусорный бак!!!", 7, 140);
  }
}