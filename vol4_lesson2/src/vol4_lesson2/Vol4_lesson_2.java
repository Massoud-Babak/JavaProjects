package vol4_lesson2;

public class Vol4_lesson_2 {

	public static void main(String[] args) {
		// Array 
		
		double grades [] = { 96.5,98.7,99.3,88.4,88.4,99.9}; 
		int i; 
		double max; 
		for(i =0; i <=5; i++)
		{
			System.out.println("grade number "+i+" is "+ grades[i]); 
		}
		
		max = grades[0]; 
		for( i = 0; i <=5; i++)
		{
			if( grades[i] > max)  max = grades[i]; 
		}
		
		System.out.println( " \nmax is "+ max);
	}	

}
