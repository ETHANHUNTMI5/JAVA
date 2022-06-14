package functions_Array;

import java.util.Scanner;

public class AnybaseToDeci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int base= scn.nextInt();
		int ans=anybase(n,base);
		System.out.println(ans);
		}
    public static int anybase(int n,int base)
    {	int a=0,c=1,sum=0;
    while(n!=0)
    {int b=n%10;
  	  a=b*c;
  	  
  	  c=c*base;
     n=n/10;
     sum=sum+a;}
		return sum;
}
}
