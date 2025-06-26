package utilities.SortingMethods;

import shapes.ThreeDShape;

import java.util.Random;


public class QuickSort {
    //Sort Height
    public static void SortHeight(ThreeDShape[] shapesArray) {
        SortHeight(shapesArray, 0, shapesArray.length - 1);
    }
    public static void SortHeight(ThreeDShape[] shapesArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        ThreeDShape pivot = shapesArray[pivotIndex];

        //this will move the pivot to the end of the array
        Swap(shapesArray, pivotIndex, highIndex);

        int leftPointer = PartitionHeight(shapesArray, lowIndex, highIndex, pivot);

        //left sub array
        SortHeight(shapesArray, lowIndex, leftPointer - 1);
        //right sub array
        SortHeight(shapesArray, leftPointer + 1,  highIndex);
    }
    private static int PartitionHeight(ThreeDShape[] array, int lowIndex, int highIndex, ThreeDShape pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //This is where compareTo() will be used
        while (leftPointer < rightPointer) {
            //moves left pointer to the left
            while (array[leftPointer].compareTo(pivot) <= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            //moves right pointer to the right
            while (array[rightPointer].compareTo(pivot) >= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }
            Swap(array, leftPointer, rightPointer);
        }

        Swap(array, leftPointer, highIndex); //swap in the pivot (numbers smaller now on left, bigger on right)
        return leftPointer;
    }

    //Sort Base Area
    public static void SortBaseArea(ThreeDShape[] shapesArray) {
            SortBaseArea(shapesArray, 0, shapesArray.length - 1);
        }
    public static void SortBaseArea(ThreeDShape[] shapesArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        ThreeDShape pivot = shapesArray[pivotIndex];

        //this will move the pivot to the end of the array
        Swap(shapesArray, pivotIndex, highIndex);

        int leftPointer = PartitionBaseArea(shapesArray, lowIndex, highIndex, pivot);

        SortBaseArea(shapesArray, lowIndex, leftPointer - 1);
        SortBaseArea(shapesArray, leftPointer + 1, highIndex);
    }
    private static int PartitionBaseArea(ThreeDShape[] array, int lowIndex, int highIndex, ThreeDShape pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //This is where compareTo() will be used
        while (leftPointer < rightPointer) {
            //moves left pointer to the left
            while ((ThreeDShape.BaseAreaComparator.compare(array[leftPointer], pivot) <= 0 ) && leftPointer < rightPointer) {
                leftPointer++;
            }
            //moves right pointer to the right
            while (ThreeDShape.BaseAreaComparator.compare(array[rightPointer], pivot ) >= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }
            Swap(array, leftPointer, rightPointer);
        }

        Swap(array, leftPointer, highIndex); //swap in the pivot (numbers smaller now on left, bigger on right)
        return leftPointer;
    }

    //Sort by Volume
    public static void SortVolume(ThreeDShape[] shapesArray) {
        SortBaseArea(shapesArray, 0, shapesArray.length - 1);
    }
    public static void SortVolume(ThreeDShape[] shapesArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        ThreeDShape pivot = shapesArray[pivotIndex];

        //this will move the pivot to the end of the array
        Swap(shapesArray, pivotIndex, highIndex);

        int leftPointer = PartitionBaseArea(shapesArray, lowIndex, highIndex, pivot);

        SortVolume(shapesArray, lowIndex, leftPointer - 1);
        SortVolume(shapesArray, leftPointer + 1, highIndex);
    }
    private static int PartitionVolume(ThreeDShape[] array, int lowIndex, int highIndex, ThreeDShape pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //This is where compareTo() will be used
        while (leftPointer < rightPointer) {
            //moves left pointer to the left
            while ((ThreeDShape.BaseAreaComparator.compare(array[leftPointer], pivot) <= 0 ) && leftPointer < rightPointer) {
                leftPointer++;
            }
            //moves right pointer to the right
            while (ThreeDShape.BaseAreaComparator.compare(array[rightPointer], pivot ) >= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }
            Swap(array, leftPointer, rightPointer);
        }

        Swap(array, leftPointer, highIndex); //swap in the pivot (numbers smaller now on left, bigger on right)
        return leftPointer;
    }

    private static void Swap(ThreeDShape[] array, int index1, int index2) {
        ThreeDShape temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
