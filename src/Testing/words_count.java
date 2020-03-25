package Testing;

public class words_count {

	public static void main(String[] args) {
		
		
		int count = 0;
		
		String str = "Testing user";

		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length(); i++)
		{
			ch[i]=str.charAt(i);
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))|| ((ch[i]!=' ')&&(i==0)))
		
				
				count++;
		}
		System.out.println(count);
		
		}
	
	}

