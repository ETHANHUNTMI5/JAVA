package functions_Array;

public class ARRAY_MAX {

	public static void main(String[] args) {

		int [] arr = {4,-45,9,-32,-9};
		System.out.println(max(arr));
		
	}

	  public static int max(int [] arr)
	  {
		  int max =Integer.MIN_VALUE;
		  for(int a=0;a<arr.length;a++)
		  {if(arr[a]>max)
			  max=arr[a];}
	  
	  return max;}
	
}
