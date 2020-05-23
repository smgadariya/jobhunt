package practice.linkedlist;
public class RotateLinkedList {

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);

		Node n = n1;
		while(null !=n ) {
			System.out.print(n.getValue() + "->");
			n=n.getNext();
		}
		n = new RotateLinkedList().reverseLinkList(n1, 2);
		System.out.println("\nNew List: ");
		while(n != null) {
			System.out.print(n.getValue() +"->");
			n=n.getNext();
		}

 	}

	private Node reverseLinkList(Node head,int k) {

		int count = 0;
		Node start = head;
		//traverse till the end of the list and keep incrementing
		//count
		while (head.getNext() != null) {
			head = head.getNext();
			count++;
		}
		count++;
		// if k > count, do k%count, its an optimization. 2%5 == 12%5
		k = k % count;
		//find the new k
		k = Math.abs(count - k);
		if (k == 0)
			return start;
		//connect last element to start	
		head.setNext(start);
		//traverse for new k value		
		while (k-- > 0) {
			head = head.getNext();
		}
		// note: head is not the last element, so set the start.
		start = head.getNext();
		head.setNext(null);
		return start;
	}

}

class Node{

	private int value;
	private Node next;
	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}


}
