import java.util.function.Predicate;

public class SimpleLambda {

	public static void main(String[] args) {
		Predicate<String> wordChecker = s ->s.contains("Download");
		boolean containsWord = wordChecker.test("Download e-book");
		System.out.println(containsWord);

	}

}
