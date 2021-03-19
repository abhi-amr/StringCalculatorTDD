
public class StringCalculator {
	private final String delimeter = ",|\n";
	
	public int Add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		if(input.length() == 1) {
			return StringToInt(input);
		}
		
		String[] numbers = input.split(delimeter);
		
		return GetSum(numbers);
	}
	
	private int GetSum(String[] numbers) {
		int sum = 0;
		for(String number : numbers) {
			
			sum += StringToInt(number);
		}
		
		return sum;
	}
	
	private int StringToInt(String str) {
		return Integer.parseInt(str);
	}

}
