void drawLine(int y, int y2) {
  line(0, y, 200, y2);
}

void drawCars() {
  int y= 180;
  for (int i=0; i<4; i++) {
    fill(colors[i]);
    rect(xes[i], y, 60, 20);
    xes[i] = xes[i] + speeds[i];
    if (speeds[i]<0) {
      if (xes[i]<=-30) {
        xes[i]=230;
      }
    } else {
      if (xes[i]>=230) {
        xes[i]=-30;
      }
    }
    y=y-40;
  }
}    

void drawFrog() {
  fill(#58C62E);
  rect(100, frogY, 20, 20);
  int index=0;
  for (int i=180; i>=60; i=i-40) {
    boolean collisionCar = frogY==i && abs(100-xes[index])<=40;
    index=index+1;
    if (collisionCar) { //<>//
      background(#363030);
      for (int j=0; j<4; j++) {
        speeds[j] = 0; //<>//
      }
      println("game over");
      text("Тебя сбила машина и ты улетел", 5, 125);
      text("в мусорный бак!!!", 7, 140);
    }
  }
}