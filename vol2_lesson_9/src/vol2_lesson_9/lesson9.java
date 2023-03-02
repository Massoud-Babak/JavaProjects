package vol2_lesson_9;
import java.util.Scanner; 
public class lesson9 {

	public static void main(String[] args) {
		// switch --In switch you  compare for equality with the variable,
		// 
		
		/*
		char grade = 'A'; 
		
		switch(grade)
		{
		case 'A':
			System.out.println(" you got A in exam! ");
			break; 
		case 'B':
			System.out.println(" you got B in exam! ");
			break; 
		case 'C':
			System.out.println(" you got C in exam! ");
			break; 
		case 'D': 
			System.out.println(" you got D in exam! ");
			break; 
			
			default:
				System.out.println(" You Entered invalid Entery ");
		}*/

		
		Scanner input = new Scanner(System.in); 
		
		int month =1; 
		System.out.println("Enter your favorite month of the year ");
		if(input.hasNextInt() == true) month = input.nextInt(); 
		
		switch (month)
		{
		case 1: 
			System.out.println("January is your favorite month "); 
			break; 
			
		case 2: 
			System.out.println("Febraury is your favorite month "); 
			break; 
		case 3: 
			System.out.println("March is your favorite month "); 
			break; 
		case 4: 
			System.out.println("April is your favorite month "); 
			break; 
		case 5: 
			System.out.println("May is your favorite month "); 
			break; 
		case 6: 
			System.out.println("June is your favorite month "); 
			break; 
		case 7: 
			System.out.println("July is your favorite month "); 
			break; 
		case 8: 
			System.out.println("Auguest is your favorite month "); 
			break; 
		case 9: 
			System.out.println("September is your favorite month "); 
			break; 
		case 10: 
			System.out.println("October is your favorite month "); 
			break; 
		case 11: 
			System.out.println("November is your favorite month "); 
			break; 
			
		case 12: 
			System.out.println("December is your favorite month "); 
			break; 
			
			default:
				System.out.println("Invalid Entery! ");
		}
	}

}
