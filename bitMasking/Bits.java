package bitMasking;

public class Bits {

	public static void main(String[] args) {
		
		//&
		System.out.println(5&3);
		// |
		System.out.println(3|5);
		
		System.out.println(~13);
		
		System.out.println(10<<2);//(a*2^b)
		
		System.out.println(12>>1);//(a/2^b)
	
	
		// even or odd
		int n =5;
		if((n&1)==0)
		{System.out.println("even");}
		else
		{System.out.println("odd");}
		
		System.out.println(ExtractBit(22, 5));//010110
		System.out.println(ExtractBit(6, 5));//000110
		
		System.out.println(SetBit(21, 4));
		System.out.println(ResetBit(21, 4));
		
		RightmostsetBit(8);
		
		System.out.println(addOne(8));
		
		System.out.println(MagicNo(5));
		
		System.out.println(PowerOf2(1));
	}

	public static int ExtractBit(int n , int i)
	{
		int j=1;
		j = j<<i-1;
		
		int ans = n&j;
		
	
		return (ans==0 ? 0:1 );
	}


	public static int SetBit(int n , int i)
	{
		int j=1;
		j = j<<i-1;
		
		int ans = n|j;
		
	
		return ans;
	}

	public static int ResetBit(int n , int i)
	{
		int j=1;
		j = ~(j<<i-1);
		
		int ans = n&j;
		
	
		return ans;
	}

	public static void RightmostsetBit(int n)
	{
	int pos=1;
	int mask=1;
	
	while((n&mask)==0)
	{
		
		
		pos++;
		mask=mask<<1;
	}
	
	System.out.println(pos);
	
	}

 public static int addOne(int n)
 {
	 int mask=1;
	
	 
	 while((mask&n)!=0)
	 {
		 
		 n=n^mask;
		 mask = mask<<1;
	 }
	 
	// one more time
	 n = n^mask;
	 
	 return n;
	 
	 
 }
	
 public static int MagicNo(int i)
 {
	 
	 int ans=0;
	 int pow=1;
	 
	 
	 
	 while(i!=0)
	 {
	
		 pow=pow*5;
		 
		 if((i&1)!=0)
		 {ans = ans+pow;
		 }
		 i = i >>1;
		 
	 }
	return ans; 
 }
 
 public static boolean PowerOf2(int n )
 {
	if(n!=0 && n!=1)
	{
		if((n&n-1)==0)
		{return true;}
	}
	
	return false;
 }
}


