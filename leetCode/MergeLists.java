package leetCode;

public class MergeLists {

		
		  class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
//		      ListNode(int val) { this.val = val; }
//		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		
		class Solution {
		    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		        
		        ListNode t1= l1;
		        ListNode t2 = l2;
		        
		        ListNode ans= new ListNode();
		        ListNode temp = ans;
		        ListNode temp2 = ans;
		        
		        if(t1.val<t2.val)
		        {
		            ans = t1;
		            t1=t1.next;
		            temp = ans.next;
		            System.out.println(ans.val+" 1");
		        }
		        else
		        {ans=t2;
		        t2=t2.next;
		         temp = ans.next;
		        System.out.println(ans.val+" 2");}
		        
		        while(t1!=null && t2!=null)
		        {
		            
		            if(t1.val<t2.val)
		            {
		                  System.out.println("yup");
		               temp2= t1;
		                temp=temp2;
		                temp2 = temp.next;
		                 t1=t1.next;
		                System.out.println(ans.val+" 1");
		            }
		            
		            else
		            {
		             System.out.println("bye");   
		                temp2= t2;
		                temp=temp2;
		                temp2 = temp.next;
		                t2=t2.next;
		                
		                System.out.println(ans.val+ " 2");
		            }
		            
		            
		        }
		        
		        if(t1==null)
		        {
		            while(t2!=null)
		            {
		                temp2= t2;
		                temp=temp2;
		                temp2 = temp.next;
		                t2= t2.next;

		                System.out.println(ans.val+" 2");
		            }
		            
		            
		        }
		        
		        if(t2==null)
		        {
		            while(t1!=null)
		            {
		                
		                temp2= t1;
		                temp=temp2;
		                temp2 = temp.next;
		                t1= t1.next;

		                System.out.println(ans.val+" 1");
		            }
		            
		        }
		        
		        
		        
		        
		    return ans;}
		}
		public static void main(String[] args) {
			
	}

}
