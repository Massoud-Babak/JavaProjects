package vol3_lesson_4;

import java.util.Scanner; 
public class Lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		
		int num1 = 0; 
		int num2 = 0; 
		int answer; 
		
		System.out.println("Enter first number : ");
		if(input.hasNextInt() == true) num1 = input.nextInt(); 
		
		System.out.println(" Enter Second Number : "); 
		if( input.hasNextInt() == true) num2 = input.nextInt(); 
		
		answer = largeNumber(num1, num2);
				
			System.out.println(" you have entered "+ num1 + " and "+ num2); 
			System.out.println(" The largest number is "+ answer); 
				
		
	}
	
	public static int largeNumber( int x, int y)
	{
		if( x >=y) return x; 
			
		
		else return y; 
			
		
	}
	
	

}
