import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = "/Users/cristianion/Documents/text.rtf";
		
		File textfile = new File(filename);
		
		Scanner in = new Scanner(textfile);
		
		int val=in.nextInt();
		
		System.out.println("Read value:" + val);
		
		while (in.hasNextLine()){
			String line = in.nextLine();
			
			System.out.println(line);
		
		}
		in.close();
		
		
		
		
		
	}

}
