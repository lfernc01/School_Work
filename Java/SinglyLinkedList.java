//Functions for Singly Linked List assuming the following structure
// public class Node{
//	public int element;
//	public Node next;
// }

public class SinglyLinkedList {
	public Node head = null;
		
	public static int length(SinglyLinkedList list) {
		int index = 0;
		Node current = list.head;
		while(current != null) {
			index++;
			current = current.next;
		}
		return index;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		 int l = length(list);
		 System.out.println(""+l);
	}
	
	public static void add(SinglyLinkedList list, int element) { //what does it mean by cannot be resolved to a type
		int index = 0;
		Node node = new Node();
		node.element = element;
		Node current = list.head;
		while(current.next != null) {
			index++;
			current = current.next;
		}
		current.next = node;
		list.length++;
	}

}
