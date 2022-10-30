import java.util.Scanner;

public class Student3 {

	 int total;
	 float avg;
	 int M1,M2,M3,M4;
	
	 public void total() {
		 
		 total=M1+M2+M3+M4;
	System.out.println("The total of the Student is : "  +total);
	 }
	  
	   public void avg() {
		   
		 avg=total/4;
	System.out.println("The average of the Student is: " +avg);
	   }
	
	
	
	public static void main(String[] args) {
		int M1,M2,M3,M4;
		Student2 S1=new Student2();
		Student2  S2=new Student2();
		Student2 S3=new Student2();
		Student2 S4=new Student2();
		
		System.out.println("   Enter the marks of students 1   ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student1 marks in Maths :");
		S1.M1=input.nextInt();
		System.out.println("Enter student1 marks in Science :");
		S1.M2=input.nextInt();
		System.out.println("Enter student1 marks in Social :");
		S1.M3=input.nextInt();
		System.out.println("Enter student1 marks in English :");
		S1.M4=input.nextInt();
		S1.total();
		S1.avg();
		System.out.println("   Enter the Marks of Student 2    ");
		
		
		System.out.println("Enter student2 marks in Maths :");
		S2.M1=input.nextInt();
		System.out.println("Enter student1 marks in Science :");
		S2.M2=input.nextInt();
		System.out.println("Enter student1 marks in Social :");
		S2.M3=input.nextInt();
		System.out.println("Enter student1 marks in English :");
		S2.M4=input.nextInt();
		S2.total();
		S2.avg();
		
		
		System.out.println("   Enter the Marks of Student 3   ");
		
		
		
		System.out.println("Enter student2 marks in Maths :");
		S3.M1=input.nextInt();
		System.out.println("Enter student1 marks in Science :");
		S3.M2=input.nextInt();
		System.out.println("Enter student1 marks in Social :");
		S3.M3=input.nextInt();
		System.out.println("Enter student1 marks in English :");
		S3.M4=input.nextInt();
		S3.total();
		S3.avg();
		
		System.out.println("   Enter the Marks of Student 4    ");
		
		
		
		System.out.println("Enter student2 marks in Maths :");
		S4.M1=input.nextInt();
		System.out.println("Enter student1 marks in Science :");
		S4.M2=input.nextInt();
		System.out.println("Enter student1 marks in Social :");
		S4.M3=input.nextInt();
		System.out.println("Enter student1 marks in English :");
		S4.M4=input.nextInt();
		S4.total();
		S4.avg();
	
	
	}
	
	
	
	
	
	

}