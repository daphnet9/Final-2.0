//Daphne & Jia Yi
import java.util.ArrayList;

public class Task {
    private int reward;
    private String name;
    private int time;
    private String description;
    //ArrayList to keep track of all the tasks
    static ArrayList<Task> tracker = new ArrayList<Task>();
 
    public static void addTask(Task task) {
        tracker.add(task); 
    }

    public static void printTasks() {
        int num = 1;
        System.out.print("\n");
        for (Task task : tracker) {
            System.out.print("Task " + num + ": ");
            System.out.println(task.getName());
            num++;
        }
        System.out.print("\n");
    }

    public Task (String n, int h, String de, int r)
    {
        this.name = n;
        this.time = h;
        this.description = de;
        this.reward = r;
    }

    public String getName()
    {
        return name;
    }
    public int getTime()
    {
        return time;
    }
    public String getDescription()
    {
        return description;
    }
    public int getReward()
    {
        return reward;
    }

    public String toString() 
    {
        return "Task Name: " + name + "\n" +
               "Time: " + time + "\n" +
               "Description: " + description + "\n" +
               "Reward: " + reward;
    }

    public static Task chooseTask(int index) throws ArrayIndexOutOfBoundsException
    {
        Task current = null; 
        if (index < 0 || index >= tracker.size()) { 
            throw new ArrayIndexOutOfBoundsException("Invalid task number. Please select a valid task.");
        }
        else {
            current = tracker.get(index); 
            System.out.println("You have selected: " + "\n" + current.toString()); 
        }
        return current; 
    }

    public void deductReward(int deduction) {
        this.reward = this.reward - deduction; 
    }
    
}
