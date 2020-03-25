package Testing;

public class SumOfDigit {
	
	public static void main (String arg[]) {
		
		int number = 20619895;
		int reminder;
		int result = 0;
		
		
		while(number !=0) {
			
			reminder = number%10;
			result = result +reminder;
			number = number/10;
			
		}
		System.out.println(result);
		
	}

}
