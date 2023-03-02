package vol2_lesson3;
import java.util.Scanner; 
public class Lesson3 {

	public static void main(String[] args) {
		// reading two characters and displaying them. 
		// reading character has point to learn ->
		// variable = input.next().charAt(0); 
		
		Scanner input = new Scanner( System.in); 
		char var, var2; 
			
			System.out.println(" Enter 1st character: "); 
			var = input.next().charAt(0); 
			
			System.out.println(" Enter 2nd character: "); 
			var2 = input.next().charAt(0); 
				
			System.out.println(" Your first input is:  "+ var);
			
			System.out.println(" Your second input is:  "+ var2);
	}

}
