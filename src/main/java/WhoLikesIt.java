class WhoLikesIt {
	public static String whoLikesIt(String... names) {

		if (names.length == 0){
			return "no one likes this";

		}else if (names.length == 1){
			return names[0] + " likes this";

		}else if (names.length == 2){
			return names[0] + " and " + names[1] + " like this";

		}else if (names.length == 3){
			return getFirstTwoNames(names) + names[2] + " like this";

		}else {
			return getFirstTwoNames(names) + String.valueOf(names.length - 2) + " others like this";
		}
	}

	private static String getFirstTwoNames(String[] names) {
		return names[0] + ", " + names[1] + " and ";
	}

//		switch (names.length) {
//			case 0:
//				return "no one likes this";
//			case 1:
//				return String.format("%s likes this", names[0]);
//			case 2:
//				return String.format("%s and %s like this", names[0], names[1]);
//			case 3:
//				return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
//			default:
//				return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
//		}
//	}
}