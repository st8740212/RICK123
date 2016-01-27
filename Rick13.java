import java.util.ArrayList;

public class Rick13
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
       
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
            System.out.println(var);
        }
       
       System.out.println(lists.get(35));
       System.out.println(lists.get(1));
     }
}