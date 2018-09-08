using System;

class Program {
    static void Main(string[] args) {
        Task.PrintAsterisks(3);
        Console.Read();
    }
}


class Task {
    public static void PrintAsterisks(int amount) {
        string asterisks = "";
        for (int i = 0; i < amount; i++) {
            asterisks = asterisks + "*";
        }
        Console.WriteLine(asterisks);
    }
}
