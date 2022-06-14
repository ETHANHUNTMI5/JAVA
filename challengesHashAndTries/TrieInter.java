package challengesHashAndTries;

import java.util.Scanner;

public class TrieInter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		int g=0,k=0,ans=0;;
		for(int i =0;i<n;i++)
		{g=0;
			for(int j=i;j<n;j++)
			{
				g= g^arr[j];
				if(g>ans)
				{
					k=j;
					ans=g;
				}
				
				
			}
			System.out.println(g+"-->"+k);
		}
		System.out.println(k);

	}

}
