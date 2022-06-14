package textProcessing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import heap.Heap;

public class HuffmanEncoding {

	 HashMap<Character, String > encode = new HashMap<Character, String>();
	 HashMap<String,Character  > decode = new HashMap<String,Character>();

	 public HuffmanEncoding(String feeder)
	 {
		//1. CREATE A FREQ MAP
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 for(int i = 0; i<feeder.length();i++)
		 {
			 char cc = feeder.charAt(i);
			 if(map.containsKey(cc))
			 {
				 int  g = map.get(cc);
				 g=g+1;
				 map.put(cc,g);
				  
			 }
			 else
			 {map.put(cc,1);}
			 
		 }
		 
		 // 2.CREATE MIN HEAP
	    textProcessing.Heap<Node > min = new textProcessing.Heap<Node>();
	    Set<Map.Entry<Character, Integer>> entry = map.entrySet();
	    for(Map.Entry<Character, Integer> entries: entry)
	    {
	    	Node node = new Node(entries.getKey(), entries.getValue());
	    	min.add(node);
	    }
	    //3. COMBINE NODES UNTIL ONE NODE IS LEFT IN HEAP
	    
	    while(min.size()!=1)
	    {
	    	Node minone = min.remove();
	    	Node mintwo = min.remove();
	    	
	    	Node combined = new Node(minone,mintwo);
	    	combined.cost= minone.cost+mintwo.cost;
	    	combined.data='\0';
	    	min.add(combined);
	    	
	    }
	    //4. POP THE FINAL NODE FROM HEAP
	    Node ft = min.remove();
	    this.encode= new HashMap<Character, String>();
	    this.decode= new HashMap<String, Character>();
		this.initEncoDeco(ft,"");
		 
	    
	 }
	 //FILLING ENCODE AND DECODE
	 private void initEncoDeco(Node node, String osf)
	 {
		 if(node == null)
		 {return;}
		 
		 if(node.left==null && node.right==null)
		 {
			 this.encode.put(node.data,osf);
			 this.decode.put(osf,node.data);
		 }
		 
		 this.initEncoDeco(node.left, osf+"0");
		 this.initEncoDeco(node.right, osf+"1");
		 
	 }
	 
	 public String ENCODED(String src)
	 {
		 String rv= "";
		 for(int i =0; i<src.length();i++)
		 {String code= this.encode.get(src.charAt(i));
		 rv=rv+code;}
		 
		 return rv;
		 
	 }
	 
	 public String DECODED(String codedstr)
	 {
		 String rv= "";
		 String key="";
		 for(int i =0; i<codedstr.length();i++)
		 {
			 key = key +codedstr.charAt(i);
			 if(this.decode.containsKey(key))
			 {rv= rv+this.decode.get(key);
			 key="";}
			 
		 }
		 
		 return rv;
		 
	 }
	 private class Node implements Comparable<Node>
	 {
		 Character data;
		 int cost;
		 Node left;
		 Node right;
		 
		 public Node(char data,int cost) {
		this.data=data;
		this.cost= cost;
		this.left= null;
		this.right=null;
		 
		 }
		 
		  public Node(Node left,Node right) {
            this.left= left;
            this.right= right;
			  
		  }

		@Override
		public int compareTo(Node o) {
			return this.cost-o.cost;
			
		} 
		 
	 }
}
