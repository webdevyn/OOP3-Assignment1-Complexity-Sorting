package utilities.SortingMethods;

import shapes.ThreeDShape;

public class InsertionSort {

    public static void SortHeight(ThreeDShape[] shapesArray) {
        for (int i = 1; i < shapesArray.length; i++) {
            ThreeDShape currentShape = shapesArray[i];
            int j = i - 1;

            while (j >= 0 && shapesArray[j].compareTo(currentShape) > 0) {
                shapesArray[j + 1] = shapesArray[j];
                j--;
            }
            shapesArray[j + 1] = currentShape;
        }
    }

    public static void SortBaseArea(ThreeDShape[] shapesArray) {
        for (int i = 1; i < shapesArray.length; i++) {
            ThreeDShape currentShape = shapesArray[i];
            int j = i - 1;

            while (j >= 0 && ThreeDShape.BaseAreaComparator.compare(shapesArray[j], currentShape) > 0) {
                shapesArray[j + 1] = shapesArray[j];
                j--;
            }
            shapesArray[j + 1] = currentShape;
        }
    }

    public static void SortVolume(ThreeDShape[] shapesArray) {
        for (int i = 1; i < shapesArray.length; i++) {
            ThreeDShape currentShape = shapesArray[i];
            int j = i - 1;

            while (j >= 0 && ThreeDShape.VolumeComparator.compare(shapesArray[j], currentShape) > 0) {
                shapesArray[j + 1] = shapesArray[j];
                j--;
            }
            shapesArray[j + 1] = currentShape;
        }
    }
}


