package cb;

import java.util.Scanner;

public class A2 {
public static int count=0;
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
          int total= scn.nextInt();
          int num = scn.nextInt();
          
          int [] arr = new int[num];
          
          for(int a=0;a<num;a++)
          {
        	  arr[a]= scn.nextInt();
          }
          
          System.out.println(ans(arr, 0, total));
          System.out.println(count);
	}

	public static int ans(int [] arr, int pre,int total)
	{
		if(pre>total)
		{return 0;}
		
		if(pre==total)
		{
			count++;
			return 1;}
		
		int fans=0;
		int in =0;
		int ex =0;
		for(int a=0;a<arr.length;a++)
		{
			fans =fans+ ans(arr, pre+arr[a], total);
			
		}
		
		return fans;
		
		
		
	}
}
