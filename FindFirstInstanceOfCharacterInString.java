
public class FindFirstInstanceOfCharacterInString {

	public static void main(String[] args) {
		String myString = "Hello. My name is Elena";
		char searchedChar = 'X';
		boolean found = false;
		int position = 0;
		while(position < myString.length() && !found){
			if(searchedChar == myString.charAt(position)){
				found= true;
			} else {
				position ++;
			}
		}
		if(found){
			System.out.println("Found at position: " + position);
		} else {
			System.out.println("Not found!");
		}
	}

}
