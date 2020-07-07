package Testing;

import java.util.Arrays;

public class AlphabeticStr {

	public static void main(String[] args) {
		 String str = "akash singhal";
		    char[] chars = str.toCharArray();
		 
		    Arrays.sort(chars);
		    String sorted = new String(chars);
System.out.println(sorted);
}
}