int[] a = {4, 1, 9};
int number;
int amount;
int x = 1;

while (x == 10) {
  number = int(random(0, 2));
  amount = int(random(0, 9));
  println("Массив a  "+a);
  a[number]=amount;
  x=x+1;
  delay(2000);
}