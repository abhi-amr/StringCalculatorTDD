
public class StringCalculator {
	
	public int Add(String input) {
		String[] numbers = input.split(",");
		if(input.isEmpty()) {
			return 0;
		}
		if(input.length() == 1) {
			return StringToInt(input);
		}
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
