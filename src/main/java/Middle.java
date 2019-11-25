public class Middle {

	public static String getMiddle(String word) {

		Integer wordSize = word.length();
		Integer half = wordSize / 2;

		if (wordIsEven(wordSize)){
			return word.substring(half - 1, half + 1);
		}else {

			word = word.substring(half, half + 1);
//			while (word.length() > 1){
//				word = word.substring(1, word.length() - 1);
//			}
			return word;
		}
	}

	public static boolean wordIsEven(Integer wordSize) {
		return wordSize % 2 == 0;
	}
}
