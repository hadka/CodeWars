import org.apache.commons.lang3.StringUtils;

public class StringExpander {

	public static String expandedForm(int num) {

//		String result = "";
//		String stringInteger = String.valueOf(num);
//		Integer numberOfDigits = stringInteger.length();
//		char[] array = stringInteger.toCharArray();
//
//		for (int i = 0; i < numberOfDigits; i++){
//			Integer numberOfZeros = numberOfDigits - i - 1;
//			char a = array[i];
//			if (a != '0'){
//				result = result + a + StringUtils.repeat("0", numberOfZeros) + " + ";
//			}
//		}
//		return result.replaceAll(" \\+ $", "");


		String outs = "";
		for (int i = 10; i < num; i *= 10) {
			int rem = num % i;
			outs = (rem > 0) ? " + " + rem + outs : outs;
			num -= rem;
		}
		outs = num + outs;

		return outs;
	}
}
