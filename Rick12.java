import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Rick12
{
    public static void main(String[] args)
    {
        /*
         * Scanner scn = new Scanner(System.in);
         * System.out.println("歡迎來到我的99程式"); System.out.print("請輸入你的名子: ");
         * String name = scn.next(); System.out.println("歡迎" + name);
         * System.out.println("我們有四個人在玩遊戲");
         */
        System.out.println(card(52));
    }

    public static int card(int card)
    {
        ArrayList list = new ArrayList(52);
        
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
               int a=i+""+j;             //這邊沒辦法連結兩個數值
                System.out.println(i+""+j);
                
            }
        }
        
        return card;
        

        
    }

}