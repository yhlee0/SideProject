import java.util.Scanner;

public class HashOf5 {

	public static void main(String[] args) {
		System.out.println("Input 5 Characters.");
		
		char[] s = new char[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		s[i]=sc.next().charAt(0);
		}
		
		double result=0;
		for(int i=0,j=4; i<5; i++) {
		result=result+s[i]*Math.pow(31,j);
		j--;
		}
		System.out.printf("The Hash of String %c%c%c%c%c is %.2f. \n",s[0],s[1],s[2],s[3],s[4], result);
	}
}