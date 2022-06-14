package abc;

import java.util.Scanner;

public class E2 {
public static int k=998244353;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[101];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int a=2;a<=100;a++)
		{
			int b=a-1;
			while(b!=-1)
			{arr[a]= (arr[a]+arr[b])%k;
			
			b--;
			}
			arr[a]=(arr[a]+2)%k;
			}

		System.out.println(arr[n]);
		System.out.println(688750769-162752612);
	}
	
} 
