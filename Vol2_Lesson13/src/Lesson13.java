
import java.util.Scanner;
public class Lesson13 {

	 
	public static void main(String[] args) {
		// do while loop 
		Scanner input = new Scanner(System.in); 
		
		int num = 0;
		int answer = 17;
		
		System.out.println("Guess a number between 1 and 20 "); 
		if(input.hasNextInt()== true) num = input.nextInt(); 
		
		do
		{
			System.out.println(" You entered "+ num); 
			 if(num == answer)
			 
					System.out.println("You guessed Correct! ");
			
			if (num < answer)
			
				System.out.println(" you entered very low "); 
			
			
			if ( num > answer) {
				
					System.out.println(" You enterd very high"); 
				
			}
			break; 
				
		} 
		while ( num != answer); 
		
	
		
		
		

	}

}
