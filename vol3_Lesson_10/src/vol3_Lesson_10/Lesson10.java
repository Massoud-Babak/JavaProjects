package vol3_Lesson_10;

public class Lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cameryEndurance; 
		
		car hybridCamery = new car(); 
		car luxus = new car (); 
		car sienna = new car(); 
		car pilotHonda = new car(); 
		car acura	= new car(); 
		
		hybridCamery.passengers = 4; 
		hybridCamery.speed = 180; 
		hybridCamery.fuelCapacity = 56; 
		hybridCamery.fuelBurnRate = 9.5; 
		hybridCamery.price = 24000; 
		
		
		cameryEndurance = hybridCamery.fuelCapacity /hybridCamery.fuelBurnRate ; 
		System.out.println("hybrid Camery details ");
		System.out.println("---------------------- ");
		
		System.out.println("Passengers :  "+ hybridCamery.passengers);
		System.out.println("Speed : "+ hybridCamery.speed +" MPH");
		System.out.println("Fuel Capacity : "+ hybridCamery.fuelCapacity+ " Gallons");
		System.out.println("Fuel Burn Rate: "+ hybridCamery.fuelBurnRate+ " M/Gallon");
		System.out.println("Drives before full tank is empty: "+ cameryEndurance);
		
		

	}

}



class car
{
	int passengers; 
	double fuelCapacity; 
	double fuelBurnRate; 
	double speed; 
	double price; 
	
}