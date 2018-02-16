int heightOfBoar;
int nakazat;

void setup() {
  for (int i=1; i<=20; i++) {
    heightOfBoar = int(random(140, 190));
    if (heightOfBoar>160) {
      println("ЛОХ! "+heightOfBoar);
      nakazat = nakazat+1;
    }
    delay(1000);
  }
  println("Количество лохов, которы надо выпороть: "+nakazat);
}