package vol2_lesson_6;

import java.util.Scanner; 
public class Lesson6 {

	public static void main(String[] args) {
		// if and else statements 
		
		Scanner keyBoard = new Scanner(System.in); 
		
		int myAge = 33; 
		int guesAge =0; 
		
		System.out.println("Enter a Guess for my age!"); 
		if(keyBoard.hasNextInt() == true) guesAge = keyBoard.nextInt(); 
		
		if(guesAge == myAge)
		{
			System.out.println(" Correct, my age is "+ guesAge);
		}
		else
		{
			System.out.println(" Wrong!\n Guess again!");
		}
		
		
		
		
		
		
		/*int score = 99 ; 
		
		if(score >= 95)
		{
				System.out.println(" you scored "+ score+" on the exam! "); 
				System.out.println(" Great job on the exmam1 ");
		}
		else
		{
			System.out.println(" you scored "+ score+" on the exam! ");
			System.out.println( " you did poorly in exam! "); 
		}
			*/
	}

}
