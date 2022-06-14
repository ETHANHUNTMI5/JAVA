package sheet;

import java.util.LinkedList;

public class DisappearedNums {

	public static void main(String[] args) {
		
		int [] arr = {4,3,2,7,8,2,3,1};
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		int n = arr.length;
		
		for(int a=1;a<=n;a++)
		{
			ll.addLast(a);
		}
		
		for(int a=0;a<n;a++)
		{
			
			if(ll.contains(arr[a]))
			{
				ll.removeFirstOccurrence(arr[a]);
			}
		}
	
	}

}
