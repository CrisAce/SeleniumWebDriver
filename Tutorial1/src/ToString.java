class Broasca {

	private String name;
	private int id;

	public Broasca(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String tooString() {

		/*StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		
		////Format String///////////
		return String.format("%4d: %s", id,name);
	}

}

public class ToString {

	public static void main(String[] args) {

		Broasca frog1 = new Broasca(7, "Robby");
		Broasca frog2 = new Broasca(8, "Mutzi");

		System.out.println(frog1.tooString());
		System.out.println(frog2.tooString());

	}

}
