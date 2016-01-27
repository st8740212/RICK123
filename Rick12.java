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
        
        System.out.println(card(0));
        
    }

    public static int card(int temp)
    {
        ArrayList<Integer> lists = new ArrayList<Integer>();

        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
                lists.add(j);
            }
        }
        System.out.println(lists.size());
        lists.remove(temp);
        System.out.println(lists.size());
        return lists.get(temp);
        
        
        /*
        for (int var : lists)
        {
            System.out.print(var + " ");
        }

        System.out.println("\n" + lists.get(35));
        */
    }
    public static void wash(int wash)
    {
        
    }
}
