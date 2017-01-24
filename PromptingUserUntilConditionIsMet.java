import java.util.Scanner;

public class PromptingUserUntilConditionIsMet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number that's less than 100: ");
		int input = 0;
		
		boolean valid = false;
		
		while(!valid){
			input = scan.nextInt();
			if(input >0 && input <100){
				valid = true;
				System.out.println("Thank you for the valid number!");
			} else {
				System.out.println("This is not a valid number!");
			}
		}

	}

}
