import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class TestSamples{
	private StringCalculator calc = new StringCalculator();
	
	
	@Test
	public void ForEmptyStringReturnZero() {
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	public void ForSingleStringReturnTheSame() {
		assertEquals(calc.Add("1"), 1);
	}
	
	@Test
	public void TwoStringDelimitedCommaReturnSum() {
		assertEquals(calc.Add("1,2"), 3);
	}
	
	@Test
	public void MultipleStringsReturnSum() {
		assertEquals(calc.Add("1,2,3,4,5"), 15);
	}
	
	@Test
	public void StringsWithNewLineDelimiterReturnSum() {
		assertEquals(calc.Add("1\n2"), 3);
	}
	
//	@Test
//	public void NegativeNumerThrowException() {
//		Exception exception = assertThrows(IllegalArgumentException.class, ()->{
//			Integer.parseInt("-1");
//		});
//		String expectedMessage = "No negative allowed";
//		String actualMessage = exception.getMessage();
//		assertTrue(actualMessage.contains(expectedMessage));
//	}
	
	
	
}
