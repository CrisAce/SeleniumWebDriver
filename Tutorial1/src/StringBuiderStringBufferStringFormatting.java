
public class StringBuiderStringBufferStringFormatting {

	public static void main(String[] args) {

		String info = "";

		info += "My name is Cristi";
		info += " ";
		info += "I'm a tester.";

		System.out.println(info);

		StringBuilder sb = new StringBuilder();

		sb.append("My name is Cristi");
		sb.append("And I'm 30 years old");

		sb.append("I like to learn Java");

		System.out.println(sb.toString());
		
		StringBuilder  c = new StringBuilder();

		c.append("I think I ll use my Java learings at work").append(" But depends on my will to carry on")
		.append(" We will see");
		
		System.out.println(c.toString());
		////Formatting//////////////////////////////////////////
		System.out.printf("This is a format of a integer %d\n", 5);
		System.out.print("This is a text.\tThis was a tab.\nThis was a new line");
		
		for (int i = 0;i<20;i++){
			System.out.printf("%2d: %s\n",i,"uite text");
		}
		
		System.out.printf("Total value: %6.1f",33434.2345);
		
	}

}
