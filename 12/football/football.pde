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
    float x=modelX(ballX, ballY, 0);
    float y=modelY(ballX, ballY, 0);
    if (x>netX && y>netY && y<netY+netH) {
      applyHit();
    }
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