import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
class TestSamples{
	
	@Test
	void ForEmptyStringReturnZero() {
		StringCalculator calc = new StringCalculator();
		//assertThat(calc.Add("")).isEqualTo(0);
		assertEquals(calc.Add(""), 0);
	}
}
