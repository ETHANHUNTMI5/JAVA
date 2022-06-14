package recursion;

public class IsSorted {

	public static void main(String[] args) {
 
		int [] arr = {3,8,16,21,40,40};
		System.out.println(isSorted(arr,0));
		
	}

	public static boolean isSorted(int[] arr , int si)
	{
	
		if(si==arr.length-1)
		{return true;}
		
		if(arr[si]>arr[si+1])
		{return false;}
		
		else
		{boolean b = isSorted(arr,si+1);
		return b;}
		
		
		
	}
}
