
public class StringCalculator {
	
	public int Add(String input) {
		String[] numbers = input.split(",");
		if(input.isEmpty()) {
			return 0;
		}
		if(input.length() == 1) {
			return Integer.parseInt(input);
		}
		return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
	}

}
