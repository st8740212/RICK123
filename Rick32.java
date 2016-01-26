import java.util.Scanner;
public class Rick32 {
	public static void main(String[] args) {
		Scanner good = new Scanner(System.in);
		String InUserID,InUserPW;
		String UserID="JAVA",UserPW="1234";
		int i=1;
		
		a:while(i<4){
		
			System.out.print("�п�J�b��: ");
			InUserID = good.next();
			
			System.out.print("�п�J�K�X: ");
			InUserPW = good.next();
		
			if (InUserID.equals(UserID) && InUserPW.equals(UserPW)) 
			{
				System.out.println("�n�J���");	
				break a;
			}
			else
			{
				if(i<3)
				{
					System.out.println("��J���~"+i+"��");	
					i++;
				}
				else 
				{
					System.out.println("�n�J����!");
					break a;
				}
			}
		}
	}
}