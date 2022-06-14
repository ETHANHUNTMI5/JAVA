package recursion;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] arr = {50,40,80,20,90};
		bubble(arr,0,arr.length-1);
		display(arr,0);
	}

	public static void bubble(int [] arr,int si,int li)
	{
		if(li==0)
		{return;}
		
		if(si==li)
		{bubble(arr,0,li-1);
		return;}
		
		if(arr[si]>arr[si+1])
		{
			int temp=arr[si+1];
			arr[si+1]=arr[si];
			arr[si]=temp;
			}
		
		bubble(arr,si+1,li);
		
	}
	
	public static void display(int [] arr,int a)
	{
		if(a==arr.length)
		{return;}
		
		System.out.print(arr[a]+ " ");
		
		display(arr,a+1);
		
	}
}
