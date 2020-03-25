  package Testing;

public class numbers2 {


	
	public static void main(String[] args) {
		
		String str = "AB!@#$%^1234C";
		int i;
		
		char[] str2 = str.toCharArray();
		
		
		StringBuffer alpha= new StringBuffer(), num= new StringBuffer(), special = new StringBuffer();
		
		for(i=0; i<str2.length; i++ )
		{
			
			if(Character.isAlphabetic(str2[i]))
				alpha.append(str2[i]);
			
			else if (Character.isDigit(str2[i]))
				num.append(str2[i]);
			
			else
				special.append(str2[i]);

		}
		{	
		System.out.print("Alpabetic character:"+alpha);
		System.out.println("");
		System.out.print("Number character:"+ num);
		System.out.println("");
		System.out.print("Special character:"+ special);
		
	}
}
}
