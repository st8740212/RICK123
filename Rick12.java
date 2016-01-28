import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardlist = new ArrayList<Integer>();
        card(cardlist);
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> player4 = new ArrayList<Integer>();
        for(int i =1; i<=52; i++)
        {
        player1.add(getcard(cardlist));
        }
       
        
       
          System.out.println(player1.size());

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
    }

    public static int getcard(ArrayList<Integer> templist)
    {
        Random ran = new Random();
        int temp = ran.nextInt(templist.size());
        int number = templist.get(temp);
        templist.remove(temp);
        return number;
    }

}