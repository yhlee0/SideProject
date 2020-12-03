import java.util.Scanner;

public class VolumeOfTruncatedCone {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input R1: ");
		double R1=sc.nextDouble();
		System.out.print("Input R2: ");	
		double R2=sc.nextDouble();
		System.out.print("Input Hegiht: ");
		double Hegiht=sc.nextDouble();
		double pi=3.14;

		double v=pi*(R1*R1+R1*R2+R2*R2)*Hegiht/3;
		
		System.out.println("volume: "+v);
			}
	}
