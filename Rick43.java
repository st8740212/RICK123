public class Rick43 {
	
	public static void main(String[] args) 
		{
<<<<<<< HEAD
			int[] list = {  41 , 56 , 66 , 31 , 96 , 86 , 76 , 21};  

		int length = list.length;
		System.out.println("原本的值: ");
		for (int i = 0; i < length; i++) 
		{			
			System.out.print(list[i] + " ");
		}
			
		System.out.print("\n");
		System.out.println("奇數偶數的值: ");
		
		for (int i = 0; i < list.length-1; i++)
		{
			for (int j = 0; j < list.length-1; j++)  
			{
				if (list[j] < list[j+1])
				{
					int temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
				}
			}
		}

		for (int i = 0; i < length; i++) 
		{
			if((list[i] & 0x1) != 0)
			{
				System.out.print(list[i] + " ");
			}
		}
		
		for (int i = 0; i < list.length-1; i++)
		{
			for (int j = 0; j < list.length-1; j++)  
			{
				if (list[j+1] < list[j])
				{
					int temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
				}
			}
		}
		
		for (int a = 0; a < length; a++) 
		{
			if((list[a] & 0x1) == 0)
			{
				System.out.print(list[a] + " " );
=======
		int[] list = { 36 , 77 , 15 , 28 , 33 , 10 , 58 , 70 , 41};  
		reorderOddEven(list); 
		}
		static void reorderOddEven(int[] list) 
		{
			
		int length = list.length;                    
		System.out.println("原本的值: ");
		for (int i = 0; i < length; i++) 
		{			
		System.out.print(list[i] + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < list.length-1; i++)
        {
             for (int j=0;j<list.length-1; j++)  
             {
                  if (list[j+1]<list[j])
                  {
                      int temp = list[j+1];
                      list[j+1]=list[j];
                      list[j]= temp;
                  }
             }
        }
		System.out.println("奇數偶數值: ");
		
		for (int i = 0; i < length; i++) 
		{
			if((list[i] & 0x1) !=0)
			{
			System.out.print(list[i]+" ");
			}
		}
		for (int a = 0; a < length; a++) 
		{
			if((list[a] & 0x1) ==0)
			{
			System.out.print(list[a]+" " );
>>>>>>> refs/remotes/origin/master
			}
		}
	}
}
