String str = "топчак";
int number = 0;

char letterOne = str.charAt(number);
number = str.length()-1;
char letterTwo = str.charAt(number);
if (letterOne == letterTwo) {
  println("Мне нравится!");
} else {
  println("Чё за дичь?!");
}