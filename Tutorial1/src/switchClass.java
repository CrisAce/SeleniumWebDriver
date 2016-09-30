import java.util.Scanner;

public class switchClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a commmand:");
		
		
		String value = input.nextLine();
		
		switch(value){
		case "start":
			System.out.println("The application will start");
			break;
			
		case "stop":
			System.out.println("The application will stop");
			break;
			
		default:
			System.out.println("Command not recognized");
		}

	}

}
