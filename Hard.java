//Daphne

import java.util.Scanner;

public class Hard extends Task {
    private final String difficulty = "Hard";

    private static int hardReward = 50;
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
        Task newTask = new Easy(n, Integer.valueOf(h), de, hardReward);
        Task.tracker.add(newTask);
        scanner.close();
    }

    public Hard(String n, int h, String de, int r) {
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
        return hardReward;
    }
    //same for every other subclass
    //create a variable for the set rewards
    //private variables for the time, name, short description
    //methods that will store the parameter into those variables
    //constructor which supers the reward, takes the private variables and constructs a new object
}
