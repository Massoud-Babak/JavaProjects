package vol4_lesson6;

public class twodimentionalArry {

	public static void main(String[] args) {
		// two dimensional array 
		// used mostly for making tables 
		
		// first bracket is rows & second brackets is columns 
		
		int table [][] = new int [12][2]; 
		
		
		table [0][0] = 1 ; 
		table [1][0] = 2; 
		table [2][0] = 3 ; 
		table [3][0] = 4; 
		table [4][0] = 5 ; 
		table [5][0] = 6; 
		table [6][0] = 7 ; 
		table [7][0] = 8; 
		table [8][0] = 9 ; 
		table [9][0] = 10; 
		table [10][0] = 11 ; 
		table [11][0] = 12; 
		
		
		table [0][1] = 34 ; 
		table [1][1] = 44; 
		table [2][1] = 23 ; 
		table [3][1] = 76; 
		table [4][1] = 65 ; 
		table [5][1] = 98; 
		table [6][1] = 123 ; 
		table [7][1] = 102; 
		table [8][1] = 87 ; 
		table [9][1] = 43; 
		table [10][1] = 34 ; 
		table [11][1] = 12;
		
		for( int i =0; i <=11; i++)
		{
			System.out.println("For month number "+ table[i][0]+" the revenue was $ "+table[i][1]);
		}
	
		
		

	}

}
