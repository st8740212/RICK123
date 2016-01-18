import java.util.Scanner;

public class Rick1 {
	public static void main(String[] args) {
		
		Scanner good = new Scanner(System.in);
   		System.out.print("請輸入第一個整數:");
		int a = good.nextInt();
		System.out.print("請輸入第二個整數:");
		int b = good.nextInt();
		boolean c= true;
		c=a>b;
		System.out.println(a+" > "+b+" = "+c);
	   
	}
}