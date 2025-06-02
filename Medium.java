//Jia Yi
 public class Medium extends Task {
    private final String difficulty = "Medium";

    private int medReward = 25;
    private String name;
    private int hours;
    private String description;

    public void setHours(int h)
    {
        hours = h;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setDescription(String d)
    {
        description = d;
    }
    
    public Medium(String n, int h, String de, int r)
    {
        super(n, h, de, r);
    }

    public String getDifficulty()
    {
        return difficulty;
    }
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
        return medReward;
    }
}
