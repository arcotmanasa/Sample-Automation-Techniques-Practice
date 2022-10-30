package Selenium;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FoodMenu {
	
	
	public HashMap<Integer, String> Veg_Menu = new HashMap<Integer,String>();
	public HashMap<Integer, String> NonVeg_Menu = new HashMap<Integer,String>();
	
	public  HashMap<Integer,Double> Veg_Menu_price = new HashMap<Integer,Double>();
	public HashMap<Integer,Double> NonVeg_Menu_price = new HashMap<Integer,Double>();
	
	public HashMap<Integer,Integer> Veg_Order = new HashMap<Integer,Integer>();
	public HashMap<Integer,Integer> NonVeg_Order = new HashMap<Integer,Integer>();
	
	public Scanner Obj_Input = new Scanner(System.in);
	
	public double TotalCost;
	public double GST;
	public double Parcel_Charges;
	public double ServiceCharge;
	public double Discount;

	public void Display_menu(int Veg_Non_Veg_Flag_parm ) {

		System.out.println("Below are the dishes available currently to order :");
		if (Veg_Non_Veg_Flag_parm == 1)
		{
		Veg_Menu.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue() + " - " + Veg_Menu_price.get(entry.getKey()));
		});
		}
		else if (Veg_Non_Veg_Flag_parm == 2)
		{
			NonVeg_Menu.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue() + " - " + NonVeg_Menu_price.get(entry.getKey()));
		});
		}
	}
	
	public void order_food_method () {
		System.out.println(" Please select a category from the below list");
		System.out.println("[1] vegetarian or [2] Non-vegetarian");
		int Veg_Non_Veg_Flag_fn= Obj_Input.nextInt();
		Display_menu(Veg_Non_Veg_Flag_fn);

	System.out.println("Please enter the option:");
	int Option= Obj_Input.nextInt();
	int count=0;
	
	if (Veg_Non_Veg_Flag_fn == 1) {
		System.out.println("Please enter the number of " + Veg_Menu.get(Option));
		int Quantity = Obj_Input.nextInt();
		Veg_Order.put(Option,Quantity);
	}
	else if (Veg_Non_Veg_Flag_fn == 2) {
		System.out.println("Please enter the number of " + NonVeg_Menu.get(Option));
		int Quantity = Obj_Input.nextInt();
		NonVeg_Order.put(Option,Quantity);
	}
	
	}
	
	public static void main(String[] args) {
		
		int Veg_Non_Veg_Flag = 1;
		FoodMenu FM = new FoodMenu();
		
		Scanner Obj1 = new Scanner(System.in);
		Scanner Obj2 = new Scanner(System.in);
		FM.Veg_Menu.put(1,"Panner TIkka");
		FM.Veg_Menu.put(2,"Cashew pulao");
		FM.Veg_Menu.put(3,"Veg Fried rice ");
		FM.Veg_Menu.put(4,"Gobi 65");
		FM.Veg_Menu.put(5,"Veg Thali");
	    
		FM.NonVeg_Menu.put(1,"Chicken Biriyani");
		FM.NonVeg_Menu.put(2,"Fish Curry");
		FM.NonVeg_Menu.put(3,"Chicken 65");
		FM.NonVeg_Menu.put(4,"Mutton Gravy");
		FM.NonVeg_Menu.put(5,"Chicken Fried rice");
	    
		
		Scanner Obj3 = new Scanner(System.in);
		Scanner Obj4 = new Scanner(System.in);
		Scanner Obj5 = new Scanner(System.in);
		
		FM.Veg_Menu_price.put(1,120.0);
		FM.Veg_Menu_price.put(2,150.0);
		FM.Veg_Menu_price.put(3,130.0);
		FM.Veg_Menu_price.put(4,100.0);
		FM.Veg_Menu_price.put(5,140.0);
		FM.NonVeg_Menu_price.put(1,200.0);
		FM.NonVeg_Menu_price.put(2,150.0);
		FM.NonVeg_Menu_price.put(3,120.0);
		FM.NonVeg_Menu_price.put(4,220.0);
		FM.NonVeg_Menu_price.put(5,180.0);
		
		FM.Parcel_Charges = 0;
		FM.ServiceCharge = 0;
		FM.GST = 0;
		FM.Discount = 0;

		    	
    	System.out.println(" Welcome to Numpy Ninja Restaurant");
    	System.out.println(" select the service offering from below list : [1] dine-in  or [2] take away");
		int DineInTakeAway = Obj1.nextInt();
		
		String More_Order;
		do {
			FM.order_food_method();
			System.out.println("Would you like to order one more dish : [Yes] or [No]");			 
			String More_Order_input = Obj5.nextLine();
			More_Order = More_Order_input;			
		}
		while (More_Order.equals("Yes"));
		
		FM.TotalCost = 0;
			
		FM.Veg_Order.entrySet().forEach(entry -> {
		    System.out.println("You Have ordered " + FM.Veg_Menu.get(entry.getKey()) + " price " + FM.Veg_Menu_price.get(entry.getKey()) + " Quantity " + entry.getValue() + " Total Cost for this item " + FM.Veg_Menu_price.get(entry.getKey())*entry.getValue());
		    FM.TotalCost = FM.TotalCost + FM.Veg_Menu_price.get(entry.getKey())*entry.getValue();
		});
		FM.NonVeg_Order.entrySet().forEach(entry -> {
		    System.out.println("You Have ordered " + FM.NonVeg_Menu.get(entry.getKey()) + " price " + FM.NonVeg_Menu_price.get(entry.getKey()) + " Quantity " + entry.getValue() + " Total Cost for this item " + FM.NonVeg_Menu_price.get(entry.getKey())*entry.getValue());
		    FM.TotalCost = FM.TotalCost + FM.NonVeg_Menu_price.get(entry.getKey())*entry.getValue();
		});
		
		System.out.println("Will calculate the total");
		System.out.println("Total Cost " + FM.TotalCost);
		 FM.GST = (FM.TotalCost*6)/100;
		 System.out.println("Total GST " + FM.GST);
		
		if(DineInTakeAway == 2) {
			FM.Parcel_Charges = 10;
			System.out.println("Total Parcel Charges " + 10);
		}
		else {
			FM.ServiceCharge = 30;
			System.out.println("Total Service Charges " + 30);
		}
		
		FM.TotalCost = FM.TotalCost + FM.GST + FM.Parcel_Charges + FM.ServiceCharge;
		System.out.println("Total Cost Before Discount " + FM.TotalCost);
		
		if (FM.TotalCost > 1000) {
			FM.Discount = (FM.TotalCost*10)/100;
			System.out.println("Congratulations - You got a discount of " + FM.Discount);			
		}
		else if (FM.TotalCost > 1500) {
			FM.Discount = (FM.TotalCost*15)/100;
			System.out.println("Congratulations - You got a discount of " + FM.Discount);
		}
		else{
			System.out.println("Sorry - No Discount");
		};
		
		FM.TotalCost = FM.TotalCost - FM.Discount;
		System.out.println("Final Amount " + FM.TotalCost );			
	}
}

		/* int Sum;
		int Quantity;
		float TotalCost = Sum+ Sum(Food_Order.entrySet().forEach(entry -> {
			    System.out.println(entry.getKey() + " " + entry.getValue() + " - " + Veg_Menu_price.get(entry.getKey())*Quantity);
			System.out.println(" Total Price of the food you have ordered is: "  +TotalCost);
				float GST = (TotalCost*6)%100;
			System.out.println(" The GST of the Total Food is 6% of the Total Cost:" +GST);
				double ParcelorDineincharge = 30.00;
			System.out.println(" Parcel or Dine In Charge:" +ParcelorDineincharge);
				float TotalAmount = (float) (TotalCost+GST+ParcelorDineincharge);
			System.out.println("Total Amount of the food is :" +TotalAmount);
				if(TotalAmount>=1000) {
				float Discount = (TotalAmount*10)%100;//118.50
			System.out.println(" The Discount applies if TotalAmount is more than 1000:" +Discount );	
				float NetBill = TotalAmount-Discount;
				System.out.println(" The net bill after the discount is :" +NetBill);
             System.out.println("Thank you ! Visit again !");*/
		 
		 
		 
			
 