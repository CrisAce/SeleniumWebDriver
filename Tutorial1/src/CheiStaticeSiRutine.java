class Thing {

	public final static int LUCKY_NUMBER = 6;// static variable witch can be
											// assigned once
	public  static int count = 0;

	public String name;// intance variables
	public static String description;// static variable or class variables

	public void showName() {
		System.out.println("Object id: " + id +", " + description +": "+name);
	}

	public static void showInfo() {
		System.out.println(description);

	}
	public int id;
	
	public Thing(){
		
		id = count;
		
		count++;
		}
	

}

public class CheiStaticeSiRutine {

	public static void main(String[] args) {

		Thing.description = "I am a thing";
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		
		
		Thing.showInfo();
		// System.out.println(Thing.description);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
	
		
		System.out.println("Before creating objects, count is: " + Thing.count);

		thing1.name = "Ion";
		thing2.name = "Gheorghe";

		// System.out.println(thing1.name);
		// System.out.println(thing2.name);
		thing1.showName();
		thing2.showName();

		//System.out.println(Math.PI);
		// Math.PI = 3;
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
