package sheet;

public class Segregate0_1 {

	public static void main(String[] args) {
		
		int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			while(left<right && arr[left]==0)
			{left++;}
			
			while(left<right && arr[right]==1)
			{right--;}
			
			if(left>=arr.length || right<0)
			{break;}
			
			if(arr[left]==1 && arr[right]==0)
			{
				arr[left]=0;
				arr[right]=1;
				
				left++;
				right--;
			}
	
			
		}
		for(int i : arr)
		{System.out.print(i+" ");}
		System.out.println();
		
	}

}
