//Jia Yi
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends TimerTask {
    private int hours;
    private int mins;
    private int secs;

    @Override
    public void run() {
        //seconds goes first, then minutes, then hours
        //when seconds reached 0, it resets to 59 and minutes decrements by 1
        //when minutes reaches 0, it resets to 59 and hours decrements by 1
        //hours starts at Task.getHours() - 1
        //should be able to print out the time in the format HH:MM:SS
        //once run is done, adds the reward to the player
        //scheduled break runs when hours is a certain amount
        //pauses the timer for a certain amount of time
        //then resumes the timer
        //unscheduled breaks are 10 minutes, which is triggered by scanner input
        // if the user inputs "break" it pauses the timer for 10 minutes
        //pauses the timer for 10 minutes, and decrements the reward
    }
    //update method? for the display but then how do you get the varaibles out
    // public Clock (Task current)
    // {
    //     hours = current.getHours();
    // }

    public static void startTask() 
    {
        
    //method startTimer
    //contains local vars for minutes (starts at 59), and seconds(also starts at 59)
    //uses timerTask method for every second , prints out the time thats updated
    //all the timerTask method is doing is printing out the time
    //actual code is within the start timer, which decrements the time within a nesed if statement
    //and then also contains an integrated break when hour reaches a certain amount and if the starting hours was a lot//
    //unscheduled break is through a timer
    };
}
