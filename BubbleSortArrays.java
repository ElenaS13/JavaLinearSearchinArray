
public class BubbleSortArrays {

	public static void main(String[] args) {
		
		int[] houseNums = {23, 76, 15,47,14,38, 52};
		
		//System.out.print("The original sequence is: \n");
		for(int i =0; i<houseNums.length; i++){
			//System.out.println(houseNums[i] + ", ");
		}
		
		sortThem(houseNums);
	}

	private static void sortThem(int[] arr) {
		int temp;
		
		for(int i =arr.length-1; i>0;i--){
			
			
			for(int j=0; j<i; j++){
				
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("The new sequence is: ");
	   for(int i=0; i<arr.length; i++){
		   System.out.print(arr[i] + ", ");
	   }	
	}

}
