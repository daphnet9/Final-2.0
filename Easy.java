//Daphne

import java.util.Scanner;

public class Easy extends Task {
    private final String difficulty = "Easy";

    private static int easyReward = 10;
    private static String name;
    private static int hours;
    private static String description;

    public static void creatingTask()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String n = (scanner.nextLine());
        System.out.println("Hours:");
        String h = (scanner.nextLine());
        System.out.println("Description:");
        String de = (scanner.nextLine());
        System.out.println("Done! Your task has been created.");
        Task newTask = new Easy(n, Integer.valueOf(h), de, easyReward);
        Task.tracker.add(newTask);
        scanner.close();
    }

    public Easy(String n, int h, String de, int r) {
        super(n, h, de, r);
    }
    public String getDifficulty() {
        return difficulty;
    }
    public String getName()
    {
        return name;
    }
    public int getHours()
    {
        return hours;
    }
    public String getDescription()
    {
        return description;
    }
    public int getReward()
    {
        return easyReward;
    }
}
