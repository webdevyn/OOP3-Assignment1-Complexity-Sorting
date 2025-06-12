package utilities;

import shapes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Methods {

    //array to store lines from file (need it accessible outside the ReadFile method)
    public static ThreeDShape[] shapesArray = null;

    //ReadFile and store in array
    public static void ReadFile(String pathName) {
        Scanner fileScanner = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathName));

            //read first line of txt file to get array size
            int arraySize = Integer.parseInt(reader.readLine()); //reads first line of txt file

            //create array to store shapes from txt file
            shapesArray = new ThreeDShape[arraySize];

            //instantiate variable to be used to store each line from txt file
            String line;

            //create index variable to use to iteratively increase to store shapes in array indexes
            int index = 0;

            //while loop adds rest of lines from txt file to array
            while ((line = reader.readLine()) != null && index < shapesArray.length) {
                String[] shapeInfo = line.split(" ");

                //CreateShape(shapeInfo);

                shapesArray[index] = CreateShape(shapeInfo);
                index++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Create the shape objects
    public static ThreeDShape CreateShape(String[] shapeInfo) {
        String baseType = shapeInfo[0];
        double height = Double.parseDouble(shapeInfo[1]);

        return switch (baseType) {
            case "Cone" -> {
                double radius = Double.parseDouble(shapeInfo[2]);
                yield new Cone(baseType, height, radius);
            }
            case "Cylinder" -> {
                double radius = Double.parseDouble(shapeInfo[2]);
                yield new Cylinder(baseType, height, radius);
            }
            case "Pyramid" -> {
                double edgeLength = Double.parseDouble(shapeInfo[2]);
                yield new Pyramid(baseType, height, edgeLength);
            }
            case "OctagonalPrism" -> {
                double edgeLength = Double.parseDouble(shapeInfo[2]);
                yield new OctagonalPrism(baseType, height, edgeLength);
            }
            case "PentagonalPrism" -> {
                double edgeLength = Double.parseDouble(shapeInfo[2]);
                yield new PentagonalPrism(baseType, height, edgeLength);
            }
            case "SquarePrism" -> {
                double edgeLength = Double.parseDouble(shapeInfo[2]);
                yield new SquarePrism(baseType, height, edgeLength);
            }
            case "TriangularPrism" -> {
                double edgeLength = Double.parseDouble(shapeInfo[2]);
                yield new  TriangularPrism(baseType, height, edgeLength);
            }
            //exception catch
            default -> throw new IllegalStateException("Unexpected value: " + baseType);
        };
    }

    //Sort by height
    public static void SortByHeight(ThreeDShape[] shapesArray) {
        Arrays.sort(shapesArray);
    }

    //sort by base area
    public static void SortByBaseArea(ThreeDShape[] shapesArray) {
        Arrays.sort(shapesArray, ThreeDShape.BaseAreaComparator);
    }

    //sort by volume
    public static void SortByVolume(ThreeDShape[] shapesArray) {
        Arrays.sort(shapesArray, ThreeDShape.VolumeComparator);
    }

}


