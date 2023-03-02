package vol3_Lesson_9;

public class lesson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		groceryStore houstonStore = new groceryStore(); 
		groceryStore seattleStore = new groceryStore(); 
		groceryStore orlandoStore = new groceryStore(); 
		
		houstonStore.appleSoldYearly = 534; 
		houstonStore.pricePerApple = 0.99; 
		houstonStore.orangeSoldYearly = 429;  
		houstonStore.pricePerOrange = 0.87; 
		
		houstonStore.totalAmountA = houstonStore.appleSoldYearly * houstonStore.pricePerApple; 
		houstonStore.totalAmountO = houstonStore.pricePerOrange * houstonStore.orangeSoldYearly; 
		houstonStore.total = houstonStore.totalAmountA + houstonStore.totalAmountO; 
		
		
		seattleStore.appleSoldYearly = 765; 
		seattleStore.pricePerApple = 0.86; 
		seattleStore.orangeSoldYearly = 842; 
		seattleStore.pricePerOrange = 0.91; 
		seattleStore.totalAmountA = seattleStore.appleSoldYearly * seattleStore.pricePerApple; 
		seattleStore.totalAmountO = seattleStore.pricePerOrange * seattleStore.orangeSoldYearly; 
		seattleStore.total = seattleStore.totalAmountA + seattleStore.totalAmountO; 
		
		orlandoStore.appleSoldYearly = 402; 
		orlandoStore.pricePerApple = 0.86; 
		orlandoStore.orangeSoldYearly = 398; 
		orlandoStore.pricePerOrange = 0.79; 
		orlandoStore.totalAmountA = orlandoStore.appleSoldYearly * orlandoStore.pricePerApple; 
		orlandoStore.totalAmountO = orlandoStore.pricePerOrange * orlandoStore.orangeSoldYearly; 
		orlandoStore.total = orlandoStore.totalAmountA + orlandoStore.totalAmountO; 
		
		
		System.out.println("Output for Houston store "); 
		System.out.println("------------------------- ");
		
		System.out.println( "\nApple sold: "+ houstonStore.appleSoldYearly);
		System.out.println("Apple Retail Price: "+ houstonStore.pricePerApple); 
		
		System.out.println("\nOranges sold: "+ houstonStore.orangeSoldYearly); 
		System.out.println("Orange Retail Price: "+ houstonStore.pricePerOrange); 
		
		System.out.println("------------------------- ");
		
		System.out.println(" Apples = $ "+ houstonStore.totalAmountA);
		
		System.out.println(" Oranges = $ "+ houstonStore.totalAmountO); 
		System.out.println(" Total = $"+ houstonStore.total); 
		System.out.println("------------------------- ");
		
		System.out.println("\nOutput for Seattle store "); 
		System.out.println("------------------------- ");
		
		System.out.println( "\nApple sold: "+ seattleStore.appleSoldYearly);
		System.out.println("Apple Retail Price: "+ seattleStore.pricePerApple); 
		
		System.out.println("\nOranges sold: "+ seattleStore.orangeSoldYearly); 
		System.out.println("Orange Retail Price: "+ seattleStore.pricePerOrange); 
		System.out.println("------------------------- ");
		System.out.println(" Apples = $ "+ seattleStore.totalAmountA);
		
		System.out.println(" Oranges = $ "+ seattleStore.totalAmountO); 
		System.out.println(" Total = $"+ seattleStore.total); 
		System.out.println("------------------------- ");
		
		System.out.println("\nOutput for Orlando store "); 
		System.out.println("------------------------- ");
		
		System.out.println( "\nApple sold: "+ orlandoStore.appleSoldYearly);
		System.out.println("Apple Retail Price: "+ orlandoStore.pricePerApple); 
		
		System.out.println("\nOranges sold: "+ orlandoStore.orangeSoldYearly); 
		System.out.println("Orange Retail Price: "+ orlandoStore.pricePerOrange);
		
		System.out.println("------------------------- ");
		System.out.println(" Apples = $ "+ orlandoStore.totalAmountA);
		
		System.out.println(" Oranges = $ "+ orlandoStore.totalAmountO); 
		System.out.println(" Total = $"+ orlandoStore.total); 

	}

}

class groceryStore
{
	int appleSoldYearly; 
	double pricePerApple; 
	int orangeSoldYearly; 
	double pricePerOrange;
	double totalAmountA; 
	double totalAmountO; 
	double total; 
	
}
