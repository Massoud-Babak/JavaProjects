package vol3_methodInClass;

public class clasMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		groceryStore houstonStore = new groceryStore(534, 0.99, 429,0.87); 
		groceryStore seattlStore = new groceryStore(400, 0.99, 450,0.97); 
		groceryStore orlandoStore = new groceryStore(400, 0.99, 450,0.97); 
		


		
		System.out.println("\nGrocery chain Stores "); 
		System.out.println("==============");
		
		System.out.println("\nHouston Store "); 
		System.out.println("______________");
		
		System.out.println("Apple sold: "+ houstonStore.appleSoldY);
		System.out.println("Each: "+ houstonStore.pricePerApple);
		
		System.out.println("Oranges sold: "+ houstonStore.orangeSoldY);
		System.out.println("Each: "+ houstonStore.pricePerOrange);
		System.out.println("REVENUE: "+houstonStore.totalCalculation()); 
		 
		
		
		System.out.println("\nSeattle Store "); 
		System.out.println("____________");
		
		System.out.println("Apple sold: "+ seattlStore.appleSoldY);
		System.out.println("Each: "+ seattlStore.pricePerApple);
		
		System.out.println("Oranges sold: "+ seattlStore.orangeSoldY);
		System.out.println("Each: "+ seattlStore.pricePerOrange);
		System.out.println("REVENUE: "+seattlStore.totalCalculation()); 
		
		System.out.println("______________");
		
		System.out.println("\nOrlando Store "); 
		System.out.println("_____________");
		
		System.out.println("Apple sold: "+ orlandoStore.appleSoldY);
		System.out.println("Each: "+ orlandoStore.pricePerApple);
		
		System.out.println("Oranges sold: "+ orlandoStore.orangeSoldY);
		System.out.println("Each: "+ orlandoStore.pricePerOrange);
		System.out.println("REVENUE: "+orlandoStore.totalCalculation()); 
		System.out.println("---------------");
		
		
		System.out.println("Targeted revnue for houston Store " +houstonStore.appleRevenueTarget(1000)); 
		System.out.println("Targeted revnue for houston Store " +seattlStore.OrangeRevenueTarget(103));

	}

}


class groceryStore
{
	int appleSoldY; 
	double pricePerApple; 
	int orangeSoldY; 
	double pricePerOrange; 
	 
	
	groceryStore (int appleSold,double applePrice, int orangeSold, double orangePrice ) // constructor declaraion and initialization
	{
		appleSoldY = appleSold; 
		pricePerApple = applePrice; 
		orangeSoldY = orangeSold; 
		pricePerOrange = orangePrice; 
	}
	
	
	double totalCalculation()
	{
		
		double revenue = (appleSoldY*pricePerApple) + (orangeSoldY * pricePerOrange);  
		
		
		return revenue;  
	}
	
	double appleRevenueTarget(int targetApple)
	{
		return pricePerApple *targetApple; 
	}
	double OrangeRevenueTarget(double targetOrange)
	{
		double tragetRevenue =  pricePerApple *targetOrange; 
		
		return tragetRevenue; 
	}
	
}