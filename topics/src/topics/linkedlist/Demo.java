package topics.linkedlist;

/**
 * Node contains data next pointer
 */
class Node {
	int data;
	Node next;

	// constructure of node
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

class LinkedList {
	Node head;

	/**
	 * adding a new node to the list
	 */
	public void add(int data) {
		Node new_node = new Node(data);

		if (head == null) {

			head = new_node;
			head.next = null;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}

	public void add(int data, int index) {
		Node new_node = new Node(data);
		Node temp = head;
		if (index == 0) {
			new_node.next = head;
			head = new_node;
		} else {
			while ((index - 1) != 0) {
				temp = temp.next;
				index--;
			}
			new_node.next = temp.next;
			temp.next = new_node;
		}
	}

	public void remove(int data) {
		Node temp = head;
		if (temp.data == data) {
			head = head.next;
			return;
		}
		while (temp.next != null) {
			if (temp.next.data == data) {
				break;
			}
			temp = temp.next;
		}
		if (temp.next.next != null) {
			temp.next = temp.next.next;
		} else {
			temp.next = null;
		}
	}

	public void removeNthFromLast(int i) {

		// length
		int len = 0;

		Node temp = head;

		while (temp != null) {
			len++;
			temp = temp.next;
		}

		int delI = (len - i) - 1;
		Node temp1 = head;
		if (delI == -1) {
			head = head.next;
			return;
		}
		while (delI > 0) {
			temp1 = temp1.next;
			delI--;
		}
		if (temp1.next.next == null) {
			temp1.next = null;
		} else {
			temp1.next = temp1.next.next;
		}

	}

	public void print() {
		Node temp = head;

		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.print("]");
	}

	public void oddAndEven() {

		Node oddhead = null, evenhead = null;
		Node oddend = null, evenend = null;
		Node temp = head;

		while (temp != null) {
			// odd
			int value = temp.data;
			if (value % 2 != 0) {
				if (oddhead == null) {
					oddhead = temp;
					oddend = oddhead;
				} else {
					oddend.next = temp;
					System.out.println("temp " + temp.data);
					oddend = oddend.next;
				}

			}
			if (value % 2 == 0) {
				if (evenhead == null) {
					evenhead = temp;
					evenend = evenhead;
				} else {
					evenend.next = temp;
					evenend = evenend.next;
				}
			}

			temp = temp.next;
		}

		if (evenhead == null || oddhead == null) {
			return;
		}
		evenend.next = oddhead;
		oddend.next = null;
		head = evenhead;

	}
}

public class Demo {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.print();
//		list.remove(18);
//		list.remove(7);
//		list.removeNthFromLast(4);
//		list.removeNthFromLast(1);
		list.oddAndEven();
		list.print();
	}
}
