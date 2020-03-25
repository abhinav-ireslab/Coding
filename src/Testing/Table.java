	package Testing;

public class Table {

	public static void main(String[] arg) {

		int result = '\n';
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 10; j++)

			{
				if (i == 6 || j == 6)

					continue;

				//result+= '\n';
				{

					System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		}
	}
}