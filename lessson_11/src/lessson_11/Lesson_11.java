package lessson_11;

public class Lesson_11 {

	public static void main(String[] args) {
		/*
		 * x = x + y		x +=y
		 * x = x - y		x-=y
		 * x = x * y		x *=y
		 * x = x / y		x /=y
		 * 
		 */
		int num; 
		System.out.println(" num \t a=num+2 \t b=num-2 \t c=num*2 \t d=num/2");
		
		for( num =1; num <=15; num++)
		{
			int a = num; 
			int b = num; 
			int c = num; 
			double d = num; 
			
			a +=2; 
			b -= 2; 
			c *=2; 
			d /=2; 
			
			System.out.println(" "+num +"\t " + a+  " \t\t " + b+ "\t \t " + c+ " \t\t " +d );
			
			
			
		}

	}

}
