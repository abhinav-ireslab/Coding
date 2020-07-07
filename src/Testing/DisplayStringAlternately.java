package Testing;

class DisplayStringAlternately {
	public static void main(String[] arg) {
		
		String a1 = "abc";
		String b1 ="def";
		String c1 = "ghi";
		
		char[] a2 = a1.toCharArray();
		char[] b2= b1.toCharArray();
		char[] c2= c1.toCharArray();
		
		alternate(a2, b2,c2);
	}

	public static void alternate(char[] a2, char[] b2, char[] c2 ) {
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]);
			System.out.print(b2[i]);
			System.out.print(c2[i]);
		}

	}
}
