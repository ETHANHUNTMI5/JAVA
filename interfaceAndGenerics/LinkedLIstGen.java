package interfaceAndGenerics;



public class LinkedLIstGen<T> {

	
	private class Node      //inner class
	{
		T data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	

	
   //O(n)
	public void Display()
	{
		
		Node temp = this.head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" , ");
			temp=temp.next;
			
		
		}
		
 
	}
	
	
}
