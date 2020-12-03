class CardDeck{
    String shape;
    int number;

    void deal(){
        System.out.println("==>card:"+this.shape+", "+this.number);
    }
}

public class CardTest {
    public static void main(String[] args) {

        int[] Arr = new int[3];//Make array
        int k = Arr.length;//length of Array save the k

        CardDeck c1 = new CardDeck();
        c1.shape = "diamond";
//1
        System.out.println("Number of cards currently remaining : " + k);
        System.out.println("Pick a card.");

        int n = (int) Math.floor(Math.random() * 9) + 2;
        Arr[0] = n;
        c1.number = n;
        c1.deal();
        k--;
//2
        System.out.println("Number of cards currently remaining : " + k);
        System.out.println("Pick a card.");

        n = (int) Math.floor(Math.random() * 9) + 2;
        while (n == Arr[0]) {
            n = (int) Math.floor(Math.random() * 9) + 2;
        }
        Arr[1] = n;

        c1.number = n;
        c1.deal();
        k--;
//3
        System.out.println("Number of cards currently remaining : " + k);
    }
}