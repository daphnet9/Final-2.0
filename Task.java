//Daphne & Jia Yi
import java.util.ArrayList;

public class Task {
    private int reward;
    private String name;
    private int time;
    private String description;
    //arraylist "tracker" or "task-list" 
    static ArrayList<Task> tracker = new ArrayList<Task>();
 
    public static void addTask(Task task) {
        tracker.add(task); //add the task to the tracker
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

    //methods to return the vars 
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

    public String toString() //converting the task into a string
    {
        return "Task Name: " + name + "\n" +
               "Time: " + time + "\n" +
               "Description: " + description + "\n" +
               "Reward: " + reward;
    }

    //method to choose a task from arraylist *might have to write an exception for if it goes out of range 
    public static Task chooseTask(int index) throws ArrayIndexOutOfBoundsException
    {
        Task current = null; //initialize current task
        if (index < 0 || index >= tracker.size()) { //check if the index is out of bounds
            throw new ArrayIndexOutOfBoundsException("Invalid task number. Please select a valid task.");
        }
        else {
            current = tracker.get(index); //get the task at the specified index
            System.out.println("You have selected: " + "\n" + current.toString()); //print out the task name
        }
        return current; //return the current task
    }

    public void deductReward(int deduction) {
        this.reward = this.reward - deduction; //update the reward with the new value
    }
    //update reward (deduction) 
}
