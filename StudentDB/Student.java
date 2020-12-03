
import java.util.*;
public class Student {

		String name;
		int number;
		double gpa;
		
		Student(String name, int num, double gpa){
			this.name=name;
			this.number=num;
			this.gpa=gpa;
		}
		
		String getName(){
			return name;
		}
		int getNumber(){
			return number;
		}
		double getGPA(){
			return gpa;
		}
		public String toString(){
			return "Name: "+getName()+", Number: "+getNumber()+", GPA: "+getGPA();
		}
}
