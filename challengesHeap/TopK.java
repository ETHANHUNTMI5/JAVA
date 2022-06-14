package challengesHeap;

import java.util.HashMap;
import java.util.Scanner;

import heap.Heap;

public class TopK {

	public static void main(String[] args) {

		Heap heap= new Heap();
		
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int [] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int num=0;
        for(int a=0;a<n;a++)
        {
        arr[a]= scn.nextInt();
        num = arr[a];
        if(map.containsKey(num))
        {
        	map.put(num,map.get(num)+1);
        }
        else
        {
        	map.put(num,1);
        }
        	
        	
        }
        
        
        System.out.println(map);
		
	}

}
