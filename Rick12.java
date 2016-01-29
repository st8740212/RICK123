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
        
        System.out.println("歡迎來到我的99遊戲");
        System.out.println("請輸入你的姓名: ");
        int name = scn.nextInt();
        System.out.println("歡迎"+name);
        System.out.println("--------------開始遊戲--------------");
        int total = 0;
        for (;;)
        {
            System.out.println("我的手牌");
            System.out.println("1.[" + player1.get(0) + "]    2.[" + player1.get(1) + "]    3.[" + player1.get(2)
                    + "]    4.[" + player1.get(3) + "]    5.[" + player1.get(4) + "]");
            System.out.print("輸入你的選擇(1~5): ");
            int choose = scn.nextInt();
            total += allplayer(player1, cardlist, 1, choose);
            System.out.println("目前分數: " + total);/// player1 total cardlist
            System.out.println("**********");
            if (total > 100)
            {
                System.out.println("玩家1輸了!!!");
                break;
            }

            total += allplayer(player2, cardlist, 2, 1);
            System.out.println("目前分數: " + total);/// player2 total cardlist
            System.out.println("**********");
            if (total > 100)
            {
                System.out.println("玩家2輸了!!!");
                break;
            }

            total += allplayer(player3, cardlist, 3, 1);
            System.out.println("目前分數: " + total);/// player3 total cardlist
            System.out.println("**********");
            if (total > 100)
            {
                System.out.println("玩家3輸了!!!");
                break;
            }

            total += allplayer(player4, cardlist, 4, 1);
            System.out.println("目前分數: " + total);// player4 total cardlist
            System.out.println("**********");
            if (total > 100)
            {
                System.out.println("玩家4輸了!!!");
                break;
            }

            System.out.println("-----------下一輪----------");
        }

    }

    public static int allplayer(ArrayList<Integer> player, ArrayList<Integer> card_list, int playernumber, int choose)
    {

        int playergetcard = player.get(choose - 1);
        int number = getcard(card_list);
        player.remove(choose - 1);
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