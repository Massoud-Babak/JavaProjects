package vol3_lesson_2;
import java.util.Scanner; 
public class Lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		int season = 0; 
		
		
		
		System.out.println(" Enter a season! "); 
		System.out.println(" 1 = Spring\n 2 = Summer\n 3 = Fall\n 4 = Winter ");
		
		if(input.hasNextInt() == true) season =  input.nextInt(); 
		
			if(season == 1)
			{
				printSpring(); 
			}
			if(season == 2)
			{
				printSummer(); 
			}
			if(season == 3)
			{
				printFall(); 
			}
			if(season == 4)
			{
				printWinter(); 
			}
	}
	
	public static void printSpring()
	{
		System.out.println(" The season is spring, and flowers are blooming!"); 
	}
	public static void printSummer()
	{
		System.out.println(" The season is Summer, and its getting hot!"); 
	}
	public static void printFall()
	{
		System.out.println(" The season is Fall, and the leaves are falling!"); 
	}
	public static void printWinter()
	{
		System.out.println(" The season is Winter, and it is snowing"); 
	}

}
