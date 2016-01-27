import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

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
        
    }

    public static void card()
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[52];
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
                a[j] = sc.nextInt();
            }
        }
        for (int i = 52; i >= 0; i--)
        {
            System.out.print(a[i]);

        }
        
    }
}