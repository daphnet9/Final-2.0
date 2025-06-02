//Daphne
public class Easy extends Task {
    private final String difficulty = "Easy";

    public Easy(String n, int h, String de) {
        super(n, h, de, 10);
    }

    public String getDifficulty() {
        return difficulty;
    }
}
