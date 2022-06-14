package a111;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int f = scn.nextInt();
		
		int [][] arr = new int[n][2];
		
		int min=0;
		int max=0;	
		int [] help= new int[n];
		for(int a=0;a<n;a++)
		{
			arr[a][0] = scn.nextInt();
			arr[a][1] = scn.nextInt();
			help[a]=arr[a][1]-arr[a][0];
			min+=arr[a][0];
			max+=arr[a][1];
		}
		
		if(f<min || f>max)
		{System.out.println("No");
		return;}
		
		if(f==min)
		{System.out.println("Yes");
		return;}
		
		int find = f-min;
		if(find==help[0])
		{System.out.println("Yes");
		return;}
		
		
		boolean b = isSubsetSum(help, n, find);
		if(b)System.out.println("Yes");
		else
		{System.out.println("No");}
		
		
	}
	static boolean isSubsetSum(int set[],
            int n, int sum)
{
// The value of subset[i][j] will be
// true if there is a subset of
// set[0..j-1] with sum equal to i
boolean subset[][] = new boolean[sum + 1][n + 1];

// If sum is 0, then answer is true
for (int i = 0; i <= n; i++)
subset[0][i] = true;

// If sum is not 0 and set is empty,
// then answer is false
for (int i = 1; i <= sum; i++)
subset[i][0] = false;

// Fill the subset table in bottom
// up manner
for (int i = 1; i <= sum; i++) {
for (int j = 1; j <= n; j++) {
subset[i][j] = subset[i][j - 1];
if (i >= set[j - 1])
 subset[i][j] = subset[i][j]
                || subset[i - set[j - 1]][j - 1];
}
}

/* // uncomment this code to print table
for (int i = 0; i <= sum; i++)
{
for (int j = 0; j <= n; j++)
System.out.println (subset[i][j]);
} */

return subset[sum][n];
}}
