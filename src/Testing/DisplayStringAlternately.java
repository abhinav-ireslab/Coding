package Testing;

class DisplayStringAlternately {
	public static void main(String[] arg) {
		
		String a1 = "abc";
		String b1 ="def";
		
		char[] a2 = a1.toCharArray();
		char[] b2= b1.toCharArray();

		alternate(a2, b2);
	}

	public static void alternate(char[] a2, char[] b2) {
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]);
			System.out.print(b2[i]);
		}

	}
}
