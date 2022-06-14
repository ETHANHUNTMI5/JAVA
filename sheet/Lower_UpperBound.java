package sheet;

public class Lower_UpperBound {

	public static void main(String[] args) {
		int [] arr = {1,2,3,3,3,3,4,4,4,5,5};
		
		System.out.println(lower(arr, arr.length, 3));
		System.out.println(upper(arr, arr.length, 3));
	}
	
	public static int lower(int [] arr, int n, int val)
	{
		int lo =0;
		int hi = n-1;
		int ans=-1;
		
		while(lo<=hi)
		{
			int mid = (lo+hi)/2;
			
			if(arr[mid]==val)
			{
				ans = mid;
				hi = mid-1;
				
			}
			else if(arr[mid]>val)
			{
				hi = mid-1;
			}
			else
			{lo = mid+1;}
		}
	return ans;}

	public static int upper(int [] arr, int n, int val)
	{
		int lo =0;
		int hi = n-1;
		int ans=-1;
		
		while(lo<=hi)
		{
			int mid = (lo+hi)/2;
			
			if(arr[mid]==val)
			{
				ans = mid;
				lo = mid+1;
				
			}
			else if(arr[mid]>val)
			{
				hi = mid-1;
			}
			else
			{lo = mid+1;}
		}
	return ans;}

}
