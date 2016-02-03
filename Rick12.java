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

        ArrayList<Integer> sequencePlayerList = new ArrayList<Integer>();
        cardDeck(cardList);
        Scanner scn = new Scanner(System.in);
        for (int i = 1; i <= 4; i++)
        {
            playerCardList(cardList, ALL_PLAYER_IN_HERE(i));
        }
        setPlayerNumber(sequencePlayerList);

        // System.out.println("歡迎來到我的99遊戲");
        // System.out.print("請輸入你的姓名: ");
        // String name = scn.nextLine();
        // System.out.println("歡迎" + name);
        // System.out.println("--------------開始遊戲--------------");

        int total = 0;
        int intPlayerUser = 0;
        int intComputerPlayer = 0;
        int user_player_number = 1;
        int AI_Player_Number = 3;
        for (;;)
        {
            ArrayList<Integer> Set_SpecialCard_Turn_Place = ALL_PLAYER_IN_HERE(specialCard_Turn_Place(sequencePlayerList, sequenceNumber(intComputerPlayer, intPlayerUser)));

            if (Set_SpecialCard_Turn_Place == ALL_PLAYER_IN_HERE(1))
            {
                intPlayerUser = playOutCard(Set_SpecialCard_Turn_Place, cardList, user_player_number, playerUserChoose(ALL_PLAYER_IN_HERE(1)));
                total = UserChooseSpecialCard(intPlayerUser, total);
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
                int selectComputer = AIChooseCard(Set_SpecialCard_Turn_Place, total);
                intComputerPlayer = playOutCard(Set_SpecialCard_Turn_Place, cardList, sequencePlayerList.get(AI_Player_Number), selectComputer);
                total = AIChooseSpecialCard(intComputerPlayer, total);
                intPlayerUser = 0;

                System.out.println("目前分數: " + total);
                System.out.println("**********");
                if (total > 99)
                {
                    System.out.println("玩家" + sequencePlayerList.get(AI_Player_Number) + "輸了!!!");
                    break;
                }
            }
        }
    }

    public static ArrayList<Integer> ALL_PLAYER_IN_HERE(int number)
    {
        ArrayList<Integer> returnPlayer = null;
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> player4 = new ArrayList<Integer>();
        switch (number)
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

    public static int specialCard_Turn_Place(ArrayList<Integer> playerList, int number)/// 1~3是指定，4是正常排序，5是迴轉
    {
        int playerNumber = 0;
        if (number == 4)
        {
            playerNumber = playerList.get(0);
            playerList.remove(0);
            playerList.add(playerNumber);
        }
        else if (number == 5)
        {
            playerNumber = playerList.get(2);
            Collections.swap(playerList, 0, 2);
            playerList.remove(0);
            playerList.add(playerNumber);

        }
        else
        {
            for (int i = 1; i <= number; i++)
            {
                int setPlayer = playerList.get(0);
                playerList.remove(0);
                playerList.add(setPlayer);
            }
            playerNumber = playerList.get(3);
        }

        return playerNumber;
    }

    public static void setPlayerNumber(ArrayList<Integer> playerCard)
    {
        for (int i = 1; i < 5; i++)
        {
            playerCard.add(i);
        }
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
        default:
            total = total + specialCard;
        }
        return total;
    }

    private static void playerCardList(ArrayList<Integer> cardList, ArrayList<Integer> player)
    {
        for (int i = 1; i <= 5; i++)
        {
            player.add(shuffleCard(cardList));
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
        int playergetcard = player.get(choose - 1);
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
        cardList.add(number);
        return number;
    }
}