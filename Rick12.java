import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardlist = new ArrayList<Integer>();
        Random ran = new Random();
        card(cardlist);
        // System.out.println(cardlist.size());
        // System.out.println(ran.nextInt(cardlist.size()));
        // System.out.println(getcard(a, cardlist));
        //你可以把getcard這個method改成直接取random的值
        //你只要把random的那行code拿進來  取代原本的temp就可以了
        
        for (int i = 1; i <= 52; i++)
        {
            System.out.println(getcard(ran.nextInt(cardlist.size()), cardlist));
        }
    
        
    }

    public static void card(ArrayList<Integer> templist)
    {

        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
                templist.add(j);
            }
        }
        /*
         * for (int var : lists) { System.out.print(var + " "); }
         * 
         * System.out.println("\n" + lists.get(35));
         */
    }

    public static int getcard(int temp, ArrayList<Integer> templist)
    {
        int number = templist.get(temp);
        templist.remove(temp);
        // System.out.println(templist.size()); 範圍大小 {0 ~(templist.size()-1)}
         
        return number;
    }

}