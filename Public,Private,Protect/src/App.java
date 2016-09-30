import word.Plant;

/*
 * private -- only within same class
 * public -- access from anywhere
 * protected -- same class, subclass, and same package	
 * no modifier -- same package	only
 * */

public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		//Will not work , type is declared private
		//System.out.println(plant.type);
		
		//Won't work , size is protected and Plant class is in another package
		//System.out.println(plant.size);
		
		System.out.println(plant.name);
		
		
 
	}

}
