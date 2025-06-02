//Daphne & Jia Yi
import java.util.ArrayList;

public class Task {
    private int reward;
    private String name;
    private int hours;
    private String description;
    //arraylist "tracker" or "task-list" 
    ArrayList<Task> tracker = new ArrayList<Task>();

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

    //var for current task in main class
    //method to choose a task from arraylist *might have to write an exception for if it goes out of range 
    public static Task chooseTask(ArrayList<Task> tracker, int index) throws ArrayIndexOutOfBoundsException
    {
        Task current = tracker.get(index);
        System.out.println("Your chosen task is: " + current.getName()); //after including the method
    }

    
    //update reward (deduction) 
}
