package vol4Lesson10;

public class Lesson10 {

	public static void main(String[] args) {
		// comparing two strings 
		
		String str1 = " massoud "; 
		String str2 = " mohammad"; 
		String str3 = " Ahamd"; 
		String str4 = " Ahmad"; 
		
		System.out.println(str1); 
		System.out.println(str2); 
		System.out.println(str3); 
		System.out.println(str4); 
		
		System.out.println("_____________"); 
		
		if(str1.compareTo(str2) >0) System.out.println("Equal yes!"); 
		if(str1.compareTo(str2) <0)System.out.println("Nope, not equal!"); 
		
		if(str3.compareTo(str4) >0) System.out.println("str 4 and 3 are equal"); 
		if(str3.compareTo(str4) <0) System.out.println("str 4 and 3 are NOT  equal"); 
		
		

	}

}
