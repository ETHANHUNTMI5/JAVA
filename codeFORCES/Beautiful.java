package codeFORCES;

import java.util.Scanner;

public class Beautiful {

	public static void main(String[] args) {
		int [][] arr = new int[5][5];
		
		Scanner scn = new Scanner(System.in);
		
		int row=0;
		int col=0;
		for(int i =0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{arr[i][j]=scn.nextInt();
			if(arr[i][j]==1)
				{
				row=i;
				col=j;
				}}
		}
		int ans = Math.abs(row-2)+Math.abs(col-2);
		System.out.println(ans);
		
	}
	 

}
