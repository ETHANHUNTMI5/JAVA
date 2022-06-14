package leetCode;

public class AddBinary {

	public static void main(String[] args) {

		String x ="11";
		String y ="10";
		
		int max = Math.max(x.length(), y.length());

		
		int p = x.length();
		int q= y.length();
		
		int [] arr1 = new int[max+1];
		int [] arr2 = new int[max+1];
		
		
		for(int i=0;i<p;i++)
		{
			arr1[i]= x.charAt(p-i-1)-48;
		}
		for(int i=0;i<q;i++)
		{
			arr2[i]= y.charAt(q-i-1)-48;
		}
		
		
		for(int i : arr1)
		{System.out.print(i+" ");}
		System.out.println();

		for(int i : arr2)
		{System.out.print(i+" ");}
		
		int [] ans = new int[max+1];
		
		int c=0;
		for(int i=0;i<=max;i++)
		{
			
			
			int t = arr1[i]+arr2[i]+c;
			
			if(t==0)
			{
				ans[i]=t;
				c=0;
			}
			else if(t==2)
			{
				ans[i]=0;
				c=1;
			}
			
			else if(t==3)
			{
				ans[i]=1;
				c=1;
			}
			
			else
			{
				ans[i]=1;
				c=0;
			}
				
			
			
		}
		
		String f="";
		
		for(int l=max;l>=0;l--)
		{
			f=f+ans[l];
		}
	   System.out.println(f);
	}
}