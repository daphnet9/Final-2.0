//Jia Yi
import java.util.Scanner;
 public class Medium extends Task {
    private final static String difficulty = "Medium";

    private static int medReward = 25;

    public static void creatingTask(Scanner scanner)
    {
        System.out.println("Name:");
        String n = (scanner.nextLine());
        System.out.println("Time:");
        int h = Integer.parseInt(scanner.nextLine()); 
        System.out.println("Description:");
        String de = (scanner.nextLine());
        System.out.println("Task created! Add a new task or type 'done' to finish.");
        Medium med = new Medium(n, h, de, medReward);
        Task.tracker.add(med);
    }

    public Medium(String n, int h, String de, int r)
    {
        super(n, h, de, r);
    }

    public static String getDifficulty()
    {
        return difficulty;
    }
}
