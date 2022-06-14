package challengesStacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PrateekSir {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		Stack<Integer> type2 = new Stack<Integer>();
		
		for(int a=1;a<=n;a++)
		{
			int num1 = scn.nextInt();
               
			if(num1==2)
			{
				int num2 = scn.nextInt();
				
				type2.push(num2);
			}

			else if(num1 == 1)
			{
				if(type2.isEmpty())
				{System.out.println("No");}
				
				else
				{System.out.println(type2.pop());}
				
			}
			
		
		
		}

		
		
	}

}

///////**************

//import java.util.*;
//public class Main {
//
//public static void main(String args[]) {
//	Scanner sc=new Scanner(System.in);
//	int size=sc.nextInt();
//	LinkedList l1=new LinkedList();
//	for(int i=0;i<size;i++){
//		l1.addLast(sc.nextInt());
//	}
//	int size2=sc.nextInt();
//	LinkedList l2=new LinkedList();
//	for(int i=0;i<size2;i++){
//		l2.addLast(sc.nextInt());
//	}
//	System.out.println(l1.findIntersection(l1.head,l2.head));
//}
//private static class LinkedList {
//private class Node {
//	int data;
//	Node next;
//	public Node(int data) {
//		 this.data=data;
//		 this.next=null;
//	}
//	
//	
//}
//private Node head;
//private Node tail;
//private int size;
////O(N)
//public void display(){
//	Node temp=this.head;
//	while(temp!=null){
//		System.out.print(temp.data+" ");
//		temp=temp.next;
//	}
//	System.out.println();
//}
////O(N)
//public void addLast(int data){
//	 Node newNode=new Node(data);
//
//	 this.size++;
//	if(head==null){
//		head=newNode;
//		tail=newNode;
//		return;
//	}
//	 tail.next=newNode;
//	 this.tail=newNode;
//}
//public int findIntersection(Node l1, Node l2){
//	Node l1Head=l1;
//	Node l2Head=l2;
//	int count1=0,count2=0;
//	while(l1Head!=null){
//		l1Head=l1Head.next;
//		count1++;
//	}
//	while(l2Head!=null){
//		l2Head=l2Head.next;
//		count2++;
//	}
//    if(count1>=count2)
//	{int d=count1-count2;
//	l1Head=l1;
//	l2Head=l2;
//	int count=0;
//	while(count!=d){
//		l1Head=l1Head.next;
//		count++;
//	}
//	while(l1Head!=null && l2Head!=null){
//		if(l1Head.data==l2Head.data){
//			return l1Head.data;
//		}
//		l1Head=l1Head.next;
//		l2Head=l2Head.next;
//	}
//	
//    }
//    else
//    {
//int d=count2-count1;
//	l1Head=l1;
//	l2Head=l2;
//	int count=0;
//	while(count!=d){
//		l2Head=l2Head.next;
//		count++;
//	}
//	while(l1Head!=null && l2Head!=null){
//		if(l1Head.data==l2Head.data){
//			return l1Head.data;
//		}
//		l1Head=l1Head.next;
//		l2Head=l2Head.next;
//
//
//    }
//    
//    
//    }
//    return -1;}
//public int size(){
//	return this.size;
//}
////O(1)
//public void addFirst(int data){
//	Node newNode=new Node(data);
//	this.size++;
//	if(head==null){
//		head=newNode;
//		tail=newNode;
//		return;
//	}
//	newNode.next=head;
//	head=newNode;
//}
////O(N)
//private Node getNodeAt(int index){
//	int count=0;
//	if(this.size==0){
//		return null;
//	}
//	Node temp=head;
//	while(temp!=null){
//		if(count==index){
//			return temp;
//		}else{
//			count++;
//		}
//		temp=temp.next;
//	}
//	return null;
//}
////O(1)
//public int getFirst(){
//	if(head==null){
//		return -1;
//	}
//	return this.head.data;
//}
////O(1)
//public int getLast(){
//	if(tail==null){
//		return -1;
//	}
//	return this.tail.data;
//}
////O(N)
//public int getAt(int index){
//	if(size==0){
//		return -1;
//	}else if(index<0 || index>=this.size){
//		return -1;
//	}
//	
//	int count=0;
//	Node temp=head;
//	while(temp!=null){
//		if(count==index){
//			return temp.data;
//		}else{
//			count++;
//		}
//		temp=temp.next;
//	}
//	return -1;
//}
////O(1)
//public int removeFirst(){
//	if(head==null){
//		return -1;
//	}
//	int rv=head.data;
//	if(this.size==1){
//		this.size=0;
//		this.head=null;
//		this.tail=null;
//	}
//	head=head.next;
//	this.size--;
//	return rv;
//}
//
////O(N)
//public int removeLast(){
//	if(tail==null){
//		return -1;
//	}
//	if(size==1){
//		this.size=0;
//		this.head=null;
//		this.tail=null;
//	}
//	int rv=tail.data;
//	Node temp=getNodeAt(size-2);
//	tail=temp;
//	tail.next=null;
//	this.size--;
//	return rv;
//}
//
////O(N)
//public int removeAt(int index){
//	if(size==0){
//		return -1;
//	}else if(index<0 || index>=size){
//		return -1;
//	}else if(index==0){
//		return removeFirst();
//	}else if(index==size-1){
//		return removeLast();
//	}else{
//		Node node=getNodeAt(index-1);
//		Node nextNode=node.next;
//		Node nextOfNextNode=nextNode.next;
//		node.next=nextOfNextNode;
//		this.size--;
//		return nextNode.data;
//	}
//}
////reverse data
//public void reverseList(){
//	if(size==0){
//		return;
//	}
//	int left=0;
//	int right=this.size-1;
//	while(left<right){
//		Node leftNode=getNodeAt(left);
//		Node rightNode=getNodeAt(right);
//		int temp=leftNode.data;
//		leftNode.data=rightNode.data;
//		rightNode.data=temp;
//		left++;
//		right--;
//	}
//}
//
//public void reversePointers(){
//	Node prev=this.head;
//	Node temp=prev.next;
//	while(temp!=null){
//		Node next=temp.next;
//		temp.next=prev;
//		prev=temp;
//		temp=next;
//	}
//	Node t=this.head;
//	this.head=this.tail; 
//	this.tail= t;
//	this.tail.next=null;
//}
//
//public int midNode(){
//	Node slow=this.head;
//	Node fast=slow.next;
//	
//	while(fast.next!=null && fast.next.next!=null){
//		slow=slow.next;
//		fast=fast.next.next;
//	}
//	
//	return slow.data;
//}
//}
//
//}
//
//
//
//
//
//
//
//
//
//
