import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {

	@Test
	public void testSomething() {
		assertEquals("10 + 2", Kata.expandedForm(12));
		assertEquals("40 + 2", Kata.expandedForm(42));
		assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
	}

	@Test
	public void testOne(){
		assertEquals("1", Kata.expandedForm(1));
	}

	@Test
	public void testTwo(){
		assertEquals("2", Kata.expandedForm(2));
	}

	@Test
	public void testTwoDigits(){
		assertEquals("10 + 2", Kata.expandedForm(12));
	}

	@Test
	public void testThreeDigits(){
		assertEquals("100 + 20 + 3", Kata.expandedForm(123));
	}

	@Test
	public void testFourDigits(){
		assertEquals("1000 + 200 + 30 + 4", Kata.expandedForm(1234));
	}

	@Test
	public void testZero(){
		assertEquals("", Kata.expandedForm(0));
	}
}