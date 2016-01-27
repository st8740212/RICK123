import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import sun.misc.Queue;

public class Rick12
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("歡迎來到我的99程式");
        System.out.print("請輸入你的名子: ");
        String name = scn.next();
        System.out.println("歡迎"+name);
        System.out.println("我們有四個人在玩遊戲");
       
        boolean direction = true; // 回合的方向(true = 順時鐘; false = 逆時鐘)
        int people[]; // 0 = 等待; 1 = 出牌; 2 = 出局 
        int card5_peo[]; // 玩家的五張牌
        int sum_old = 0; // 上回合的總和
        int Quene;
        Queue cards = new Queue();; // 101~113 = 梅花; 201~213 = 方塊; 301~313 = 紅心; 401~413 = 黑桃  (不知道為什麼不能加上new Queue(52))
        int sum = 0; // 總和
      
            String s = JOptionPane.showInputDialog(null, "請輸入人數(2~4):", 4);
            int numberOfPerson = Integer.parseInt(s);
            people = new int[numberOfPerson];

            for (int i = 0; i < people.length; i++)
                people[i] = 0;
            people[0] = 1;
            card5_peo = new int[5];
            for (int j = 1; j < 5; j++)
                for (int x = 0; x < 13; x++)
                    cards.add((x + 1) + (j * 100));
            wash(cards);

    public void wash(Queue cards)
    {
        int x, y, temp;
        for (int time = 0; time < 200; time++)
        {
            x = (int) (Math.random() * 52);
            y = (int) (Math.random() * 52);
            temp = cards.Q[y];
            cards.Q[y] = cards.Q[x];
            cards.Q[x] = temp;
        }
    }
    public int choose() {
        return cards.del();
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int x) {
        sum = x;
    }
    public int getLoser() {
        int temp = 0;
        for (int x = 0; x < people.length; x++) {
            if (people[x] == 2)
                temp++;
        }
        return temp;
    }
}
}
}