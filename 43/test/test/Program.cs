using System;

class Program {
    static void Main() {
        string mostWidespread = Task.GetMostWidespread(new[] { "Emperor Penguin", "Macaroni Penguin", "Emperor Penguin", "Little Penguin" });
        Console.WriteLine(mostWidespread); // Emperor Penguin
    }
}

class Task {
    int EmperorPenguins = 0;
    int LittlePenguins = 0;
    int MacaroniPenguins = 0;
    public static String GetMostWidespread() {
        for (int i = 0; i < mostWidespread; i++) {
            if (mostWidespread[i] = "Emperor Penguins") {
                EmperorPenguins = EmperorPenguins + 1;
            }

            if (mostWidespread[i] = "Little Penguins") {
                LittlePenguins = LittlePenguins + 1;
            }

            if (mostWidespread[i] = "Macaroni Penguins") {
                MacaroniPenguins = MacaroniPenguins + 1;
            }
        }
        if (EmperorPenguins > EmperorPenguins && EmperorPenguins > MacaroniPenguins) {
            return EmperorPenguins;
        } else if (LittlePenguins > EmperorPenguins && LittlePenguins > MacaroniPenguins) {
            return LittlePenguins;
        } else {
            return MacaroniPenguins;
        }
    }
}