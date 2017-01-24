
public class SmallestAndLargestInSequence {

	public static void main(String[] args) {
		int[] arr = {4,2,6,234,1,4489,54};
		
		//finding the largest
		int result = arr[0];
		int newREs=0;
		
		
		for(int i =1;i<arr.length;i++){
			
				if(arr[i]>result){
					//5>4
					result = arr[i];			
				}
		}
		System.out.println(result);
		
		for(int i =1;i<arr.length;i++){
			int rr =arr[0];
			if(rr>arr[i]){
			//	4 >  2 true
				
				newREs = arr[i];
				
			}
		}
		
	
		System.out.println(newREs);

	}

}
