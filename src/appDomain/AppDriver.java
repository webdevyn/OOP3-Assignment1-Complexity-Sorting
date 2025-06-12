package appDomain;

import utilities.Methods;

import java.util.Collections;

import static utilities.Methods.ReadFile;
import static utilities.Methods.shapesArray;
import static utilities.Methods.CreateShape;


public class AppDriver
{

	public static void main( String[] args )
	{
		String pathName = "res/shapes1.txt";
		//ensure to add parameter of file path to readfile method
		ReadFile(pathName);

		System.out.println(shapesArray[0]);

	}

}
