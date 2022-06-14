package challenges_Array;

import java.util.Scanner;

public class Sort_Game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x= scn.nextInt();
		int c=0;
		int n= scn.nextInt();
		int [] arr = null;
		arr = new int [n];
		
		char [] arr1 = null;
		arr1 = new char [n];
		
		
		for(int a=0;a<n;a++)
		{int s= scn.nextInt();
		char ch = scn.next().charAt(0);
			arr[a]=s;
			arr1[a]=ch;
		}
			
		for(int a=0;a<n;a++)
		{if(arr[a]>x)
			{c++;}
		
		}
		
		int [] arr2 = null;
		arr2 = new int [c];
	}

}
