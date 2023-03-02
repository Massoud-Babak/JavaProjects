package vol4lesson8;

public class vol4lesson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		int number [] = { 12,43,54,2,7,33,65,999,4,-1567}; 
		
		int smallest = number[0]; 
		int largest = number[0]; 
		
		
		
	for (int element: number){
		
			if( element < smallest) smallest = element; 
			if (element > largest) largest = element; 
			 
			
			
		}
	System.out.println("smallest\t " + smallest);
	System.out.println("largest \t" + largest);
	}
	}


