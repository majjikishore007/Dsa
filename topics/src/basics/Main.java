package basics;

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
		Dog jack=new Dog("jack","black");
		//jack.name="jack";
		System.out.println(jack.name);
	
	}
}
