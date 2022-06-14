package oopsAndStacks;

public class Overloading {

	public static void main(String[] args) {
		// Overloading only for different type of arguments
		// and only different num of arguments

        System.out.println(sum(2,3));
		int [] arr = {2,3,4,5,6};
		System.out.println(sum("",arr));
        
        
        System.out.println(sum("",2,3,4,5,6));
	}
 // only one type of undetermined variables
// the should be at last eg sum(String s,int... args)	
	
	public static int sum(String s,int... args)
	{
		int sum=0;
		for(int i:args)
		{sum+=i;}
		return sum;
	}
	
	
	public static int sum(int a,int b)
	{
		
		return a+b;
	}


}
