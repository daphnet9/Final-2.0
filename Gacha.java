//Daphne
import java.util.ArrayList;
import java.util.Random;

public class Gacha {
    //arraylist with all the possible rolls
    public static String[] pool = {
        "(•‿•)", "(◑‿◐)", "…ᘛ⁐̤ᕐᐷ", "=＾● ⋏ ●＾=", "(¬‿¬)",
        "ʕ•ᴥ•ʔ", "╰(°▽°)╯", "ʕっ•ᴥ•ʔっ", "ʕ•́ᴥ•̀ʔっ", "ʕ◕ᴥ◕ʔ",
        "/ᐠ｡‸｡ᐟ\""
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
        return result;
    }

    //method that returns the indexes of array (just a method for ourselves to keep track)

    //method that randomizes a number in the range of the array and gets the item at that index (return function)
}
