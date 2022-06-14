package leetCode;


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode ans = head;
        ListNode temp = ans;
        ListNode prev=ans;
        
        int t=0;
        while(temp!=null)
        {
            
            ListNode nn = new ListNode();
            nn.val=temp.val;
        prev=temp;
        temp=temp.next;
        t++;}
        
        
   return ans; }
}