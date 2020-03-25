package Testing;

public class LowestHighestNumber {

	public static void main(String[] args) {

		
		//int numArray[] = new int[] {12,4,6,1,23,56,78};
		int numArray[] = new int[] {12,4,6,23,56,78};
		
		int smallno = numArray[0];
		int Largeno = numArray[0];
		
		for( int i=0; i<numArray.length; i++) {
			
			if(numArray[i]>Largeno)
				Largeno = numArray[i];
			
			else if (numArray[i] < smallno)
				smallno = numArray[i];
			
		}
		
		System.out.println("Small Number:"+ smallno );
		System.out.println("Large Number:"+ Largeno );
	}

}
