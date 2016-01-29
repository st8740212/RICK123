import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardList = new ArrayList<Integer>();
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> player4 = new ArrayList<Integer>();
        card(cardList);
        Scanner scn = new Scanner(System.in);
        playerCardList(cardList, player1, player2, player3, player4);

        // System.out.println("歡迎來到我的99遊戲");
        // System.out.print("請輸入你的姓名: ");
        // int name = scn.nextInt();
        // System.out.println("歡迎" + name);
        // System.out.println("--------------開始遊戲--------------");

        int total = 0;

        for (;;)
        {
            total = specialCard(allPlayer(player1, cardList, 1, playerOne(player1)), total);
            System.out.println("目前分數: " + total);
            System.out.println("**********");
            if (total > 99)
            {
                System.out.println("玩家1輸了!!!");
                break;
            }

            // total=specialCard_K( allPlayer(player2, cardList, 2,
            // computer(player2, total)),total);
            // System.out.println("目前分數: " + total);
            // System.out.println("**********");
            // if (total > 99)
            // {
            // System.out.println("玩家2輸了!!!");
            // break;
            // }
            //
            // total += allPlayer(player3, cardList, 3, computer(player3,
            // total));
            // System.out.println("目前分數: " + total);
            // System.out.println("**********");
            // if (total > 99)
            // {
            // System.out.println("玩家3輸了!!!");
            // break;
            // }
            //
            // total += allPlayer(player4, cardList, 4, computer(player4,
            // total));
            // System.out.println("目前分數: " + total);
            //
            // if (total > 99)
            // {
            // System.out.println("玩家4輸了!!!");
            // break;
            // }

            System.out.println("-----------下一輪----------");
        }

    }

    public static int specialCard(int specialCard, int total)
    {
        Scanner scn = new Scanner(System.in);
        if (specialCard == 13)
        {
            total = 99;
        } 
        else if (specialCard == 12)
        {
            System.out.print("請問要加20還減20(輸入 1=加，2=減): ");
            int choose = scn.nextInt();
            if (choose == 1)
            {
                total += 20;
            } else
            {
                total -= 20;
            }
        } 
        else if(specialCard == 11)
        {
            total +=0;
        }
        else if(specialCard == 10)
        {
            System.out.print("請問要加10還減10(輸入 1=加，2=減): ");
            int choose = scn.nextInt();
            if (choose == 1)
            {
                total += 10;
            } else
            {
                total -= 10;
            }
        }
        else
        {
            total = total + specialCard;
        }
        return total;
    }

    private static void playerCardList(ArrayList<Integer> cardList, ArrayList<Integer> player1,
            ArrayList<Integer> player2, ArrayList<Integer> player3, ArrayList<Integer> player4)
    {
        for (int i = 1; i <= 5; i++)
        {
            player1.add(getCard(cardList));
            player2.add(getCard(cardList));
            player3.add(getCard(cardList));
            player4.add(getCard(cardList));
        }
    }

    public static int computer(ArrayList<Integer> player, int total)
    {
        int choose;
        if (total <= 70)
        {
            choose = 5;
        } else
        {
            choose = 1;
        }
        return choose;
    }

    public static int playerOne(ArrayList<Integer> player)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("我的手牌");
        Collections.sort(player);
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(" " + i + ".[" + player.get(i - 1) + "]");
        }
        System.out.println("");
        System.out.print("輸入你的選擇(1~5): ");
        int choose = scn.nextInt();
        return choose;
    }

    public static int allPlayer(ArrayList<Integer> player, ArrayList<Integer> card_list, int playerNumber, int choose)
    {
        Collections.sort(player);
        int playergetcard = player.get(choose - 1);
        int number = getCard(card_list);
        player.remove(choose - 1);
        player.add(number);
        if(playergetcard==4|playergetcard==5|playergetcard==10|playergetcard==11|playergetcard==12|playergetcard==13)
        {
            System.out.println("玩家" + playerNumber + "出: " + "特殊牌"+playergetcard);
        }
        else
        {
            System.out.println("玩家" + playerNumber + "出: " + playergetcard);
        }
        return playergetcard;
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

    public static int getCard(ArrayList<Integer> templist)
    {
        Random ran = new Random();
        int temp = ran.nextInt(templist.size());
        int number = templist.get(temp);
        templist.remove(temp);
        return number;
    }

}