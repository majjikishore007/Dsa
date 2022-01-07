package basics;

import java.util.LinkedList;

class Dog {
	String color;
	String name;
	//constructure
	public Dog(String name,String color) {
		this.name=name;
		this.color=color;
	}

}

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(1);
		list.add(2);
		System.out.print(list);
		
		Dog jack=new Dog("jack","black");
		//jack.name="jack";
		System.out.println(jack.name);
	
	}
}
