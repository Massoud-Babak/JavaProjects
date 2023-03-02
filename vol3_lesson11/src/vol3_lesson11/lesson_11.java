package vol3_lesson11;

public class lesson_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double endurance; 
		aircraft cessna172 = new aircraft(); 
		
		aircraft piperSaratoga = new aircraft(); 
		
		cessna172.passenger = 4; 
		cessna172.fuelCapacity = 70; 
		cessna172.fuelBurnRate = 9.5; 
		cessna172.CruisSpeed = 140; 
		
		System.out.println("Sessna 172 details "); 
		System.out.println("==================="); 
		
		System.out.println("Passengers:  "+ cessna172.passenger); 
		System.out.println("Fuel Capacity:  "+ cessna172.fuelCapacity); 
		System.out.println("Fuel Burn Rate:  "+ cessna172.fuelBurnRate); 
		System.out.println("Speed:  "+ cessna172.CruisSpeed); 
		
	
		
		cessna172.calculateEndurance();
		
		

	}

}


class aircraft
{
	int passenger; 
	double fuelCapacity; 
	double fuelBurnRate; 
	double CruisSpeed; 
	
	void calculateEndurance()
	{
		double endurance; 
		
		endurance = fuelCapacity / fuelBurnRate; 
		System.out.println("Endurance is "+ endurance+ " hours."); 
		
		 
		
	}
}