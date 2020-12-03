import java.util.Scanner;

public class QuadraticEquation{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.print("a, b, c ");
		System.out.print("Input a: ");
		int a=sc.nextInt();
		System.out.print("Input b: ");	
		int b=sc.nextInt();
		System.out.print("Input c: ");
		int c=sc.nextInt();
		double numerator=(b*b)-(4*a*c);
		double root=Math.sqrt(numerator);
		double x1, x2;
		
		x1=(-b+root)/(2*a);
		x2=(-b-root)/(2*a);

	   System.out.print("result : "+x1+","+x2);	
		
	}
}
