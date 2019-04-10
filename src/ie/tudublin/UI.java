package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		loadResistors();
		printColours();
	}
	
	public void draw()
	{
		int x1 = 150;
		int y1 = 50;
		int x2 = 200;
		int y2 = 100;
		
		

		
		for(int i = 0; i<=4;i++)
		{
			rect(x1,y1,x2,y2);
		}
	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row: table.rows())
		{
			Colour colour = new Colour(row);
			colours.add(colour);
		}

	}

	public void loadResistors()
	{
		/*
		Table table = loadTable("resistors.csv", "header");
		for(TableRow row: table.rows())
		{
			Resistor resistor = new Resistor(row);
			resistor.add(resistor);
		}
		*/
	}

	public void printColours()
	{
		for(Colour colour: colours)
		{
			System.out.println(colour);
		}
	}
	
	/*
	public Colour findColour(int value)
	{
		
		System.out.println(value.ArrayList<Colour>colours); 

	}
	*/
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();
}

