package pattern;

import java.util.Scanner;

public class Basic_Cal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 
		while(true)
		{	 char ch = scn.next().charAt(0);
		
			 
	 if(ch=='*')
	 {int n1=scn.nextInt();
	 int n2=scn.nextInt();
	 int ans=n1*n2;
	 System.out.println(ans);}
	 
	 
	 else if(ch=='+')
	 {int n1=scn.nextInt();
	 int n2=scn.nextInt();
     int ans=n1+n2;
	 System.out.println(ans);}
	 
	 
	 else if(ch=='-')
	 {int n1=scn.nextInt();
	 int n2=scn.nextInt();
	 int ans=n1-n2;
	 System.out.println(ans);}
	
	 
	 else if(ch=='%')
	 {int n1=scn.nextInt();
	 int n2=scn.nextInt();
     int ans=n1%n2;
	 System.out.println(ans);}
	

	 else if(ch=='/')
	 {int n1=scn.nextInt();
	 int n2=scn.nextInt();
	 int ans=n1/n2;
	 System.out.println(ans);}
	 
	 else if(ch == 'x' || ch == 'X') 
	 {break;}
	 
	 else
	 {System.out.println("Invalid operation. Try again");}
	
		
	 
	}
		
	 
	}

}
