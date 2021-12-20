import java.util.*;
/**
	Node 
	contains 
		data 
		next pointer
 */
class Node{
	int data;
	Node next;

	//constructure of node 
	public Node(int data){
		this.data=data;	
	}

}
class LinkedList{
	Node head;
	/**
		adding a new node to the list
	 */
	public void add(int data){
		
		Node new_node=new Node(data);

		if(head==null){

			head=new_node;
			head.next=null;
		}
		else {
			Node temp=head;
			System.out.println("not null"+temp.data);
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
			new_node.next=null;
		}
	}
	public void add(int data,int index){
		Node new_node=new Node(data);
		Node temp=head;
		for(int i=0;i<index && temp.next!=null;i++){
			temp=temp.next;
			
		}
		if(temp.next ==null){

			temp.next = new_node;
			new_node.next =null;
		}
		else{
			temp.next = new_node;
			new_node.next = temp.next.next;
		}
	}	
	public void print(){
		Node temp=head;

		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
public class Demo{
	public static void main(String[] args) {
		System.out.println("Starting ......");
		LinkedList list=new LinkedList();

		list.add(5);
		list.add(3);
		list.add(8);
		list.add(7,1);

		list.print();
	}
}