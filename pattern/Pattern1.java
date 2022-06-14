package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int n= scn.nextInt();
    int row=1;

    while(row<=n)
    {for(int a=1;a<row;a++)
    {System.out.print(" ");}
    	
    for(int a=n;a>=row;a--)
    {System.out.print("*");}
    
    
    	
    row++;
    System.out.println();}
	
	
	
	}}