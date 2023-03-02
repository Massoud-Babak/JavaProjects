package vol_lesson_3;

public class Lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method that adds and returns result 

		int num1 = 2; 
		int num2 = 4; 
		int answer1, answer2;
		boolean answer3; // have to change type to boolean, int doesnt work
		
		answer1 = multNumbers(num1); // method 1 multiplies 11 by num1
		
		System.out.println("The result is "+ answer1); 
		
		answer2 = add( num1, num2);// method two adds num1 and num2
				
					System.out.println(" The sum of num1 & num 2 is: "+ answer2);
				
				
		answer3 = equalNumbers(num1, num2);
		
			System.out.println(" number1 and number2 if not match = false, if match = true: "+ answer3);
		
				
		
	}
	
	
	public static int multNumbers( int x)
	{
	
		int answer = x *11; 
		
		return answer; 
	}
	
	public static int add( int x, int y)
	{
		int sum = x + y; 
		
		return sum; 
	}
	
	public static boolean equalNumbers( int r, int t)
	{
		if( r == t) return true; 
		else return false; 
	}
	
	

}
