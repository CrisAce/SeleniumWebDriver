
class Machine{
	public void start(){
		System.out.println("Machine start!");
	}
}	
class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Camera start!");
	}
	public void span(){
		System.out.println("Photo taken!");
	}
	
}	

public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.span();
		
		//Upcasting
		Machine machine2 = camera1;
		machine2.start();
		// machine2.snap();
		
		//Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.span();
		
		//dosen t work, runtime error
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		//camera3.start();
		//camera3.span();
		
		
		
		
	}

}
