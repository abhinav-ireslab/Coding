package Testing;

public class Compare {

	public static void main(String[] args) {
		
		
		String S1 = "a, b, c";
		String S2 = "a, b, c";
		
		String S3 = new String("a, b, c");
		String S4 = new String("a, b, c");
		
		
		System.out.println(S1 == S2);
		System.out.println(S1.equals(S2));
		System.out.println(S1 == S3);
		System.out.println(S1.equals(S3));
		System.out.println("************");
		System.out.println(S3 == S1);
		System.out.println(S3.equals(S4));
		System.out.println(S3 == S4);

	}

}
