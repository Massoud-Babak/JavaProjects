package vol2_Lesson5;
import java.util.Scanner; 

public class Lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		//this program calcultes the area of a circle 
		/*double radius; 
		double area; 
		
	System.out.println("enter the radius of a circle:");
	radius = input.nextDouble(); 
	
	area = 3.14159*radius*radius; 
	
	System.out.println("The area of the circle is "+ area );
	
	*/
		
		
		double lenght = 0, width = 0;  // this program calculates the area & perimeter 
									  // of a rectingle. 
		double perimeter =0, area = 0; 
		
		System.out.println("Enter the length of rectingle: "); 
		if(input.hasNextDouble() == true) lenght = input.nextDouble(); 
		
		System.out.println("Enter the width of rectingle: "); 
		if(input.hasNextDouble() == true) width = input.nextDouble(); 
		
		area = lenght*width; 
		perimeter = lenght + lenght + width + width; 
		
		System.out.println("the area of the rectingle is: " +area);
		System.out.println("the Perimeter of the rectingle is: " +perimeter);
		
	}

}
