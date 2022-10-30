package com.ninja.training;

import java.util.Scanner;

public class EmpMonthlyTakeHomeSal {
	
	           float EmpSal; 
	           float bonus;
	           float basicSal;
	           float pF;
	           float tax;
	           float boa;
	           double grossSal;
	           double netSal;
	           int level;
	              
	           public void grossSal(int EmpLevel) {
	        	   
	        	   switch(EmpLevel) {	 
		           case 1: basicSal=7000;
		            	   boa=5000;
		            	   bonus=2000;
		            	 break;
		           case 2:basicSal=10000;
		            	  boa=7000;
		            	  bonus=2500;
		                 break;
		           case 3:basicSal=12000;
		            	  boa=9000;
		            	  bonus=3000;
		                 break;
		           case 4:basicSal=15000;
		            	  boa=10000;
		            	  bonus=3500;
		                 break;
				} 
	        	  grossSal= basicSal+boa+bonus;

	           	  			
	           }
	             
					   public double pF() {
				 System.out.println("Gross Salary :" +grossSal);
				 double netSal= grossSal-(grossSal*0.12);
				 System.out.println(" Employee netSalary before tax reduction:" +netSal);
				 System.out.println("Employee Annual Salary before tax reduction:");
				 netSal=netSal*12;
				  return netSal;       
					   }
				       
		  
	        	 public void tax(){
	 	  			netSal = pF();

	 	  			System.out.println(netSal);

	        		if (netSal<250000) {
	        			
	        			System.out.println("No tax for the employee");}
	        
	        			else if (netSal>=250000 && netSal<500000) {
	        				
	        				System.out.println(" Employee will pay 5% tax");
	        				
	        			    netSal=	(netSal*5)/100;
	        			}
	        			
	        			else if (netSal>=500000 && netSal <750000) {
	        				
	        				System.out.println("Employee will pay 10% tax");
	        				netSal= (netSal*10)/100;
	        				}
	        			else if (netSal>=750000 && netSal< 1000000) {
	        				System.out.println("Employee will pay 15% tax");
	        				netSal =(netSal*15)/100;
	        			}
	        			else if(netSal>= 1000000 && netSal<1250000) {
	        				System.out.println("Employee will pay 20% tax");
	        				netSal =(netSal*20)/100;}
	        			else if(netSal>=1250000 && netSal<1500000) {
	        				System.out.println("Employee will pay 25% tax");
	        				netSal=(netSal*25)/100;}
	        			else if(netSal>=1500000) {
	        				System.out.println("Employee will pay 30% tax");
	        				netSal=(netSal*30)/100;
	        			}		
	  
	        			
	        	 }	
	     			
	        	
		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println(" Enter the level of an Employee (0-4):");
			int level = input.nextInt();
			System.out.println(level);
			System.out.println(" Enter the basic Salary:");
			int basicSal = input.nextInt();
			System.out.println("Enter the BOA:");
			int boa= input.nextInt();

			EmpMonthlyTakeHomeSal E1=new EmpMonthlyTakeHomeSal();
			
		    E1.grossSal(level );
		    E1.tax();
		    input.close();
		}

			
			
		
		

	}


