import java.util.Scanner;

public class Rick3 {
	public static void main(String[] args) {
	Scanner test = new Scanner(System.in);
	
   	int num1,num2,num3,max;
   	System.out.print("請輸入第一個數字");
   	num1=test.nextInt();
   	System.out.print("請輸入第二個數字");
   	num2=test.nextInt();
   	System.out.print("請輸入第三個數字");
   	num3=test.nextInt();
   	if (num1>num2){
   		if(num1>num3) 				
   			max = num1;
   		else
   			max = num3;
    	}///56123213656//
   	
   	
	}
}