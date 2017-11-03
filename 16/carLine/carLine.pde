int carX = 200;
PImage car;

void setup() {
  size(400, 400);
  car = loadImage("car.png");
}

void draw() {
  background(30);

  handleMotionKeys();
  for (int i=10; i <= 390; i=i+30) {
    image(car, carX, i);
  }
}

void handleMotionKeys() {
  if (keyPressed) {
    if (key == 'a') {
      carX -= 2;
    } else if (key == 'd') {
      carX += 2;
    }
  }
}