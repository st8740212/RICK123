import java.util.Scanner;

public class Rick22 {
	public static void main(String[] args) {
		
		Scanner good = new Scanner(System.in);
   		System.out.print("請輸入數學成績:");
		int a = good.nextInt();
		System.out.print("請輸入英文成績:");
		int b = good.nextInt();
		System.out.print("請輸入國文成績:");
		int c = good.nextInt();
		
			double d;
			d=a+b+c;
			System.out.printf("平均分數 = %.2f",d/3);
	   
	}
}