class Person{
	String name;
	int age;
	
	void sayHello(){
		System.out.println("Hello All!");
	}
	
	int getAge(){
		System.out.println("My age is : ");
		return age;
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.sayHello();
		person1.getAge();
		
	}

}
