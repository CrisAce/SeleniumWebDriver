
public class MCs {
	
	String name;
	String location;
	int age;
	

	public static void main(String[] args) {
		
		MCs estCost = new MCs();
		
		estCost.name = "Rakim";
		estCost.location = "Brooklyn";
		estCost.age = 48;
		
		MCs westCost = new MCs();
		
		westCost.name = "2Pac";
		westCost.location = "Los Angeles";
		westCost.age = 42;
		
		
		System.out.println(westCost.name);
		System.out.println(westCost.location);
		
		
	}

}
