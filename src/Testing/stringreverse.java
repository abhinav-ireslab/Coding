package Testing;

public class stringreverse {

	
	public static void main(String[] args) {

		String str = "Akash kumar";
		//String rev="";
		int i;
		//char[] str2 = str.toCharArray();
		
		String[] str2 = str.split(" ");
		
		for (i=str2.length-1; i>=0; i--)
		{	
		//rev = rev+str.charAt(i);
		
		System.out.print(str2[i]+" ");
		
		
		
		}	
		//System.out.print(rev);
	}
}
