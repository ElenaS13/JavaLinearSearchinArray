import java.util.ArrayList;

public class PracticeReversingArrayList {

	public static void main(String[] args) {
		//create ArrayList and then reverse it
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Elena");
		names.add("Hugger");
		names.add("Kevin");
		
		System.out.println(names);
		
		//create method to reverse the ArrayList
		System.out.println(reverse(names));
		
		
	}
	public static ArrayList<String> reverse(ArrayList<String> names){
		ArrayList<String> result = new ArrayList<String>();
		for(int i = names.size()-1; i>=0;i--){
			result.add(names.get(i));
		}
		return result;
	}

}
