int[] waterLevels = { 23, 4545, 45, 2, 16, 765, 341, 1, 3, 0 };
int firstMonth = waterLevels[0];

// вычитаем из осадков каждого месяца осадки первого месяца
for (int i = 0; i < waterLevels.length; i++) {
  waterLevels[i] = waterLevels[i] - firstMonth;
}

// выводим результат
for (int i = 0; i < waterLevels.length; i++) {
  println(waterLevels[i]);
}