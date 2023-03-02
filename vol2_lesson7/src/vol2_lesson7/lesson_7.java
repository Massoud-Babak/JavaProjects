package vol2_lesson7;
import java.util.Scanner; 

public class lesson_7 {

	public static void main(String[] args) {
		// nested if
			
		/*
		int tempreture = 70; 
		boolean sunny = true; 
		
		if( tempreture >=90 ) 
		{
			System.out.println("Its hot outside! "); 
			if (sunny == true) System.out.println("Its sunny outside!"); 
			else System.out.println("its NOT sunny outside! "); 
				
		}
		
		else 
		{
			System.out.println(" tempreture is less than 90, Not so hot today! "); 
			if( sunny == true) System.out.println(" its sunny though "); 
			else System.out.println( " and its not even sunny today "); 
		}
		*/
		
		Scanner input = new Scanner(System.in); 
		/*
		int guess = 0; 
		// the program will let the user to guess how many states are in USA.
		// If the user a # higher than 50, it will display msg that u guessed to high
		// or if input a lower # the program will prompt that you guessed a too low.
		// till the user puts 50 and it will execute the message "correct!".
		 * 
		
		System.out.println(" How many states are in USA? "); 
		if(input.hasNextInt() == true) guess = input.nextInt(); 
		
		if( guess == 50 )
		{
			System.out.println(" You are Correct! ");
		}
		
		else 
		{
			System.out.println("you are incorrect! "); 
			if (guess < 50) System.out.println("You guessd to low. ");
			else System.out.println("You guessed to high. ");
		}
		*/
		
		// this program will check your score and display the msg accordingly.
		// else if ladder.
		
		char score = 'A'; 
		
		if (score == 'A')
			System.out.println(" you earn A, Fantastic! "); 
		else if ( score == 'B')
			System.out.println(" your earned B, good job "); 
		else if ( score == 'C')
			System.out.println(" your earned C, you are Average Student! ");
		else if (score == 'D')
			System.out.println(" your earned D, you did poorly! ");
		else 
			System.out.println(" your earned F, You failed ");
		
		
			
		
		
	}

}
