package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class President {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		char cc = scn.next().charAt(0);
		int row =0;
		int si=0;
		
		char [][] arr = new char[n][m];
		scn.nextLine();
		
		
		for(int a=0;a<n;a++)
		{String s = scn.nextLine();
			for(int b=0;b<m;b++)
			{
				
				
				char var = s.charAt(b);
				if(var==cc)
				{row=a;}
				
				
				
				arr[a][b]= var;
			}
		}
		
		int count=0;
		int ei=0;
		for(int a=0;a<m;a++)
		{
			
			
			if(count==0 && arr[row][a]==cc)
			{
				si=a;
				count=1;
			}
			
			if(count!=0 && arr[row][a]=='.')
			{
				ei=a-1;
				break;
			}
			
		}
		
//	for(int a=0;a<n;a++)
//		{
//			for(int b=0;b<m;b++)
//			{
//				System.out.print(arr[a][b]+" ");
//			}
//		
//		System.out.println();}
//		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int a=0;a<n;a++)
		{
			for(int b=0;b<m;b++)
			{
				
				if(arr[a][b]==cc)
				{
					if(a>0)
					{
					if(arr[a-1][b]!='.' && arr[a-1][b]!=cc &&!map.containsKey(arr[a-1][b]))
					{
						map.put(arr[a-1][b],1);
					}
					}
					
					if(a<n-1)
					{
						if(arr[a+1][b]!='.' && arr[a+1][b]!=cc && !map.containsKey(arr[a+1][b]))
						{
							map.put(arr[a+1][b],1);
						}
					}
					
					if(b<m-1)
					{
						if(arr[a][b+1]!='.' && arr[a][b+1]!=cc &&!map.containsKey(arr[a][b+1]))
						{
							map.put(arr[a][b+1],1);
						}
					}
					
					if(b>0)
					{
						if(arr[a][b-1]!='.' &&arr[a][b-1]!=cc && !map.containsKey(arr[a][b-1]))
						{
							map.put(arr[a][b-1],1);
						}
					}
					
					
					
				}
				
				
			}
		}
		System.out.println(map.size());
		
		
		
	}
}