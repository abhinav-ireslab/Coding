package Testing;

public class ReverseStringWithoutchanagePosition {
	
	public static void main(String[] arg) {
	
	String str = "new phase of";
	String arr[] = str.split(" ");
	
	
	for(int i =0; i<arr.length; i++) {
		for(int j=arr[i].length()-1; j>=0; j--) {
			
			System.out.print(arr[i].charAt(j));
		}
		
		System.out.print(" ");
	}
	
}
}
