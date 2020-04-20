package Testing;

public class Vovels {

	static int ccount = 0, vcount = 0;

	public static void main(String[] arg) {

		String str = "AkashkumarSinghal";

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
			} else if (ch >= 'a' && ch <= 'z') {
				ccount++;

			}

		}

		System.out.println("Vowels Count: " + vcount);
		System.out.println("Char count: " + ccount);

	}
}