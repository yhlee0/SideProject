//201710710 LEE YEONHWA

public class MidtermMainFine {
    public static void main(String[] args) {

        //1
        FineType case1=FineType.OVER2040;
        System.out.println("CASE 1: fine: "+case1.getVehicle("AUTO"));
        //2
        FineType case2One =FineType.LIGHT;
        FineType case2Two =FineType.YELLOW;
        System.out.printf("CASE 2: fine: %d \n", case2One.getVehicle("VAN")+case2Two.getVehicle("VAN"));
        //3
        FineType case3One=FineType.BUSONLYHIGHWAY;
        FineType case3Two=FineType.OVER60;
        System.out.printf("CASE 3: fine: %d \n",case3One.getVehicle("CAR")+case3Two.getVehicle("CAR"));
        //
        Calculator.AddTotal();
    }
}
