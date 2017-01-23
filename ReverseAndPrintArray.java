import java.util.Scanner;

public class ReverseAndPrintArray {

	public static void main(String[] args) {
		
		int[] numbers = readInput(5);
		printReversed(numbers);
		
//		int[] newarr= {7,9,8,76};
//		for(int i =newarr.length-1; i>=0;i--){
//			System.out.println(newarr[i]+" ");
//		}

	}
public static int[] readInput(int num){
	System.out.println("Enter " + num + " numbers.");
	Scanner scan = new Scanner(System.in);
	int[] input = new int[num];
	for(int i =0; i<input.length; i++){
		input[i] = scan.nextInt();
	}
	
	return input;
	
}
public static void printReversed(int[] values){
	for(int i=values.length-1; i>=0;i--){
		System.out.println(values[i]+" ");
	}
}



}
