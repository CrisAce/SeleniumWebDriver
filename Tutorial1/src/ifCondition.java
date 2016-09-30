import java.util.Scanner;

public class ifCondition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your pick: ");
		String player = input.nextLine();
		System.out.println("You chosen player:" + player);	
		
		String s = "Curry";
		
		String c = "Thomson";
		int x = 0;
		
		while(x<5){
			System.out.println("You have " + (5-x) + " tries, don't mess up!");
		
			System.out.println("Let's see..");
			
		if(player.equals(s)){
			System.out.println("Yes! you should put Curry back in.");
			break;
		}
		
		else if(player.equals(c)) {
			System.out.println("I was thinking about Curry, but Kley is also an option");
		}
		else{
			System.out.println("Think about that, who is the right player to win the game?");
		}
		System.out.println("Keep try..");
		x++;
		}
		
		
	}

}
