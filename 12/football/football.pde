// количество очков
int score = 0;

boolean isShooting; // шарик в полете?
// координаты шарика
int ballX;
int ballY;

// координаты сетки
int netX = 330;
int netY;
// размеры сетки
int netW = 51;
int netH = 87;

boolean hit = false;

void setup() {
  size(400, 400, P3D);
  init();
  respawnNet();
}

void draw() {
  updateNet();

  if (isShooting) {
    updateBall();
  }

  updatePaddle();
}

void applyHit() {
  isShooting = false;
  hit = true;
  score += 10;
  ballX = 0;
  respawnNet();
}