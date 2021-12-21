package topics.linkedlist;

class Stack {
	Node head;

	public void push(int data) {
		Node new_node = new Node(data);
		Node temp = head;

		if (head == null) {
			head = new_node;
		} else {
			new_node.next = head;
			head = new_node;
		}

	}

	public void pop() {
		head=head.next;
	}
	public void print() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class Questions {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
//		stack.print();
		stack.pop();
		stack.print();
	}
}
