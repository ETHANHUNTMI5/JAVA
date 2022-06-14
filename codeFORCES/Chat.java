package codeFORCES;

import java.util.Scanner;

public class Chat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(), q = sc.nextInt(), l = sc.nextInt(), r= sc.nextInt();
		int arr1[][] = new int[p][2];
		int arr2[][] = new int[q][2];
		 
		for(int i = 0; i< p; i++){
		        for(int j =0; j<2; j++){
		                arr1[i][j] = sc.nextInt();
		        }
		}
		 
		for(int i = 0; i< q; i++){
		        for(int j =0; j<2; j++){
		                arr2[i][j] = sc.nextInt();
		        }
		}
		 
		int ans = 0;
		 
		
		for(int k=l;k<=r;k++)
		{
			t:for(int j=0;j<q;j++)
			{
				int one = arr2[j][0]+k;
				int two = arr2[j][1]+k;
				
				
		for(int i =0;i<p;i++)
			{
				if(one>=arr1[i][0] && two<=arr1[i][1]||
						one>=arr1[i][0] && one<=arr1[i][1]||
						two>=arr1[i][0] && two<=arr1[i][1]||
						one<=arr1[i][0] && two>=arr1[i][1])
				{
					ans++;
					break t;
				}
				
				
				
			}
			}
			
			
			
		}
		System.out.println(ans);
	}

}
