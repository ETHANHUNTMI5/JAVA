package codeFORCES;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] one = new int[n];
		int[] two = new int[n];
		
		for(int a=0;a<n;a++)
		{
			one[a]= scn.nextInt();
			two[a]= scn.nextInt();
		}
		int count=0;
		for(int a=0;a<n;a++)
		{
			for(int b=0;b<n;b++)
			{
				if(one[a]==two[b])
				{count++;}
			}
			
		}
System.out.println(count);
	}

}
