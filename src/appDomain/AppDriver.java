package appDomain;

import shapes.ThreeDShape;
import utilities.Methods;

import java.util.Collections;

import static utilities.Methods.*;


public class AppDriver
{

	public static void main( String[] args )
	{
		String pathName = "res/shapes1.txt";
		//ensure to add parameter of file path to readfile method
		ReadFile(pathName);

		SortByHeight(shapesArray);

		//print out each array item
		for (ThreeDShape shape : shapesArray) {
			System.out.println(shape);
		}

	}

}
