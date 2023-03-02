package vol3_lesson8;

public class lesson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aircraft cessna172 = new aircraft(); 
		aircraft piperSaratoga = new aircraft(); 
		
		cessna172.passenger = 4; 
		cessna172.CruiseSpeed = 140; 
		cessna172.fuelCapacity = 56.6; 
		cessna172.fuelBurnRate = 9.5; 
		
		System.out.println(" \nCessna 172 details as follow:\n "); 
		System.out.println(" Passenger: "+ cessna172.passenger); 
		System.out.println(" Cruise speed: "+ cessna172.CruiseSpeed + " MPH"); 
		System.out.println(" Fuel capacity:"+ cessna172.fuelCapacity +" Gallons"); 
		System.out.println(" fuel Burn Rate:"+ cessna172.fuelBurnRate + " GPH");
		
		piperSaratoga.passenger = 6; 
		piperSaratoga.CruiseSpeed = 201; 
		piperSaratoga.fuelCapacity = 102.5; 
		piperSaratoga.fuelBurnRate = 20.5; 
		
		System.out.println(" \nPiper Saratoga details are as follow: \n"); 
		
		System.out.println(" Passenger: "+ piperSaratoga.passenger);
		System.out.println(" Cruise Speed: "+ piperSaratoga.CruiseSpeed+" MPH"); 
		System.out.println(" Fuel Capicity "+ piperSaratoga.fuelCapacity + " Gallons"); 
		System.out.println(" Fuel Burn Rate "+ piperSaratoga.fuelBurnRate + " GPH"); 
		
		
		
		

	}

}


class aircraft 
{
	int passenger; 
	double CruiseSpeed; 
	double fuelCapacity; 
	double fuelBurnRate; 
	
}