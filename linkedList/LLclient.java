package linkedList;

public class LLclient {

	public static void main(String[] args) throws Exception {
 
		LinkedList l = new LinkedList();
 
		LinkedList l2 = new LinkedList();
		
		
     

        l.addLast(10);
       System.out.println( l.getFirst());
        l.addFirst(20);
        l.addLast(30);
        l.Display();
        l.addLast(40);
        System.out.println(l.getLast());
        l.addFirst(50);
        
        l.Display();

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getAt(3));
        
        l.addAt(3, 69);
        l.Display();
        System.out.println(l.RemoveFirst());
        System.out.println(l.RemoveLast());
        System.out.println(l.RemoveAt(2));
        l.Display();
        
        System.out.println("*****************");
        
        for(int i=1;i<=5;i++)
        {
        	l2.addLast(10*i);
        }
        l2.Display();
        l2.ReverseData();
        
        l2.Display();
      
        l2.ReversePointer();
        System.out.println(l2.mid());
        l2.Display();
	 }
	
}
