package topics.linkedlist;

/**
 * Node contains data next pointer
 */
class Node {
	int data;
	Node next;
	Node random;

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

	public void print(Node head) {
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

	public Node reverse() {
		Node prev = null, curr, fut;
		curr = head;
		while (curr.next != null) {
			fut = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fut;
		}
		curr.next = prev;
		head = curr;

		return head;

	}

	public Node reverse(Node start, Node end) {
		Node prev = null, curr, fut;
		curr = head;
		while (curr.next != end) {
			fut = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fut;
		}
		curr.next = prev;
		head = curr;

		return head;

	}

	public Node reverse_kNodes(int k) {

		if (k == 0 || k == 1) {
			return head;
		}
		Node curr = head;
		while (curr != null) {
			if (has_kth_node(curr, k)) {

				Node kth_node = get_kth_Node(curr, k);
				// reverse

				reverse(curr, kth_node);
				// final head kth_node ,curr tail
				curr.next = kth_node.next;

			} else
				curr = curr.next;
		}
		return head;

	}

	public boolean has_kth_node(Node curr, int k) {
		if (curr.next == null) {
			return false;
		}
		while (k > 0) {
			curr = curr.next;
			k--;
		}
		if (curr != null) {
			return true;
		}
		return false;
	}

	public Node get_kth_Node(Node curr, int k) {

		while (k > 0) {
			curr = curr.next;
			k--;
		}
		return curr;

	}

	public Node clonList() {
		Node new_nodeh = new Node(head.data);
		Node temp = head.next;
		Node new_nodet;
		new_nodet = new_nodeh;

		while (temp != null) {
			Node add = new Node(temp.data);
			new_nodet.next = add;
			new_nodet = new_nodet.next;
			temp = temp.next;
		}

		Node temp1 = head;
		Node new_temp = new_nodeh;
		while (temp1 != null) {
			Node ran = temp1.random;

			new_temp.random = ran;
			temp1 = temp1.next;
		}

		return new_nodeh;
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
		LinkedList list1 = new LinkedList();
		
		list1.add(4);
		list1.add(8);
		list1.add(12);
		list1.add(22);
		list1.add(25);
		list1.add(30);
		list1.print();

		Node head=Exaples.sortTWoList(list.head,list1.head);
		list.print(head);
		
//		list.print();
//		list.remove(18);
//		list.remove(7);
//		list.removeNthFromLast(4);
//		list.removeNthFromLast(1);
//		list.oddAndEven();
//		list.print();
//		list.print();
////		Node head_new = list.reverse();
//		Node head = list.reverse_kNodes(2);
//		list.print(head);

	}
}
