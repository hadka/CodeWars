import java.util.Arrays;

public class PhoneNumber {

	public static String createPhoneNumber(int[] numbers) {

		String strArray[] = Arrays.stream(numbers)
			.mapToObj(String::valueOf)
			.toArray(String[]::new);

		String result = String.join("", strArray);

		return  "(" + result.substring(0, 3) + ")"
			+ " " + result.substring(3, 6)
			+ "-" + result.substring(6);

//		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
//		String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
//		return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];
	}
}
