class Robot {
	public void sayHello(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Sam is jumping:" + distance + " meteres heading " + direction);

	}

}

public class Functii {

	public static void main(String[] args) {

		Robot sam = new Robot();
		sam.sayHello("Hello");
		sam.jump(8);
		sam.move("Tineretului", 14.00);

		String salut = "Salut eu sunt SAM! :)";

		sam.sayHello(salut);
	}

}
