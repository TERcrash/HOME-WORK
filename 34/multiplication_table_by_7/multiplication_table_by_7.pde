int a = 0;
int b = 7;

while (true) {
  a=a+1;
  if (a>9) {
    break;
  }
  println(a+"*"+b+"="+a*b);
}