package timeAndSpaceCom;


public class QuickSort {

	public static void main(String[] args) {
	
		int [] arr = {40,20,90,30,70,10,80,60,50};
		quick(arr, 0, arr.length-1);
		for(int i : arr)
		{System.out.print(i+" ");}
	}
	
	public static void quick(int [] arr, int lo, int hi)
	{
		if(lo>=hi)
		{return;}
		
		int mid = (lo+hi)/2;
		
		int piv = arr[mid];
		
		int left = lo;
		int right = hi;
		
		while(left<=right)
		{
			while(arr[left]<piv)
			{left++;}
			
			while(arr[right]>piv)
			{right--;}
			
			if(left<=right)
			{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;}
			
		}
		quick(arr, lo, right);
		quick(arr,left,hi);
	}
}