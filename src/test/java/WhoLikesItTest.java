import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhoLikesItTest {

	@Test
	public void staticTests() {
		assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
		assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
		assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
		assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
		assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
	}

	@Test
	public void testEmpty(){
		assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
	}

	@Test
	public void testOne(){
		assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
	}

	@Test
	public void testTwo(){
		assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
	}

	@Test
	public void testThree(){
		assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
	}

	@Test
	public void testFour(){
		assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));

	}

	@Test
	public void testFive(){
		assertEquals("Alex, Jacob and 3 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Teo"));

	}
}