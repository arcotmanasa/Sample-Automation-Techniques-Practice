package Selenium;

public class SumAndAvg {

	public float m1;
	public float m2;
	public float m3;
	public float m4;
	
	
	public SumAndAvg() {
		float m1=35;
		float m2=35;
		float m3=35;
		float m4=35;
	}
	
	//Parameterized Constructor //
	
	public SumAndAvg(float M1,float M2,float M3,float M4) {
		
		float m1=M1;
		float m2=M2;
		float m3=M3;
		float m4=M4;
		
	}	
	// Parameterized constructor with 2 marks//
	
	public SumAndAvg(float M1,float M2) {
		
		float m1=M1;
		float m2=M2;
		float m3=35;
		float m4=35;
	}
	
	public void calSum()
	{
		
		float sum=0;
		sum=m1+m2+m3+m4;

		System.out.println(" The sum of the student marks is :"  +sum);
	}
	
	public void calAvg() {
		
		float avg=0;
		avg=(m1+m2+m3+m4)/4;

		System.out.println(" The average of the student marks is :"  +avg);
	}
	
	
	public static void main(String Args[]) {
		
		//SumAndAvg SA= new SumAndAvg();
		SumAndAvg SA =new SumAndAvg();
		
		SA.m1=99.9f;
		SA.m2=90.8f;
		SA.m3=89.9f;
		SA.m4=90.7f;
		SA.calSum();
		SA.calAvg();
		
		
		SumAndAvg SA1=new SumAndAvg();
		SA1.m1=99.9f;
		SA1.m2=90.8f;
		SA1.m3=35;
		SA1.m4=35;
		SA1.calSum();
		SA1.calAvg();
		
	   }
		
		
	}

