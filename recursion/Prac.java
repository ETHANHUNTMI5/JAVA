package recursion;

import java.util.Scanner;

public class Prac {

public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	Even(2*n);
	
	}
public static void Even(int n)
{
 if(n==0)
 {return ;}
 
 if(n%2!=0)
 {
	 Even(n-1);
	 
 }

 else
 {
	 Even(n-2);
	 System.out.print(n+" ");
 }
}

}
