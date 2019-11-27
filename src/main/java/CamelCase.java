import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {

	public static String camelCase(String str) {

		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] =
				words[i].length() > 0 ?
				words[i].substring(0, 1).toUpperCase() + words[i].substring(1) :
				words[i].toUpperCase();
		}
		return String.join("", words);

//		return str == null || str.isEmpty() ? "" : Arrays.asList(str.split(" ")).stream()
//			.map(str1 -> str1.trim().length() > 0 ?
//				str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase() :
//				"")
//			.collect(Collectors.joining(""));
	}
}

