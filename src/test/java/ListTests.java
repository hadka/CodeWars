import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class ListTests {
	@Test
	public void test1() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int n = 1;
		assertEquals("Sheldon", new Line().WhoIsNext(names, n));
	}
	@Test
	public void test2() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int n = 6;
		assertEquals("Sheldon", new Line().WhoIsNext(names, n));
	}

	@Test
	public void test10() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int n = 10;
		assertEquals("Penny", new Line().WhoIsNext(names, n));
	}

	@Test
	public void test52() {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int n = 52;
		assertEquals("Penny", new Line().WhoIsNext(names, n));
	}
}