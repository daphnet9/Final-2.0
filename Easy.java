//Daphne

import java.util.Scanner;

public class Easy extends Task {
    private final String difficulty = "Easy";

    private static int easyReward = 10;

    public static void creatingTask(Scanner scanner)
    {
        System.out.println("Name:");
        String n = (scanner.nextLine());
        System.out.println("Time:");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.println("Description:");
        String de = (scanner.nextLine());
        System.out.println("Task created! Add a new task or type 'done' to finish.");
        Easy easy = new Easy(n, h, de, easyReward);
        Task.tracker.add(easy);
    }

    public Easy(String n, int h, String de, int r) {
        super(n, h, de, r);
    }
    public String getDifficulty() {
        return difficulty;
    }
}
