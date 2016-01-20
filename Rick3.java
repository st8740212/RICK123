import java.util.Scanner;

public class Rick3 {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		
		int num1=36,num2=12;
		String se1;
		do{
		System.out.println("***********四則運算選單************* ");
		System.out.println("A..+");
		System.out.println("B..-");
		System.out.println("C..*");
		System.out.println("D../");
		System.out.println("OUT");
		System.out.println("*******************************");
			do{
				System.out.print("請選擇功能: ");
				se1=test.next().toUpperCase();
			}while ("ABCDE".indexOf(se1)== -1 );
			
			switch (se1){
				case "A":
					System.out.printf("%d+%d = %d%n",num1,num2,num1+num2);
					break;
				case "B":
					System.out.printf("%d-%d = %d%n",num1,num2,num1-num2);
					break;
				case "C":
					System.out.printf("%d*%d = %d%n",num1,num2,num1*num2);
					break;
				case "D":
					System.out.printf("%d/%d = %d%n",num1,num2,num1/num2);
					break;
				case "E":
					System.out.println("OUTTTTTTTTTTTTT");
					break;
					}
		}while(!(se1.equals("E")));
	}
}