
public class FindingSumAndAverageInArray {

	public static void main(String[] args) {
		
		//finding sum of values in the array
		
		int[] arr = {56,4,5,6,7,34};
		int sum = 0;
		for(int element: arr){
			sum+=element;
			
		}
		System.out.println(sum);
		//finding average 
		
		System.out.println(sum/arr.length);
	}

}
