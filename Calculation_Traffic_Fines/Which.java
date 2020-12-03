//201710710 LEE YEONHWA

public class Which {
    String violation(int n) {

        String str ="";
        if(n==0) str ="LIGHT";
        if(n==1) str ="PEDESTRIAN";
        if(n==2) str ="YELLOW";
        if(n==3) str ="BUSONLYHIGHWAY";
        if(n==4) str ="LANE";
        if(n==5) str ="OVER60";
        if(n==6) str ="OVER4060";
        if(n==7) str ="OVER2040";
        if(n==8) str ="OVER20";

        return str;
    }
    String car(int n) {

        String kinds="";

        if(n==0) kinds ="VAN";
        if(n==1) kinds ="CAR";
        if(n==2) kinds ="AUTO";

        return kinds;

    }
}
