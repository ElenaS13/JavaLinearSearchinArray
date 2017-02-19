import java.util.Optional;
import java.util.function.Function;

public class OptionalExample {

	public static void main(String[] args) {
		Function<String, String> getSecondWord = (String s ) ->
		{return s.split(" ").length >1 ? s.split(" ")[1] : null;};
      
		
		Function <String, Integer> getLetterCount = t ->t.length();
		
		//Integer count = getSecondWord.andThen(getLetterCount).apply("Optinal Example");
		//System.out.println(count);
		
		//to prevent null pointer exception, we will use Optional
		
		Optional<String> myOptional = Optional.ofNullable(getSecondWord.apply("Example"));
		
		boolean isPresent = myOptional.isPresent();
		//System.out.println(isPresent);
		
		//null check
		
	    if(myOptional.isPresent()) {
			myOptional.ifPresent(System.out::println);
		} else {
			String s = myOptional.orElse("nothing else");
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
