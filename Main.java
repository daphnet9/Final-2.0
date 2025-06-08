//Jia Yi
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isRunning = true; //boolean to check if the scanner is running
    public static void main(String[] args) {
        System.out.println(Intro.startIntro()); //in order to call methods from another class they have to be static and referenced to the class//

        ArrayList<String> gacha = new ArrayList<String>();
        Gacha.setPool(gacha, Gacha.pool);

        Scanner scanner = new Scanner(System.in);
        while(isRunning)
        {
            String command = scanner.nextLine();
            Main.commandsList(command, scanner);
        }
        scanner.close();
        System.out.println("prints if the scanner stops reading after the while loop");
    }

    public static void commandsList(String userInput, Scanner scanner)
    {
        String method = userInput.toLowerCase();
            //REFERENCE TO COMMANDS
            if (method.equals("help")) {
                System.out.println("Available commands: play | view tasks | start task(s) | stats | gacha | exit");
            }
            if (method.equals("play")) {
                System.out.println("Loading...");
                //Selecting the difficulty level
                System.out.println("Select your difficulty level: Easy, Medium, Hard");
                while(scanner.hasNextLine())
                {
                    String difficulty = scanner.nextLine().toLowerCase();
                    //easy difficulty
                    if (difficulty.equals("easy")) {
                    System.out.println("You have selected Easy mode. Good luck!");
                    // Easy.data();
                    // Task newTask = new Easy(Easy.getName(), Easy.getHours(), Easy.getDescription(), Easy.getReward());
                    // Task.tracker.add(newTask);
                    } 
                    //medium difficulty
                    else if (difficulty.equals("medium")) {
                        System.out.println("You have selected Medium mode. Challenge accepted!");
                        Medium.creatingTask(); 
                    }
                    else if (difficulty.equals("hard")) {
                        System.out.println("You have selected Hard mode. Brace yourself!");
                        // Hard.data();
                        // Task newTask = new Hard(Hard.getName(), Hard.getHours(), Hard.getDescription(), Hard.getReward());
                        // Task.tracker.add(newTask)
                    }
                    else if (difficulty.equals("complete")){
                        System.out.println("Done creating tasks. You can now start studying!");
                        break; //exit the loop when the user types "complete"
                    }
                    else {
                        System.out.println("Invalid difficulty level. Please try again.");
                    }
                }
            }
            if(method.equals("view task") || method.equals("view tasks")) {
                if((Task.tracker).size() == 0)
                {
                    System.out.println("You have no tasks yet. Please add a task first.");
                } else {
                    for(Task task : Task.tracker) {
                        System.out.println("-------------------------");
                        System.out.println(task.toString());
                        System.out.println("-------------------------");
                    }
                }
            }
            if(method.equals("start task")){
                //will prompt the user to select a task using the method in task class
                    //will then automatically go start the timer using that task
                    //after completion should add points to the user's total 
                    //don't program unscehduled breaks - because that takes more time
                    //focus on programming the scheduled breaks and timer
                    //once timer ends, remove task from the arrylist
            }
            if(method.equals("stats")){
                    //toString method that prints out everything 
                    System.out.println("testing view stats");
            }
            if(method.equals("gacha")){
                    System.out.println("testing gacha command");
                //welcomes the user by printing out a whole statement that looks like a ui
                //if player says to roll - prints out what is rolled and dedicts the cost from the coin pouch
                //if insufficient, print out something that tells the user that its not possible
            }
            if(method.equals("exit")){
                System.out.println("Exiting the program. Goodbye!");
                scanner.close(); //close the scanner when exiting
                Main.closeProgram(); //set the boolean to false to stop the while loop
            }
            else{
                System.out.println("Invalid command.");
            }
    }

    public static void closeProgram()
    {
        isRunning = false; //set the boolean to false to stop the while loop
    }
}