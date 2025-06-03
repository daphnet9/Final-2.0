//Jia Yi
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Intro.startIntro()); //in order to call methods from another class they have to be static and referenced to the class//

        ArrayList<String> gacha = new ArrayList<String>();
        Gacha.setPool(gacha, Gacha.pool);

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            String command = scanner.nextLine();
            Main.commandsList(command);
        }
    }

    public static void commandsList(String userInput)
    {
        String method = userInput.toLowerCase(); 
        switch (method) {
            case "play":
                System.out.println("Loading...");
            //Selecting the difficulty level
                System.out.println("Select your difficulty level: Easy, Medium, Hard");
                Scanner scanner = new Scanner(System.in);
                String difficulty = scanner.nextLine().toLowerCase();
                //easy difficulty
                if (difficulty.equals("easy")) {
                    System.out.println("You have selected Easy mode. Good luck!");
                } 
                //medium difficulty
                else if (difficulty.equals("medium")) {
                    System.out.println("You have selected Medium mode. Challenge accepted!");
                    Medium.data(); 
                    Task newTask = new Medium(Medium.getName(), Medium.getHours(), Medium.getDescription(), Medium.getReward());
                    Task.tracker.add(newTask);
                }
                else if (difficulty.equals("hard")) {
                    System.out.println("You have selected Hard mode. Brace yourself!");
                    //Hard.data();
                    //Task newTask = new Hard(Hard.getName(), Hard.getHours(), Hard.getDescription(), Hard.getReward());
                    //Task.tracker.add(newTask);
                } else {
                    System.out.println("Invalid difficulty level. Please try again.");
                }
            case "view task":
                if((Task.tracker).size() == 0)
                {
                    System.out.println("You have no tasks yet. Please add a task first.");
                } else {
                    for(Task task : Task.tracker) {
                        System.out.println(task.toString());
                        System.out.println("-------------------------");
                    }
                }

            default:
                break;
        }
        }
        //Play, calls the adding task method
        //which then contains an inner loop that will run until the user types "done" or "exit"

        //catalogue for commands
        //!! FIGURE THIS OUT FIRST - try to find a more efficient way than making a long strip of if commands or switch case
    }


//note to self:
//close scanner at the very end of the program, when user is done with all assignments
//i think just in case, should probably reset timer as well

//problems:
//scanner doesn't continously run (i think), how do i make it continously read the inputs
//how is timer going to work with the unscheduled breaks?
