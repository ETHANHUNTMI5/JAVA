package leetCode;

public class Median {

	public static void main(String[] args) {
		double [] arr1 = {};
		double [] arr2 = {1};
		
		int m= arr1.length;
		int n = arr2.length;
		
		
		double [] ans = new double[m+n];
		
		int i =0;
		int j =0;
		int k=0;
		
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				ans[k]=arr1[i];
				
				i++;
				k++;
			}
			
			else
			{
				ans[k]= arr2[j];
				j++;
				k++;
			}
			
			
			if(i==m)
			{
				while(j<n)
				{
					ans[k]=arr2[j];
					j++;
					k++;
				}
				
			}
            
			if(j==n)
			{
				
				while(i<m)
				{
					ans[k]= arr1[i];
					i++;
					k++;
				}
				
			}
			
			
		}
		
	   double fil=0;
	   
	   if(ans.length%2==0)
	   {
		   fil = (ans[ans.length/2]+ ans[ans.length/2-1])/2;
	   }
	   else
	   {
		   fil= ans[(ans.length-1)/2];
		   
	   }

	   for(double d : ans)
	   {System.out.println(d+" ");}
	   
	   System.out.println(fil);
	}

}
