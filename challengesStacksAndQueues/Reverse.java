package challengesStacksAndQueues;

import java.io.DataInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		
		Stack<Integer> stack = new Stack<>();
		
		Fill(arr, stack, 0);
 
		  
	       int [] arrHelp= new int [n];
	       
	       ReverseHelp(stack, arrHelp, 0);
	       
	       for(int a=0;a<arrHelp.length;a++)
			{
				stack.push(arrHelp[a]);
				
			}
			

  
	       display(stack);
	}
	
	public static void Fill(int [] arr,Stack<Integer> stack,int vi)
	{
		if(vi==arr.length)
		{return;}
		
		stack.push(arr[vi]);
		Fill(arr, stack, vi+1);
		
	}

	
	public static void ReverseHelp(Stack<Integer> stack,int [] arrHelp,int vi)
	{
		if(vi==arrHelp.length)
		{return;}
		
		int rv = stack.pop();
		arrHelp[vi]=rv;
		
		
		ReverseHelp(stack, arrHelp, vi+1);
		
		
	}
	
	public static void display(Stack<Integer> stack)
	{
		for(int a=stack.size()-1;a>=0;a--)
		{System.out.println(stack.get(a));}
		
		
		
	}
	
}
