import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanLiteralsTest {

	private RomanLiterals conversion = new RomanLiterals();

	@Test
	public void shouldConvertToRoman() {
		assertEquals("I", conversion.solution(1));
		assertEquals("IV", conversion.solution(4));
		assertEquals("VI", conversion.solution(6));
	}

	@Test
	public void test1(){
		assertEquals("I", conversion.solution(1));
	}

	@Test
	public void test2(){
		assertEquals("II", conversion.solution(2));
	}

	@Test
	public void test3(){
		assertEquals("III", conversion.solution(3));
	}

	@Test
	public void test5(){
		assertEquals("V", conversion.solution(5));
	}

	@Test
	public void test10(){
		assertEquals("X", conversion.solution(10));
	}

	@Test
	public void test100(){
		assertEquals("C", conversion.solution(100));
	}

	@Test
	public void test15(){
		assertEquals("XV", conversion.solution(15));
	}

	@Test
	public void test55(){
		assertEquals("LV", conversion.solution(55));
	}

	@Test
	public void test155(){
		assertEquals("CLV", conversion.solution(155));
	}

	@Test
	public void test160(){
		assertEquals("CLX", conversion.solution(160));
	}

	@Test
	public void test255(){
		assertEquals("CCLV", conversion.solution(255));
	}

	@Test
	public void test8(){
		assertEquals("VIII", conversion.solution(8));
	}

	@Test
	public void test4(){
		assertEquals("IV", conversion.solution(4));
	}

	@Test
	public void test9(){
		assertEquals("IX", conversion.solution(9));
	}

	@Test
	public void test6(){
		assertEquals("VI", conversion.solution(6));
	}

	@Test
	public void test14(){
		assertEquals("XIV", conversion.solution(14));
	}

	@Test
	public void test19(){
		assertEquals("XIX", conversion.solution(19));
	}

	@Test
	public void test29(){
		assertEquals("XXIX", conversion.solution(29));
	}

	@Test
	public void test28(){
		assertEquals("XXVIII", conversion.solution(28));
	}

	@Test
	public void test24(){
		assertEquals("XXIV", conversion.solution(24));
	}

	@Test
	public void test99(){
		assertEquals("XCIX", conversion.solution(99));
	}
}

