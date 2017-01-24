import java.util.ArrayList;
import java.util.Scanner;

public class RemoveFromArrayList {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		ArrayList<Double> inputs = new ArrayList<Double>();
		System.out.print("Enter some numbers: ");
		while(scan.hasNextDouble()){
			inputs.add(scan.nextDouble());
		}
		
		System.out.println(inputs);
		inputs = remove(inputs);
		System.out.println("");
		System.out.println(inputs);
		

	}
	public static ArrayList<Double> remove(ArrayList<Double> inputs){
		int i =0;
		while(i < inputs.size()){
			if(inputs.get(i) >50){
				inputs.remove(i);
			} else {
				i++;
			}
		}
		return inputs;
	}

}
