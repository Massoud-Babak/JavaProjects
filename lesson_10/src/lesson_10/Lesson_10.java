package lesson_10;

public class Lesson_10 {

	public static void main(String[] args) {
		// logical operators
		
		/*
		 * &&	logical AND		"A and B" must be true. 
		 * ||	logical Or		"A or B" both or one must be true
		 * !	logical NOT		"Invert State" Not
		 * ^	logical XOR		"A or B" one must be true, NOT BOTH.
		 */
			
		int a = 10; 
		int b =	5; 
	 
		
		if( a == 10 && b == 5) System.out.println("Success!");
		if (a==10 || b == 2) System.out.println("Success2!");
		if (a!=3 ) System.out.println("Success3!");
		if (a==10 ^ b == 0) System.out.println("Success4!");
		
		int age =47; 
		
		if(  age >=25 && age <= 35)
			System.out.println( " your age between 25 and 35");
		if(age >= 45 && age<=55)
			System.out.println( "your age is between 45 and 55"); 
	}

}
