package vol3_lesson_5;
 import java.util.Scanner; 
 
public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner( System.in); 
		
		double number1 = 1.0; 
		double number2 = 1.0; 
		double number3 = 1.0; 
		double avarage = 1.0; 
		
		
		System.out.println("Enter firs score: ");
		 number1 = input.nextDouble();
		
		System.out.println("Enter second score: ");
		 number1 = input.nextDouble();
		
		System.out.println("Enter third score: ");
		 number1 = input.nextDouble();
		
	avarage	= averageScore( number1, number2, number3); 
		
		System.out.println(" The average of your scores "+ avarage);

		
		
	}
	public static double averageScore(double a, double b, double c)
	{
		double avarage1 = (a+b+c)/ 3.0; 
		
		return avarage1; 
		
	}

}
