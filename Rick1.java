import java.util.Scanner;

public class Rick1
{
    public static void main(String[] args)
    {

        Scanner good = new Scanner(System.in);
        System.out.print("�п�J�Ĥ@�Ӿ��:");
        int a = good.nextInt();
        System.out.print("�п�J�ĤG�Ӿ��:");
        int b = good.nextInt();
        boolean c = true;
        c = a > b;
        System.out.println(a + " > " + b + " = " + c);

    }
}