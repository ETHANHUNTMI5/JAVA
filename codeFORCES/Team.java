package codeFORCES;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans=0;
        for(int a=0;a<n;a++)
        {int count=0;
        	
        int x=scn.nextInt();
        if(x==1)
        {count++;}
        int y=scn.nextInt();
        if(y==1)
        {count++;}
        int z=scn.nextInt();
        if(z==1)
        {count++;}
        
        if(count>=2)
        {ans++;}
        }
        System.out.println(ans);
	}

}
