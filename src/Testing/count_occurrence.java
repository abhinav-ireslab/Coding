package Testing;

public class count_occurrence {

	public static void main(String[] args) {

		int MAX_CHAR = 256;
		String str1 = "EENETWORKSLIMITED";
		char[] str = str1.toCharArray();

		// Create an array of size 256 i.e. ASCII_SIZE
		int count[] = new int[MAX_CHAR];

		// int len = str.length;

		// Initialize count array index
		for (int i = 0; i < str.length; i++)
			count[str[i]]++;

		// System.out.println(str.length);

		// Create an array of given String size
		char ch[] = new char[str.length];
		for (int i = 0; i < str.length; i++) {
			ch[i] = str[i];
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str[i] == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str[i] + " is:" + count[str[i]]);
		}
	}
}