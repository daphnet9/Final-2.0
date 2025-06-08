//Jia Yi
import java.util.Scanner;
 public class Medium extends Task {
    private final static String difficulty = "Medium";

    private static int medReward = 25;
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
        System.out.println("Done! Your task has been created. Type in the difficulty for a new task.");
        Task newTask = new Medium(n, Integer.valueOf(h), de, medReward);
        Task.tracker.add(newTask);
    }

    public Medium(String n, int h, String de, int r)
    {
        super(n, h, de, r);
    }

    public static String getDifficulty()
    {
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
        return medReward;
    }
}
