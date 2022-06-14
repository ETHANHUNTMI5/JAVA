package leetCode;

public class RotatedSortedArray2 {

	public static void main(String[] args) {
		
		int [] arr = {1,0,1,1,1};
		int tar=0;
		
		
		int lo =0;
		int hi = arr.length-1;
		int ans=-1;
		while(lo<=hi)
		{
			System.out.println(lo+" "+hi);
			int mid = (lo+hi)/2;
			
			if(arr[mid]==tar)
			{
				ans=mid;
				break;
			}
			
			
			if(arr[lo]<arr[mid])
			{
				if(arr[mid]>tar && arr[lo]<=tar)
				{
					hi=mid-1;
					
				}
				
				else
				{
					lo=mid+1;
				}
				
			}
			else
			{
			
				if(arr[mid]<tar && arr[hi]>=tar)
				{
					lo=mid+1;
					
				}
				
				else
				{
					hi=mid-1;
				}
				
				
			}
			
			
				
		}
		
		if(ans==-1)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
		
	
		
		
		
		
	}

}
