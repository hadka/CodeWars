import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class FindOdd {

	public static int findIt(int[] array) {

		HashMap<Integer, Integer> map = new HashMap<>();
		findOccurence(array, map);

		Collection<Integer> collectionOfCounts = map.values();
		List<Integer> listOfCount = new ArrayList<>(collectionOfCounts);

		Integer odd = definOdd(listOfCount);

		return getKey(map, odd);
	}

	private static void findOccurence(int[] array, HashMap<Integer, Integer> map) {
		for (int i : array){
			if (map.containsKey(i)){
				map.put(i, map.get(i) + 1);

			}else {
				map.put(i, 1);
			}
		}
	}

	private static Integer definOdd(List<Integer> listOfCount) {
		return listOfCount.stream()
				.filter(i -> i % 2 != 0)
				.findFirst()
				.orElse(null);
	}

	public static Integer getKey(HashMap<Integer, Integer> map, Integer value) {
		return map.entrySet()
			.stream()
			.filter(entry -> value.equals(entry.getValue()))
			.map(HashMap.Entry::getKey)
			.findFirst().get();
	}

}
