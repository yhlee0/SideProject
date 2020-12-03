import java.util.Scanner;
public class Replace{

	public static void main(String[] args) {
		
		String a="Let's meet in my office at 10";
		
		
		String changeStr;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is a program that replaces a string in the next sentence.\nOriginal sentence: Let's meet in my office at 10");
		System.out.println("Input the string you want to replace in the sentence:");
		changeStr=sc.nextLine();
		
		System.out.println("Input a new string:");
		String newStr=sc.nextLine();
		
		String text=a.replace(changeStr,newStr);
		
		System.out.printf("new sentence: %s", text);
	}

}
