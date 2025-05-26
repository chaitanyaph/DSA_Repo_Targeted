package com.linkedlist;

class Node {
	
	int data;
	Node next;
	
	Node(int data){
		
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	
	public static Node converArrToLinkedList(int[] arr) {
		
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i = 1; i<arr.length; i++) {
			
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	public static void IterateLL(Node head) {
		
		Node temp = head;
		
		while(temp != null) {
			
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public static int findLengthLL(Node head) {
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		Node converArrToLinkedList = converArrToLinkedList(arr);
		
		IterateLL(converArrToLinkedList);
		System.out.println();
		
		int findLengthLL = findLengthLL(converArrToLinkedList);
		
		System.out.println("The Length of LinkedList is : "+findLengthLL);
		
	}

}
