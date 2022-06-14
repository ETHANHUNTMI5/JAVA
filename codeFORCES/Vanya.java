package codeFORCES;

import java.util.Scanner;

public class Vanya {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int h = scn.nextInt();
		int [] arr = new int[n];
		
		int wid=0;
		for(int a=0;a<n;a++)
		{
			arr[a]=scn.nextInt();
			if(arr[a]<=h)
			{wid=wid+1;}
			else
			{wid=wid+2;}
		}
     
		System.out.println(wid);
	}

}
