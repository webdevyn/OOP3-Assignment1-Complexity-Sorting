package utilities.SortingMethods;

import shapes.ThreeDShape;

public class BubbleSort {

    public static void SortHeight(ThreeDShape[] shapesArray) {
        //Start the timer to measure how long it took for sorting to complete
        long startTime = System.currentTimeMillis();

        //Sorting Method
        //variable check if something in shapesArray was swapped
        boolean swappedSomething = true; //set to true to get into the while loop initially
        //THIS LOGIC TO SEE IF WE NEED TO SORT SHOULD HAPPEN SOMEWEHERE ELSE?
        //VARIABLE TO STORE shapesArray[i].compareTo(shapesArray[i + 1]) > 0 ????
        while (swappedSomething) {
            swappedSomething = false; //set to false to get out of while loop if nothing is swapped
            for (int i = 0; i < shapesArray.length - 1; i++) {
                //implement the compareTo() method from ThreeDShape class to compare shape heights
                /*
                REMEMBER
                if shape1 > shape2 -> positive number
                if shape1 < shape2 -> negative number
                if shape 1 = shape2 -> 0
                 */
                if (shapesArray[i].compareTo(shapesArray[i + 1]) > 0) { //checking to see if compareTo() returns a positive number
                    swappedSomething = true; //something needs to be swapped

                    ThreeDShape temp = shapesArray[i];
                    shapesArray[i] = shapesArray[i + 1];
                    shapesArray[i + 1] = temp;
                }
            }
        }

        //Stop timer
        long endTime = System.currentTimeMillis();
        long sortingTime = endTime - startTime;

        if (sortingTime <= 0) {
            System.out.println("Bubble Sort run time was: <" + sortingTime + " ms");
        }
        else {
            System.out.println("Bubble Sort run time was: " + sortingTime + " ms");
        }
    }

    public static void SortBaseArea(ThreeDShape[] shapesArray) {
        //start timer
        long startTime = System.currentTimeMillis();

        boolean swappedSomething = true;
        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < shapesArray.length - 1; i++) {
                if (ThreeDShape.BaseAreaComparator.compare(shapesArray[i], shapesArray[i + 1]) > 0) {
                    swappedSomething = true;
                    ThreeDShape temp = shapesArray[i];
                    shapesArray[i] = shapesArray[i + 1];
                    shapesArray[i + 1] = temp;
                }
            }
        }

        //Stop timer
        long endTime = System.currentTimeMillis();
        long sortingTime = endTime - startTime;

        if (sortingTime <= 0) {
            System.out.println("Bubble Sort run time was: <" + sortingTime + " ms");
        }
        else {
            System.out.println("Bubble Sort run time was: " + sortingTime + " ms");
        }
    }

    public static void SortVolume(ThreeDShape[] shapesArray) {
        long startTime = System.currentTimeMillis();
        boolean swappedSomething = true;
        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < shapesArray.length - 1; i++) {
                if (ThreeDShape.VolumeComparator.compare(shapesArray[i], shapesArray[i + 1]) > 0) {
                    swappedSomething = true;
                    ThreeDShape temp = shapesArray[i];
                    shapesArray[i] = shapesArray[i + 1];
                    shapesArray[i + 1] = temp;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long sortingTime = endTime - startTime;
        if (sortingTime <= 0) {
            System.out.println("Bubble Sort run time was: <" + sortingTime + " ms");
        }
        else {
            System.out.println("Bubble Sort run time was: " + sortingTime + " ms");
        }
    }
}
