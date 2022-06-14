package leetCode;

import java.util.LinkedList;

public class PartitionList {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode tail;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
	public static void main(String[] args) {
		
	PartitionList node = new PartitionList();
	System.out.println(node);
	
		
	}
	public class Solution {
	    public ListNode partition(ListNode head, int x) {
		
	    	ListNode less = new ListNode();
	    	ListNode more = new ListNode();
	    	ListNode temp1 = less;
	    	ListNode temp2 = more;
	    	
	    	ListNode temp =head;
	    	
	    	
	    	while(temp!=null)
	    	{
	    	
	    		if(temp.val<x)
	    		{addLast(temp1, temp.val);}
	    		else
	    		{
	    		addLast(temp2, temp.val);	
	    		}
	    		
	    		
	    		
	    	temp= temp.next;}
	    	
	    	return head;
	        
	    }
	    
	}
	    
	public void addLast(ListNode temp,int val)
	{
		ListNode nn = new ListNode(val);
		
		temp.next=nn;
		temp=nn;
		
		
	}
	

}
