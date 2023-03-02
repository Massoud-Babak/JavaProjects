
public class lesson_11 {

	public static void main(String[] args) {
		// the reminder operator and Continue
		// % reminder operator 
		//continue; means repeat basically. 
		
		/*
		int counter; // this program will display the multiples of 2. 
		
		for( counter =1; counter<=30; counter++)
		{
			if(counter%2==0)
				System.out.println(counter); 
			 continue; 
			
		}

		*/
		
		/*
		 * write a program that uses a for loop to continue
		 *  statement to print out all even numbers between 1
		 *  and 100.
		 */
		
		int i; 
		for(i = 1; i<=100; i++)
		{
			if(i%2 !=0)
				continue;
				System.out.println("even number : "+i);
			
		}
	}

}
