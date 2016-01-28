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
        
        for (int i = 1; i <52; i++)
        {
            if(total < 100){
            System.out.println("玩家1出: "+player1.get(0));
            total += player1.get(0);
            player1.remove(0);
            player1.add(getcard(cardlist));
            System.out.println("目前分數: "+total);
            }
            else {
                System.out.println("玩家1輸了!!!");
                break;
            }
            if(total < 100){
            System.out.println("玩家2出: "+player2.get(0));
            total +=  player2.get(0);
            player2.remove(0);
            player2.add(getcard(cardlist));
            System.out.println("目前分數: "+total);
            }
            
            else {
            System.out.println("玩家2輸了!!!");
                break;
                
            }
            if(total < 100){
            System.out.println("玩家3出: "+player3.get(0));
            total += player3.get(0) ;
            player3.remove(0);
            player3.add(getcard(cardlist));
            System.out.println("目前分數: "+total);
            }
            else {
            System.out.println("玩家3輸了!!!");
            break;
            }
            if(total < 100){
            System.out.println("玩家4出: "+player4.get(0));
            total += player4.get(0);
            player4.remove(0);
            player4.add(getcard(cardlist));
            System.out.println("目前分數: "+total);
            }
            
            else {
            System.out.println("玩家4輸了!!!");
            break;
            }
            System.out.println("-----------下一輪----------");
 
        }

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