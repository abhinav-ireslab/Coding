package Testing;

public class Compare {

	public static void main(String[] args) {
		
		
		String S1 = "a, b, c";
		String S2 = "a, b, c";
		
		String S3 = new String("a, b, c");
		String S4 = new String("a, b, c");
		String S5 = new String("a, b, c").intern();		
		
		System.out.println(S1 == S2);          //true
		System.out.println(S1.equals(S2));     //true
		System.out.println(S1 == S3);          //false
  		System.out.println(S1.equals(S3));     //true
		System.out.println("************");
		System.out.println(S3 == S1);            //false
		System.out.println(S3.equals(S4));       //true
		System.out.println(S3 == S4);           //false
		System.out.println(S1 == S5);           //true

	}

}
