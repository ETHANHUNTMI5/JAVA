package pattern;

import java.util.Scanner;

public class Prateekcandy2 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		user();
		}
	public static void user()
	{	
	int p= scn.nextInt();
	int [] array=null;
	array = new int[p];
	for(int l=0;l<=p-1;l++)
	{array[l]= scn.nextInt();
      prime(array[l]);
	}
}
	
	public static void prime(int m)
	{int n=1000000,k=0;
	for(int a=1;a<=n;a++)
    {
			int c=0;
			for(int b=1;b<=a;b++)
			{if(a%b==0)
			{c++;}	
			}
			if(c==2)
			{k++;}
			
	if(k==m)
	{System.out.println(a);
	break;}
	
	
	
	}	
	}
}

	
