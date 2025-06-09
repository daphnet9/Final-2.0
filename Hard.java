//Daphne

import java.util.Scanner;

public class Hard extends Task {
    private final static String difficulty = "Hard";

    private static int hardReward = 50;

    public static void creatingTask(Scanner scanner)
    {
        System.out.println("Name:");
        String n = (scanner.nextLine());
        System.out.println("Time:");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.println("Description:");
        String de = (scanner.nextLine());
        System.out.println("Task created! Add a new task or type 'done' to finish.");
        Task hard = new Hard(n, h, de, hardReward);
        Task.addTask(hard); 
    }

    public Hard(String n, int h, String de, int r) {
        super(n, h, de, r);
    }

    public String getDifficulty() {
        return difficulty;
    }
}
