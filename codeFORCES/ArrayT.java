package codeFORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayT {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		ArrayList<Integer> neg = new ArrayList<Integer>();
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> ze = new ArrayList<Integer>();
		
		for(int a=0;a<n;a++)
		{
			int g = scn.nextInt();
			
			if(g<0)
			{neg.add(g);}
			
			else if(g>0)
			{pos.add(g);}
			
			else
			{ze.add(g);}			
		}
		
		if(neg.size()!=0 && neg.size()%2==0)
		{
			if(ze.size()>0)
			{ze.add(neg.remove(0));}
		}
		
		if(pos.size()==0)
		{
			pos.add(neg.remove(0));
			pos.add(neg.remove(0));
		}
		
		System.out.print(neg.size()+" ");
		for(int i :neg)
		{System.out.print(i+" ");}
		System.out.println();
		
		System.out.print(pos.size()+" ");
		for(int i :pos)
		{System.out.print(i+" ");}
		System.out.println();

	
		System.out.print(ze.size()+" ");
		for(int i :ze)
		{System.out.print(i+" ");}
		System.out.println();

	}

}
