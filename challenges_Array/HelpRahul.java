package challenges_Array;

import java.util.Scanner;

public class HelpRahul {

	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scn.nextInt();
		
		int [] arr = new int [n];
		takeinput(arr);
		
		int a = scn.nextInt();
		
		linear(arr,a);
		
		
	}

	public static void takeinput(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();
			}
		}

    public static void linear(int [] arr , int b)
    {
    	int ans =-1;
    	
    	for(int a=0;a<arr.length;a++)
    	{if(arr[a]==b)
    	{ans = a;}
    		}
		
    System.out.println(ans);}
}

