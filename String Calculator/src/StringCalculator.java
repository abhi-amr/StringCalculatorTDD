
public class StringCalculator {
	
	public int Add(String input) {
		String[] numbers = input.split(",");
		if(input.isEmpty()) {
			return 0;
		}
		if(input.length() == 1) {
			return StringToInt(input);
		}
		return StringToInt(numbers[0]) + StringToInt(numbers[1]);
	}
	
	private int StringToInt(String str) {
		return Integer.parseInt(str);
	}

}
