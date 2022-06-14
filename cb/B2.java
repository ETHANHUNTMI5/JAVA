package cb;

import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {
		
        int mem1 = 2;
        int mem2=2;
     
        int t=1;
        int mem=1;
        
        while(mem2-mem>=0 || mem1-mem>=0)
        {
        	
        
        if(mem2>mem1)
        {
       mem2=mem2-mem;	
        }
        else
        {
        	mem1=mem1-mem;
        }
        mem++;
        t++;
	}

        System.out.println(t+" "+mem1+" "+mem2);
}}
