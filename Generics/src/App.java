import java.util.ArrayList;
import java.util.HashMap;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class App {

	public static void main(String[] args) {
		
		/////before java 5//////////////
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Peach");
		
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		/////Modern Style///////////////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Dog");
		strings.add("Cat");
		strings.add("mice");
		
		String animal = strings.get(0);
		
		System.out.println(animal);
		
		//////more than one type argument////
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		
		
		
	}

}
