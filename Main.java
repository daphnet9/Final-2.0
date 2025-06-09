//Jia Yi
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isRunning = true; //boolean to check if the scanner is running
    static ArrayList<String> gacha = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(Intro.startIntro()); //in order to call methods from another class they have to be static and referenced to the class//
        Gacha.setPool(gacha, Gacha.pool);

        Scanner scanner = new Scanner(System.in);
        while(isRunning)
        {
            String command = scanner.nextLine();
            Main.commandsList(command, scanner);
        }
        scanner.close();
        System.out.println("Thank you for playing Studier. Hope to see you tomorrow!"); 
    }

    public static void commandsList(String userInput, Scanner scanner)
    {
        String method = userInput.toLowerCase();
            //REFERENCE TO COMMANDS ------------------------------------------------------------
            if (method.equals("help")) {
                System.out.println("Available commands: PLAY | VIEW TASK(S) | START TASK | STATS | GACHA | COMPLETE");
            }
            else if (method.equals("play")) {
            //SIMULATING LOADING ---------------------------------------------------------------
                System.out.println("Loading...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println("Welcome to Studier! Let's get started.");
            //Selecting the difficulty level ---------------------------------------------------
                System.out.println("Select your difficulty level: Easy, Medium, Hard." + "\n" 
                + "You'll be prompted to enter the task name, time (in minutes), and a short description." 
                + "\n" + "When you're done, type 'done'.");
                while(scanner.hasNextLine())
                {
                    String difficulty = scanner.nextLine().toLowerCase();
                    //easy difficulty ----------------------------------------------------------
                    if (difficulty.equals("easy")) {
                        System.out.println("You have selected Easy mode. Good luck!");
                        Easy.creatingTask(scanner); 
                    } 
                    //medium difficulty --------------------------------------------------------
                    else if (difficulty.equals("medium")) {
                        System.out.println("You have selected Medium mode. Challenge accepted!");
                        Medium.creatingTask(scanner); 
                    }
                    else if (difficulty.equals("hard")) {
                        System.out.println("You have selected Hard mode. Prepare yourself!");
                        Hard.creatingTask(scanner);
                    }
                    else if (difficulty.equals("done")){
                        System.out.println("Done creating tasks. You can now start studying!");
                        break; //exit the task loop when the user types "complete"
                    }
                    else {
                        System.out.println("Invalid difficulty level. Please try again.");
                    }
                }
            }
            else if(method.equals("view task") || method.equals("view tasks")) {
                //will print out all the tasks in the task tracker
                if((Task.tracker).size() == 0) {
                    System.out.println("You have no tasks, please start by adding a task first.");
                } 
                else {
                    Task.printTasks();
                }
            }
            else if(method.equals("start task") || method.equals("start tasks")) {
                //will prompt the user to select a task using the method in task class
                if((Task.tracker).size() == 0) {
                    System.out.println("You have no tasks, please start by adding a task first.");;
                } 
                else {
                    System.out.println("Your tasks: ");
                    Task.printTasks();
                    System.out.println("Select a task to start by typing the task number:");
                    int taskNumber = Integer.parseInt(scanner.nextLine()); 
                    Task currentTask = Task.chooseTask(taskNumber - 1);
                    Clock clock = new Clock(currentTask.getTime()); 
                    System.out.println("Start Timer? Type 'yes' to start or 'no' to exit out");
                    String startTimer = scanner.nextLine().toLowerCase();
                    if(startTimer.equals("yes")) {
                        try {
                            clock.startTimer(); //start the timer for the task
                            System.out.println("Task completed! You earned " + currentTask.getReward() + " dabloons.");
                            Stats.addDabloons(currentTask.getReward());
                            Stats.incrementTaskCount();
                            Task.tracker.remove(currentTask); 
                            if(Task.tracker.isEmpty()) {
                                System.out.println("All tasks completed! You're done for the day!");
                            }
                        } catch (InterruptedException e) {
                            System.out.println("Timer interrupted.");
                        }
                    } else {
                        System.out.println("Timer not started. Start another task?");
                    }
                }
            }
            else if(method.equals("stats")){
                //will print out the stats of the user
                System.out.println("Your Stats: ");
                System.out.println("Dabloons: " + Stats.getDabloons());
                System.out.println("Level: " + Stats.getLevel());
                System.out.println("Tasks Completed: " + Stats.getTaskCount());
                System.out.println("Current Avatar: " + Stats.currentAvatar());
            }
            else if(method.equals("gacha")){
                System.out.println(Gacha.gachaUI()); 
                while(scanner.hasNextLine()) //wait for user input
                {
                    System.out.println("Type 'roll' to roll or 'exit' to exit the Gacha.");
                    String rolling = scanner.nextLine().toLowerCase();
                    if(rolling.equals("roll")){
                        if(Stats.getDabloons() >= 300) { //check if the user has enough dabloons
                            Gacha.roll(gacha); //call the roll method from Gacha class
                        } else {
                            System.out.println("You do not have enough dabloons to roll.");
                        }
                    } else if(rolling.equals("exit")) {
                        System.out.println("Exiting Gacha.");
                        break; 
                    }
                }
            }
            else if(method.equals("complete")){
                scanner.close(); //close the scanner when exiting
                Main.closeProgram(); //set the boolean to false to stop the while loop
            }
            else if(method.equals("hacks") || method.equals("hack")) {
                Stats.addDabloons(10000000);
            }
            else {
                System.out.println("Invalid command.");
            }
    }

    public static void closeProgram()
    {
        isRunning = false; //set the boolean to false to stop the while loop
    }
}