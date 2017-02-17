import java.util.function.Function;

public class FunctionInterfaceJava {

	public static void main(String[] args) {
		
Function<Integer, String> numberToText = new Function<Integer, String>() {

	@Override
	public String apply(Integer t) {
		switch(t){
		case 0: return "zero";
		case 1: return "one";
		case 2: return "two";
		default: return "unknown";
		}
	}
	
};

String result = numberToText.apply(0);
System.out.println(result);

	}

}
