package com.linkedlist;

import java.util.Stack;

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
		
		if(head == null) {
			return null;
		}
		
		if(position == 1) {
			
			head = head.next;
			return head;
		}
		
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
	
	public static Node deleteByValue(Node head, int value) {
		
		if(head.data == value) {
			
			head = head.next;
			return head;
		}
		
		Node temp = head;
		Node prev = null;
		
		while(temp != null) {
			
			if(temp.data == value) {
				
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	
	public static Node insertAtHead(Node head, int value) {
		
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		return head;
	}
	
	public static Node insertAtTail(Node head, int value) {
		
		if(head == null || head.next == null) {
			
			return null;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			
			temp = temp.next;
		}
		Node newnode = new Node(value);
		temp.next = newnode;
		return head;
	}
	
	public static Node additionTwoLL(Node head1, Node head2) {
		
		Node temp1 = head1;
		Node temp2 = head2;
		Node dummy = new Node(-1);
		Node curr =  dummy;
		int carry = 0;
		
		while(temp1 != null || temp2 != null) {
			
			int sum = carry;
			sum = sum + temp1.data;
			sum = sum + temp2.data;
			
			Node newnode = new Node(sum % 10);
			carry = sum / 10;
			
			curr.next = newnode;
			curr = curr.next;
			
			if(temp1 != null) {
				temp1 = temp1.next;
			}
			
			if(temp2 != null) {
				
				temp2 = temp2.next;
			}
			
			if(carry > 0) {
				
				Node newnode1 = new Node(carry);
				curr.next = newnode1;
			}
		}
		return dummy.next;
	}
	
	public static Node segrregateOddEven(Node head) {
		
		if(head == null || head.next == null) return null;
		
		Node odd = head;
		Node even = head.next;
		Node evenHead = head.next;
		
		while(even != null && even.next != null) {
			
			odd.next = odd.next.next;
			even.next = even.next.next;
			
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
	
	public static Node segggragrate012(Node head) {
		
		if(head == null) return null;
		
		Node temp = head;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		while(temp != null) {
			
			if(temp.data == 0) {
				
				count0++;
			}
			else if(temp.data == 1) {
				
				count1++;
			}
			else {
				
				count2++;
			}
			
			temp = temp.next;
		}
		
		temp = head;
		while(temp != null) {
			
			if(count0 >  0) {
				
				temp.data = 0;
				count0--;
			}
			else if(count1 > 1) {
				
				temp.data =1;
				count1 --;
			}
			else if(count2 > 0) {
				
				temp.data = 2;
				count2--;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static Node removeFromEnd(Node head, int position) {
		
		if(head == null) return null;
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			
			count++;
			temp = temp.next;
		}
		
		temp = head;
		int result = count - position;
		
		if(result == 0) {
			head = head.next;
			return head;
		}
		while(temp != null) {
			
			result--;
			if(result == 0) {
				break;
			}
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		return head;
	}
	
	public static Node reverseLL(Node head) {
		
		Node temp = head;
		Stack<Integer> stack = new Stack<>();
		
		while(temp != null) {
			
			stack.push(temp.data);
			temp = temp.next;
		}
		
		temp = head;
		
		while(temp != null) {
			
			temp.data = stack.peek();
			stack.pop();
			temp = temp.next;
		}
		return head;
	}
	
	public static Node reverseLinked(Node head) {
		
		Node temp = head;
		Node prev = null;
		
		
		while(temp != null) {
			
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
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
		
//		int pos = 1;
//		Node deleteByPosition = deleteByPosition(converArrToLinkedList, pos);
//		IterateLL(deleteByPosition);
		
//		Node deleteByValue = deleteByValue(converArrToLinkedList, 5);
//		IterateLL(deleteByValue);
		
//		int value = 0;
//		Node insertAtHead = insertAtHead(converArrToLinkedList, value);
//		IterateLL(insertAtHead);
		
//		int value = 6;
//		Node insertAtTail = insertAtTail(converArrToLinkedList, value);
//		IterateLL(insertAtTail);
		
//		int[] crr = {2,4,6};
//		int[] brr = {3,8,7};
//		
//		Node converArrToLinkedList2 = converArrToLinkedList(crr);
//		Node converArrToLinkedList3 = converArrToLinkedList(brr);
//		
//		IterateLL(converArrToLinkedList2);
//		System.out.println();
//		IterateLL(converArrToLinkedList3);
//		System.out.println();
//		
//		Node additionTwoLL = additionTwoLL(converArrToLinkedList2, converArrToLinkedList3);
//		IterateLL(additionTwoLL);
		
//		int[] brr = {1,2,3,4,5,6};
//		Node converArrToLinkedList2 = converArrToLinkedList(brr);
//		
//		Node segrregateOddEven = segrregateOddEven(converArrToLinkedList2);
//		IterateLL(segrregateOddEven);
		
//		int[] brr = {1,0,1,0,2,0,2,1,0,2};
//		Node converArrToLinkedList2 = converArrToLinkedList(brr);
//		Node segggragrate012 = segggragrate012(converArrToLinkedList2);
//		IterateLL(segggragrate012);
		
//		int[] brr = {1,2,3,4,5,6};
//		Node converArrToLinkedList2 = converArrToLinkedList(brr);
//		Node removeFromEnd = removeFromEnd(converArrToLinkedList2, 6);
//		IterateLL(removeFromEnd);
		
//		Node reverseLL = reverseLL(converArrToLinkedList);
//		IterateLL(reverseLL);
		
		Node reverseLinked = reverseLinked(converArrToLinkedList);
		IterateLL(reverseLinked);
	}

}
