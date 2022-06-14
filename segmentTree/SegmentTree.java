package segmentTree;

public class SegmentTree {

	
	private class Node
	{
		int data;
		int leftInt;
		int rightInt;
		Node left;
		Node right;
	}
	
	Node root;
	public SegmentTree(int [] arr) {
	this.root= create(arr, 0, arr.length-1);
	}
	
	private Node create(int [] arr , int si, int ei)
	{
		
		if(si==ei)
		{
			Node leaf = new Node();
			leaf.data= arr[si];
			leaf.leftInt=si;
			leaf.rightInt=ei;
			return leaf;
		}
		Node nn = new Node();
		
		nn.leftInt= si;
		nn.rightInt=ei;
		
		int mid = (si+ei)/2;
		nn.left= create(arr, si, mid);
		nn.right= create(arr, mid+1, ei);
		
		nn.data= nn.left.data+nn.right.data;
		
		return nn;
		
	}
	public void display()
	{
	this.display(this.root);	
	}
	private void display(Node node)
	{
		
		String str= "";
		
		if(node.left!=null)
		{
			str= str+"[ "+node.left.leftInt+" , "+node.left.rightInt+" ]" +node.left.data+" => ";
		}
		else
		{
			str= str + "No left child =>";
		}
		
		str= str +"[ "+node.leftInt+" , "+node.rightInt+" ]"+node.data;
		
		
		if(node.right!=null)
		{
			str= str+" <= "+"[ "+node.right.leftInt+" , "+node.right.rightInt+" ]" +node.right.data;
		}
		else
		{
			str= str + " <= No right child ";
		}
		
		System.out.println(str);
	
	
		 if(node.left!=null)
		 {this.display(node.left);}
		 if(node.right!=null)
		 {this.display(node.right);}
	}

	public int query(int qsi,int qei)
	{
		return this.query(this.root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		
		// no base case required
		
		// node is completely lying inside the query
		if(node.leftInt>=qsi && node.rightInt<=qei)
		{
			return node.data;
		}
		
		// node completely outside the query
		else if(node.rightInt<qsi || node.leftInt>qei)
		{return 0;}
		
		//Overlapping
		else
		{
			int leftans = query(node.left, qsi, qei);
			int rightans = query(node.right, qsi, qei);
			
			return leftans+rightans;
		}
		
	}
	public void update(int idx , int value)
	{
		this.root.data= update(this.root, idx, value);
		
	}
	
	private int update(Node node,int idx,int value)
	{
		if(idx>=node.leftInt && idx<=node.rightInt)
		{
			if(idx==node.leftInt && idx==node.rightInt)
			{
				node.data=value;
				
			}
			else
			{
				int leftVal = update(node.left, idx, value);
				int rightVal = update(node.right, idx, value);
				node.data= leftVal+rightVal;
			}
		
		}
		return node.data;
		
	}
}
