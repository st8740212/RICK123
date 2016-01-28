import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardlist = new ArrayList<Integer>();
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> player4 = new ArrayList<Integer>();
        card(cardlist);
        Scanner scn = new Scanner(System.in); // 玩家輸入

        for (int i = 1; i <= 5; i++)
        {
            player1.add(getcard(cardlist));
            player2.add(getcard(cardlist));
            player3.add(getcard(cardlist));
            player4.add(getcard(cardlist));
        }

        int total = 0;
        for (;;)
        {
            total += allplayer(player1, cardlist, 1);
            System.out.println("目前分數: " + total);/// player1 total cardlist
            if (total > 100)
            {
                System.out.println("玩家1輸了!!!");
                break;
            }

            total += allplayer(player2, cardlist, 2);
            System.out.println("目前分數: " + total);/// player2 total cardlist
            if (total > 100)
            {
                System.out.println("玩家2輸了!!!");
                break;
            }

            total += allplayer(player3, cardlist, 3);
            System.out.println("目前分數: " + total);/// player3 total cardlist
            if (total > 100)
            {
                System.out.println("玩家3輸了!!!");
                break;
            }

            total += allplayer(player4, cardlist, 4);
            System.out.println("目前分數: " + total);// player4 total cardlist
            if (total > 100)
            {
                System.out.println("玩家4輸了!!!");
                break;
            }

            System.out.println("-----------下一輪----------");
        }

    }

    public static int allplayer(ArrayList<Integer> player, ArrayList<Integer> card_list, int playernumber)
    {
        int playergetcard = player.get(0);
        int number = getcard(card_list);
        player.remove(0);
        player.add(number);
        System.out.println("玩家" + playernumber + "出: " + playergetcard);
        return playergetcard;
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
    }

    public static int getcard(ArrayList<Integer> templist) // 隨機亂數取牌
    {
        Random ran = new Random();
        int temp = ran.nextInt(templist.size());
        int number = templist.get(temp);
        templist.remove(temp);
        return number;
    }

}