import java.util.Scanner;
public class Rick32 {
	public static void main(String[] args) {
		Scanner good = new Scanner(System.in);
		String InUserID,InUserPW;
		String UserID="JAVA",UserPW="1234";
		int i=1;
		
		a:while(i<4){
		
			System.out.print("請輸入帳號: ");
			InUserID = good.next();
			
			System.out.print("請輸入密碼: ");
			InUserPW = good.next();
		
			if (InUserID.equals(UserID) && InUserPW.equals(UserPW)) 
			{
				System.out.println("登入成功!");	
				break a;
			}
			else
			{
				if(i<3)
				{
					System.out.println("輸入錯誤"+i+"次");	
					i++;
				}
				else 
				{
					System.out.println("登入失敗!");
					break a;
				}
			}
		}
	}
}