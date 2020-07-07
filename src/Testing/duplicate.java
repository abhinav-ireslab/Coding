package Testing;

public class duplicate {

	public static void main(String[] args) {

		int i,j;
		//int count = 1;
		String str = "aabcdb";
		char[] str2 = str.toCharArray();
		
		for(i=0; i<str2.length; i++) {
			for(j =i+1; j<str2.length; j++)
			{
				
				if(str2[i] == str2[j])
				{
					
					//continue;
					System.out.print(str2[j]+ " ");
					//count++;
					//break;
			
				
			}
				
		}
	}
}
	}
