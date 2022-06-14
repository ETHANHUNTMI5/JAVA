package leetCode;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int [] arr = {0,0,1,1,1,1,2,3,3,3};
		
		int temp=arr[0];
		int count=1;
		
		for(int a=1;a<arr.length;a++)
		{
			
			if(arr[a]==temp)
			{
				count++;
				if(count>2)
				{
					arr[a]=100001;
				}
			}
			
			else
			{
				count=1;
				temp=arr[a];
				
			}
			
			
		}
		
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]==100001)
			{
				int b=a+1;
				
				while(b<arr.length && arr[b]==100001)
				{
					b++;
				}
				if(b<arr.length)
				{int temp2= arr[b];
				arr[b]=arr[a];
				arr[a]=temp2;
				}
			}
		
		
			
			
		}
		int fans=0;
		for(int i:arr)
		{
			if(i!=100001)
			{fans+=1;}
		}
		
		System.out.println(fans);
	}

}
