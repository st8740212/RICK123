import java.util.Scanner;

public class Rick
{
    public static void main(String[] args)
    {
        Scanner net = new Scanner(System.in);
        System.out.print("請輸入你的姓名:");
        String name = net.next();
        System.out.print("請輸入你的年齡:");
        int age = net.nextInt();
        System.out.printf("%s 你好!你的年齡為%d歲%n", name, age);
        System.out.print("請輸入你的座右銘:");
        String mot;
        while ((mot = net.nextLine()).equals(""))
        {
        }
        System.out.println("你的座右銘是:" + mot);
        // 12313132
    }
}
