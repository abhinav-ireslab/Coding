package Testing;

public class remove_dup {

	public static void main(String[] args) {

		String str = "AbhinavGarg";
		String str1 = str.toLowerCase();
		char[] str2 = str1.toCharArray();
		int i, j;
		// int count=0;
		
		for (i = 0; i < str2.length; i++) {
			for (j = i+1; j < str2.length; j++) {

				if (str2[i] == str2[j]) 
				{
					str2[j] = 0;
					// break;
					
					//System.out.print(str2[i]);
				}

			}System.out.println("Remove duplicate string: "+str2[i]);
		}
	}
}
