package com.ninja.training;

import java.util.Scanner;

public class PrintDayOfWeek {
	
      int dayOfWeek;
 
      public void getDayOfWeek(int dayOfWeek) {
      	  
		
switch(dayOfWeek) { 
case 1: 
	System.out.println("Its Sunday");
	break;
	
case 2: 
	System.out.println("Its Monday");
	break;
case 3:
	 System.out.println("Its Tuesday");
	 break;	 
case 4:
	System.out.println("Its Wednesday");
	break;
case 5:
	 System.out.println("Its Thursday");
	 break;
case 6: 
	System.out.println("Its FRiday");
	break;
case 7:
	System.out.println("Its Saturday");
	break;
	 
   default: 
	   System.out.println(" No value found for a week");
	   break;
          }
	
      
      }

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter the number of the day you want to print (1-7):");
		int dayOfWeek = input.nextInt();
		
		PrintDayOfWeek P1=new PrintDayOfWeek();
		P1.getDayOfWeek(dayOfWeek);
		input.close();

		
	}

}

