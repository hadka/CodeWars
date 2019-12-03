import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class MissingLetter
{
	public static char findMissingLetter(char[] array) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		if (Character.isUpperCase(array[0])){
			alphabet = alphabet.toUpperCase();
		}

		String alphabetPart = alphabet.substring(
			alphabet.indexOf(array[0]),
			alphabet.indexOf(array[array.length - 1]) + 1);

		String result = alphabetPart.replaceAll(
			"[" + new String(array) + "]",
			"");

		return result.toCharArray()[0];

		/*In Java, char is a numeric type. When you add 1 to a char, you get to the next unicode code point.
		In case of 'A', the next code point is 'B':*/

//		char expectableLetter = array[0];
//		for(char letter : array){
//			if(letter != expectableLetter) break;
//			expectableLetter++;
//		}
//		return expectableLetter;
	}
}