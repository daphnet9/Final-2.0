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
            //REFERENCE TO COMMANDS ------------------------------------------------------------
            if (method.equals("help")) {
                System.out.println("Available commands: play | view tasks | start task(s) | stats | gacha | exit");
            }
            else if (method.equals("play")) {
            //SIMULATING LOADING ---------------------------------------------------------------
                System.out.println("Loading...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println("Welcome to Studier! Let's get started.");
            //Selecting the difficulty level ---------------------------------------------------
                System.out.println("Select your difficulty level: Easy, Medium, Hard");
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
                        System.out.println("You have selected Hard mode. Brace yourself!");
                        Hard.creatingTask(scanner);
                    }
                    else if (difficulty.equals("complete")){
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
            else if(method.equals("start task")){
                //will prompt the user to select a task using the method in task class
                if((Task.tracker).size() == 0) {
                    System.out.println("You have no tasks, please start by adding a task first.");;
                } 
                else {
                    System.out.println("Your tasks: " + "\n");
                    Task.printTasks();
                    System.out.println("Select a task to start by typing the task number:");
                    // String taskNum = scanner.nextLine();
                    
                }

                    //will then automatically go start the timer using that task
                    //after completion should add points to the user's total 
                    //don't program unscehduled breaks - because that takes more time
                    //focus on programming the scheduled breaks and timer
                    //once timer ends, remove task from the arrylist
            }
            else if(method.equals("stats")){
                    //toString method that prints out everything 
                    System.out.println("testing view stats");
            }
            else if(method.equals("gacha")){
                Gacha.gachaUI(); 
                
                //if player says to roll - prints out what is rolled and dedicts the cost from the coin pouch
                //if insufficient, print out something that tells the user that its not possible
            }
            else if(method.equals("exit")){
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