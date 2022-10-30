package Selenium;

import java.util.Scanner;

public class FacortsOfaGivenNumber {
     		private static Scanner sc;
			
			public static void main(String[] args) {
				int Number, i; int count=0;
				sc = new Scanner(System.in);
				
				System.out.println("Please Enter any number to Find Factors: ");
				Number = sc.nextInt();
				
				for(i = 1; i <= Number; i++) {
					if(Number%i == 0)
					  {
						count = count +1;
						System.out.format(" %d  ", i);}
					  }
						System.out.println(" The count of total number of factors is:" +count);
					}
				}
			
		

