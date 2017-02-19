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

Function<String, Integer> wordCountFunction = new Function<String, Integer>()
{

	@Override
	public Integer apply(String t) {
		return t.split(" ").length;
	}
	};
	

String result = numberToText.apply(0);
System.out.println(result);

Integer wordCount = wordCountFunction.apply("lets write something");
System.out.println(wordCount);

//chaining the above created functions

String text = wordCountFunction.andThen(numberToText).apply("lets new");
System.out.println(text);
	}

}
