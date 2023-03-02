package vol2_Lesson10;
import java.util.Scanner; 

public class Lesson10 {

	public static void main(String[] args) {
		// switch --> comparison 
		// break will end the loop at a given number
		
		
		/*int counter; 
		
		for(counter =1; counter <=10; counter++)
		{
			System.out.println("Counter is at loop " + counter);
			
			if(counter == 7) break; 
			
			
		}
			
		System.out.println();
		System.out.println("End of loop "); 
		*/
		
		Scanner input = new Scanner(System.in); 
		
		int i; 
		char userC; 
		char letterTest = 'A'; 
		
		System.out.println(" Enter your favorite CAPITAL letter of alphabet: ");
		userC = input.next().charAt(0); 
		
		for( i = 1; i <=26; i++)
		{
			
			if(userC == letterTest)
				break;
			letterTest++;
		}
		System.out.println("your favorite letter is "+
				letterTest+ " your counter number is"+i);
	}

}
