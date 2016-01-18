import java.util.Scanner;

public class Rick22 {
	public static void main(String[] args) {
		
	Scanner good = new Scanner(System.in);
   	System.out.print("請輸入數學成績:");
	int math = good.nextInt();
	System.out.print("請輸入英文成績:");
	int english = good.nextInt();
	System.out.print("請輸入國文成績:");
	int chinese = good.nextInt();
	
	
	System.out.printf("平均分數 = %.2f",(double)(math+english+chinese)/3);
	   
	}
}