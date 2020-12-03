import java.util.*;

public class StudentMain02 {
		public static void main(String[] args) {
			

			StudentDB sDB=new StudentDB();

			Student s0 =new Student("KIM JIWOO", 201911111, 4.01);
			sDB.add(s0);

			for(int i=1; i<sDB.students.length;i++){
				sDB.students[i]=new Student("unexist", 0, 0.0);	}

			sDB.add("LEE MINJOON", 201922222, 3.85);
			sDB.add("PARK SEOYUN", 201933333, 3.90);
								
		
			Scanner scanner=new Scanner(System.in);
			System.out.printf("choose the type of Input.\n");
			System.out.printf("1.name, 2.number, 3.gpa, 4. up/down and gpa");
			int InputN=scanner.nextInt();
			switch(InputN) {
			case 1:
				System.out.printf("Input Name\n");
				System.out.printf("our students :KIM JIWOO, LEE MINJOON, PARK SEOYUN");
				String InputName= scanner.next();
				Student finds1 =sDB.findBy(InputName);
				System.out.printf(finds1.toString());
				break;
			
			case 2:
				System.out.printf("Input Number\n");
				int InputNumber= scanner.nextInt();
				Student finds2 =sDB.findBy(InputNumber);
				System.out.printf(finds2.toString());
				break;
				
			case 3:
				System.out.printf("Input gpa\n");
				double Inputgpa= scanner.nextDouble();
				Student finds3 =sDB.findBy(Inputgpa);
				System.out.printf(finds3.toString());
				break;
			
			case 4:
				System.out.printf("Input both 1.LOWER_THAN or HIGHER_THAN 2.gpa");
				String InputEnum= scanner.nextLine();
				double Inputgpa2= scanner.nextDouble();
				
				StudentDB.FindGPAParam temp3 = StudentDB.FindGPAParam.LOWER_THAN;
				if(InputEnum=="LOLOWER_THAN") {
					Student finds4 =sDB.findBy(StudentDB.FindGPAParam.LOWER_THAN ,Inputgpa2);
				}
				else {
					Student finds4 =sDB.findBy(StudentDB.FindGPAParam.HIGHER_THAN ,Inputgpa2);
				}
				break;

			}
		}
}