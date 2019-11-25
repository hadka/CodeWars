import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MiddleExampleTest {

	@Test
	public void evenTests() {
		assertEquals("es", Middle.getMiddle("test"));
		assertEquals("dd", Middle.getMiddle("middle"));
	}

	@Test
	public void oddTests() {
		assertEquals("t", Middle.getMiddle("testing"));
		assertEquals("A", Middle.getMiddle("A"));
	}

	@Test
	public void testModulo(){
		assertTrue(Middle.wordIsEven(4));
		assertFalse(Middle.wordIsEven(5));
	}

	@Test
	public void testReturnSubstringForOddWord(){
		String word = "irreversible";
		assertEquals("rreversibl", word.substring(1, word.length() - 1));
	}

}
