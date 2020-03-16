package com.bridgelabz.utility;

public class LinkedListUsingQueue<T> {
	
	//A node class has been created for performing node operations.
	public class Node<T>
	{
		Node next;
		T data;
	}
	
	//Node head has been declared.
	public Node head=null;
	
	//Enqueue operation in linked list has been declared.
	public void enqueue(T data)
	{
		//Initializing new node object which is to be inserted.
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null)
			head=newNode;
		else
		{
			//Traversing through the linked list.
			Node tempNode=head;
			while(tempNode.next!=null)
			{
				tempNode=tempNode.next;
			}
			//Adding new node with its data.
			tempNode.next=newNode;
		}
		
	}
	
	//Method to Display the linked list data.
	public void print()
	{
		Node tempNode=head;
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
	}
}
