
public class StringCalculator {
	private int _sum = 0;
	private final String delimeter = ",|\n";
	
	public int Add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		if(input.length() == 1) {
			return StringToInt(input);
		}
		
		String[] numbers = input.split(delimeter);
		
		for(String number : numbers) {
			_sum += StringToInt(number);
		}
		
		return _sum;
	}
	
	private int StringToInt(String str) {
		return Integer.parseInt(str);
	}

}
