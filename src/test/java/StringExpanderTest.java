import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class StringExpanderTest {

	@Test
	public void testSomething() {
		assertEquals("10 + 2", StringExpander.expandedForm(12));
		assertEquals("40 + 2", StringExpander.expandedForm(42));
		assertEquals("70000 + 300 + 4", StringExpander.expandedForm(70304));
	}

	@Test
	public void testOne(){
		assertEquals("1", StringExpander.expandedForm(1));
	}

	@Test
	public void testTwo(){
		assertEquals("2", StringExpander.expandedForm(2));
	}

	@Test
	public void testTwoDigits(){
		assertEquals("10 + 2", StringExpander.expandedForm(12));
	}

	@Test
	public void testThreeDigits(){
		assertEquals("100 + 20 + 3", StringExpander.expandedForm(123));
	}

	@Test
	public void testFourDigits(){
		assertEquals("1000 + 200 + 30 + 4", StringExpander.expandedForm(1234));
	}

	@Test
	public void testZero(){
		assertEquals("", StringExpander.expandedForm(0));
	}
}