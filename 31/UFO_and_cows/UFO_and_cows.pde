int UFO = int(random(0, 500));
int cows;
int amount;
int number;


void setup() {
  println("Ну чё пацаны НЛО? Вместимость "+UFO);
  while (true) {
    cows = int(random(0, 200));
    println("коровка "+cows);
    amount = amount+cows;
    if (amount>UFO) {
      println("Упс! Перегрузка! Поехали! Коровы: "+number);
      break;
    }
    number = number+1;
    delay(3000);
  }
}