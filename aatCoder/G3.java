package aatCoder;

import java.util.Scanner;

public class G3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int [] ans = new int[n];
		
		
		for(int a=0;a<n;a++)
		{
			int get = arr[a];
			ans[get-1]=a+1;
		}
		
		for(int i : ans)
		{System.out.print(i+" ");}
	}

}
