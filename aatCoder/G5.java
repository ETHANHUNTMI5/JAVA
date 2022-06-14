package aatCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class G5 {
public static int start=0;
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			
			int x = scn.nextInt();
			
			if(x == 1) {
				int num = scn.nextInt();
				list.add(num);
			}else if(x == 2) {
				if(pq.size() != 0) {
					System.out.println(pq.poll());
				}else {
					System.out.println(list.pollFirst());
				}
			}else if(x == 3) {
				pq.addAll(list);
				list.clear();
			}
			
		}
		
	}
	

}
