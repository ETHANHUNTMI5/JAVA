package recursion;

public class LastIndex {

	public static void main(String[] args) {
		
		int [] arr = {3,8,1,8,8,7};
		System.out.println(last(arr,0,8));
		
	}

	public static int last(int [] arr,int si,int data)
	{
		if(si==arr.length)
		{return -1;}
		
		int t = last(arr,si+1,data);
		
		if(t==-1)
		{
			if(arr[si]==data)
		{
			return si;	
		}
		else
		{return -1;}
	}
		else 
			return t;
	}
}	
//	public static int last(int [] arr, int si , int data)
//	{
//		if(si==arr.length)
//		{return -1;}
//		
//		int index = last(arr,si+1,data);
//		
//		if(index==-1)
//		{
//			if(arr[si]==data)
//			{return si;}
//			else 
//			{return -1;}
//			
//			
//			
//		}
//		
//		else 
//		{return index;}
//		
//		
//		
//	}
//	
//}
