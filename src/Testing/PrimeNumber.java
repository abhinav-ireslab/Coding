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

}
	
	/*public static void main(String[] arg) {
		
		int find =0;
		int n= 25;
		int m = n/2;
		
		if(n==0 || n ==1) {
			System.out.println("Not prime number");
			
		}else {
		
		for(int i =2; i<=m; i++) {
			
			if(n%i ==0) {
				System.out.println("Not Prime");
				
			find = 1;
			break;
			}
		}		
			if(find==0) {
				System.out.println("Prime number");
				
			}
			
		}
				
		
		
		
		
	}*/
	
}
