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
	
	public static boolean searchElement(Node head, int key) {
		
		Node temp = head;
		
		while(temp != null) {
			
			if(temp.data == key) {
				
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static Node deleteHead(Node head) {
		
		Node temp = head;
		head  = head.next;
		return head;
	}
	
	public static Node deleteTail(Node head) {
		
		Node temp = head;
		
		while(temp.next.next != null) {
			
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	public static Node deleteByPosition(Node head, int position) {
		
		Node temp = head;
		Node previous = null;
		int count = 0;
		
		while(temp != null) {
			
			count++;
			
			if(count == position) {
				
				previous.next = previous.next.next;
				break;
			}
			previous =  temp;
			temp = temp.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		Node converArrToLinkedList = converArrToLinkedList(arr);
		
		IterateLL(converArrToLinkedList);
		System.out.println();
		
//		int findLengthLL = findLengthLL(converArrToLinkedList);
//		
//		System.out.println("The Length of LinkedList is : "+findLengthLL);
//		
//		boolean searchElement = searchElement(converArrToLinkedList,4);
//		
//		if(searchElement) {
//			System.out.println("The Element is Prsent.....");
//		}
		
//		Node deleteHead = deleteHead(converArrToLinkedList);
//		IterateLL(deleteHead);
//		System.out.println();
//		
//		Node deleteTail = deleteTail(converArrToLinkedList);
//		IterateLL(deleteTail);
		
		int pos = 3;
		Node deleteByPosition = deleteByPosition(converArrToLinkedList, pos);
		IterateLL(deleteByPosition);
		
	}

}
