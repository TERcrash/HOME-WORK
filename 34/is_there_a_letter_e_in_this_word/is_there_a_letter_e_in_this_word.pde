String str = "лолипоп";
int number = 0;

while (true) {
  char letter = str.charAt(number);
  if (letter == 'и') {
    println(true);
    number=number+1;
    println(letter+" Буква номер "+number);
    println("Всего букв:"+str.length());
    break;
  }
  number = number+1;
}