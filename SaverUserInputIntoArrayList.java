import java.util.ArrayList;
import java.util.Scanner;

public class SaverUserInputIntoArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter some numbers: ");
		
		ArrayList<Double> inputs = new ArrayList<Double>();
		while(scan.hasNextDouble()){
			inputs.add(scan.nextDouble());
		}
		System.out.println(inputs);

	}

}
