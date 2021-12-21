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
		this.next=null;
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

			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	public void add(int data,int index){
		Node new_node=new Node(data);
		Node temp=head;
		if(index==0){
			new_node.next=head;
			head=new_node;
		}
		else {
			while((index-1) !=0){
				temp=temp.next;
				index--;
			}
			new_node.next=temp.next;
			temp.next=new_node;
		}
	}
	public void remove(int data){
		Node temp=head;
		if(temp.data==data){
			head=head.next;
			return;
		}
		while(temp.next!=null ){
				if(temp.next.data==data){
					break;
				}
				temp=temp.next;
		}
		if(temp.next.next!=null){
			temp.next=temp.next.next;
		}
		else {
			temp.next=null;
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

		LinkedList list=new LinkedList();

		list.add(18);
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(7);

		list.remove(18);
		list.remove(7);
		list.print();
	}
}
