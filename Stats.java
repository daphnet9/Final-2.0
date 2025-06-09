//Daphne
import java.util.ArrayList;

public class Stats {
    private static int dabloons = 0;
    private static int level = 0;
    private static int taskCount = 0;
    static private String currentAvatar = "";
    static private ArrayList<String> avatars = new ArrayList<>();
    static private ArrayList<String> achievements = new ArrayList<>();
    // private int exp = 0;
    
    public void addAvatar(String avatar) {
        avatars.add(avatar);
        currentAvatar = avatar;
    }

    public void changeAvatar(int index) {
        String availAvatar = avatars.get(index);
        if(avatars.contains(availAvatar)) {
            currentAvatar = availAvatar;
            System.out.println("Avatar changed to: " + currentAvatar);
        } else {
            System.out.println("Avatar not found in closet.");
        }
    }
    public static void viewAchievements() {
        if(achievements.isEmpty()) {
            System.out.println("No achievements");
            return;
        }
        System.out.println("Your Achievements: ");
        for(String i : achievements) System.out.println("- " + i);
    }

    public void addAchievement(String achievement) {
        achievements.add(achievement);
    }

    public static void viewCloset() {
        if(avatars.isEmpty()) {
            System.out.println("Your closet is currently empty. Roll to earn avatars!");
            return;
        }
        System.out.println("Your closet:");
        for(String avatar : avatars) {
            System.out.println("- " + avatar);
        }
    }

    public static String currentAvatar()
    {
        return currentAvatar;
    }

    public static int getDabloons() {
        return dabloons;
    }
    public static int getLevel() {
        return level;
    }

    public static int getTaskCount() {
        return taskCount;
    }

    public static void incrementTaskCount() {
        taskCount++;
    }
    // private void checkLevelUp() {
    //     if(exp >= level * 50) {
    //         level++;
    //         System.out.println("Level up! You are now level " + level + ".");
    //     }
    // }

    public static void addDabloons(int addedAmount) {
        dabloons += addedAmount;
        //for the sake of the presentation
    }
}
