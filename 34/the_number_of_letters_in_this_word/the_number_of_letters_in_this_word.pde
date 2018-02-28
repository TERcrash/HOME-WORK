String str="пожалуйста";
int number = 0;
int amount=0;

while (true) {
  char letter = str.charAt(number);
  if (letter == 'ж') {
    amount=amount+1;
  }
  number = number+1;
  if (number==str.length()) {
    println("Слово: "+str);
    println("Всего букв ж: "+amount);
    break;
  }
}