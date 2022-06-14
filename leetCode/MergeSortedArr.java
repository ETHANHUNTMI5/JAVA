package leetCode;

public class MergeSortedArr {

	public static void main(String[] args) {
		
		int [] arr1 = {1,4,7,8,10,0,0,0};
		int m =5;
		int [] arr2 = {2,3,9};
		int n =3;

		int g = (m+n)/2;
		if((m+n)%2!=0)
		{
			g+=1;
		}
			
		int gap=g;
		
		int i =0;
		int j =0;
		
		for(int a=m;a<m+n;a++)
		{
			arr1[a]= arr2[a-m];
		}
		
		for(int p : arr1)
		{
			System.out.print(p+" ");
		}
		
		System.out.println();
		while(gap>1)
		{
			i=0;
			j=i+gap;
			
			while(j<m+n)
			{
				
				if(arr1[i]>arr1[j])
				{
					int temp = arr1[i];
					arr1[i]= arr1[j];
					arr1[j]= temp;
					
				}
				i++;	
				j++;
				
			}
			
			System.out.println(gap+" yo");
			
			if(gap%2!=0)
			{
				gap=gap/2+ 1;
			}
			
			else
			{
				gap=gap/2;
			}
			
		}
		
		i=0;
		j=i+1;
		
		for(int a=0;a<m+n-1;a++)
		{
			if(arr1[a]>arr1[a+1])
			{
				int temp = arr1[a];
				arr1[a]= arr1[a+1];
				arr1[a+1]=temp;
				
			}
			
		}
		
		
		for(int p : arr1)
		{
			System.out.print(p+" ");
		}
		
	}
}