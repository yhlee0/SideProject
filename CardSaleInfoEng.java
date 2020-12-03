import java.util.Scanner;


enum Card {


        CJONE_SAMSUNG(30, 1), CJONE_SHINHAN(30, 1),
        THE_CJ(20, 2), SAMSUNG_6_V4(20, 0),
        SHINHAN_LADY(20, 0), KB_STAR(20, 0), EMART_KB(15, 0);

        int sale;
        int save;

        //
        Card(int sale, int save) {
            this.sale = sale;
            this.save = save;
        }

        //
        int getSale() {
            return sale;
        }

        int getSave() {
            return save;
        }
    }

    public class CardSaleInfoEng {
    public static void main(String[] args) {


        System.out.println("CHOOSE AND INPUT THE CARD.\n: CJ ONE SAMSUNG CARD,CJ ONE SHINHWAN CARD, THE CJ,SAMSUNG 6 V4,SHINHAN LADY,KB STAR,EMART KB");
        Scanner sc = new Scanner(System.in);
        String Input;
        Input = sc.nextLine();

        System.out.println("CARD NAME:"+Input);


        switch(Input) {
            case "CJ ONE SAMSUNG CARD":
                System.out.println("sale: " + Card.CJONE_SAMSUNG.getSale() + ", save:" + Card.CJONE_SAMSUNG.getSave());
                break;
            case "CJ ONE SHINHWAN CARD":
                System.out.println("sale: " + Card.CJONE_SHINHAN.getSale() + ", save:" + Card.CJONE_SHINHAN.getSave());
                break;
            case "THE CJ":
                System.out.println("sale: " + Card.THE_CJ.getSale() + ", save:" + Card.THE_CJ.getSave());
                break;
            case "SAMSUNG 6 V4":
                System.out.println("sale: " + Card.SAMSUNG_6_V4.getSale() + ", save:" + Card.SAMSUNG_6_V4.getSave());
                break;
            case "SHINHAN LADY":
                System.out.println("sale: " + Card.SHINHAN_LADY.getSale() + ", save:" + Card.SHINHAN_LADY.getSave());
                break;
            case "KB STAR":
                System.out.println("sale: " + Card.KB_STAR.getSale() + ", save:" + Card.KB_STAR.getSave());
                break;
            case "EMART KB":
                System.out.println("sale: " + Card.EMART_KB.getSale() + ", save:" + Card.EMART_KB.getSave());
                break;
            default:
                break;
        }
    }
}
