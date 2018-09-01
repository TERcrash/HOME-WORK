using System;

class Program {
    static void Main(string[] args) {
        Task.PrintColoredText("This text should be red", ConsoleColor.Red);
        Task.PrintColoredText("This text should be yellow", ConsoleColor.Yellow);
        Console.Read();
    }
}

class Task {
    public static void PrintColoredText(string text, ConsoleColor color) {
        Console.ForegroundColor = color;
        Console.WriteLine(text);
    }
}