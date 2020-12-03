
import java.util.*;
class Dice {
    int number;

    int roll(){
        int k = (int) Math.floor(Math.random() * 6) + 1;
        return k;
    }
    void ShowRoll() {
        System.out.println("==>The number of dice :" + this.number);
    }
}

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("How many dice would you throw?\n");
        int n = sc.nextInt();
        System.out.printf("Throw: %d \n", n);

        Dice t1 = new Dice();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            t1.number = t1.roll();
            t1.ShowRoll();

            sum += t1.number;

        }
        System.out.println("The sum : " + sum);
        if (sum % 2 == 0) {
            System.out.println("=>because of even, Take the bus!!");
        }
        else {
            System.out.println("=>because of odd, Take the subway!!");
        }
    }
}
