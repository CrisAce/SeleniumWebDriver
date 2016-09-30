class Machine {
	private String name;
	private int age;

	public Machine() {

		// System.out.println("This is the first machine");
		this("Arnie", 7);
	}

	public Machine(String name) {
		this(name,0);
		this.name = name;
		System.out.println("This is the second constructor and machine name is: " + name);
	}

	public Machine(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("This is the 3rd constructor and machine name is :" + name + " and has an age of " + age);
	}

}

public class Constructori {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Arnie");
		Machine machine3 = new Machine("T100", 7);
	}

}
