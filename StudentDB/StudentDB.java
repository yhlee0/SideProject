
import java.util.*;
public class StudentDB {

		List listA =new ArrayList();
		//Student st =new Student();

		Student[] students;// =new Student[3];
		int k=0;int p=0; int f; int q;
		enum FindGPAParam{
		LOWER_THAN,//0
		HIGHER_THAN//1
		}
		StudentDB(){
			students =new Student[3];
		};

		void add(Student student){
			students[p]=student;  p++;
		}
		
		void add(String name, int num, double gpa){
			students[p]=new Student(name, num, gpa);
			p++;
		}


		Student findBy(String name){
			for(f=0;f<students.length;f++) {
				if(students[f].name!=name) 
					break;
			}
				return students[f];
		}
		
		Student findBy(int num){
			while(q<students.length) 
			{
				if(students[q].number==num) {
					break;
				}
			}return students[q];
		}
		
		Student findBy(double gpa){
			while(q<students.length) 
			{
				if(students[q].gpa==gpa) {
					break;
				}
			}return students[q];
		}
		Student findBy(FindGPAParam param, double gpa){
			FindGPAParam temp2 = FindGPAParam.LOWER_THAN;
			if(param==temp2){
				while(q<students.length) 
				{
					if(students[q].gpa<=gpa) {
						System.out.printf("Name: "+students[q].getName()+", Number: "+students[q].getNumber()+", GPA: "+students[q].getGPA());
					}
				}
			}
			
			else{
				while(q<students.length) 
				{
					if(students[q].gpa<=gpa) {
						System.out.printf("Name: "+students[q].getName()+", Number: "+students[q].getNumber()+", GPA: "+students[q].getGPA());
					}
				}
			}
			return students[q];
		
		}
}