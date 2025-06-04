//Daphne & Jia Yi
import java.util.ArrayList;

public class Task {
    private static int reward;
    private static String name;
    private static int hours;
    private static String description;
    //arraylist "tracker" or "task-list" 
    static ArrayList<Task> tracker = new ArrayList<Task>();

    //note for me: when tracker is empty it should close scanner(i think?) and then print out all the achievements from stats at the end//

    //constructor with all the same private variables as the subclass 
    public Task (String n, int h, String de, int r)
    {
        name = n;
        hours = h;
        description = de;
        reward = r;
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
    //var for current task in main class

    public String toString() //converting the task into a string
    {
        return "Task Name: " + name + "\n" +
               "Hours: " + hours + "\n" +
               "Description: " + description + "\n" +
               "Reward: " + reward;
    }

    //method to choose a task from arraylist *might have to write an exception for if it goes out of range 
    public static Task chooseTask(ArrayList<Task> tracker, String taskName) throws ArrayIndexOutOfBoundsException
    {
        Task current = null; //initialize current task as null
        for (Task task : tracker) {
            if ((task.getName().toLowerCase()).equals(taskName)) { //return the task if found
                current = task; //set the current task to the one found
            }
        }
        return current; //after including the method
    }

    public void deductReward(int deduction) {
        this.reward = this.reward - deduction; //update the reward with the new value
    }
    //update reward (deduction) 
}
