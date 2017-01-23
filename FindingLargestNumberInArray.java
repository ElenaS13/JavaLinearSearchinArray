
public class FindingLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] numArr = {56,54,34,56,234};
		int largest = numArr[0];
		for (int i = 0; i < numArr.length; i++) {
			if(numArr[i]>largest){
				largest = numArr[i];
				
				
			}
		}
		System.out.println(largest);

	}

}
