class Frog{
	private String name;
	int age;
	
	public void sayName(String name){
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;	
	}
	public int getAge(){
		return age;
	}
}


public class Functii2 {

	public static void main(String[] args) {
		
		
		Frog frog1 = new Frog();
		
		frog1.sayName("Pulicica!");
		
		System.out.println(frog1.getName());
		
		frog1.setAge(12);
		
		int var1 ;
		var1 = frog1.getAge();
		
		System.out.println(var1);
		
		
		
		
	
	}

}
