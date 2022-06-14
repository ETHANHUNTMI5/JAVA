package cb;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int [][] arr = new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		
		int ele = scn.nextInt();
		
		int ans =0;
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(count==1)
			{break;}
			if(ele>arr[i][m-1])
			{i++;}
			for(int j=0;j<m;j++)
			{
			  if(arr[i][j]==ele)
			  {ans=1;
			  count=1;
			  break;}
			}
		}
     
		System.out.println(ans);
	}
	public static int BPBU(int end,int [] arr)
	{

		int [] dp= new int[end+6];
		
		arr[end]=1;
		
		for(int i = end-1;i>=0;i--)
		{
			arr[i]= arr[i+1]+arr[i+2]+arr[i+3]+arr[i+4]+arr[i+5]+arr[i+6];
			
		}
		return arr[0];
		


	}


}
