
public class LinearSearchInArray {

	public static void main(String[] args) {
		int[] values = {45,34,66,12,42,23};
		int searchedValue = 12;
		int position =0;
		boolean found = false;
		
		while(position<values.length && !found){
			if(values[position]==searchedValue){
				found = true;
			} else {
				position ++;
			}
		}
		if(found){
			System.out.println("Found at position: " + position);
		} else {
			System.out.println("Not found.");
		}

	}

}
