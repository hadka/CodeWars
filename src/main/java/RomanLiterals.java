import java.util.LinkedHashMap;
import java.util.Map;

public class RomanLiterals {

	public String solution(int n) {

		LinkedHashMap<String, Integer> romanSymbols = mapRomanSymbols();
		StringBuilder result = new StringBuilder();

			for (Map.Entry<String, Integer> entry : romanSymbols.entrySet()){

				int numberOfTimes = n / entry.getValue();

				for(int i = 0; i < numberOfTimes; i++) {
					result.append(entry.getKey());
				}
				n = n % entry.getValue();
			}
		return result.toString();
	}

	private LinkedHashMap<String, Integer> mapRomanSymbols() {
		return new LinkedHashMap<String, Integer>(){{
			put("M", 1000);
			put("CM", 900);
			put("D", 500);
			put("CD", 400);
			put("C", 100);
			put("XC", 90);
			put("L", 50);
			put("XL", 40);
			put("X", 10);
			put("IX", 9);
			put("V", 5);
			put("IV", 4);
			put("I", 1);
		}};
	}
}
