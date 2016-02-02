import java.util.ArrayList;

public class Rick13
{
    public static void main(String[] args)
    {
        
       
        ArrayList<Integer> lists = new ArrayList<Integer>(); 
        
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
                lists.add(j);
            }
        }

        for(int var:lists)
        {
            System.out.print(var+" ");
        }
       
       System.out.println("\n"+lists.get(35));
       System.out.println(lists.get(34));
       
       
       /////////////////測試code
       
       for (int a = 0; a < cardlist.size(); a++)
       {
           System.out.print("  " + cardlist.get(a));
       }
       System.out.println();
       System.out.println(cardlist.size());
       
       System.out.println(getCard(cardlist));
       System.out.println(cardlist.size());
       for (int a = 0; a < cardlist.size(); a++)
       {
           System.out.print("  " + cardlist.get(a));
       }
       System.out.println();
       
       
       
       ///////////////玩家1
       
       System.out.println("1.[" + player1.get(0) + "]    2.[" + player1.get(1) + "]    3.[" + player1.get(2)
       + "]    4.[" + player1.get(3) + "]    5.[" + player1.get(4) + "]");
System.out.print("輸入你的選擇(1~5): ");
int choose = scn.nextInt();


     }
}