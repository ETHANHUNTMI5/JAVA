package codeFORCES;

import java.util.Scanner;

public class Device {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		if(n>=m)
		{System.out.println(n-m);}
		
		
		else
		{
		
		}
		
			
//			int [] arr = new int[2*m-1];
//			
//			
//			for(int a=m+1;a<2*m-1;a++)
//			{arr[a]=a-m;
//				}
//			
//			for(int a=m-1;a>=1;a--)
//			{
//				arr[a]= 1 +Math.min(arr[2*a], arr[a+1]);
//			}
//			
//			for(int i : arr)
//			{System.out.print(i+" ");}
// 
//			System.out.println();
//			System.out.println(arr[n]);
//		}
		
	}
	public static int kar(int n,int m,boolean[] chk,int [] arr)
	{
		if(n==0 || n>=2*m || chk[n])
		{return 0;}
		chk[n]=true;
		if(n==m)
		{return 1;}
		
		if(arr[n]!=0)
		{return arr[n];}
		
		int ans =0;
		int blue = kar(n-1, m, chk,arr);
		int red= kar(n*2, m,chk, arr);
		
		ans = 1+Math.min(blue, red);
		arr[n]=ans;
		
		
		return ans;
		
		
	}
	
	
	}
