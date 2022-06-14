package functions_Array;

public class Binary_Search {
	public static int a=0;
	public static void main(String[] args) {
		
		int [] array = {1,3,42,65,74};
		System.out.println(Binary(array,65));
	System.out.println(a);
	}
    public static int Binary(int [] arr,int item)
    {
    	int lo=0,hi=arr.length-1;
   
    	
    	while(lo<=hi)
    	{
    		a++;
    	 	int mid= (lo+hi)/2;

    		if(arr[mid]<item)
    		{lo=mid+1;}
    		else if(arr[mid]>item)
    		{hi=mid-1;}
    		else
    		{return mid;}
    		
    		
    		
    	}
    	System.out.println(a);
    	return -1;
    }
}
