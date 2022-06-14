package sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MaxMeetings {
	static class Pair
	{
		int s;
		int e;
		int num;
		Pair(int s,int e, int num)
		{
			this.s=s;
			this.e=e;
			this.num=num;
		}
	}

	static class HComparator implements Comparator<Pair>
	{
		
		public int compare(Pair t,Pair o)
		{return t.e-o.e;}
	}
	
	
	public static void main(String[] args) {
		int [] st={75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
		int [] et={112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };
		
		int n = st.length;
		ArrayList<Pair> ll = new ArrayList<>();
		for(int a=0;a<n;a++)
		{
			ll.add(new Pair(st[a],et[a],a+1));
		}

		Collections.sort(ll,new HComparator());
		
		int ex =ll.get(0).e;
		int ans=1;
		System.out.print(ll.get(0).num+" ");
		for(int a=1;a<ll.size();a++)
		{
			if(ll.get(a).s>ex)
			{System.out.print(ll.get(a).num+" ");
			ex = Math.max(ex, ll.get(a).e);
			ans++;}
		}
		System.out.println();
		System.out.println(ans);
	}

}
