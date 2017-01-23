import java.util.Scanner;

public class ElenasPracticeLinearSearchInArray {

	public static void main(String[] args) {
		
		int[] arr = {5,6,7,8,9};
		int val = 74;
		valueFinder(arr, val);
		
		
		
	}
//	//we are getting integers from the user and putting them into an array
//	public static int[] getIntegers(int n){
//		System.out.println("Please, enter "+n +" integers.");
//		Scanner scan = new Scanner(System.in);
//		int[]arr2= new int[n];
//		for(int i =0; i<arr2.length;i++){
//			arr2[i]=scan.nextInt();
//			System.out.print(arr2[i]);
//		}
//		
//		return null;
//		
//		
//	}	
//	
	
	private static void valueFinder(int[] arr, int val) {
		
		int pos =0;
		boolean found = false;
		while(pos<arr.length && !found){
			if(arr[pos]==val){
				found =true;
			} else{
				pos++;
			}
		}
		if(found){
			System.out.println("Found");
		} else{
			System.out.println("no");
		}
		
	}
	
		
}