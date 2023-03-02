package lesson_8;

public class lessson8 {

	public static void main(String[] args) {
		// boolean data type. only can hold "true or false".
		/*
		boolean var = true; 
		boolean bar = false; 
		
		if( var) // for true value, the condion of if could be declared with
			//without == signs-- only for true condition.
			
			System.out.println(" correct!");
		if( bar) // for false, you will have to use == signs. otherwise it will
		//or it will print otherwise. 
			System.out.println(" wrong!");
		*/
		
		boolean bool = false; // if true the 1st block will execute.
								// if false the 2nd block will execute. 
		int i; 
		
		for( i =1; i <=4; i++)
		{
			if(bool)
			{
				System.out.println(" The value of the variable is "
						+ bool); 
			}
			if(bool != true)
			{
				System.out.println(" The value of the variable is "+ bool 
						); 
			}
		}
		
		
	}

}
