
public class Rick43 {
	
	public static void main(String[] args) {
		int[] list = { 36 , 77 , 15 , 28 , 33 , 10 , 58 , 70 , 41};  
		reorderOddEven(list); 							
	}
		static void reorderOddEven(int[] list) {
		int length = list.length;                    
		
		System.out.println("原本的值: ");
		for (int i = 0; i < length; i++) {			
			System.out.print(list[i] + " ");
		}
		
		System.out.print("\n");
		for (int i=0;i<list.length-1;i++)
        {
             for (int j=0;j<list.length-1;j++)  
             {
                  if (list[j+1]<list[j])
                  {
                      int temp = list[j+1];
                      list[j+1]=list[j];
                      list[j]= temp;
                  }
             }
        }
		
		if(  int[] list !=0 ){         ///抓不到排序後的值
			System.out.print(  +", "); 
		}
		
		
		
	}

}
