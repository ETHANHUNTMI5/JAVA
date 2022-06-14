package recursionChallenges;

public class Sort0_1_2 {

	public static void main(String[] args) {
		
		int [] arr = {0,2,2,1,1,0,1};
		sort(arr);
	}

	public static void sort(int [] arr)
	{
		int lo=0,hi=arr.length-1,mid=0;
		
		while(mid<=hi)
		{
			if(arr[mid]==0)
			{
				Swap(arr,lo,mid);
				mid++;
				lo++;
				
			}
			else if(arr[mid]==1)
			{ 
			mid++; 
			
			}
			
			
			else
			{
			 Swap(arr, mid, hi);	
			 hi--;
			}
			}
			
			
			display(arr);
			
		}
		
	 	public static void Swap(int [] arr, int i,int j)
	 	{
	 		
		 int temp =arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
	  		
			
			
		}
	 	
	 	public static void display(int [] arr)
	 	{
	 		for(int a=0;a<arr.length;a++)
	 		{System.out.print(arr[a]+" ");}
	 		
	 		
	 	}
		

	}

