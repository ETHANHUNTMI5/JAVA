package timeAndSpaceCom;

public class MergeSort {

	public static void main(String[] args) {
	
//    	int[] arr1 = {10,20,30,40,50};
//		int[] arr2 = {5,15,30,45,60,70,80};
//
//		int [] ans = Merge2(arr1, arr2);
//	
//		display(ans);
	
		int [] arr ={5,15,30,40,20,10,25};
		int [] ans=MergeSortyo(arr, 0, arr.length-1);
		display(ans);
	}

	public static int[] Merge2(int[] arr1 ,int[] arr2)
	{
		int [] merged = new int [arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j < arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				merged[k]=arr1[i];
				i++;
				k++;
			}
			
			else
			{merged[k]=arr2[j];
			j++;
			k++;
		}
			
			
		}
		
		if(i==arr1.length)
		{
			while(j<arr2.length)
			{merged[k]=arr2[j];
			j++;
			k++;
			}
			}
			
			
		
		if(j==arr2.length)
		{while(i<arr1.length)
		{merged[k]=arr1[i];
		i++;
		k++;
		}}
		
		
	return merged;}
	
	public static void display(int[] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
			
		}
		
	}
	
	public static int[] MergeSortyo(int [] arr,int lo,int hi)
	{
		if(lo==hi)
		{int[] br = new int[1];
		br[0]=arr[lo];
		return br;}
		
		int mid = (lo+hi)/2;
		
		int [] fh = MergeSortyo(arr, lo,mid);
		int [] sh = MergeSortyo(arr, mid+1,hi);
		
	int[] merge	=Merge2(fh, sh);
		
	
	return merge;}
	
}



