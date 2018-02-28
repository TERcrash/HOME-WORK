String str="жужа";
int amount=0;

for (int i=0; i<str.length(); i++) {
  char letter = str.charAt(i);
  if (letter == 'ж') {
    amount=amount+1;
  }
}
println("Слово: "+str);
println("Всего букв ж: "+amount);