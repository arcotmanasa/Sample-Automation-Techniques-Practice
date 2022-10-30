import java.util.Scanner;

public class Fibonacci {
		
		public static int fib(int n) {
			
			if(n<=1)
				
				return n;
				
				else 
					
			 return fib(n-1)+fib(n-2);
			
		}
		

		public static void main(String[] args) {
			
			System.out.println("Enter the nth number to find the fibonacci series:" );
			
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			Fibonacci F =new Fibonacci();
			
			if(n<0)
				
				System.out.println("There is no fibonacci series defined");
				
				else
					
			 Fibonacci.fib(n);
			 System.out.println("The Fibonacci series of the given number is :" +F.fib(n));
			}

}