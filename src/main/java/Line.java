import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Line {

	public static String WhoIsNext(String[] names, int n) {

//		/*Game starts with index 1, but we as programmers know that counting starts with 0...*/
//		n--;
//		long qlength = names.length;
//		while(qlength <= n) {
//			n -= qlength;
//			qlength *= 2;
//		}
//		return names[(int)(n / (qlength / names.length))];
//	}
//}

		Integer drinkers = names.length;
		Integer remainingColas = n;

		for (int availableColas = n; drinkers <= availableColas; availableColas = remainingColas){
			remainingColas = availableColas - drinkers;
			drinkers = drinkers * 2;
		}

//		for (int i = 1; i <= names.length; i++) {
//			if (remainingColas <= (drinkers / names.length) * i &&
//				remainingColas >= (drinkers / names.length) * (i - 1)) {
//				return names[i - 1];
//			}
//
//		}

		int result = (int) (((remainingColas - 1) / (drinkers / names.length)));
		return  names[result];
	}
}