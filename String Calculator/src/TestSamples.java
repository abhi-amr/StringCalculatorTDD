import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
class TestSamples{
	private StringCalculator calc = new StringCalculator();
	
	@Test
	void ForEmptyStringReturnZero() {
		assertEquals(calc.Add(""), 0);
	}
}
