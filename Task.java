//Daphne & Jia Yi
import java.util.ArrayList;

public class Task {
    private int reward;
    private String name;
    private int hours;
    private String description;
    //arraylist "tracker" or "task-list" 
    static ArrayList<Task> tracker = new ArrayList<Task>();
 
    public static void addTask(Task task) {
        tracker.add(task); //add the task to the tracker
    }

    public static void printTasks() {
        int num = 1;
        for (Task task : tracker) {
            System.out.print("Task " + num + ": ");
            System.out.println(task.getName());
            num++;
        }
    }

    public Task (String n, int h, String de, int r)
    {
        this.name = n;
        this.hours = h;
        this.description = de;
        this.reward = r;
    }

    //methods to return the vars 
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
        return reward;
    }

    public String toString() //converting the task into a string
    {
        return "Task Name: " + name + "\n" +
               "Hours: " + hours + "\n" +
               "Description: " + description + "\n" +
               "Reward: " + reward;
    }

    //method to choose a task from arraylist *might have to write an exception for if it goes out of range 
    public static Task chooseTask(ArrayList<Task> tracker, String name) throws ArrayIndexOutOfBoundsException
    {
        Task current = null; //initialize current task
        for (Task task : tracker) {
            if (task.getName().equals(name)) { //if the name matches the task name
                current = task; //set current to that task
                break; //break out of the loop
            }
        }
        return current; //return the current task
    }

    public void deductReward(int deduction) {
        this.reward = this.reward - deduction; //update the reward with the new value
    }
    //update reward (deduction) 
}
