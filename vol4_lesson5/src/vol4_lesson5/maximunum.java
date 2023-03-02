package vol4_lesson5;

public final class maximunum {

	public static void main(String[] args) {
		// Minimum and maximum numbers
		
			
		int scores [] = { 3,4,2,45,43,22,-33,56,78,98,99,-9}; 
		
		int smallestScore = scores[0]; 
		int largestScore = scores [0]; 
		int i; 
		
		for(i = 0; i<=11; i++ )
		{
			if( scores[i]< smallestScore) smallestScore = scores[i]; 
			else if (scores[i] > largestScore) largestScore = scores[i]; 
		}
			
		System.out.println("Smalles score is "+ smallestScore);
		System.out.println("Largest score is "+ largestScore);
	}

}
