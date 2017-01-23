import java.util.Scanner;

public class ElenasPracticArrayReverseAndPrint {

	public static void main(String[] args) {
		int[] arr = {7, 8, 5, 6, 89};
		int searchedValue = 89;
		valueFinder(arr, searchedValue);
	
	
	}

	private static void valueFinder(int[] arr, int searchedValue) {
		// TODO Auto-generated method stub
		
		int pos =0;
		boolean found = false;
		while(pos<arr.length && !found){
			if(arr[pos]==searchedValue){
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


