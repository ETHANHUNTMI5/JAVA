package functions_Array;

public class KadaneAlgo {

	public static void main(String[] args) {
		//MAX SUM SUBARRAY
		
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
	
		int cur=0;
		int max=Integer.MIN_VALUE;
		for(int a=0;a<arr.length;a++)
		{
			
			cur = cur+arr[a];
			
			if(cur>max)
			{max=cur;}
			
			if(cur<0)
			{cur=0;}
			System.out.println(cur+" "+max);
		}
		
		System.out.println(max);
	}
	

}
