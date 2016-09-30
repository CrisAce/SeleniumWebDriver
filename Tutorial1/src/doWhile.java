import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int value = scanner.nextInt();
		
		while (value != 5){
			System.out.println("Enter a new number again");
			value = scanner.nextInt();
		}
		
		System.out.println("Got 5!");
		

	}
}	
