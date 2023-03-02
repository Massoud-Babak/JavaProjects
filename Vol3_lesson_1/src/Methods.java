
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Program Starts here "); 
		name(); // call to first method 
		second(); // call to second method 
		System.out.println(" Program Ends here "); 
		
		calc(); // call third method
	}
	
	
	public static void name()// first method 
	{
		System.out.println("\tFirst method execution --> \t\t\tMy first Name is Massoud "); 
	}
	
	public static void second()// second method 
	{
		System.out.println("\tSecond method execution --> \t\t\tThis is second method being executed!");
		System.out.println(); 
	}
	public static void calc()// third method
	{
		int mass = 4; 
		int babak = 5; 
		
		int nameNum; 
		nameNum = mass + babak; 
		System.out.println( " the sum of num.. in name is: "+nameNum); 
	}
	
}
