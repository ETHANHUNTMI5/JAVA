package codeFORCES;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
      long n = scn.nextLong();
      
      long sum=0;
      
      long k = n/2;
      
      if(n%2==0)
      {System.out.println(k);}
      else
      {System.out.println(-k-1);}
	}

}
