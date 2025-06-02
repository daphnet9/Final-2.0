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
        scanner.close();
    }

    public static void commandsList(String userInput)
    {
        //catalogue for commands
        //!! FIGURE THIS OUT FIRST - try to find a more efficient way than making a long strip of if commands or switch case
    }
}

//note to self:
//close scanner at the very end of the program, when user is done with all assignments
//i think just in case, should probably reset timer as well

//problems:
//scanner doesn't continously run (i think), how do i make it continously read the inputs
//how is timer going to work with the unscheduled breaks?
