import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {

	public static int duplicateCount(String text) {

		HashMap<Character, Integer> charMap = new HashMap<>();

		for (Character ch : text.toLowerCase().toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		List<Integer> values = new ArrayList<Integer>(charMap.values());

		return (int) values.stream().filter(i -> i > 1).count();

//		return (int)text.toLowerCase().chars().boxed()
//			.collect(Collectors.groupingBy(k->k,Collectors.counting()))
//			.values().stream().filter(e->e>1).count();
	}
}
