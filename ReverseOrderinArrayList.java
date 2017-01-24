import java.util.ArrayList;

public class ReverseOrderinArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("elena");
		names.add("hugger");
		names.add("kevin");
		
		System.out.println(names);
		System.out.println(reverse(names));
		
		
		

	}
	public static ArrayList<String> reverse(ArrayList<String> name){
		ArrayList<String> result = new ArrayList<String>();
		for(int i =(name.size()-1); i>=0; i--){
			result.add(name.get(i));
			
		}
	
		return result;
		
	}
	

}
