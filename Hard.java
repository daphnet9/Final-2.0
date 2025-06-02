//Daphne
public class Hard extends Task {
    private final String difficulty = "Hard";

    public Hard(String n, int h, String de) {
        super(n, h, de, 50);
    }

    public String getDifficulty() {
        return difficulty;
    }

    //same for every other subclass
    //create a variable for the set rewards
    //private variables for the time, name, short description
    //methods that will store the parameter into those variables
    //constructor which supers the reward, takes the private variables and constructs a new object
}
