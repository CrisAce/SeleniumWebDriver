
public class Car extends Machine {
	
	
	//overriding machine's stop() method of class Machine
	@Override
	public void stop() {
		System.out.println("Car started");
	}
	//declaring a void method wipeWindShields()
	public void wipeWindShields(){
		System.out.println("Wiping windshield");
		}
	//declaring a void method showInfo()
	public void showInfo(){
		System.out.println("Car type is: " + name);
	}
	

}
