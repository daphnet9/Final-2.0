//Jia Yi
import java.util.Scanner;
 public class Medium extends Task {
    private final String difficulty = "Medium";

    private static int medReward = 25;
    private static String name;
    private static int hours;
    private static String description;

    public static void data()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        Medium.setName(scanner.nextLine());
        System.out.println("Hours:");
        Medium.setHours(scanner.nextInt());
        System.out.println("Description:");
        Medium.setDescription(scanner.nextLine());
        System.out.println("Done! Your task has been created.");
        scanner.close();
    }

    public static void setHours(int h)
    {
        hours = h;
    }
    public static void setName(String n)
    {
        name = n;
    }
    public static void setDescription(String d)
    {
        description = d;
    }
    
    public Medium(String n, int h, String de, int r)
    {
        super(n, h, de, r);
    }

    public static String getDifficulty()
    {
        return difficulty;
    }
    public static String getName()
    {
        return name;
    }
    public static int getHours()
    {
        return hours;
    }
    public static String getDescription()
    {
        return description;
    }
    public static int getReward()
    {
        return medReward;
    }
}
