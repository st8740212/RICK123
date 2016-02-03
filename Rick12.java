import java.util.*;
import java.util.Random;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.ArrayList;
import java.util.Collections;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardList = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> playerList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sequencePlayerList = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        setplayerList(playerList); // initialize
        cardDeck(cardList);
        playerCardList(cardList, playerList);
        setPlayerNumber(sequencePlayerList);

        // System.out.println("歡迎來到我的99遊戲");
        // System.out.print("請輸入你的姓名: ");
        // String name = scn.nextLine();
        // System.out.println("歡迎" + name);
        // System.out.println("輸入'0'即可立即結束遊戲喔~~");
        // System.out.println("--------------開始遊戲--------------");
        int total = 0;
        int SetCardVariable = 1;
        int playerOutTheCard = 0;
        ArrayList<Integer> setSpecialCardTurnPlace = playerList.get(0);
        for (;;)
        {

            if (setSpecialCardTurnPlace == playerList.get(0))
            {
                playerOutTheCard = playOutCard(setSpecialCardTurnPlace, cardList, SetCardVariable, playerUserChoose(playerList.get(0)));
                SetCardVariable = specialCardVariable(sequencePlayerList, userSequenceNumber(playerOutTheCard));
                total = UserChooseSpecialCard(playerOutTheCard, total);
                System.out.println("目前分數: " + total);
                System.out.println("**********");
                if (total > 99)
                {
                    System.out.println("玩家1輸了!!!");
                    break;
                }
                else
                {
                    if (playerOutTheCard == -1)
                    {
                        System.out.println("遊戲結束!!!");
                        for (int i = 0; i <= 3; i++)
                        {
                            System.out.println("**********");
                            System.out.println("玩家" + (i + 1) + "的手牌");
                            System.out.println(playerList.get(i));
                        }
                        break;
                    }
                }
            }
            else
            {
                int selectComputer = AIChooseCard(setSpecialCardTurnPlace, total);
                playerOutTheCard = playOutCard(setSpecialCardTurnPlace, cardList, SetCardVariable, selectComputer);
                SetCardVariable = specialCardVariable(sequencePlayerList, AISequenceNumber(playerOutTheCard));
                total = AIChooseSpecialCard(playerOutTheCard, total);
                System.out.println("目前分數: " + total);
                System.out.println("**********");
                if (total > 99)
                {
                    System.out.println("玩家" + sequencePlayerList.get(3) + "輸了!!!");
                    break;
                }
            }
            setSpecialCardTurnPlace = SpecialCardTurnPlace(SetCardVariable, playerList);

        }
    }

    public static void setplayerList(ArrayList<ArrayList<Integer>> playerList)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 1; i <= 4; i++)
        {
            playerList.add(new ArrayList<Integer>());
        }
    }

    public static int AISequenceNumber(int AINumber)
    {
        int player;
        if (AINumber == 5)
        {
            player = 5;
        }
        else if (AINumber == 4)
        {
            Random ran = new Random();
            player = ran.nextInt(3) + 1;
        }
        else
        {
            player = 4;
        }
        return player;
    }

    static int SPEICAL_CARD_TYPE_REVERSE = 5;

    public static int userSequenceNumber(int UserNumber)
    {
        int player;
        if (UserNumber == 5)
        {
            player = SPEICAL_CARD_TYPE_REVERSE;
        }
        else if (UserNumber == 4)
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

    public static int specialCardVariable(ArrayList<Integer> playerList1, int SPEICAL_CARD_TYPE)
    {
        int setPlayer;
        if (SPEICAL_CARD_TYPE == 4) //// 正常排序
        {
            setPlayer = playerList1.get(0);
            playerList1.remove(0);
            playerList1.add(setPlayer);
        }
        else if (SPEICAL_CARD_TYPE == SPEICAL_CARD_TYPE_REVERSE) ///// 5號牌-迴轉
        {
            setPlayer = playerList1.get(2);
            Collections.swap(playerList1, 0, 2);// 1234 3214 2341
            playerList1.remove(0);
            playerList1.add(setPlayer);

        }
        else /// 4號牌-指定
        {
            for (int i = 1; i <= SPEICAL_CARD_TYPE; i++)
            {
                int Player = playerList1.get(0);
                playerList1.remove(0);
                playerList1.add(Player);
            }
            setPlayer = playerList1.get(3);
        }
        return setPlayer;
    }

    public static ArrayList<Integer> SpecialCardTurnPlace(int number, ArrayList<ArrayList<Integer>> player)
    {
        ArrayList<Integer> returnPlayer;
        returnPlayer = player.get(number - 1);
        return returnPlayer;
    }

    public static void setPlayerNumber(ArrayList<Integer> playerCard)
    {
        for (int i = 2; i < 5; i++)
        {
            playerCard.add(i);
        }
        playerCard.add(1);
    }

    public static int AIChooseSpecialCard(int specialCard, int total)
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

    public static int UserChooseSpecialCard(int specialCard, int total)
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
        case -1:
            total += 0;
            break;
        default:
            total = total + specialCard;
        }
        return total;
    }

    private static void playerCardList(ArrayList<Integer> cardList, ArrayList<ArrayList<Integer>> player)
    {
        for (int j = 0; j <= 3; j++)
        {
            for (int i = 1; i <= 5; i++)
            {
                player.get(j).add(shuffleCard(cardList));
            }
        }
    }

    public static int AIChooseCard(ArrayList<Integer> player, int total)
    {

        int choose = 3;
        for (int i = 4; i >= 0; i--)
        {
            Collections.sort(player);
            switch (player.get(i))
            {
            case 12:
                if (total >= 80 || total >= 70)
                {
                    choose = i;
                }
                else
                {
                    break;
                }

            case 10:
                if (total >= 90 || total >= 60)
                {
                    choose = i;
                }
                else
                {
                    break;
                }

            case 11:
                if (total >= 90)
                {
                    choose = i;
                }
                else
                {
                    break;
                }
            case 13:
                if (total >= 90)
                {
                    choose = i;
                }
                else
                {
                    break;
                }
            case 5:
                if (total >= 90)
                {
                    choose = i;
                }
                else
                {
                    break;
                }
            case 4:
                if (total >= 90)
                {
                    choose = i;
                }
                else
                {
                    break;
                }
            }
            if (total + player.get(i) > 80)
            {
                choose = 4;
            }
            else if (total < 50 && player.get(i) != 11 && player.get(i) != 4 && player.get(i) != 5)
            {
                choose = 3;
            }
            else if (total > 50 && total <= 80)
            {
                choose = 2;
            }

        }
        return choose + 1;
    }

    public static int playerUserChoose(ArrayList<Integer> player)
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

    public static int playOutCard(ArrayList<Integer> player, ArrayList<Integer> card_list, int playerNumber, int choose)
    {
        Collections.sort(player);
        int playergetcard;
        if (choose == 0)
        {
            playergetcard = -1;
        }
        else
        {
            playergetcard = player.get(choose - 1);
            int number = shuffleCard(card_list);
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
        }
        return playergetcard;
    }

    public static void cardDeck(ArrayList<Integer> cardList)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
                cardList.add(j);
            }
        }
    }

    public static int shuffleCard(ArrayList<Integer> cardList)
    {
        Random ran = new Random();
        int temp = ran.nextInt(cardList.size());
        int number = cardList.get(temp);
        cardList.remove(temp);
        return number;
    }
}