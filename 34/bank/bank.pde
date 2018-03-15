int[] cards = {2, 2, -3};
float amount = 1;

for (int i=0; i<cards.length-1; i++) {
  if (cards[i]>0) {
    amount=amount+1;
  }
} //<>//
if(amount==cards.length){
  println("долгов нет");
}else{
 println("долги есть"); 
}