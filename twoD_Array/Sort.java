package twoD_Array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[][] arr = {{3,4},
		               {2,1},
					   {6,8},
		               {12,5}};
		
		Arrays.sort(arr,(a,b)->a[0]-b[0]); // sort on basis of col1
		Arrays.sort(arr,(a,b)->a[1]-b[1]); // sort on basis of col2
		
		for(int a=0;a<arr.length;a++)
		{
			for(int b=0;b<arr[0].length;b++)
			{System.out.print(arr[a][b]+" ");}
			System.out.println();
		}
		}
	}


