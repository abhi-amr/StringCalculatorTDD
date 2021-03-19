import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class TestSamples{
	private StringCalculator calc = new StringCalculator();
	
	@Test
	void ForEmptyStringReturnZero() {
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	void ForSingleStringReturnTheSame() {
		assertEquals(calc.Add("1"), 1);
	}
}
