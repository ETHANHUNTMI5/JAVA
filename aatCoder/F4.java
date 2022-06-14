package aatCoder;

import java.util.Scanner;

public class F4 {

	
	    private int[] Heap;
	    private int size;
	    private int maxsize;
	  
	    // Constructor to initialize an
	    // empty max heap with given maximum
	    // capacity.
	    public F4(int maxsize)
	    {
	        this.maxsize = maxsize;
	        this.size = 0;
	        Heap = new int[this.maxsize + 1];
	        Heap[0] = Integer.MAX_VALUE;
	    }
	  
	    // Returns position of parent
	    private int parent(int pos) { return pos / 2; }
	  
	    // Below two functions return left and
	    // right children.
	    private int leftChild(int pos) { return (2 * pos); }
	    private int rightChild(int pos)
	    {
	        return (2 * pos) + 1;
	    }
	  
	    // Returns true of given node is leaf
	    private boolean isLeaf(int pos)
	    {
	        if (pos > (size / 2) && pos <= size) {
	            return true;
	        }
	        return false;
	    }
	  
	    private void swap(int fpos, int spos)
	    {
	        int tmp;
	        tmp = Heap[fpos];
	        Heap[fpos] = Heap[spos];
	        Heap[spos] = tmp;
	    }
	  
	    // A recursive function to max heapify the given
	    // subtree. This function assumes that the left and
	    // right subtrees are already heapified, we only need
	    // to fix the root.
	    private void maxHeapify(int pos)
	    {
	        if (isLeaf(pos))
	            return;
	  
	        if (Heap[pos] < Heap[leftChild(pos)]
	            || Heap[pos] < Heap[rightChild(pos)]) {
	  
	            if (Heap[leftChild(pos)]
	                > Heap[rightChild(pos)]) {
	                swap(pos, leftChild(pos));
	                maxHeapify(leftChild(pos));
	            }
	            else {
	                swap(pos, rightChild(pos));
	                maxHeapify(rightChild(pos));
	            }
	        }
	    }
	  
	    // Inserts a new element to max heap
	    public void insert(int element)
	    {
	        Heap[++size] = element;
	  
	        // Traverse up and fix violated property
	        int current = size;
	        while (Heap[current] > Heap[parent(current)]) {
	            swap(current, parent(current));
	            current = parent(current);
	        }
	    }
	  
	    public void print()
	    {
	        for (int i = 1; i <= size / 2; i++) {
	            System.out.print(
	                " PARENT : " + Heap[i]
	                + " LEFT CHILD : " + Heap[2 * i]
	                + " RIGHT CHILD :" + Heap[2 * i + 1]);
	            System.out.println();
	        }
	    }
	  
	    // Remove an element from max heap
	    public int extractMax()
	    {
	        int popped = Heap[1];
	        Heap[1] = Heap[size--];
	        maxHeapify(1);
	        return popped;
	    }
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		F4 heap = new F4(n);
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
			heap.insert(arr[a]);
		}

		int ans=0;
		
		
		while(k!=0)
		{
			int get = heap.extractMax();
			
			if(get==0)
			{break;}
			
			ans+=get;
			
			
			heap.insert(get-1);
			
		k--;}
		
		System.out.println(ans);
	}

}
