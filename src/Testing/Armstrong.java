package Testing;

public class Armstrong {

	
	public static void main(String[] args) {
		
		
		int a = 153;
		int reminder ;
		int check=0;
		int ar = a;
		
		
		
		
		
		while(a>0)
		{
			reminder = a%10;
			check = check +(int)Math.pow(reminder, 3);
			a=a/10;
		}
		
		//System.out.println(check);
	

	if(ar==check)
	{
		System.out.println("Given number is "+ ar+": " + "Number is Armstrong");
	}
	else
	{
		System.out.println("Given number is "+ ar+": " + "Number not Arstrong");
	}
	
}
}