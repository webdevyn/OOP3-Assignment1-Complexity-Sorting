package utilities.SortingMethods;

import shapes.ThreeDShape;

public class SelectionSort {
    //Sort By Height
    public static void SortHeight(ThreeDShape[] shapes) {
        int length = shapes.length;

        for (int i = 0; i < shapes.length - 1; i++) { //we can stop at second last position because we know nothing is after the last position
            ThreeDShape minHeight = shapes[i]; //we take first number as the OG min height
            int minIndex = i;

            for (int j = i + 1; j < length; j++) { //we loop through all nums after the OG min to possibly find one smaller than it (that's why we needed the OG minIndex)
                if (shapes[j].compareTo(minHeight) < 0) {
                    minHeight = shapes[j];
                    minIndex = j;
                }
            }

            Swap(shapes, i, minIndex);
        }
    }

    //Sort By Base Area
    public static void SortBaseArea(ThreeDShape[] shapes) {
        int length = shapes.length;

        for (int i = 0; i < shapes.length - 1; i++) { //we can stop at second last position because we know nothing is after the last position
            ThreeDShape minHeight = shapes[i]; //we take first number as the OG min height
            int minIndex = i;

            for (int j = i + 1; j < length; j++) { //we loop through all nums after the OG min to possibly find one smaller than it (that's why we needed the OG minIndex)
                if (ThreeDShape.BaseAreaComparator.compare(shapes[j], minHeight) < 0) {
                    minHeight = shapes[j];
                    minIndex = j;
                }
            }
            Swap(shapes, i, minIndex);
        }
    }

    //Sort By Volume
    public static void SortVolume(ThreeDShape[] shapes) {
        int length = shapes.length;

        for (int i = 0; i < shapes.length - 1; i++) { //we can stop at second last position because we know nothing is after the last position
            ThreeDShape minHeight = shapes[i]; //we take first number as the OG min height
            int minIndex = i;

            for (int j = i + 1; j < length; j++) { //we loop through all nums after the OG min to possibly find one smaller than it (that's why we needed the OG minIndex)
                if (ThreeDShape.VolumeComparator.compare(shapes[j], minHeight) < 0) {
                    minHeight = shapes[j];
                    minIndex = j;
                }
            }
            Swap(shapes, i, minIndex);
        }
    }

    //Swap Method
    private static void Swap(ThreeDShape[] shapes, int a, int b) {
        ThreeDShape temp = shapes[a];
        shapes[a] = shapes[b];
        shapes[b] = temp;
    }
}
