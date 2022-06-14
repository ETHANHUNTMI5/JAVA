package leetCode;

public class BinarySearch2D {

	public static void main(String[] args) {
		
		int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int t=10;
		
		int rows= arr.length;
		int cols = arr[0].length;
		
		int lo=0;
		int hi = rows-1;
		int a=0;
		int mid=0;
		while(lo<=hi)
		{
			mid = (lo+hi)/2;
			
			if(t>arr[mid][cols-1])
			{
				lo=mid+1;
			}
			
			else if(t<arr[mid][0])
			{
				hi=mid-1;
			}
			
			else
			{
				break;
			}
		
		a++;
		System.out.println(a);}
	
		int lo2=0;
		int hi2=cols-1;
		int count=0;
		while(lo2<=hi2)
    	{
    		a++;
    	 	int mid2= (lo2+hi2)/2;

    		if(arr[mid][mid2]<t)
    		{lo2=mid2+1;}
    		else if(arr[mid][mid2]>t)
    		{hi2=mid2-1;}
    		else
    		{ count++;
    			System.out.println("true");
    		break;}
    		
    		
    		
    	
    	}	
		
		if(count==0)
		{System.out.println(false);}
		
	}

}
