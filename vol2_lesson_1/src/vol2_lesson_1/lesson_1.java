package vol2_lesson_1;

import java.util.Scanner; 
 
public class lesson_1 {

	public static void main(String[] args) {
		// guess my character game.
		
		
		Scanner var = new Scanner(System.in); 
		char input = 'w'; 
		System.out.println(" Guess my character: ");
		input = var.next().charAt(0);  
	
		if(( input == 'w') || (input == 'W'))
		{
			System.out.println(" You guessed it correct! ");
			
			
		}
		if(( input != 'w') && (input != 'W'))
		{
			System.out.println(" Incorrect! ");
		}
		
		
	
		
		
		
		

	}

}
