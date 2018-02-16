int country;
int numberOfcountres=1;
int maxDistance;

void setup() {
  maxDistance = country;
  while (true) {
    country = int(random(0, 200));
    if (maxDistance<country) {
      maxDistance=country;
    }
    println(numberOfcountres+" Город "+country);
    numberOfcountres = numberOfcountres+1;
    if (10<numberOfcountres) {
      println("Макс. дистанция: "+maxDistance);
      break;
    }
    delay(1500);
  }
}