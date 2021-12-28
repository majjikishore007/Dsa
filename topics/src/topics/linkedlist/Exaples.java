package topics.linkedlist;

public class Exaples {
	public static Node sortTWoList(Node h1, Node h2) {
		if(h1==null) {
			return h2;
		}
		if(h2==null) {
			return h1;
		}
		Node new_node=null;
		
		if(h1.data<h2.data) {
			Node temp1=new Node(h1.data);
			new_node=temp1;
		}else {
			Node temp1=new Node(h2.data);
			new_node=temp1;
		}	
		Node temp=new_node;
		
		while(h1!=null && h2!=null) {
			if(h1.data<h2.data) {
				Node temp1=new Node(h1.data);
				temp.next=temp1;
				temp=temp.next;
				h1=h1.next;
			}else {
				Node temp1=new Node(h2.data);
				temp.next=temp1;
				temp=temp.next;
				h2=h2.next;
			}	
		}
		if(h1==null) {
			temp.next=h2;
		}
		else {
			temp.next=h1;
		}
	return  new_node.next;
	}
}
