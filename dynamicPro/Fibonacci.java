package dynamicPro;

public class Fibonacci {

	public static void main(String[] args) {
	 
		int n =25;
		System.out.println(FiboREC(n));
        System.out.println(FibTD(n, new int[n+1]));
	     System.out.println(FibBU(n));
		System.out.println(FibBUSE(n));
	}
	
	//T(n)= 0(2^n)  SC = REC space
	public static int FiboREC(int n)
	{
		if(n==0 || n==1)
		{return n;}
		
		int fnm1= FiboREC(n-1);
		int fnm2= FiboREC(n-2);
		
		return fnm1+fnm2;
		
	}
	
	// T(n)= 0(n)  SC = n+ REC space
 public static int FibTD(int n,int [] strg)
 {if(n==0 || n==1)
	{return n;}
 
     if(strg[n]!=0)  // re use   	 
     {return strg[n];}
	
	int fnm1= FibTD(n-1,strg);
	int fnm2= FibTD(n-2,strg);
	int fn =fnm1+fnm2;
	strg[n]=fn;// store the values
	return fn;
	}
 
 //T(n)= 0(n)  SC = n
 public static int FibBU(int n)
 {
	 // array of size n+1
	 int [] strg = new int[n+1];
	 
	 // fill base case values of TD
	 strg[0]=0;
	 strg[1]=1;
	 
	 for(int i=2;i<=n;i++)
	 {strg[i]=strg[i-1]+strg[i-2];}
	 
	 return strg[n];
	 
 }
 
//T(n)= 0(n)  SC = 0(1) bottom up space efficient
 public static int FibBUSE(int n)
 {
	 int [] strg = new int [2];
	 
	 strg[0]=0;
	 strg[1]=1;
	 
	 for(int slide =1;slide<=n-1;slide++)
	 {
		 int sum = strg[0]+strg[1];
		 strg[0]=strg[1];
		 strg[1]=sum;
	 }
	 return strg[1];
 }
}
