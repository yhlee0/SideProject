//201710710 LEE YEONHWA

import java.util.*;
public class Calculator {

    static void AddTotal() {
        int a, b, total_fine = 0;
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            Which which = new Which();
            a = rand.nextInt(3);
            b = rand.nextInt(9);

            FineType repeatRandom = FineType.valueOf(which.violation(b));

            System.out.print("car: " + which.car(a));
            System.out.print(", violation: " + repeatRandom.name());
            System.out.println(", fine: " + repeatRandom.getVehicle(which.car(a)));
            total_fine += repeatRandom.getVehicle(which.car(a));
        }
        System.out.println("Total fine: " + total_fine);
    }
}
