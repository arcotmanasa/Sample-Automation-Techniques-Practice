

public class Student1 {

	     /* Creating the variables with Data types*/

	int M1,M2,M3,M4;
	int total;
	float avg;
	
		  /* Creating the two methods totalMarks and averageMarks of the Student1*/
			public void total() {
			  
				total =M1+M2+M3+M4;
				System.out.println("The total Marks of Student1 is:"  +total );
			}
			
			public void avg(){
				
				float avg = total/4;
			    System.out.println("The average Marks of Student1 is:" +avg );
			}
			
			//*main method*//
			public static void main(String[] args) {
				
				/* Creating an object for the class Student1*/
				
				Student1 S1= new Student1();
                    S1.M1=90;
                 System.out.println("Marks of Student in Maths M1 is :"   +S1.M1);
                    S1.M2=89;
                    
                 System.out.println("Marks of Student in Science M2 is :"  +S1.M2);
                    S1.M3=90;
                    
                 System.out.println("Marks of Student in Social M3 is :" +S1.M3);
                    S1.M4=99;
                    
                 System.out.println("Marks of Student in English M4 is :" +S1.M4);
				    S1.total();
				    S1.avg();
				    
				  
				
				
				
				
				
			}
			}
	  
	
		    
		    
