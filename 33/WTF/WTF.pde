int[] a = {4, 1, 9};
int number;
int amount;

number = int(random(0, 2));
amount = int(random(0, 9));
a[number]=amount;
print("Массив а:  ");
for (int i=0; i<a.length; i++) {
  print(a[i]+"  ");
}