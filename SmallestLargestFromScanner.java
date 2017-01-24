import java.util.Scanner;

public class SmallestLargestFromScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a series of numbers: \r");
		
//		int fromScan = scan.nextInt();
//		//finding the largest number in the user input
//		while(scan.hasNextInt()){
//			int loopy = scan.nextInt();
//			if(fromScan<loopy){
//				//2 < 4 false
//			
//				fromScan=loopy;
//				
//				
//			}
//			
//			
//		}
//		System.out.println(fromScan);
		
//smallest
		int fromScan = scan.nextInt();
		//finding the largest number in the user input
		while(scan.hasNextInt()){
			int loopy = scan.nextInt();
			if(fromScan>loopy){
				//2 < 4 false
			
				fromScan=loopy;
				
				
			}
		

	}
		System.out.println(fromScan);
	}

}
