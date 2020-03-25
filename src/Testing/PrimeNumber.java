package Testing;

public class PrimeNumber {
	
	public static void main(String[] arg) {
	
	int i=0;
	int num=0;
	
	String pnumber ="";
	
	for(i=1; i<=100; i++)
	{
		int count=0;
		for(num =i; num>=1; num--)
		{
	
	if(i%num==0)
	{
		count = count + 1;

	}
}
	if(count==2)
	{
		pnumber =pnumber +i + " ";
	}
	}
	System.out.println(pnumber);

}}
