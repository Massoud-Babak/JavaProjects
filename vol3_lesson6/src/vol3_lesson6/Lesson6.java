package vol3_lesson6;

public class Lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a class is a template. 
		
	aircraft cessna172 = new aircraft(); // it creates object of class aircraft
	
	//aircraft piperSaratoga = new aircraft(); // creates second object of class aircraft
	
	
	aircraft piperSaratoga; // or it could be declared separately
	piperSaratoga = new aircraft(); 	// and initialized separately just a variable
	

	}

}

class aircraft
{
	int passengers; 		// number of people
	int CruiseSpeed; 		// miles per hour
	double fuleCapacity; 	// gallons 
	double fuelBurnRate; 	// gallons per hour
}

