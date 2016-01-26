import java.util.Scanner;

public class Rick
{
    public static void main(String[] args)
    {
        Scanner net123 = new Scanner(System.in);
        System.out.print("請輸入你的姓名:");
        String name = net123.next();
        System.out.print("請輸入你的年齡:");
        int age = net123.nextInt();
        System.out.printf("%s 你好!你的年齡為%d歲%n", name, age);
        System.out.print("請輸入你的座右銘:");
        String mot;
        while ((mot = net123.nextLine()).equals(""))
        {
        }
        System.out.println("你的座右銘是:" + mot);
        
    }
}
