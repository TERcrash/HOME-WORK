using System;

class Program {
    static void Main() {
        string mostWidespread = Task.GetMostWidespread(new[] { "Emperor Penguin", "Macaroni Penguin", "Emperor Penguin", "Little Penguin", "Little Penguin" });
        Console.WriteLine(mostWidespread); // Emperor Penguin
    }
}

class Task {
    static int EmperorPenguins = 0;
    static int LittlePenguins = 0;
    static int MacaroniPenguins = 0;
    public static String GetMostWidespread(String[] penguins) {
        for (int i = 0; i < penguins.Length; i++) {
            if (penguins[i] == "Emperor Penguin") {
                EmperorPenguins = EmperorPenguins + 1;
            }

            if (penguins[i] == "Little Penguin") {
                LittlePenguins = LittlePenguins + 1;
            }

            if (penguins[i] == "Macaroni Penguin") {
                MacaroniPenguins = MacaroniPenguins + 1;
            }
        }
        if (EmperorPenguins >= LittlePenguins && EmperorPenguins >= MacaroniPenguins) {
            return "Emperor Penguin";
        } else if (LittlePenguins >= EmperorPenguins && LittlePenguins >= MacaroniPenguins) {
            return "Little Penguin";
        } else {
            return "Macaroni Penguin";
        }
    }
}