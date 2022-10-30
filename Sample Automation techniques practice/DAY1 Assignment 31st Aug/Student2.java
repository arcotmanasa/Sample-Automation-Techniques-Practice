
public class Student2 {

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
		
		Student2 S1=new Student2();
		Student2  S2=new Student2();
		Student2 S3=new Student2();
		Student2 S4=new Student2();
		S1.M1=90;
		S1.M2=89;
		S1.M3=88;
		S1.M4=90;
		S1.total();
		System.out.println("The total of student1 marks in Maths is :"  +S1.M1);
		S1.avg();
		System.out.println("The total of Student1 marks in Science is:"  +S1.M2);
		System.out.println("The total of Student1 marks in Social is :"  +S1.M3);
		System.out.println("The total of Student1 marks in English is :"  +S1.M4);
		System.out.println("The total of Student1 marks  is :"  +S1.total);
		System.out.println("The average of Student1 marks is :"  +S1.avg);
		S2.M1=98;
		S2.M2=99;
		S2.M3=88;
		S2.M4=90;
		S2.total();
		System.out.println("The total of student2 marks in Maths is :"  +S2.M1);
		S2.avg();
		System.out.println("The total of Student2 marks in Science is:"  +S2.M2);
		System.out.println("The total of Student2 marks in Social is :"  +S2.M3);
		System.out.println("The total of Student2 marks in English is :"  +S2.M4);
		System.out.println("The total of Student2 marks  is :"  +S2.total);
		System.out.println("The average of Student2 marks is :"  +S2.avg);
		
		S3.M1=90;
		S3.M2=79;
		S3.M3=68;
		S3.M4=80;
		S3.total();
		System.out.println("The total of student3 marks in Maths is :"  +S3.M1);
		S3.avg();
		System.out.println("The total of Student3 marks in Science is:"  +S3.M2);
		System.out.println("The total of Student3 marks in Social is :"  +S3.M3);
		System.out.println("The total of Student3 marks in English is :"  +S3.M4);
		System.out.println("The total of Student3 marks  is :"  +S3.total);
		System.out.println("The average of Student3 marks is :"  +S3.avg);
		
		S4.M1=88;
		S4.M2=90;
		S4.M3=82;
		S4.M4=99;
		S4.total();
		System.out.println("The total of student3 marks in Maths is :"  +S4.M1);
		S4.avg();
		System.out.println("The total of Student3 marks in Science is:"  +S4.M2);
		System.out.println("The total of Student3 marks in Social is :"  +S4.M3);
		System.out.println("The total of Student3 marks in English is :"  +S4.M4);
		System.out.println("The total of Student3 marks  is :"  +S4.total);
		System.out.println("The average of Student3 marks is :"  +S4.avg);
		
	}

}
