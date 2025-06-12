package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Methods {

    //array to store lines from file
    public static String[] shapesArray = null;

    //ReadFile and store in array
    public static void ReadFile(String pathName) {
        Scanner fileScanner = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathName));

            //read first line of txt file to get array size
            int arraySize = Integer.parseInt(reader.readLine()); //reads first line of txt file

            //create array to store shapes from txt file
            shapesArray = new String[arraySize];

            //instantiate variable to be used to store each line from txt file
            String line;

            //create index variable to use to iteratively increase to store shapes in array indexes
            int index = 0;

            //while loop adds rest of lines from txt file to array
            while ((line = reader.readLine()) != null && index < shapesArray.length) {
                shapesArray[index] = line;
                index++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //print out each array item
        for (String shape : shapesArray) {
            System.out.println(shape);
        }

    }


}


