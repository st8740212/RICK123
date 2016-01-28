import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardlist = new ArrayList<Integer>();
       
        card(cardlist);
        // System.out.println(cardlist.size());
        // System.out.println(ran.nextInt(cardlist.size()));
        // int a=ran.nextInt(cardlist.size());
        // System.out.println(getcard(a, cardlist));
        randomcard(cardlist);
        
        
    }

    public static void card(ArrayList<Integer> templist) /// 定義52張牌
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

    public static int getcard(int temp, ArrayList<Integer> templist) /// 從牌庫拿取牌
    {
        int number = templist.get(temp);
        templist.remove(temp);
        // System.out.println(templist.size()); 範圍大小 {0 ~(templist.size()-1)}

        return number;
    }

    public static void randomcard(ArrayList<Integer> random)  //把牌組隨機排列
    {
        Random ran = new Random();
        int b = ran.nextInt(random.size());
        for (int i = 1; i <= 52; i++) // 隨機亂數
        {
            b = ran.nextInt(random.size());
            System.out.println(getcard(b, random));
        }
    }
}
