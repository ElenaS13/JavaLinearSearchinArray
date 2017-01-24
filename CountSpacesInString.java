
public class CountSpacesInString {

	public static void main(String[] args) {
		
		String myString = "Hello. My name is Elena!";
		int spaces = 0;
		
		for(int i =0; i<myString.length();i++){
			char ch = myString.charAt(i);
			if(ch ==' '){
				spaces++;
			}
		}
		System.out.println(spaces);

	}

}
