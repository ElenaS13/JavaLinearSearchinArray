
public class FillArrayWithSquaresOfANumber {

	public static void main(String[] args) {
		// fill array with squares 
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++){
			arr[i] = i*i;
			System.out.println(arr[i]);
		}
		
	}

}
