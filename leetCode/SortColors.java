package leetCode;

public class SortColors {

	public static void main(String[] args) {
		
		int [] arr = {1,1,0,2,0,2};
		
		
		
		int l=0,m=0,h=arr.length-1;
		
		while(m<=h)
		{
			if(arr[m]==0)
			{swap(arr,l,m);
			l++;
			m++;}
			else if (arr[m]==1)
			{m++;}
			else
			{swap(arr,m,h);
			h--;
			}
			}
	
	}

	public static void swap(int [] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;}
}