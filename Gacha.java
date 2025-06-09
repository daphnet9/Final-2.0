//Daphne
import java.util.ArrayList;
import java.util.Random;

public class Gacha {

    public static String gachaUI()
    {
        String welcome = "Welcome to the Gacha! Type \"ROLL\" to roll, or type \"EXIT\" to exit the Gacha.";
        String line = "---------------------------------------------------------------------------------";
        String details = "| Your Dabloons: " + Stats.getDabloons() + "\n" + "| Roll cost: 300"; 
        return welcome + "\n" + line + "\n" + details + "\n" + line;
    }
    
    public static String[] pool = {
        ":)", ":(", ":D", "XD", ":-)", ":]",
        "=)", ":3", ">:(", ":/",
        "(•‿•)", "…ᘛ⁐̤ᕐᐷ", "=＾● ⋏ ●＾=", "(¬‿¬)",
        "ʕ•ᴥ•ʔ", "╰(°▽°)╯", "ʕっ•ᴥ•ʔっ", "ʕ•́ᴥ•̀ʔっ", "ʕ◕ᴥ◕ʔ"
    };
    
    public static void setPool (ArrayList<String> gacha, String[] rolls) 
    {
        for(String i : rolls)
        {
            gacha.add(i);
        }
    }

    public static String roll(ArrayList<String> pool) {
        Random rand = new Random();
        int index = rand.nextInt(pool.size());
        String result = pool.get(index);
        System.out.println("You rolled: " + result);
        System.out.println("Dabloons left: " + Stats.getDabloons());
        return result;
    }
}
