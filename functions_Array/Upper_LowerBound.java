package functions_Array;

public class Upper_LowerBound {

	public static void main(String[] args) {
		
		int [] array = {1,2,2,2,2,3,3,3,9,11};
		 System.out.println(upper(array,3));
		 System.out.println(lower(array,3));
			
	}

	public static int upper(int [] arr, int item)
	{
		int lo=0,hi=arr.length-1;
		int ans=-1;
		while(lo<=hi)
		{int mid=(lo+hi)/2;
		
		if(arr[mid]==item)
		{lo = mid+1;
		ans=mid;}
		
		else if(arr[mid]>item)
		{hi = mid-1;}
		
		else
		{lo=mid+1;}
		}
		return ans;
	}
	public static int lower(int [] arr, int item)
	{
		int lo=0,hi=arr.length-1;
		int ans=-1;
		while(lo<=hi)
		{int mid=(lo+hi)/2;
		
		if(arr[mid]==item)
		{hi = mid-1;
		ans=mid;}
		
		else if(arr[mid]>item)
		{hi = mid-1;}
		
		else
		{lo=mid+1;}
		}
		return ans;
	}

	}


