int[] speeds = new int[8];
int[] carXes = new int[8];
PImage car;
boolean finished = false;

void setup() {
  size(400, 400);
  textSize(24);
  textAlign(CENTER, CENTER);
  fill(255);

  car = loadImage("car.png");

  for (int i = 0; i < 8; i++) {
    carXes[i] = (int)random(200, 400);
    speeds[i] = (int)random(1, 4);
  }
}

void draw() {
  background(30);

  if (!finished) {
    moveCars();
    updateCars();
  }

  // упрости условие с помощью цикла
  for (int i=0; i<8; i++) {
    if (carXes[i] < 0) {
      finishRace();
    }
  }
}

void moveCars() {
  for (int i = 0; i < 8; i++) {
    carXes[i] -= speeds[i];
  }
}

void updateCars() {
  for (int i = 0; i < 8; i++) {
    image(car, carXes[i], 50 + i * 40);
  }
}

void finishRace() {
  text("Одна машина финишировала!!!", width / 2, height / 2);
  finished = true;
}