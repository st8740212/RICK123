import java.util.Scanner;

public class Rick12
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("歡迎來到我的99程式");
        System.out.print("請輸入你的名子: ");
        String name = scn.next();
        System.out.println("歡迎"+name);
        System.out.println("我們有四個人在玩遊戲");
    }
    public static void people(int player){
        int  player1,player2,player3,player4;
        
    }
    class Card {
        private String suit;
        private String symbol;
        
        public Card(String suit, String symbol) {
            this.suit = suit;
            this.symbol = symbol;
        }
        public String toString() { return suit + symbol; }
    }
    public class Poker {
        private static List<Card> cards = new ArrayList<>(52);
        static {
            for(int i = 0; i < 52; i++) {
                cards.add(new Card(suit(i + 1), symbol(i + 1)));
            }
        }

    
    
    }
}