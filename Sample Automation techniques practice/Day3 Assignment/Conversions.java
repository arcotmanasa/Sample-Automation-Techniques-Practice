import java.util.Scanner;

public class Conversions {
	
	


	public void convertValue(int num) {
         
		String binary = Integer.toBinaryString(num);
		System.out.println("The Binary form of the given number is:" + binary);
		
		String hexa = Integer.toHexString(num);
		System.out.println("The Hexa decimal form of the given number is:" + hexa);
		
		String octa=Integer.toOctalString(num);
		System.out.println("The octal form of a given number is:" + octa);
		
	}
	
	
	public static void main(String[] args) {

		System.out.println("Decimal to binary,hexa and octal conversion");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want for conversion:");
		int num = Integer.parseInt(scan.nextLine());
		
		
               Conversions C = new Conversions();
               C.convertValue(num);

	}

}
