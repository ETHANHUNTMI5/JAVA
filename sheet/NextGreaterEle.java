package sheet;

import java.util.Arrays;


public class NextGreaterEle {

	public static void main(String[] args) {

		int n = 2147483486;
		
		char [] arr = new String(n+"").toCharArray();
		
		
		int l=-1;
		int r=-1;
		
		z:for(int a=arr.length-1;a>0;a--)
		{
				if(arr[a-1]<arr[a])
				{
					
					r=a;
					l=a-1;
					break z;
					
				}
		}
		
		if(l==-1 || r==-1)
		{System.out.println("-1");
		return;}
		
		int min = arr[r]-'0';
		
		int idx=r;
		System.out.println(min);
		System.out.println(l+" "+r);
		for(int a=r;a<arr.length;a++)
		{
			if(arr[a]-'0'<min && arr[a]-'0'>arr[l]-'0')
			{min = arr[a]-'0';
			idx=a;}
		}
		System.out.println(min+" "+idx);
		
		char temp = arr[l];
		arr[l] = arr[idx];
		arr[idx]=temp;
		
		
		char [] sm = new char[arr.length-l-1];
		
		for(int a=0;a<arr.length-l-1;a++)
		{
			sm[a]=arr[a+l+1];
			}
		
		Arrays.sort(sm);

		
		for(int a=0;a<arr.length-l-1;a++)
		{
			arr[a+l+1]=sm[a];
			}
		
		int ans =0;
		try 
		{
		ans=Integer.valueOf(new String(arr));
		}
		catch (Exception e) {
			System.out.println("-1");
			return;
			
				}
	
		if(ans==n)
		{System.out.println(-1);}
		else
		{System.out.println(ans);}
		
		
	}
}