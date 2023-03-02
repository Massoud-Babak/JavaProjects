package vol2_lesson8;
import java.util.Scanner; 
public class lesson8 {

	public static void main(String[] args) {
		/* write a program that asks what grade a student received on an exam.
		 * using an if-else-if ladder, output the following: 
		 * 
		 * if grade falls between 						output
		 * greater than or equal to 90					You earned an A on the exam!
		 * between 80 and 90 							You earned an B on the exam!
		 * between 70 and 80 							You earned an c on the exam!	
		 * between 60 and 70 							You earned an D on the exam!
		 * less than 60									You earned an D on the exam!
		 */
	
			Scanner input = new Scanner(System.in);
			
			int score = 0; 
			
			System.out.println("Enter your score: "); 
			if(input.hasNextInt() == true) score = input.nextInt(); 
			
			if( score >= 90) {
				System.out.println("You earned "+ score+" scores");
				System.out.println("You earned an A on the exam!");
			}
					
			else if (score >=80 && score <90) {
				System.out.println("You earned "+ score+" scores");
				System.out.println("You earned  B on the exam!");
			}
				
			else if (score >=70 && score <80) {
				System.out.println("You earned "+ score+" scores");
				System.out.println("You earned  C on the exam!");
			}
				
			else if (score >=60 && score <70) {
				System.out.println("You earned "+ score+" scores");
				System.out.println("You earned  D on the exam!");
			}
				
			else if (score <60)
				System.out.println("You earned  F on the exam!");
	}

}
