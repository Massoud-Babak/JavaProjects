package vol4lesson9;
import java.util.Scanner; 
public class Lesson9 {

	public static void main(String[] args) {
		// you can check if two strings are equal with each other using .equal();
		
		Scanner input = new Scanner (System.in); 
		
		String userInput; 
		
		
		String fname = "Massoud";
		String lname = "Babak"; 
		
		System.out.println( "Enter first name"); 
		userInput = input.next(); 
		
		System.out.println(fname.equals(userInput)); 
		 
		if(fname.equals(userInput))
		{
			System.out.println("AAfranin!");
		}
		
		
		
		
		

	}

}
