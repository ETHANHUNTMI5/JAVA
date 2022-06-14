package sheet;

public class Segregate0_1_2 {

	public static void main(String[] args) {
		int [] arr = {0,2,1,2,0};
		
		int lo =0;
		int mid=0;
		int hi = arr.length-1;
		
		while(mid<=hi)
		{
			
			if(arr[mid]==0)
			{
				int temp = arr[lo];
				arr[lo]=arr[mid];
				arr[mid]=temp;
				lo++;
				mid++;
			}
			
			
			else if(arr[mid]==1)
			{
				mid++;
			}
			
			else
			{
				int temp = arr[hi];
				arr[hi]=arr[mid];
				arr[mid]=temp;
				hi--;;	
			}
				
			
			
		}
		
		
		
		for(int i : arr)
		{System.out.print(i+" ");}
	}

}
