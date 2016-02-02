import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardList = new ArrayList<Integer>();
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> player4 = new ArrayList<Integer>();
        ArrayList<Integer> sequencePlayerList = new ArrayList<Integer>();
        card(cardList);
        Scanner scn = new Scanner(System.in);
        playerCardList(cardList, player1, player2, player3, player4);
        setPlayerNumber(sequencePlayerList);

        // System.out.println("歡迎來到我的99遊戲");
        // System.out.print("請輸入你的姓名: ");
        // String name = scn.nextLine();
        // System.out.println("歡迎" + name);
        // System.out.println("--------------開始遊戲--------------");
        int total = 0;
        int intPlayerOne = 0;
        int intComputerPlayer = 0;
        for (;;)
        {
            ArrayList<Integer> tempList = drawPlayer(sequencePlayerList, sequenceNumber(intComputerPlayer, intPlayerOne), player1,
                    player2, player3, player4);

            if (tempList == player1)
            {
                intPlayerOne = licensing(tempList, cardList, 1, playerOneChoose(player1));
                total = peopleChooseSpecialCard(intPlayerOne, total);
                intComputerPlayer = 0;
                System.out.println("目前分數: " + total);
                System.out.println("**********");
                if (total > 99)
                {
                    System.out.println("玩家1輸了!!!");
                    break;
                }
            }
            else
            {
                int selectComputer = computerChooseCard(tempList, total);
                intComputerPlayer = licensing(tempList, cardList, sequencePlayerList.get(3), selectComputer);
                total = computerChooseSpecialCard(intComputerPlayer, total);
                intPlayerOne = 0;
                System.out.println("目前分數: " + total);
                System.out.println("**********");
                if (total > 99)
                {
                    System.out.println("玩家" + sequencePlayerList.get(3) + "輸了!!!");
                    break;
                }
            }
        }
    }

    public static int sequenceNumber(int number1, int number2)
    {
        int player = 4;

        if (number1 == 5)// 迴轉
        {
            player = 5;
        }
        else if (number2 == 5)
        {
            player = 5;
        }
        else if (number1 == 4)// 指定
        {
            Random ran = new Random();
            player = ran.nextInt(3) + 1;
        }
        else if (number2 == 4)// 指定
        {
            Scanner scn = new Scanner(System.in);
            System.out.print("請問要指定哪位玩家(輸入 1~3，要注意反轉順序!!): ");
            int choose = scn.nextInt();
            player = choose;
        }
        else
        {
            player = 4;
        }
        return player;
    }

    public static ArrayList<Integer> drawPlayer(ArrayList<Integer> playerList, int number, ArrayList<Integer> player1,
            ArrayList<Integer> player2, ArrayList<Integer> player3, ArrayList<Integer> player4)/// 1~3是指定，4是正常排序，5是迴轉
    {
        int Player = 0;
        if (number == 4) //// 正常排序
        {
            Player = playerList.get(0);
            playerList.remove(0);
            playerList.add(Player);
        }
        else if (number == 5) ///// 5號牌-迴轉
        {
            Player = playerList.get(2);
            Collections.swap(playerList, 0, 2);
            playerList.remove(0);
            playerList.add(Player);

        }
        else /// 4號牌-指定
        {
            for (int i = 1; i <= number; i++)
            {
                int setPlayer = playerList.get(0);
                playerList.remove(0);
                playerList.add(setPlayer);
            }
            Player = playerList.get(3);
        }
        ArrayList<Integer> returnPlayer = null;
        switch (Player)
        {
        case 1:
            returnPlayer = player1;
            break;
        case 2:
            returnPlayer = player2;
            break;
        case 3:
            returnPlayer = player3;
            break;
        case 4:
            returnPlayer = player4;
            break;
        }
        return returnPlayer;
    }

    public static void setPlayerNumber(ArrayList<Integer> allPlayer)
    {
        for (int i = 1; i < 5; i++)
        {
            allPlayer.add(i);
        }
    }

    public static int computerChooseSpecialCard(int specialCard, int total)
    {
        switch (specialCard)
        {
        case 13:
            total = 99;
            break;
        case 12:
            if (total >= 80)
            {
                total -= 20;
            }
            else if (total < 19)
            {
                total += 20;
            }
            else
            {
                total += 20;
            }
            break;
        case 11:
            total += 0;
            break;
        case 10:
            if (total >= 90)
            {
                total -= 10;
            }
            else if (total < 9)
            {
                total += 10;
            }
            else
            {
                total += 10;
            }
            break;
        case 5:
            total += 0;
            break;
        case 4:
            total += 0;
            break;
        default:
            total = total + specialCard;
        }
        return total;
    }

    public static int peopleChooseSpecialCard(int specialCard, int total)
    {
        Scanner scn = new Scanner(System.in);
        switch (specialCard)
        {
        case 13:
            total = 99;
            break;
        case 12:
            System.out.print("請問要加20還減20(輸入 1=加，2=減): ");
            int choose = scn.nextInt();
            if (choose == 1)
            {
                total += 20;
            }
            else
            {
                total -= 20;
            }
            break;
        case 11:
            total += 0;
            break;
        case 10:
            System.out.print("請問要加10還減10(輸入 1=加，2=減): ");
            int choose1 = scn.nextInt();
            if (choose1 == 1)
            {
                total += 10;
            }
            else
            {
                total -= 10;
            }
            break;
        case 5:
            total += 0;
            break;
        case 4:
            total += 0;
            break;
        default:
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

    public static int computerChooseCard(ArrayList<Integer> player, int total)
    {

        int choose = 0;
        for (int i = 4; i >= 0; i--)
        {
            Collections.sort(player);
            switch (player.get(i))
            {
            case 12:
                if (total > 80 || total > 70)
                {
                    choose = i;
                }
                else
                {
                    break;
                }

            case 10:
                if (total > 90 || total > 60)
                {
                    choose = i;
                }
                else
                {
                    break;
                }

            case 11:
                if (total > 90)
                {
                    choose = i;
                }
                else
                {
                    break;
                }

            default:
                if (total + player.get(i) > 100)
                {
                    choose = 0;
                }
                else if (total < 50 && player.get(i) != 12 && player.get(i) != 11 && player.get(i) != 10)
                {
                    choose = 2;
                }
                else
                {
                    choose = i;
                }
            }
        }
        return choose + 1;
    }

    public static int playerOneChoose(ArrayList<Integer> player)
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

    public static int licensing(ArrayList<Integer> player, ArrayList<Integer> card_list, int playerNumber, int choose)
    {
        Collections.sort(player);
        int playergetcard = player.get(choose - 1);
        int number = getCard(card_list);
        player.remove(choose - 1);
        player.add(number);
        if (playergetcard == 10 || playergetcard == 11 || playergetcard == 12 || playergetcard == 13
                || playergetcard == 4 || playergetcard == 5)
        {
            System.out.println("玩家" + playerNumber + "出: " + "特殊牌" + playergetcard);
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