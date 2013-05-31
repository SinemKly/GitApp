import java.io.File;
import java.util.Scanner;

import enigma.core.Enigma;


public class City {
	private Car[] cars;
	private Usercar userc;
	private Tanker [] tankers;
	private Fuel_station station;
	private String [][] map;
	
	
	static Scanner input;
	public City()
	{
		
	}
	
	public void setMap(String[][] map) {
		this.map = map;
	
	}

	public String[][] getMap() {
		DrawScreen();
		return map;
		
	}

	public void DrawScreen(){
		
		try {
			input = new Scanner(new File( "D://citysim.txt" ) );	
			final enigma.console.Console cn = Enigma.getConsole("Java");
		} catch ( Exception e ) {
			e.printStackTrace();
		}
				
		//String line = input.nextLine();
		
		map = new String[24][57];

		int counter=0;
		do
		{
			String line = input.nextLine();
			//System.out.println(line);
			//System.out.println( line.length());
			for(int i=0; i<line.length() ; i++){
				//System.out.print(line.substring(i, i+1));
				map[counter][i]=line.substring(i,i+1);	
				//System.out.println(map[counter][i]);
			}
			//System.out.println("");
			counter++;
		}
		while(input.hasNext());
		
	for(int i=0; i<24; i++)
		{
		for(int j=0 ; j<57 ; j++)
		
		{
			System.out.print(map[i][j]); 
			
			
		}
		System.out.println("");
		}
		
		
		
		
	}
}
