package lesson_6;

public class Lesson6 {

	public static void main(String[] args) {
		
		double num1 = 1.25;
		double answer; 
		double power;
		int counter; 
		
		for(counter =1; counter<=20; counter =counter+1) {
			
		
		answer = Math.pow(num1, counter); 
		System.out.println(num1+ " raised to the power of "+
		counter+ " is equal to " +answer); 
		}
	}

}
