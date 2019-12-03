import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MissingLetterTest {

	@Test
	public void exampleTests() {
		assertEquals('e', MissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
		assertEquals('P', MissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
	}

	@Test
	public void exampleTestsJ() {
		assertEquals('J', MissingLetter.findMissingLetter(new char[] { 'I','K','L','M' }));
	}

	@Test
	public void exampleTestsG() {
		assertEquals('g', MissingLetter.findMissingLetter(new char[] { 'c','d','e','f', 'h', 'i' }));
	}
}