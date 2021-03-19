import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import org.junit.Rule;


class TestSamples{
	private StringCalculator calc = new StringCalculator();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
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
	
	@Test
	public void NegativeNumerThrowException() {
		thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negative input!");
        calc.Add("-1");
        calc.Add("-5,10\n-15");
		
//		assertThrows(IllegalArgumentException.class, ()->{
//			calc.Add("-1"); //expression for less than 0
//			
//		});
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
