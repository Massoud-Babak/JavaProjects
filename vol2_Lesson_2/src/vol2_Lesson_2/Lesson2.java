package vol2_Lesson_2;

import java.util.Scanner; 
public class Lesson2 {

	public static void main(String[] args) {
		// the program will take a character from user
		// display the character & displays its upper case. 

		
		Scanner input = new Scanner(System.in); 
		
		char lowerCase; 
		char upperCase; 
		
		System.out.println("Enter a character: ");
		lowerCase =  input.next().charAt(0); 
		
		System.out.println(" You Entered lower case: "+ lowerCase); 
		upperCase = (char)(lowerCase -32); 
		
		System.out.println( " The upper case version of ("
		+ lowerCase+ ") is :"+ upperCase); 
				

	}

}
