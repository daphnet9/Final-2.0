//Daphne
import java.util.ArrayList;

public class Stats {
    private int dabloons = 0;
    private int exp = 0;
    private int level = 0;
    private int taskCount = 0;
    private String currentAvatar = "";
    private ArrayList<String> avatars = new ArrayList<>();
    private ArrayList<String> achievements = new ArrayList<>();
    
    public void addAvatar(String avatar) {
        avatars.add(avatar);
        currentAvatar = avatar;
    }

    public void viewAchievements() {
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

    public void viewCloset() {
        if(avatars.isEmpty()) {
            System.out.println("Your closet is currently empty. Roll to earn avatars!");
            return;
        }
        System.out.println("Your closet:");
        for(String avatar : avatars) {
            System.out.println("- " + avatar);
        }
    }

    public int getDabloons() {
        return dabloons;
    }
    public int getLevel() {
        return level;
    }
    // public String getCurrentAvatar() {
    //     return 
    // }
    public int getTaskCount() {
        return taskCount;
    }

    public void incrementTaskCount() {
        taskCount++;
    }
    private void checkLevelUp() {
        if(exp >= level * 50) {
            level++;
            System.out.println("Level up! You are now level " + level + ".");
        }
    }

    //avatar array

    //achievements array
    
    //vars for assignments completed, coin pouch, current avatar
    //method for printing out whole achievement array (viewAchievements)
    //method to update avatar AND another method to select avatar from arraylist

    //add avatar to array(?) by making an addAvatar() which calls the random method from gacha and adds it//
}
