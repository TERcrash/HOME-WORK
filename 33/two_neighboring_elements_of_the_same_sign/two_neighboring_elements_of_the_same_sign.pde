int[] abc = {2, -2, -9, 9, 0};

for (int i=0; i<abc.length-1; i++) {
  if (abc[i]>0 && abc[i+1]>0 || abc[i]<0 && abc[i+1]<0) {
    println(abc[i],abc[i+1]);
    break;
  }
}