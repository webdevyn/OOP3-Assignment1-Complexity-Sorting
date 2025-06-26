package appDomain;

import shapes.ThreeDShape;
import utilities.Methods;
import utilities.SortingMethods.BubbleSort;

import java.util.Collections;

import static utilities.Methods.*;


public class AppDriver
{

	public static void main( String[] args )
	{
		String pathName = "res/shapes1.txt";
		//ensure to add parameter of file path to readfile method
		ReadFile(pathName);
		System.out.println("Before Sorting");

		PrintShapes(shapesArray);

		System.out.println("After Sorting");
		SortByBaseArea(shapesArray);

		//CompareByBaseArea(shapesArray);

		//CompareByVolume(shapesArray);

		PrintShapes(shapesArray);


	}

}
