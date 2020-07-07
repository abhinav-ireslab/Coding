package Testing;

public class MissingArray {

public static void main(String[] args) {


		
		int arr[] = {1, 2, 3, 5, 6};
		
		int miss = missing(arr, 5);
		System.out.println(miss);
		
	}

public static int missing(int arr[], int n) {
	
	int i, total;
	total = (n+1)*(n+2)/2;
	for(i=0; i<n; i++)
	total -=arr[i];
	return total;
	
}

}
