import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;  
public class Rick12
{
    public static void main(String[] args)
    {
       /* Scanner scn = new Scanner(System.in);
        System.out.println("歡迎來到我的99程式");
        System.out.print("請輸入你的名子: ");
        String name = scn.next();
        System.out.println("歡迎" + name);
        System.out.println("我們有四個人在玩遊戲");*/
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("楊過");  
        list.add(1,"小龍女");      
        System.out.println(list.size());
        System.out.println(list.get(1));  
    }

    public static void card(int card)
    {
       

        for (int i = 0; i <= 13; i++)
        {
            for (int a = 0; a <= 4; a++)
            {
                System.out.println(card);
            }
        }

    }

}