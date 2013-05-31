import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Try {

	static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			input = new Scanner(new File( "input.txt" ) );			
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		
		
		/*for( int j = 0; j < 8; j++ ) {
			String line = input.nextLine();
			System.out.println(line);
		}// end for 
*/	
		
		String line = input.nextLine();
		do
		{
			System.out.println(line);
			line = input.nextLine();
		}
		while(input.hasNext());
		
	}

}
