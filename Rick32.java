import java.util.Scanner;
public class Rick32 {
	public static void main(String[] args) {
		Scanner good = new Scanner(System.in);
		System.out.print("叫块计耞琌计临琌案计: ");
		int number = good.nextInt();
		if(number %2 == 0)
			System.out.print("计案计");
		else
			System.out.print("计计");
	}
}