package vol2_lesson12;

public class Lesson12 {

	public static void main(String[] args) {
		// while loop
		// initialize your variable outside of the loop and increment or decrement 
		// the variable inside the loop. 
		
		
			/*int i = 1; // Declare & initialize your variable. 
			
			while(i<=10) 
			{
				System.out.println("this is loop number: "+ i);
				i++; // increment your variable.
			}
			*/
		
	// this program prints letters from A-Z.
		/*
		char letter = 'A'; 
		
		while (letter <='Z')
		{
			System.out.println("The current letter is: "+ letter); 
			letter++; 
		}
		*/
		
		/*
		 * Write a program using while loop to calculate
		 *  the sum of all numbers from 1 to 100, then out put the result. 
		 */
		
	int number = 1; 
	int sum = 0; 
			
			while ( number<=100)
			{
				sum = sum + number; 
				number++; 
			}
			System.out.println(" The sum of all numbers from (1 to 100) is: "+ sum);
	}

}
