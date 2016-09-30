import java.util.ArrayList;

import javax.xml.stream.events.StartDocument;

class Machine{

	@Override
	public String toString() {
		return "I'm a machine";
	}
	
	public 	void start(){
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	
	@Override
	public String toString() {
		return "I'm a camera prostu matii";
	}
	
}

public class App {

	public static void main(String[] args) {

	ArrayList<Machine> list1 = new ArrayList<>();
	list1.add(new Machine());
	list1.add(new Machine());
	
	ArrayList<Camera> list2 = new ArrayList<>();
	list2.add(new Camera());
	list2.add(new Camera());
	
	showList(list1);
	showList(list2);
	
	
	}
	
	public static void showList(ArrayList<? extends Machine> list){
		for(Machine x : list){
			System.out.println(x);
			x.start();
		}
	}

}
