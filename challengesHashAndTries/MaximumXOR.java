package challengesHashAndTries;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumXOR {

	public static void main(String[] args) {

		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 int [] arr = new int[n];
		 
		 for(int a=0;a<n;a++)
		 {
			 arr[a]= scn.nextInt();
			 
		 }
		 int ans=0;
		 int g =0;
		 for(int i =0;i<n;i++)
		 {g=0;
			 for(int j =i;j<n;j++)
			 {
				 g= g^arr[j];
				 System.out.println(arr[i]+"-->"+arr[j]+"-->"+g);
				 ans = Math.max(g, ans);
			 }
		 }
		 System.out.println(ans);

	}
	}
