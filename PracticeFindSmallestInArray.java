
public class PracticeFindSmallestInArray {

	public static void main(String[] args) {
		int[] arr = {45,344,56,78,345,664};
		int smallest = arr[0];
		for(int i =0; i<arr.length;i++){
			if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		System.out.println(smallest);
	}

}
