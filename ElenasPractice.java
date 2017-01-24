import java.util.Scanner;

public class ElenasPractice {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
//get array from the user 
		
int[] nn = getIntegers(5);	
System.out.println(" " );
//System.out.println("Largest number is " + largestFinder(nn));
reverse(nn);
int[] result = new int[5];

		
		
		
		
		
	}
	//write method to accept an array from user 
	public static int[] getIntegers(int n){
		System.out.println("Please enter "+ n + " integers");
		int[] nums1=new int[n];
		
		for(int i =0; i<nums1.length;i++){
			nums1[i]=scan.nextInt();
						System.out.print(nums1[i] + " ");
			
		}
		
		return nums1;
		
	}
	
	//write a method to find the largest number in the array
	public static int largestFinder(int[] arr){
		
		int result = arr[0];
		for(int i=1; i<arr.length; i++){
			if(result<arr[i])
			  //45<4 false
			  // 45<3 false
			  //45<456 true
			{
				result=arr[i];
				
			}
			
		}
		return result;
		
		
	}
	
	//write a method to reverse the values in the array 
	public static int[] reverse(int[] arr){
		
		
		for(int i =arr.length-1; i>=0;i--){
			int result = arr[i];
		
		System.out.print(result+" ");
		 
		}
		return arr;
		
		
	}
	
	

}
