package a111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> ll = new ArrayList();
		int prev=0;
		for(int a=0;a<n;a++)
		{
			int g = scn.nextInt()%360+prev%360;
			g = g%360;
			prev=g;
			ll.add(g);
		}
		ll.add(0);
		Collections.sort(ll);
		System.out.println(ll);
		int ans=360-ll.get(ll.size()-1);
		for(int a=1;a<ll.size();a++)
		{
			System.out.println(ans);
			if(ll.get(a)-ll.get(a-1)>ans)
			{ans = ll.get(a)-ll.get(a-1);}
		}
      System.out.println(ans);
	}

}
